package modifier;

/**
 * Created by RENT on 2017-02-14.
 */
public class Product {
    private static final double VAT=1.23;
    private String name;
    private Category category;
    double price;
    public Product(String name, Category category,int price){
        this.category=category;
        this.name=name;
        this.price=price*1.23;
    }
    public Double getPrice(){
        return price;
    }
    public Double getGrossPrice(){
        return price*VAT;
    }
    public String getName(){
        return name;
    }
    public Category getCategory(){
        return category;
    }
}
