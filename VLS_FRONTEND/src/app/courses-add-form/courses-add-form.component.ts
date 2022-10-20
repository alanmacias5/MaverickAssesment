import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,  } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { courses } from '../model/courses.model';
import { CoursesService } from '../service/courses.service';


@Component({
  selector: 'app-courses-add-form',
  templateUrl: './courses-add-form.component.html',
  styleUrls: ['./courses-add-form.component.css']
})
export class CoursesAddFormComponent implements OnInit {

  courseId!: number;
  course !: courses;
  addCoursesForm!: FormGroup;

  constructor(private formBuilder : FormBuilder, private coursesService : CoursesService, private router : Router, 
    private route : ActivatedRoute) { }

  ngOnInit(): void {
    this.courseId = this.route.snapshot.params['courseId'];
    this.course = new courses();
    this.coursesService.getCourseById(this.courseId).subscribe(searchedcourses => {console.log(searchedcourses)
    this.course = searchedcourses;}, error => console.log(error))
    
    

    this.addCoursesForm = this.formBuilder.group({
      // formControlName in template
      courseId:[`${Math.floor(Math.random()*200)}`],
      // name:['Sam',Validators.required,Validators.minLength(5)]
      courseName:[""],
      authorName : [""] ,
      duration:[""],
    })
      
    
  }

  saveCourse() {
    console.log('Employee details sent to server..');
    console.log(this.addCoursesForm?.value)
    this.coursesService.addOrder(this.addCoursesForm?.value).subscribe((data)=>{
      console.log('saved ', data);

    });
}

deleteCourse() {
  console.log('Employee details sent to server..');
  console.log(this.addCoursesForm?.value)
  this.coursesService.addOrder(this.addCoursesForm?.value).subscribe((data)=>{
    console.log('saved ', data);

  });
}
// deleteCourse(toDeleteCourse : courses): void {
//   console.log('course details sent to server..');
//   console.log(toDeleteCourse)
//   this.coursesService.deleteCourse(toDeleteCourse.courseId).subscribe((data) => {
//     // remove from array
//     this.course =  this.course.filter((cours) => { course != toDeleteCourse})
//     console.log('deleted ', toDeleteCourse);
//   });
// }

}
