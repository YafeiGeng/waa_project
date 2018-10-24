package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Time;
import com.packt.webstore.domain.query.ProductSpecification;
import com.packt.webstore.repository.TimeRepository;
import com.packt.webstore.service.TimeService;

@Service
@Transactional
public class TimeServiceImpl implements TimeService {

	@Autowired
	private TimeRepository timeRepository;

	public List<Time> getAllTimes() {
		return timeRepository.getAllTimes();
	}

	public Time getTimeById(String TimeID) {
		return timeRepository.getTimeById(TimeID);
	}

	public List<Time> getProductsByCategory(String category) {
		return null;
//		TimeRepository.getTimesByCategory(category);
	}

	public Set<Time> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		TimeRepository.getProductsByFilter(params);
	}

	public void addTime(Time product) {
		TimeRepository.save(product);
	}

	public Time get(long productID) {
		return timeRepository.findOne(productID);
	}

	public List<Time> getTimesByDescOrder() {
		return null;
//		TimeRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	public Time getAddTime(String desc) {
		Time p = getTimeById("P1235");
		p = get(p.getId());

		// Update
		p.setDescription(desc);
		addTime(p);
		return p;

	}

	/*
	 * Uses the Specification Interface to pass Criteria into findAll This is the
	 * way to use the Criteria API with Spring Data
	 */
	public List<Time> findBySpec(Time product) {

		ProductSpecification productSpecification = new ProductSpecification(product);

		return TimeRepository.findAll(productSpecification);
	}

}
