import { Injectable } from '@angular/core';
import {from, Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor(private readonly http: HttpClient) { }

  getPersons(): Observable<string> {
    return from(this.http.get<string>('/api/persons'));
    /*
    const people = ['John', 'Jane', 'Joe'];
    return from(people);
     */
  }
}
