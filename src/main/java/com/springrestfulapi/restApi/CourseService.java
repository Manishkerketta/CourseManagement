package com.springrestfulapi.restApi;

import com.springrestfulapi.restApi.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourse();
    public String addCourse(Course course);

   public void deleteCourse(long courseId);

   public Course updateCourse(Course course,long id);
    //public Course deleteCourseById(long id);
    }


