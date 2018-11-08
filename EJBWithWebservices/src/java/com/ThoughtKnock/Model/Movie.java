/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ThoughtKnock.Model;

/**
 *
 * @author Arunkumar.A
 */
public class Movie {
   

	private int id;
	private String title;
	private int year;
	
	
	public Movie(int id, String title, int year) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
 
}
