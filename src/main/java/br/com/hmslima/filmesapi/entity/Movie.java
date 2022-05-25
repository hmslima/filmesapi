package br.com.hmslima.filmesapi.entity;

import javax.persistence.*;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    public String name;
    @Column(name="brname")
    public String brname;
    @Column(name="director")
    public String director;

    @Column(name="year")
    public int year;
    @Column(name="imdb")
    public String imdb;

    public Movie() {

    }

    public Movie(String name, String brname, String director, int year, String imdb) {
        this.name = name;
        this.brname = brname;
        this.director = director;
        this.year = year;
        this.imdb = imdb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrname() {
        return brname;
    }

    public void setBrname(String brname) {
        this.brname = brname;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brname='" + brname + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", imdb='" + imdb + '\'' +
                '}';
    }
}
