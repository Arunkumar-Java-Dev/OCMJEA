/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ThoughtKnock.SessionBeans;

import com.ThoughtKnock.Model.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Startup;

/**
 *
 * @author Arunkumar.A
 */
@Stateless
@LocalBean
@Startup
public class MovieData {
 private ArrayList<Movie> movies = new ArrayList<Movie>();
    public MovieData() {
        System.out.println("com.ThoughtKnock.SessionBeans.MovieData.<init>() Inside Constructor");
    }


    @PostConstruct
    public void initial(){
       
    	
    	movies.add(new Movie(1, "title1", 1990));
    	movies.add(new Movie(2, "title2", 2000));
    	movies.add(new Movie(3, "title3", 2016));
    }

	public List<Movie> getMovies() {
		return movies;
	}
    
    
    public Movie getMovie(int id){
    	Movie retmovie = null;
    	for (Movie movie : movies) {
			if(movie.getId() == id){
				retmovie = movie;
			}
		}
    	return retmovie;
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
