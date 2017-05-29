export class ProductBase{
  id : number;
  name : string;
  units : string;
  baseValidityPeriod : number;
  description : string;
  category : Category;
}

export class Product {
  id : number;
  insertDate : string;
  fresh : boolean;
  quantity : number;
  productBase : ProductBase;
}

export class User {
  id : number;
  name : string;
  surname : string;
  login : string;
}

export class Category {
  id : number;
  name : string;
  imageURL : string;
  productsBase : ProductBase[];
}
