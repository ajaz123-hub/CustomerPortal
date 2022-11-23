import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../_model/usermodel';
@Injectable({
  providedIn: 'root'
})
export class RegisterService {
  PATH_OF_API = 'http://localhost:9090';
  registerurl="http://localhost:9090/registerAdminUser";
  constructor(private httpclient: HttpClient) { }
  public addRegister(user:User)
  {
   return this.httpclient.post<User>(this.registerurl,user)

}
}
