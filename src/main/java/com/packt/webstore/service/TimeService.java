package com.packt.webstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Time;

@Service
public interface TimeService {
	List<Time> getAllTimes();
}
