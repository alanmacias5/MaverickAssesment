package com.vls.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSETABLE")
public class CoursesEntity {
    @Id
    @Column(name = "COURSE_ID", nullable = false)
    private Integer courseId;


    @Column(name = "COURSE_NAME", nullable = false)
    private String courseName;

    @Column(name = "AUTHOR_NAME" , nullable = false)
    private String authorName;

    @Column(name = "DURATION", nullable = false)
    private int Duration;



    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() { return authorName; }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        this.Duration = duration;
    }



    public CoursesEntity(Integer courseId, String courseName, String authorName, int duration) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.Duration = duration;
    }

    public CoursesEntity() {
    }


}