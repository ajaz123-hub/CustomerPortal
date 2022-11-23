import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Product } from '../_model/productmodel';
import { ProductService } from '../_services/product.service';


@Component({
  selector: 'app-add-new-product',
  templateUrl: './add-new-product.component.html',
  styleUrls: ['./add-new-product.component.css']
})
export class AddNewProductComponent implements OnInit {
  product: Product={
    productName: "",
      productDescription: "",
      productDiscountPrice:0,
      productActualPrice:0
  }
  constructor(private productservice: ProductService) { }

  ngOnInit(): void {
  }
  
  productSubmit()
  {
    console.log(this.product);
    if(this.product.productName==''|| this.product.productName==null)
    {
      alert('USER IS REQUIRED');
      return;
    }
this.productservice.addProduct(this.product).subscribe(


  (data)=>
  {
   
    console.log('data');
    console.log('success');
    alert('succesullfuly');

  },
  (error)=>
  {
    console.log('error');
    console.log('error happen');
  }

);
  
    
  }
  
 

}


