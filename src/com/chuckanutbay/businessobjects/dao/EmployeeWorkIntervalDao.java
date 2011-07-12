package com.chuckanutbay.businessobjects.dao;

import java.util.List;

import org.joda.time.DateTime;

import com.chuckanutbay.businessobjects.Employee;
import com.chuckanutbay.businessobjects.EmployeeWorkInterval;
import com.chuckanutbay.documentation.Terminology;

/**
 * {@link Terminology#DAO} for {@link EmployeeWorkInterval}.
 */
public interface EmployeeWorkIntervalDao extends GenericDao<EmployeeWorkInterval, Integer> {

	EmployeeWorkInterval findOpenEmployeeWorkInterval(Employee employee);

	List<EmployeeWorkInterval> findOpenEmployeeWorkIntervals();
	
	List<EmployeeWorkInterval> findEmployeeWorkIntervalsBetweenDates(Employee employee, DateTime start, DateTime end);
}
