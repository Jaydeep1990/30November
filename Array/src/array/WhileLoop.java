package array;

public class WhileLoop {
public static void main(String[] args) {
System.out.println("----1-----");
	int a=0;
	while(a++<5) {
		System.out.println(a);
	}
System.out.println("...2...");
int b=0;
while(++b<5) {
	System.out.println(b);
}
System.out.println("------3-----");
int c=5;
while(c>5) {
	System.out.println(c);
	
}
System.out.println("----4------");
int d=5;
while(d>0) {
//	System.out.println(d);
	//d++;//infinite lopp
}
System.out.println("---5-----");
int e=75;
while(e!=0) {
	System.out.println(e);
	e/=5;//e*=2;e=e*4,e=e/5
}
System.out.println("-----6----");
int i=0;
while(i<5||i++<2) {
	System.out.println(i);
	i++;
}
System.out.println("----7---");
int j=1,s=0;
while(j++<5) {
	s=s+j;
	System.out.println(s);
}
System.out.println("---8---");
int k=1,x=0;
while(k++<5) 
	x=x+k;
	System.out.println(x);
System.out.println("----9---");
int l=0,z=0;
while(l++<5); {
	System.out.println(l);//check +use before and after check ans
}
System.out.println("---10----");
int f=2;
while(true) {
	if(f==10) {
		System.out.println(f);
		break;
	}
	f++;
}
/*System.out.println("-----diff----loginc---");
int m=2;
while(m<12) {
	if(m%3==0) {
		System.out.println("S");
		m++;
	}
	else if(m>10) {
		System.out.println("I");
	}
	else if(m<10) 
		System.out.println("C");
	m+=2;//ccss ans
	
}
System.out.println("----2---diffloginc-----");{
	int x=2,y=50;
	while(x<y) {
		y=y/x;//25 12 6
		if(y%2==0) {
			//System.out.println(y);
			continue;
		}
		else if(y%3==0)
			break;
		System.out.println(y+"");
	}
}
*/}
}
