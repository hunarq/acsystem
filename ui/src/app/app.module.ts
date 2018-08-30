
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { AircraftComponent } from './aircraft/aircraft.component';
import { AppRoutingModule } from './app.routing.module';
import {AircraftService} from './aircraft/aircraft.service';
import {HttpClientModule} from "@angular/common/http";
import {AddAircraftComponent} from './aircraft/add-aircraft.component';

@NgModule({
  declarations: [
    AppComponent,
    AircraftComponent,
    AddAircraftComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [AircraftService],
  bootstrap: [AppComponent]
})
export class AppModule { }


