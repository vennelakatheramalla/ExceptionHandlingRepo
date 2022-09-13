package com.iq.model;

import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;

public class CreateIQ {
	private int id;
	private String courseName;
	private Clob conceptDoc;
	private Blob logo;
	private Date creationDate;
	private String comment;
	public CreateIQ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreateIQ(int id, String courseName, Clob conceptDoc, Blob logo, Date creationDate, String comment) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.conceptDoc = conceptDoc;
		this.logo = logo;
		this.creationDate = creationDate;
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Clob getConceptDoc() {
		return conceptDoc;
	}
	public void setConceptDoc(Clob conceptDoc) {
		this.conceptDoc = conceptDoc;
	}
	public Blob getLogo() {
		return logo;
	}
	public void setLogo(Blob logo) {
		this.logo = logo;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "CreateIQ [id=" + id + ", courseName=" + courseName + ", conceptDoc=" + conceptDoc + ", logo=" + logo
				+ ", creationDate=" + creationDate + ", comment=" + comment + "]";
	}
	
	
	

}
