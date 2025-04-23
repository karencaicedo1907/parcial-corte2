import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { IonicModule } from '@ionic/angular';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-customer-form',
  standalone: true,
  imports: [IonicModule, FormsModule, CommonModule],
  templateUrl: './customer-form.component.html',
  styleUrls: ['./customer-form.component.scss'],
})
export class CustomerFormComponent {
  @Output() customerData = new EventEmitter<any>();
  
  customer = { name: '', contact: '' };

  emitCustomer() {
    this.customerData.emit(this.customer);
  }
}
