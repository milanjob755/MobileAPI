package com.example.movieapi;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String studio;
    private String genre;
    private String director;
    private String writers;
    private String actors;
    private int year;
    private int length;

    @Column(name = "short_description", length = 1000)
    private String shortDescription;

    private String mpaRating;
    private String posterLink;
    private double criticsRating;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getWriters() { return writers; }
    public void setWriters(String writers) { this.writers = writers; }

    public String getActors() { return actors; }
    public void setActors(String actors) { this.actors = actors; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public String getShortDescription() { return shortDescription; }
    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

    public String getMpaRating() { return mpaRating; }
    public void setMpaRating(String mpaRating) { this.mpaRating = mpaRating; }

    public String getPosterLink() { return posterLink; }
    public void setPosterLink(String posterLink) { this.posterLink = posterLink; }

    public double getCriticsRating() { return criticsRating; }
    public void setCriticsRating(double criticsRating) { this.criticsRating = criticsRating; }
}
