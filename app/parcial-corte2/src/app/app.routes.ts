import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: 'reservation-management',
        loadComponent: () => import('./pages/reservation-management/reservation-management.page').then(m => m.ReservationManagementPage), 
      },
      {
        path: '',
        redirectTo: '/reservation-management', 
        pathMatch: 'full',
      },
];
