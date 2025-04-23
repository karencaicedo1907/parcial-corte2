import { Component, EventEmitter, Output } from '@angular/core';
import { IonicModule } from '@ionic/angular';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-table-selector',
  standalone: true,
  imports: [IonicModule, CommonModule, FormsModule],
  templateUrl: './table-selector.component.html',
  styleUrls: ['./table-selector.component.scss'],
})
export class TableSelectorComponent {
  @Output() tableSelected = new EventEmitter<number>();
  availableTables = [1, 2, 3, 4, 5];
  selectedTable: number | null = null;

  emitTable() {
    if (this.selectedTable) {
      this.tableSelected.emit(this.selectedTable);
    }
  }
}
