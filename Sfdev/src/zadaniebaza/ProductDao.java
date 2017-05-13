package zadaniebaza;

import modifier.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by RENT on 2017-02-16.
 */
public class ProductDao {
    private Set<Product> products=new HashSet<>();
    public void add(Product p){
        products.add(p);
    }
    public Set<Product> getAll(){
        return products;
    }
}
