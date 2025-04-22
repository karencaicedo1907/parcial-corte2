import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';

import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { CustomerFormComponent } from 'src/app/components/customer-form/customer-form.component';
import { DateTimePickerComponent } from 'src/app/components/date-time-picker/date-time-picker.component';
import { TableSelectorComponent } from 'src/app/components/table-selector/table-selector.component';

@Component({
  selector: 'app-reservation-management',
  templateUrl: './reservation-management.page.html',
  styleUrls: ['./reservation-management.page.scss'],
  standalone: true,
  imports: [ CommonModule, FormsModule, IonicModule, DateTimePickerComponent, CustomerFormComponent, TableSelectorComponent]
})
export class ReservationManagementPage {
  reservation = {
    dateTime: '',
    customer: { name: '', contact: '' },
    table: null as number | null,  // Permite que sea un número o null
  };

  handleDateTime(dateTime: string) {
    this.reservation.dateTime = dateTime;
  }

  handleCustomer(customer: any) {
    this.reservation.customer = customer;
  }

  handleTable(table: number) {
    this.reservation.table = table;
  }

  submitReservation() {
    console.log('Reserva enviada:', this.reservation);
    // Aquí podrías hacer un POST al backend con los datos de la reserva.
  }
}
