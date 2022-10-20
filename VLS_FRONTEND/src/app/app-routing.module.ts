import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CoursesAddFormComponent } from './courses-add-form/courses-add-form.component';
import { CoursesListComponent } from './courses-list/courses-list.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { UserRegisterComponent } from './user-register/user-register.component';

const routes: Routes = [
    {path: '', redirectTo: '/courses', pathMatch: 'full' },
    {path:'userLogin', component: UserLoginComponent},
    {path:'courses',component:CoursesListComponent},
    {path:'userRegister',component:UserRegisterComponent},
    {path:'add',component:CoursesAddFormComponent}

]

@NgModule({
    declarations: [],
    imports: [
      RouterModule.forRoot(routes)
    ],
    exports:[
      RouterModule
    ]
  })
  export class AppRoutingModule { }