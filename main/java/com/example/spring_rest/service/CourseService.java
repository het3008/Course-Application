package com.example.spring_rest.service;

import com.example.spring_rest.entities.Courses;

import java.util.List;

public interface CourseService {

    public List<Courses> getCourses ();

    public Courses getCourse(long id);

    public Courses addCourse(Courses course);

    public Courses updateCourse(Courses course);

    public void deleteCourse (long id);
}
