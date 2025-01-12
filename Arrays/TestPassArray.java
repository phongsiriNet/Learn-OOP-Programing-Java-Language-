package Arrays;
public class TestPassArray {
	  public static void main(String[] args) {
		 int [] b;
		 int n =5;
	    int[] a = {1,2};
	    b = new int[5];
	    swap(a[0],a[1]);    
	    System.out.println("a[0]:  " + a[0] + "a[1]: " + a[1]);
	    swap (a[0],a[1]);
	    System.out.println("a[0]:  " + a[0] + "a[1]:  " + a[1]);
	  }

	  public static void swap (int n1,int n2) {
	    int temp = n1; n1 = n2; n2 = temp;
	    }

	  public static void swapFirstTwoInArray (int[] array) {
	    int temp = array[0]; array[0] = array[1]; 
	    array[1] = temp;
	    }
	  } 
