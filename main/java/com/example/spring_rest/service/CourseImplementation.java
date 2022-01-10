package com.example.spring_rest.service;

import com.example.spring_rest.entities.Courses;
import org.apache.catalina.startup.ContextRuleSet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseImplementation implements CourseService{

    ArrayList<Courses> hs;
    public CourseImplementation(){
        hs = new ArrayList<>();

        hs.add(new Courses(123,"Java","This is the het shah eraaaaaaa"));
        hs.add(new Courses(234,"Python","I will  beacuse I am belive in my self"));

    }
    @Override
    public List<Courses> getCourses () {
        return hs;
    }

    public Courses getCourse(long id) {

        Courses c = null;
        for(Courses co: hs) {
            if(co.getId() == id) {
                c = co;
                return c;
            }
        }

        return c;
    }

    @Override
    public Courses addCourse(Courses course) {

        hs.add(course);
        return course;

    }

    // for update
    public Courses updateCourse (Courses course) {

       // Courses c = null;
        for(Courses co : hs) {

            if(co.getId() == course.getId()) {
                co.setName(course.getName());
                co.setDescripation(course.getDescripation());
            }

        }
        return course;
    }

    @Override
    public void deleteCourse(long id) {
        for(Courses co :hs) {
            if(co.getId() == id) {
                hs.remove(co);
            }
        }

    }
}
