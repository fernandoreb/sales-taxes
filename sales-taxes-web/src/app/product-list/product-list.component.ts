import { ProductService } from './../service/product.service';
import { Component,OnInit } from '@angular/core';


@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products;

  constructor(private productService: ProductService) {

  }

  ngOnInit() {

    this.productService.getAll()
    .subscribe(resp => {
      this.products = resp;
    });
  }

}
