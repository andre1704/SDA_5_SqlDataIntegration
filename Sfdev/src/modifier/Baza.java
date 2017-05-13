package modifier;

import java.util.*;

/**
 * Created by RENT on 2017-02-16.
 */
public class Baza {
    private Map<Category, List<Product>> categoryToProducs;
    Baza(){
        categoryToProducs =new HashMap<>();
    }
    public void add(Product p){
        categoryToProducs.putIfAbsent(p.getCategory(),new ArrayList<>());
//        if(!categoryToProducs.containsKey(p.getCategory()))
//            categoryToProducs.put(p.getCategory(),new ArrayList<>());
        categoryToProducs.get(p.getCategory()).add(p);
    }
    public List<Product> findCategory(Category category){
        List<Product> products=categoryToProducs.get(category);
        return products;
    }




    public static void main(String[] args) {
        Category cat1=new Category(12,"kkk");
        Product p=new Product("chuck",cat1,12);

        Baza nowa=new Baza();
        nowa.add(p);

    }
}
