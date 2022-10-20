import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})

export class UserLoginComponent implements OnInit {

  @Input() foodIdReceived ?: number;

  constructor( private router : Router) { }

  ngOnInit(): void {
  }

  goToOrderForm(foodIdReceived ?: number){
   
    this.router.navigate(['addOrder', foodIdReceived]);

  }

}
