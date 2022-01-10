package com.example.spring_rest.entities;

public class Courses {

    private long id;
    private String name;
    private String descripation;

    public Courses() {
    }

    public Courses(long id, String name, String descripation) {
        this.id = id;
        this.name = name;
        this.descripation = descripation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripation() {
        return descripation;
    }

    public void setDescripation(String descripation) {
        this.descripation = descripation;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descripation='" + descripation + '\'' +
                '}';
    }
}
