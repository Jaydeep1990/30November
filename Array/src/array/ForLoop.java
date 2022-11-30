package array;

public class ForLoop {
public static void main(String[] args) {
	/*System.out.println("--1--");
	for(int i=0;i<5;i++) {
		System.out.println(i);
	}
	System.out.println("--2--");
	for(int i=5;i<0;i++) {
		System.out.println(i);
	}
	System.out.println("--3--");
	for(int i=5;i>0;i++) {
		//System.out.println(i);//infinite loop
	}
	System.out.println("--4--");
	for(int i=5;i>=0;i--) {
		System.out.println(i);
	}
	System.out.println("--5--");
	//for(int i=1;i<true;i++) {
		//true is not use understatnd
	//}
	System.out.println("--6--");
	int j=0,s=0;
	for( j=1;j<5;j++) {
		s=s+j;
		System.out.println(s);//1 3 6 10
	}
	System.out.println("--7--");
	int s1=0;
	for(int i=1;i<5;i++) {
		s1=s1+i;
	}
	System.out.println(s1);
	System.out.println("---8---");
	int s2=0;int k=0;
	for( k=1;k<5;k++); {
		s2=s2+k;
		System.out.println(s2);
	}*/
	
	System.out.println("--difflogic---");
	for(int i=2;i<12;i+=2) {
		if(i%3==0) {
			System.out.println("S");
		}
		else if(i<10) {
			System.out.println("L");
		}
		else
			System.out.println("M");
	}
//	System.out.println("a");
//llslm
	System.out.println("--2-diff loginc--");
	int x=2,y=0;
	for(;y<10;++y) {
		if(y%x==0)
			continue;
		else if(y==4)
			break;
		else if(y==7)
			break;
		else
			System.out.println(y);//1 3 5
	}
}
}
