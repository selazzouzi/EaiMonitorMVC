package com.hs.eai.monitor.jobs.model;

// Generated 29-aug-2012 15:16:56 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Color generated by hbm2java
 */
@SuppressWarnings("serial")
public class Color implements java.io.Serializable {

	private int id;
	private String code;
	private String colorName;
	private String colorValue;
	private Set<JobStatus> jobStatuses = new HashSet<JobStatus>(0);

	public Color() {
	}

	public Color(int id, String code) {
		this.id = id;
		this.code = code;
	}

	public Color(int id, String code, String colorName, String colorValue, Set<JobStatus> jobStatuses) {
		this.id = id;
		this.code = code;
		this.colorName = colorName;
		this.colorValue = colorValue;
		this.jobStatuses = jobStatuses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getColorName() {
		return this.colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getColorValue() {
		return this.colorValue;
	}

	public void setColorValue(String colorValue) {
		this.colorValue = colorValue;
	}

	public Set<JobStatus> getJobStatuses() {
		return this.jobStatuses;
	}

	public void setJobStatuses(Set<JobStatus> jobStatuses) {
		this.jobStatuses = jobStatuses;
	}

}