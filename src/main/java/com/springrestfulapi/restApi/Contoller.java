package com.springrestfulapi.restApi;

import com.springrestfulapi.restApi.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Contoller {
    @Autowired
private CourseService courseService;
    @GetMapping("/course")
    public List<Course> getCourses(){
        return courseService.getCourse();
    }
    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
    @DeleteMapping("/course/{courseId}")
    public void deleteCourse(@PathVariable ("courseId") long courseId){
        this.courseService.deleteCourse(courseId);
    }
    @PutMapping("/course/{id}")
    public Course updateCourse(  @RequestBody Course course ,@PathVariable ("id")  long id ){
       this.courseService.updateCourse(course,id);
       return course;

    }
}
