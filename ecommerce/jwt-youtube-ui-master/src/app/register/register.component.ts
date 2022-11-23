import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { RegisterService } from '../_services/register.service';
import { UserService } from '../_services/user.service';
import { Router } from '@angular/router';


//import { UserService } from '../_services/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private userservice: RegisterService, private router: Router) { }
  public User = {
    userName: "",
    customerId: 0,
    address: "",
    state: "",
    country: "",
    email: "",
    dateOfBirth: "",
    contactNumber: 0,
    userPassword:""

  };
  ngOnInit(): void {
  }
  formSubmit() {
    console.log(this.User);
    if (this.User.userName == '' || this.User.userName == null) {
      alert('USER IS REQUIRED');
      return;
    }
    console.log(this.User);
    this.userservice.addRegister(this.User).subscribe(
      res => {
        console.log(res);
        console.log('success');
        alert('succesullfuly');
        this.router.navigate(['/login']);
      },
      err => {
        console.log('error');
        console.log('error happen');
      }

    );


  }



}