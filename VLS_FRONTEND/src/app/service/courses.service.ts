import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { courses } from '../model/courses.model';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {
  deleteCourse(id: any) {
    throw new Error('Method not implemented.');
  }

  baseUrl: string;
  addCourseURL : string;



  constructor(private httpClient: HttpClient) {
    this.baseUrl = "http://localhost:9099/courses";
    this.addCourseURL = "http://localhost:9099/courses/add";
   }

  getCourses() {
    return this.httpClient.get<courses[]>(this.baseUrl);
  }
  getCourseById(courseId:number){
    return this.httpClient.get<courses>(this.baseUrl + "/" +courseId);
  }

  addOrder(courses: courses) {
    return this.httpClient.post<courses>(this.addCourseURL, courses);
  }
}




  


  