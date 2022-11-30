package array;

public class IFLoop {
public static void main(String[] args) {
	System.out.println("--1--");
	int age=20;
	if(age>10) {
		System.out.println("A");
	}
	if(age>15) {
		System.out.println("B");
	}
	if(age>19) {
		System.out.println("C");
	}
	else//without else D is execate 
	System.out.println("D");
	System.out.println("E");
	System.out.println("--2--");
	int i=50;
	if(i>20) {
		System.out.println("A");
	}
	else if(i>30) {
		System.out.println("B");
	}
	else if(i>40) {
		System.out.println("C");
	}
	else {
		System.out.println("D");
	}
	
	System.out.println("--3--");
	int n=0;
	if(n>0) {
		System.out.println(n);
	}
	else
		System.out.println("yes");
	System.out.println("No");
	
	
	System.out.println("--4--");
	int k=11;
	if(k>=0&&k<=5) {
		if(k==1) {
			System.out.println("one");
		}else if(k==2){
			System.out.println("two");
		}else {
			System.out.println("any 3,4,5");
		}
	}
	else {
		if(k<10&&k>=5) {
			if(k<10) {
				System.out.println("less than 10 and more than 5");
			}
			
		}
		else {
			System.out.println("grater than 10");
		}
	}
	
	
	System.out.println("--5--");
	int x=20;
	int y=25;
	if(++x<(y=y-4)||(x=x+=4)>y) {
		System.out.println(x+".."+y);//25..21
	}
	
	System.out.println("--6--");
	int a=2*3-8/2;
	int b=8-3*2+44%8-3;
	if(++a>1||-b<20) {
		System.out.println(a+".."+b);
	}
	System.out.println("--7--");
	int v=77;
	//v%=5;
	v=v/5;;
	System.out.println(v);
}
/*int jay=350;
if(jay>=200) {
	if(jay==200) {
		System.out.println("200");
	}
	else if(jay>200 &&jay<=300) {
		System.out.println("jay between 200 and 300");
	}
	else if(jay>=301 &&jay<400) {
		if(jay<350) {
			System.out.println("jay 300 to 350");
		}
		else {
			System.out.println("jay 350 to 400");
		}
	}
	else {
		System.out.println("greater than 400");
	}
}
else {
	System.out.println("jay less 200");
}
*/


}


