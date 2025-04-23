import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { IonicModule } from '@ionic/angular';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-date-time-picker',
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule],
  templateUrl: './date-time-picker.component.html',
  styleUrls: ['./date-time-picker.component.scss'],
})

export class DateTimePickerComponent  {
  @Output() dateTimeSelected = new EventEmitter<string>();
  
  dateTime: string = '';

  emitDateTime() {
    this.dateTimeSelected.emit(this.dateTime);
  }
}
