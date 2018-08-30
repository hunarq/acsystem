import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AircraftComponent } from './aircraft/aircraft.component';
import {AddAircraftComponent} from './aircraft/add-aircraft.component';

const routes: Routes = [
  { path: 'aircrafts', component: AircraftComponent },
  { path: 'add', component: AddAircraftComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }

