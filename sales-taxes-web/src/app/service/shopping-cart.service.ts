import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from './../../environments/environment';
import { ShoppingCart } from '../model/shoppingcart';
import { ShoppingCartResume } from '../model/shoppingcartresume';

@Injectable({
  providedIn: 'root'
})
export class ShoppingCartService {

  constructor(private http: HttpClient) {

  }

  getAll() {
    return this.http.get<ShoppingCart[]>(`${environment.apiCartUrl}/shoppingCart`);
  }

  getResume(cartId){
    return this.http.get<ShoppingCartResume>(`${environment.apiCartUrl}/shoppingCartResume?cartId=${cartId}`);
  }
}
