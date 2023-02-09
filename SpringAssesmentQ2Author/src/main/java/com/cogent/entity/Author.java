package com.cogent.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;
	private String authorName;
	private String authorAddress;
	private String authorPhone;
	
	public Author(int authorId, String authorName, String authorAddress, String authorPhone) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.authorAddress = authorAddress;
		this.authorPhone = authorPhone;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorAddress() {
		return authorAddress;
	}
	public void setAuthorAddress(String authorAddress) {
		this.authorAddress = authorAddress;
	}
	public String getAuthorPhone() {
		return authorPhone;
	}
	public void setAuthorPhone(String authorPhone) {
		this.authorPhone = authorPhone;
	}
	
	
}
