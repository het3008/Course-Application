package com.example.spring_rest.controller;

import com.example.spring_rest.entities.Courses;
import com.example.spring_rest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(value = "/main", method = RequestMethod.GET)
public class Mycontroller {

    @Autowired
    CourseService service;
    @GetMapping(value = "/home")
    public String home() {

        return "Thiss is my first learning app";
    }

    @GetMapping(value ="/courses")
    public List<Courses> getCourses() {

        return this.service.getCourses();
    }


    @GetMapping(value = "/courses/{id}")
    public Courses getCourse(@PathVariable long id) {

        return this.service.getCourse(id);
    }

    @PostMapping(value = "/course")
    public Courses addCourse(@RequestBody Courses course) {

        return this.service.addCourse(course);
    }

    // for update controller
    @PutMapping("/update")

    public Courses updateCourses(@RequestBody Courses course) {

        return this.service.updateCourse(course);

    }

    // to delete a data

    @DeleteMapping("/cours/{courseId}")

    public ResponseEntity<HttpStatus> deleteCourse (@PathVariable long courseId) {

        try {
            this.service.deleteCourse(courseId);
            return new ResponseEntity<>(HttpStatus.OK);

        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
