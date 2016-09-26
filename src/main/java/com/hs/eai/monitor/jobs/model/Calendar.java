package com.hs.eai.monitor.jobs.model;

// Generated 2-jul-2012 15:30:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Calendar generated by hbm2java
 */
@SuppressWarnings("serial")
public class Calendar implements java.io.Serializable {

	private Date date;
	private int dayOfWeek;
	private int year;
	private int month;
	private int week;
	private int day;
	private Set<NonWorkingDays> nonWorkingDayses = new HashSet<NonWorkingDays>(0);
	private Set<ProcessingDays> processingDayses = new HashSet<ProcessingDays>(0);
	
	public Calendar() {
	}

	public Calendar(Date date, int dayOfWeek, int year, int month, int week,
			int day) {
		this.date = date;
		this.dayOfWeek = dayOfWeek;
		this.year = year;
		this.month = month;
		this.week = week;
		this.day = day;
	}

	public Calendar(Date date, int dayOfWeek, int year, int month, int week,
			int day, Set<NonWorkingDays> nonWorkingDayses, Set<ProcessingDays> processingDayses) {
		this.date = date;
		this.dayOfWeek = dayOfWeek;
		this.year = year;
		this.month = month;
		this.week = week;
		this.day = day;
		this.nonWorkingDayses = nonWorkingDayses;
		this.processingDayses = processingDayses;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDayOfWeek() {
		return this.dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getWeek() {
		return this.week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Set<NonWorkingDays> getNonWorkingDayses() {
		return this.nonWorkingDayses;
	}

	public void setNonWorkingDayses(Set<NonWorkingDays> nonWorkingDayses) {
		this.nonWorkingDayses = nonWorkingDayses;
	}

	public Set<ProcessingDays> getProcessingDayses() {
		return this.processingDayses;
	}

	public void setProcessingDayses(Set<ProcessingDays> processingDayses) {
		this.processingDayses = processingDayses;
	}

}