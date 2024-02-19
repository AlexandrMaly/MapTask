package Outputer;

import Goods.Product;

import java.util.Map;

public class OutputProduct {

    public void getOutputProducts(Map<Integer, Product> map) {
        map.forEach((id, product) ->
                System.out.println(id + " - name: " + product.getName()
                        + ", amount: " + product.getAmount()
                        + ", price: " + product.getPrice()));
    }

    public void getOutputProduct(Map<Integer, Product> map, int id) {
        if (map.containsKey(id)) {
            Product product = map.get(id);
            System.out.println(id + " - name: " + product.getName()
                    + ", amount: " + product.getAmount()
                    + ", price: " + product.getPrice());
        } else System.out.println("Incorrect ID");
    }

}
