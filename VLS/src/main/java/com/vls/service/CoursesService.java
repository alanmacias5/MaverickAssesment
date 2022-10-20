package com.vls.service;

import com.vls.entity.CoursesEntity;

import java.util.List;

public interface CoursesService {

    CoursesEntity addCourse(CoursesEntity coursesEntity);

    List<CoursesEntity> getCoursesEntityList();
    CoursesEntity getCourseById(int courseId);

    String deleteCourse(int courseId);
    CoursesEntity updateCourse(CoursesEntity courseId);

}
