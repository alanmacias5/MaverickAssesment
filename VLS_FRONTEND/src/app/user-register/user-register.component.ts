import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent implements OnInit {
  userRegisterForm!: FormGroup;

  constructor(private formBuilder : FormBuilder, private userService: UserService) {

   }
  

  ngOnInit(): void {
    const emailPattern = "^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$";
    const phonePattern = "^[0-9]{10}$"
    const currencyPattern ="^[0-9]+(\.[0-9]{1,2})?$"
    this.userRegisterForm = this.formBuilder.group({
      userId:[`cus${Math.floor(Math.random() * 100000)}`],
      userPassword:['',[Validators.required, Validators.minLength(8)]],
      userName: ['',[Validators.required, Validators.minLength(4), Validators.maxLength(20)]],
      userPhone: ['',[Validators.required, Validators.pattern(phonePattern)]],
      userEmail: ['',[Validators.required, Validators.email, Validators.pattern(emailPattern)]],
      userCoupon:[`coup${Math.floor(Math.random() * 100000)}`],
      userWalletBal: ['', [Validators.required,Validators.pattern(currencyPattern)]]
    })
  }

  onSubmit(){
    this.userService.createRegistration(this.userRegisterForm?.value).subscribe((data)=>{console.log('data saved',data)})
  }

}
