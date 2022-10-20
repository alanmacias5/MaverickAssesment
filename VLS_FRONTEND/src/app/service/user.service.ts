import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  baseUrl: string = "http://localhost:9099/users";

  constructor(private http: HttpClient) { }

  createRegistration(user: User){
    return this.http.post(this.baseUrl,user);
  }
}


