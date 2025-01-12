package quizPolymorphismArrayList;
import java.util.ArrayList;
class Solution 
{ 

	   ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
	   { 
	       // code here
	       ArrayList<Integer> res= new ArrayList<>();
	       if(Q==1)
	       {
	           int p=Query.get(0);
	           int r=Query.get(1);
	           A.add(p,r);
	           return A;
	       }
	       if(Q==2){
	           res.add(A.lastIndexOf(Query.get(0)));
	           return res;
	       }
	       else 
	       {
	           res.add(-1);
	           return res;
	       }
	      
	   }
	}

	 