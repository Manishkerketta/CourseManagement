package com.springrestfulapi.restApi.service;

import com.springrestfulapi.restApi.CourseService;
import com.springrestfulapi.restApi.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

   public List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
//        list.add(new Course(145,"java core course","this is the best course"));
//        list.add(new Course(150,"python core course","this is easy course"));
    }
    //private List<Course> newCourse=list;
    public List<Course> getCourse(){
        return list;
    }

    @Override
    public String addCourse(Course course) {
        list.add(course);
        return "added succesfully";
    }

    @Override
    public void deleteCourse(long courseId) {
        list=list.stream().filter(course -> course.getId()!=courseId).collect(Collectors.toList());
    }

    @Override
    public Course updateCourse( Course course,long id) {
        for (Course currentCourse:list)
        {
            if(currentCourse.getId()==course.getId()){
              currentCourse.setId(course.getId());
               currentCourse.setTitle(course.getTitle());
               currentCourse.setDescription((course.getDescription()));
            }


        }
        return  course;
    }


}
