import { Component, OnInit } from '@angular/core';
import {PersonService} from "../person.service";

@Component({
  selector: 'app-persons',
  templateUrl: './persons.component.html',
  styleUrls: ['./persons.component.scss']
})
export class PersonsComponent implements OnInit {

  constructor(private readonly personService: PersonService) { }

  ngOnInit(): void {
    this.personService.getPersons().subscribe(persons => console.log(persons));
  }

}
