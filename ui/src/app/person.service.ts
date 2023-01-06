import { Injectable } from '@angular/core';
import {from, Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor() { }

  getPersons(): Observable<string> {
    const people = ['John', 'Jane', 'Joe'];
    return from(people);
  }
}
