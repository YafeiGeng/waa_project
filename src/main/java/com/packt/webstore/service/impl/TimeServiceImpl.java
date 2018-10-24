package com.packt.webstore.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Time;
import com.packt.webstore.repository.TimeRepository;
import com.packt.webstore.service.TimeService;

@Service
@Transactional
public class TimeServiceImpl implements TimeService {

	@Autowired
	private TimeRepository timeRepository;

	@Override
	public List<Time> getAllTimes() {
		return timeRepository.getAllTimes();
	}
/*
	@Override
	public Time getTimeById(String TimeID) {
		return timeRepository.getTimeById(TimeID);
	}

	@Override
	public List<Time> getProductsByCategory(String category) {
		return null;
//		TimeRepository.getTimesByCategory(category);
	}

	@Override
	public Set<Time> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		TimeRepository.getProductsByFilter(params);
	}

	@Override
	public Time get(long productID) {
		return timeRepository.findOne(productID);
	}

	@Override
	public List<Time> getTimesByDescOrder() {
		return null;
//		TimeRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	@Override
	public Time getAddTime(String desc) {
		Time p = getTimeById("P1235");
		p = get(p.getId());

		return p;

	}*/
}
