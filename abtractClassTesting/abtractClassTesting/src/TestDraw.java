package abtractTest;

import java.util.*;
public class TestDraw {
public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
  Shape shape = null;
  int shapeNumber;
  System.out.println("Enter 1: Square, 2: RightTrianle, 3: Triangle");
  shapeNumber = input.nextInt();
  switch(shapeNumber){
 case 1: shape = new Square(4,'*'); break;
 case 2: shape = new RightTriangle(5,'#'); break;
 case 3: shape = new Triangle(6,'+'); break;
default: System.out.println("Invalid choice");
System.exit(0);
}
  shape.draw(1, 1);  //polymorphism
}
}
