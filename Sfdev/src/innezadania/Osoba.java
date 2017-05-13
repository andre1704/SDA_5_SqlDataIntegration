package innezadania;

/**
 * Created by RENT on 2017-02-13.
 */
public class Osoba {
    private int height;
    private int weight;
    public void setHeight(int height){
        this.height=height;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    Osoba(){
    }
    Osoba(int height, int weight){
        setHeight(height);
        setWeight(weight);
    }
    public String toString(){
        return "waga "+weight+" wzrost "+height;
    }



}
