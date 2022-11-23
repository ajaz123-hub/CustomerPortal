import { Injectable } from '@angular/core';
import { Product } from '../_model/productmodel';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  constructor(private httpclient: HttpClient) { }

  ngOnInit(): void {
  }
  public addProduct(product:Product)
  {
   return this.httpclient.post<Product>("http://localhost:9090/addproducts",product)

}
}
