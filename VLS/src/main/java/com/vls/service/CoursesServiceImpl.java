package com.vls.service;

import com.vls.entity.CoursesEntity;
import com.vls.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CoursesServiceImpl implements CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;

    @Override
    public CoursesEntity addCourse(CoursesEntity coursesEntity){
        CoursesEntity savedCourses = coursesRepository.save(coursesEntity);
        return savedCourses;
    }

    @Override
    public List<CoursesEntity> getCoursesEntityList() {
        List<CoursesEntity> coursesEntityList = coursesRepository.findAll();
        return coursesRepository.findAll();
    }

    @Override
    public CoursesEntity getCourseById(int courseId) {
        return coursesRepository.findByCourseId(courseId);
    }


    @Override
    public String deleteCourse(int courseId){

        Optional<CoursesEntity> course = coursesRepository.findById(courseId);
        if (course.isPresent()){
            coursesRepository.delete(course.get());
            return "Course with id: " + courseId + "was deleted.";
        }else {
            throw new RuntimeException("Product not found");
        }

    }
    @Override
    public CoursesEntity updateCourse(CoursesEntity coursesEntity){
        return coursesRepository.save(updateCourse(coursesEntity));
    }


}