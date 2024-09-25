// print the additon of 3D array using for each.

public class array2DForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0;
       int array[][] = new int [3][5];
       
       for(int i=0;i<3;i++) 
    	   for(int j=0;j<5;j++)
    		   array[i][j] = (i+1) * (j+1);
       
       System.out.println("print 2D array");
       
       for(int i=0;i<3;i++) {
    	   for(int j=0;j<5;j++) {
   		       System.out.print(array[i][j]+" ");
    	   } 
    	  System.out.println();
        }
       
       System.out.println("--------------------");
       
       for(int x[] : array) {
    	     for(int y : x) {
    	    	 System.out.println("Value is:"+y);
    	    	 sum += y;
    	     }
       }
       
       System.out.println("Sum ="+sum);
	}

}
