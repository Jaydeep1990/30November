package array;

import java.util.Arrays;

public class KKK {

	public static void main(String[] args) {
     /*   1        3 2 1   3 2 1   3           - - 3   3 - -      -  -  3  -  -     1      1 2 3
      *   1 2      2 1     3 2     2  3        - 2 3   3 2 -      -  2  3  2  -     2 1    2 3
      *   1 2 3    1       3       1  2  3     1 2 3   3 2 1      1  2  3  2  1     3 2 1  3
      */
		
		for(int i=3;i>=1;i--) {
			for(int j=i;j>=2;j--) {
				System.out.print("-");
			}for(int k=i;k<=3;k++) {
				System.out.print(k);
				
				
			}for(int l=2;l>=1;l--) {
				for(int m=l;m>=1;m--) {
					System.out.print("-");
				}for(int n=2;n>=l;n--) {
					System.out.print(n);
				}System.out.println();
				
			}
		}
		
		
		/*for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}*/
		
		/*for(int i=3;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}*/
/*		for(int i=1;i<=3;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(j);
				
			}System.out.println();
		}
		
*/		
		/*for(int i=3;i>=1;i--) {
			for(int j=i;j<=3;j++) {
				System.out.print(j);
			}System.out.println();
		}*/
		/*for(int i=3;i>=1;i--) {
			for(int j=i;j>=2;j--) {
				System.out.print("*");
			}for(int k=i;k<=3;k++) {
				System.out.print(k);
			}System.out.println();
		}*/
		/*for(int i=3;i>=1;i--) {
			for(int j=3;j>=i;j--) {
				System.out.print(j);
			}for(int k=i;k>=2;k--) {
				System.out.print("-");
			}System.out.println();
		}*/
		

		for(int i=0;i<5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}for(int k=1;k<=2*i-1;k++) {
				System.out.print(k);
			}System.out.println();
		}
		for(int l=5;l>0;l--) {
			for(int m=1;m<=5-l;m++) {
				System.out.print(" ");
			}for(int n=1;n<=2*l-1;n++) {
				System.out.print(n);
			}System.out.println();
		}
		
		
		for(int i=1;i<=3;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}
		
		int []jay= {10,29,8,38,3,29,77};
		
		int secondLoares = 0;int largest=0;
		for(int i=0;i<jay.length;i++) {
			if(jay[i]>secondLoares) {
				secondLoares=largest;
				largest=jay[i];
			}else if(jay[i]>largest) {
				secondLoares=jay[i];
			}
		}
		System.out.println(Arrays.toString(jay));
		System.out.println(secondLoares);
		
		
		
	/*	int jay[]= {10,20,30,30,50};
		int num=90;boolean flag=false;
		for(int i=0;i<jay.length;i++) {
			if(num==jay[i]) {
				System.out.println(jay[i]+"..available");
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("not available");
		}*/
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("*");
			}for(int k=1;k<=2*i-1;k++) {
				System.out.print(k);
			}System.out.println(); 
			
		}      for(int l=5;l>0;l--) {
				for(int m=1;m<=5-l;m++) {
					System.out.print("*");
				}for(int n=1;n<=2*l-1;n++) {
					System.out.print(n);
				}System.out.println();
			}
		
		
		
		 for(int i=1;i<=5;i++) {
			  for(int j=4;j>=i;j--) {
				  System.out.print(" ");
			  }for(int k=1;k<=i;k++) {
				  System.out.print("* ");
			  }System.out.println();
		  }
		  for(int l=1;l<=4;l++) {
			  for(int m=1;m<=l;m++) {
				  System.out.print(" ");
			  }for(int n=4;n>=l;n--) {
				  System.out.print("* ");
			  }System.out.println();
		  }
	}

	/*public static int getSecondLargest(int[] a, int total){  
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[total-2];  
	}  

	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));  
		}*/
	

/*	public static int second(int[]jay) {
		int temp;
		for(int i=0;i<jay.length;i++) {
			for(int j=i+1;j<jay.length;j++) {
				if(jay[i]<jay[j]) {
					temp=jay[i];
					jay[i]=jay[j];
					jay[j]=temp;
				}
			}
		}
		return jay[jay.length-4];
	}
	public static void main(String[] args) {

	int []jay= {3,30,44,52,77,88,6644};
	System.out.println(second(jay));*/
	
	
	
	/*String jay="jayadyeppdj";
	boolean flag=false;
	for(char i:jay.toCharArray()) {
		
		if(jay.indexOf(i)==jay.lastIndexOf(i)) {
			System.out.println("first non repeat character is "+i);
			flag=true;
			break;
		
	}
		
}
	if(flag==false) {
		System.out.println("not repeat chracter");
	}*/
	
	/*for(int i=1;i<=4;i++) {
		for(int j=3;j>=i;j--) {
			System.out.print(" ");
		}for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int l=1;l<=3;l++) {
		for(int m=1;m<=l;m++ ) {
			System.out.print(" ");
		}for(int n=3;n>=l;n--) {
			System.out.print("* ");
		}
		System.out.println();
	}*/
	}

