package com.packt.webstore.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.MovieTime;
import com.packt.webstore.repository.MovieTimeRepository;
import com.packt.webstore.service.MovieTimeService;

@Service
@Transactional
public class MovieTimeServiceImpl implements MovieTimeService {

	@Autowired
	private MovieTimeRepository movieTimeRepository;

	@Override
	public List<MovieTime> getAllMovieTimes() {
		return movieTimeRepository.getAllMovieTimes();
	}
}
