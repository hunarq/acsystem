import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Aircraft } from '../models/aircraft.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class AircraftService {

  constructor(private http:HttpClient) {}

  private aircraftUrl = 'http://localhost:5000/aircraft';
	//private aircraftUrl = '/api';

  public getAircrafts() {

    return this.http.get<Aircraft[]>(this.aircraftUrl);
  }

  public deleteAircraft() {
    return this.http.delete(this.aircraftUrl + "/" );
  }

  public createAircraft(aircraft) {
    return this.http.post<Aircraft>(this.aircraftUrl, aircraft);
  }

}


