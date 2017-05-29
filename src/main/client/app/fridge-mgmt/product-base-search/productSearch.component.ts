/**
 * Created by lodwr on 29.05.2017.
 */

import {Component, EventEmitter, OnInit, Output} from "@angular/core";
import {Category, ProductBase} from "../Structures";
import {ProductBaseService} from "../productBase.service";
import {CategoryService} from "../category.service";
import {ProductService} from "../products.service";
import {FridgeService} from "../fridge.service";
@Component({
  selector: 'product-base-search',
  template: require('./productSearch.component.html!text')
} as Component)
export class ProductSearchComponent implements OnInit{
  findResult : ProductBase[];
  categories : Category[];

  searchPhrase : string = "";
  selectedCategory : Category;


  constructor(
    private productBaseService: ProductBaseService,
    private fridgeService : FridgeService,
    private categoryService: CategoryService
  ){}

  ngOnInit(): void {
    this.getAllProducts();
    this.categoryService.getAllCategories().then(resp => {this.categories = resp; console.log(resp)});
  }

  getAllProducts() : void {
      this.productBaseService.getAllProducts().then(resp => {this.findResult = resp; console.log(resp)});
  }

  findProducts(name : string, catId : string) {
      this.productBaseService.searchProducts(name, catId).then(resp => this.findResult = resp);
  }

  selectCategory(cat : Category) {
    if(this.selectedCategory == null || this.selectedCategory.id != cat.id) {
      this.selectedCategory = cat;
    }else {
      this.selectedCategory = null;
    }
  }

  filter() {
      if(this.selectedCategory == null)
        this.productBaseService.searchProducts(this.searchPhrase, "-1").then(res => {console.log(res); this.findResult = res;});
      else
        this.productBaseService.searchProducts(this.searchPhrase, this.selectedCategory.id.toString()).then(res => {console.log(res); this.findResult = res;});
  }

  selectProductBase(prod : ProductBase) {
    console.log(prod);
    this.fridgeService.addProducts(prod);
  }

}
