package array;


public class GoodMoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2   00 01   10 00  4  1    11  10  3 4    01  11 2 3
		//4 3   10 11    11 01  3  2    00  01  1 2    00  10 1 4
   //   int [][]jay= {{1,2},{4,3}};
  /*    for(int i=0;i<jay.length;i++) {
    	  for(int j=0;j<jay[0].length;j++) {
    		  System.out.print(jay[i][j]+" ");
    	  }System.out.println();
      }*/
      
		
      
   /*  for(int i=0;i<jay.length;i++) {
    	  for(int j=1;j>=0;j--) {
    		  System.out.print(jay[j][i]+" ");
    	  }System.out.println();
      }*/
     
     
     /* for(int i=1;i>=0;i--) {
    	  for(int j=1;j>=0;j--) {
    		  System.out.print(jay[i][j]+" ");
    	  }System.out.println();
      }*/
      
     /* for(int i=1;i>=0;i--) {
    	  for(int j=0;j<=1;j++) {
    		  System.out.print(jay[j][i]+" ");
    	  }System.out.println();
      }*/
		/* 1 2 3  00 01 02  20 10 00  20 21 22
		 * 4 5 6  10 11 12  21 11 01  10 11 12
		 * 7 8 9  20 21 22  22 12 02  00 01 02
		 */
		
		
      int [][]jay= {{1,2,3},{4,5,6},{7,8,9}};
      for(int i=0;i<3;i++) {
    	  for(int j=0;j<3;j++) {
    		  System.out.print(jay[i][j]+" ");
    	  }System.out.println();
      }
  /*    for(int i=0;i<=2;i++) {
    	  for(int j=2;j>=0;j--) {
    		  System.out.print(jay[j][i]+" ");
    	  }System.out.println();
      }*/
      for(int i=2;i>=0;i--) {
    	  for(int j=0;j<3;j++) {
    		  System.out.print(jay[i][j]+" ");
    	  }System.out.println();
      }
	}	
	
}

		
	
