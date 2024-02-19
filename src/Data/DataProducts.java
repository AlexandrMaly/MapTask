package Data;

import Goods.Product;
import utils.IdGenerate;

import java.util.HashMap;
import java.util.Map;

public class DataProducts {
    Map<Integer, Product> map = new HashMap<>();
    public Map<Integer, Product> getDataProducts() {

        map.put(IdGenerate.generateUniqueId(), new Product("Orange", 10, 12.50));
        map.put(IdGenerate.generateUniqueId(), new Product("Apple", 25, 9.99));
        map.put(IdGenerate.generateUniqueId(), new Product("Banana", 3, 28.00));
        map.put(IdGenerate.generateUniqueId(), new Product("Melon", 18, 16.50));
        map.put(IdGenerate.generateUniqueId(), new Product("Watermelon", 5, 10.00));
        return map;
    }

    public Map<Integer, Product> addProduct(String name, int amount, double price){
        map.put(IdGenerate.generateUniqueId(), new Product(name, amount, price));
        return map;
    }


}
