package com.vls.controller;

import com.vls.entity.CoursesEntity;
import com.vls.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    @PostMapping( "/courses/add")
    public CoursesEntity addCourse(@RequestBody CoursesEntity coursesEntity){
        return coursesService.addCourse(coursesEntity);
    }
    @GetMapping( "/courses")
    public List<CoursesEntity> getCoursesEntityList(){
        List<CoursesEntity> coursesEntityList =  coursesService.getCoursesEntityList();
        return coursesEntityList;
    }

    @GetMapping( "/courses/{courseId}")
    public CoursesEntity getCourseById(@PathVariable(value = "courseId") int courseId){
        return coursesService.getCourseById(courseId);
    }



    @DeleteMapping("/courses/delete/{courseId}")
    public String deleteCourse(@PathVariable int courseId){
        return coursesService.deleteCourse(courseId);
    }

    @PutMapping("/courses/update")
    public CoursesEntity updateCourse(@RequestBody CoursesEntity coursesEntity){
        return coursesService.updateCourse(coursesEntity);
    }




}
