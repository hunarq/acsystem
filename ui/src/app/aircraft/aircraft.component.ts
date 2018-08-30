
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Aircraft } from '../models/aircraft.model';
import { AircraftService } from './aircraft.service';

@Component({
  selector: 'app-aircraft',
  templateUrl: './aircraft.component.html',
  styles: []
})
export class AircraftComponent implements OnInit {

  aircrafts: Aircraft[];

  constructor(private router: Router, private aircraftService: AircraftService) {

  }

  ngOnInit() {
    this.aircraftService.getAircrafts()
      .subscribe( data => {
        this.aircrafts = data;
      });
  };

  deleteAircraft(): void {
    this.aircraftService.deleteAircraft()
      .subscribe( data => {

      });

    this.aircraftService.getAircrafts()
      .subscribe( data => {
        this.aircrafts = data;
      });
  };

}


