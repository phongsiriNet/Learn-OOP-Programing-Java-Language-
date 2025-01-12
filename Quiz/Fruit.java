package Quiz;

public class Fruit {
    private String color;
    private int size;
    private double weight;
    String taste;

    public Fruit() {}
    public Fruit (String color,int size,double weigth) {
    	this.color=color;
    	this.size=size;
    	this.weight=weigth;
    }
    public String toString(){

        return color +  " " + size +  " " + weight + " " + taste;

 }  

}
