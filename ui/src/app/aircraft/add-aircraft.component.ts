import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Aircraft } from '../models/aircraft.model';
import { AircraftService } from './aircraft.service';

@Component({
  templateUrl: './add-aircraft.component.html'
})
export class AddAircraftComponent {

  aircraft: Aircraft = new Aircraft();

  constructor(private router: Router, private aircraftService: AircraftService) {

  }

  createAircraft(): void {
    this.aircraftService.createAircraft(this.aircraft)
        .subscribe( data => {
          alert("Aircraft added successfully.");
        });

  };

}

