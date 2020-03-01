import { Product } from '../model/product';
import { environment } from './../../environments/environment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) {

  }

  getAll() {
    return this.http.get<Product[]>(`${environment.apiProductUrl}/product`);
  }

  getById(productId){
    return this.http.get<Product[]>(`${environment.apiProductUrl}/product/${productId}`);
  }

}
