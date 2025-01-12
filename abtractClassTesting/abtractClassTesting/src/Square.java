package abtractTest;

public class Square extends Shape {
public Square(){
super();
}
public Square(int x, char ch){
super(x,ch);
}
public void draw(int x, int y){
for(int i=1; i<=y ; i++)
  System.out.println();
   for(int len = 1;len <=rows; len++ ){
      for(int i=1; i<=x; i++)
         System.out.print(" ");
      for(int j=1; j<=rows; j++)
        System.out.print(character);
      System.out.println();
   }
}
}
