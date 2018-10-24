package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Time;



public interface TimeService {

	List<Time> getAllTimes();

	Time getTimeById(String timeID);

	List<Time> getProductsByCategory(String category);

	Set<Time> getProductsByFilter(Map<String, List<String>> filterParams);

	void addTime(Time time);

	Time get(long id);

	public Time getAddTime(String desc);

	List<Time> getTimesByDescOrder();

	public List<Time> findBySpec(Time time);
}
