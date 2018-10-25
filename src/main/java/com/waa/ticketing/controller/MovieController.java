package com.waa.ticketing.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.waa.ticketing.domain.Movie;
import com.waa.ticketing.service.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

//	@Autowired
//	private CustomerService customerService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("movies", movieService.getAllMovies());
		return "movies";
	}

	@RequestMapping("/all")
	public ModelAndView allMovies() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("movies", movieService.getAllMovies());
		modelAndView.setViewName("movies");
		return modelAndView;
	}

//	@RequestMapping("/{category}")
//	public String getProductsByCategory(Model model, @PathVariable("category") String category) {
//		List<Movie> products = movieService.getProductsByCategory(category);
//
//		if (products == null || products.isEmpty()) {
//			throw new NoProductsFoundUnderCategoryException();
//		}
//
//		model.addAttribute("products", products);
//		return "products";
//	}

//	@RequestMapping("/filter/{ByCriteria}")
//	public String getProductsByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams,
//			Model model) {
//		model.addAttribute("products", movieService.getProductsByFilter(filterParams));
//		return "products";
//	}

	@RequestMapping("/movie")
	public String getMovieById(Model model, @RequestParam("id") String movieId) {

		Movie movie = movieService.getMovieById(movieId);
		model.addAttribute("movie", movie);
		return "movie";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newMovie") Movie newProduct) {
		return "addMovie";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newMovie") @Valid Movie newMovie, BindingResult result,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			return "addMovie";
		}

		MultipartFile movieImage = newMovie.getMovieImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");

		if (movieImage != null && !movieImage.isEmpty()) {
			try {
				movieImage
						.transferTo(new File(rootDirectory + "\\resources\\images\\" + newMovie.getMovieId() + ".png"));
			} catch (Exception e) {
				throw new RuntimeException("Movie Image saving failed", e);
			}
		}

		try {
			movieService.addMovie(newMovie);
		} catch (Exception up) {
			System.out.println("Transaction Failed!!!");

		}

		return "redirect:/movies";
	}

//	// CACHING example
//	// If you WATCH the logging on the console.. you will see MUTIPLE fetches from
//	// the DB for P1234
//	// AND ONLY one fetch for P1235
//	@RequestMapping(value = "/cache")
//	public String processCacheTest(Model model, @RequestParam("P1234") String P1234,
//			@RequestParam("P1235") String P1235) {
//
//		System.out.printf("Start Cache Test\n");
//
//		// Get P1234 2X OUTSIDE transaction so NO cache
//		Movie p = movieService.getMovieById("P1234");
//		p = movieService.get(p.getId());
//
//		// Change P1234 Need to get and merge[ on Update and then get again....
//		p.setDescription(P1234);
//		movieService.addMovie(p);
//		p = movieService.get(p.getId());
//
//		System.out.printf("No CACHE Product p: %s\n", p.getDescription());
//
//		// P1235 is a "description", a real get P1235 is hardcoded in getAddproduct
//		Movie pp = movieService.getAddMovie(P1235);
//// get P1235 again....
//		pp = movieService.get(pp.getId());
//
//		System.out.printf("CACHE Product pp: %s\n", pp.getDescription());
//
//		return "products";
//	}
//
//	// CASCADE - Add a product...through saving Customer
//	// needs to update product as it holds foreign key
//	@RequestMapping(value = "/cascade")
//	public String processCascadeTest(Model model) {
//
//		// new product
//		Movie p = new Movie();
//		p.setMovieName("Fire Hose");
//		p.setMovieId("P4321");
//		p.setPrice(new BigDecimal(23));
//
//		// Already existing Product
//		Movie p2 = movieService.getMovieById("P1234");
//
//		// Create a customer
//		Customer c = new Customer();
//
//		c.setLastName("Dreamer");
//		c.setFirstName("Freddy");
//		c.setAge(15);
//
////		c.getProductList().add(p);
////		c.getProductList().add(p2);
//
//		c = customerService.save(c);
//
//		// One relationship [onetoMany] automatic Join on eager fetch
//		Customer customer = customerService.findOne(c.getId());
//
////		// List ONLY Customer's products
////		List<Movie> products = customer.getProductList();
////		model.addAttribute("products", products);
//
//		return "products";
//
//	}
//
//	@RequestMapping(value = "/fetch")
//	public String processFetchTest(Model model) {
//
//		List<Movie> productList = movieService.getMoviesByDescOrder();
//
//		for (Movie pp : productList) {
//			System.out.println(pp.getMovieId());
//		}
//
//		return "products";
//
//	}
//
//	// Use Criteria API see productSpecification...
//	@RequestMapping(value = "/criteria")
//	public String processCriteriaTest(Model model) {
//
//		Movie product = new Movie();
//
//		// Search by productId string
//		product.setMovieId("P1");
//		// OR search by category
////		product.setCategory("PC");
//
//		List<Movie> productList = movieService.findBySpec(product);
//
//		model.addAttribute("products", productList);
//		for (Movie pp : productList) {
//			System.out.println(pp.getMovieId());
//		}
//
//		return "products";
//
//	}
//
//	@ExceptionHandler(ProductNotFoundException.class)
//	public ModelAndView handleError(HttpServletRequest req, ProductNotFoundException exception) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("invalidProductId", exception.getProductId());
//		mav.addObject("exception", exception);
//		mav.addObject("url", req.getRequestURL() + "?" + req.getQueryString());
//		mav.setViewName("productNotFound");
//		return mav;
//	}

}