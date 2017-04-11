import { InMemoryDbService } from 'angular-in-memory-web-api';
export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    let products = [
      { _id: 1, _name: 'milk' },
      { _id: 2, _name: 'orange' },
      { _id: 3, _name: 'apple' },
      { _id: 4, _name: 'wine' },
    ];
    return {products};
  }
}
