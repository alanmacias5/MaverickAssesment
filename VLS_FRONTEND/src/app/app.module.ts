import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { UserRegisterComponent } from './user-register/user-register.component';
import { CoursesListComponent } from './courses-list/courses-list.component';
import { CoursesAddFormComponent } from './courses-add-form/courses-add-form.component';



@NgModule({
  declarations: [
    AppComponent,
    CoursesListComponent,
    UserLoginComponent,
    UserRegisterComponent,
    CoursesListComponent,
    CoursesAddFormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
   bootstrap: [AppComponent]
  // bootstrap: [FoodMenuSbComponent]
  // bootstrap: [FoodMenuJsonSvrComponent]
  //  bootstrap: [OrderDetailsSbComponent]

  
})
export class AppModule { }