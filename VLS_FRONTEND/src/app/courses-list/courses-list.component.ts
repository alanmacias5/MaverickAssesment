import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { courses } from '../model/courses.model';
import { CoursesService } from '../service/courses.service';


@Component({
  selector: 'app-courses-list',
  templateUrl: './courses-list.component.html',
  styleUrls: ['./courses-list.component.css']
})
export class CoursesListComponent implements OnInit {

  [x: string]: any;
  messg = 'Courses List';
  courseId?: number;
  courses?: courses[];
    constructor(private coursesService : CoursesService, private router : Router) {

      console.log("CONS" , "constructor(private coursesService : CoursesService)")
     }
  

     ngOnInit(): void {
      console.log("INIT emp servce : ", "ngOnInit():")
     this.coursesService.getCourses().subscribe(
      (data) => {
        this.courses = data;
        console.log(this.courses);
      }
     )
    }

    goToOrderForm(foodId ?: number){
      this.courseId = foodId;
      this.router.navigate(['userLogin']);

    }

}







