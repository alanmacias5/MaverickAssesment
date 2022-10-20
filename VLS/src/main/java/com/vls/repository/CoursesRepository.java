package com.vls.repository;

import com.vls.entity.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<CoursesEntity, Integer> {

    CoursesEntity findByCourseId(int courseId);

}
