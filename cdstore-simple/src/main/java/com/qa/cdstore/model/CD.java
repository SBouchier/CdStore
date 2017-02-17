package com.qa.cdstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CD {
	
	@Id
    private int id;
	
    private String artist;
    private String song;
    private String genre;

    public CD(int newID, String newArtist, String newSong, String newGenre){
    	id = newID;
    	artist = newArtist;
    	song = newSong;
    	genre = newGenre;
    }
    
    public int getID(){
        return id;
    }
    public String getArtist(){
        return artist;
        }
    public String getSong(){
        return song;
    }
    public String getGenre(){
        return genre;
    }

    public void setID(int newID){
        id = newID;
    }

    public void setArtist(String newArtist){
        artist = newArtist;
    }

    public void setSong(String newSong){
        song = newSong;
    }

    public void setGenre(String newGenre){
        genre = newGenre;
    }
}