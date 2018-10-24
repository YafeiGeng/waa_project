package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Time;
import com.packt.webstore.repository.TimeRepository;
import com.packt.webstore.service.TimeService;

public class TimeServiceImpl implements TimeService {
	@Autowired
	private TimeRepository timeRepository;

	@Override
	public List<Time> getAllTimes() {
		return timeRepository.getAllTimes();
	}
}
