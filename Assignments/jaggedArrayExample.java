// New Concept - Jagged Array.

public class jaggedArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int array[][] = new int [3][]; //only define the number of rows.
         
         //define and initialize Jagged array 
         array[0] = new int[] {1,2,3};// define the number of columns.
         array[1] = new int[] {4,5};
         array[2] = new int[] {6,7,8,9,10};
         
         //display Jagged array
         System.out.println("Two Dimentional Jagged Array:");
         
         for(int i=0;i<array.length;i++) {
        	 for(int j=0;j<array[i].length;j++) {
        		 System.out.print(array[i][j]+"");
        		 System.out.println();
        	 }
         }
         
	}

}
