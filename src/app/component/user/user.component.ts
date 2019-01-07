import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  message : String
  email: String
  Address: address
  hobbies : String[]
  constructor() {
    console.log("constructor runs.....")
   }

  ngOnInit() {
    console.log("ngOnInit runs...")
    this.message="we are into it ;-) :-*"
    this.email="gabriel@gmail.com"
    this.Address= {
      street :"jordan",
        city : "newyork"
  }
this.hobbies= ["playng pubg", "drama karna"]
}
onClick(hobby){
  
  this.hobbies.push(hobby)
  }

  addHobby(hobby){
    console.log(hobby)
    this.hobbies.unshift(hobby)
    return false

  }
  addHobby1(hobby){
    console.log(hobby)
    this.hobbies.unshift(hobby)
    return false

  }

  deleteHobby(hobby){
    for(let i =0; i< this.hobbies.length; i++)
    {
      if(this.hobbies[i]==hobby){
        this.hobbies.splice(i,1)
      }
    }
  }
}

interface address
{
  street: String
  city : String
}