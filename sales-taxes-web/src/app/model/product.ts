import { SaleTax } from './saletax';
export class Product {
  id: string;
  name: string;
  price: string;
  description: string;
  saleTaxes: SaleTax[];
}
