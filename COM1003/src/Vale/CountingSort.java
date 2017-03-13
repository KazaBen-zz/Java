package Vale;

import java.util.*;

public class CountingSort{
 
 
  public static void main(String[] args) {
	  int k = 3;
	  int A[] = {0,3,1,0,2,1,1,2};
	  int B[] = new int[8];
	  int C[] = new int[k+1];
	  for(int i=0; i<=k;i++){
		  C[i] = 0;
	  } 
	  for(int j=1;j<A.length;j++){
		  C[A[j]] = C[A[j]] + 1;
	  }
	  
	

	  for(int i=1;i<=k;i++){
		  C[i] = C[i] + C[i-1];
	  }

	  
	  for(int j=A.length-1;j>=1;j--){
		 /* System.out.println("j is "+j);
		  System.out.println("A[j] is "+A[j]);
		  System.out.println("C[A[j]] is "+C[A[j]]);
		  System.out.println("B[C[A[j]]] is "+B[C[A[j]]]);*/
		  System.out.println();
		  B[C[A[j]]] = A[j];
		  C[A[j]] = C[A[j]] - 1;
		  System.out.println();
		  for(int i=1; i<=7;i++){
			  System.out.print(B[i]+", ");
		  }
		  System.out.println();
		  for(int i=0; i<=k;i++){
			  System.out.print(C[i]+", ");
		  }
	  }

  }
}
