package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Practice {
public static void main(String[] args) {
 /* String []jay= {"jay","chav","atuomation","tester"};
  ArrayList j=new ArrayList(Arrays.asList(jay));
  System.out.println(j);
  char a='a';
 String s= Character.toString(a);
 String kk="jaydeep";
char[]ok= kk.toCharArray();
System.out.println(ok);
char []pp= {'a','b','c','d'};
String h=new String(pp);
System.out.println(h);
String hh=String.valueOf(pp);
System.out.println(hh);*/
String a="jaydeep";
char[]kk=a.toCharArray();
String.valueOf(kk);
String aa=new String(kk);
char p='p';
String u=Character.toString(p);
HashSet<String> ju=new HashSet<String>();
ArrayList<String>lo=new ArrayList<String>(ju);

/*int []jay= {1,2,3,5,3,6,3,7};
HashSet set=new HashSet();
for(int i=0;i<jay.length;i++) {
	set.add(jay[i]);
}
set.toArray(new Integer[set.size()]);
System.out.println(Arrays.toString(set.toArray(new Integer[set.size()])));*/
		
/*int []jay= {3,5,78,4,3,5,22};
HashSet<Integer> hs=new HashSet<Integer>();
for(int i=0;i<jay.length;i++) {
	hs.add(jay[i]);
}
for(int a:hs) {
	System.out.println(a);
	
}*/

/*String jay[]= {"jay","cha","kaka","sud","jay"};


HashSet<String> kk=new HashSet<String>();
for(int j=0;j<jay.length;j++) {
	kk.add(jay[j]);
}
for(String a:kk) {
	System.out.println(a);
}*/

/*char jay[]= {'a','b','d','a','p'};


HashSet<Character> kk=new HashSet<Character>();
for(int j=0;j<jay.length;j++) {
	kk.add(jay[j]);
}
for(char a:kk) {
	System.out.println(a);
}*/
		

	/*	int []k= {1,2,3,2,5,7,3};
		for(int i=0;i<k.length;i++) {
		for(int j=i+1;j<k.length;j++) {
			if(k[i]==k[j]) {
				System.out.println(k[i]+" duplicate element");
			}
		}
		}*/
	/*	int []ips= {1,2,4,2,5,7};
		HashSet set=new HashSet();
		for(int i=0;i<ips.length;i++) {
			if(set.add(ips[i])==false) {
				System.out.println(ips[i]+"..duplicate element");
				
			}
		}*/

/*String s1=new String("jaydeep");//create new  object s1 heap and class memory both
String s2=new String("jaydeep");//create  new onject s2 in heap only not class 
System.out.println(s1==s2);//adress is diff or reference is diff      false
System.out.println(s1.equals(s2));//check only contains same          true
String s3="chavan";//create class memory only 
String s4="chavan";//use already created class memory
System.out.println(s3==s4);// address is same or reference is same    true
System.out.println(s3.equals(s4));// contain is same                  true   (.equal method is object class method)


String a=new String("kaka");
String b="kaka";
System.out.println(a==b); //adress is diff or reference is diff      false
System.out.println(a.equals(b));//check only contains same          true




*/
/*String jay="jaydeep";
byte[]chavan=jay.getBytes();
System.out.println(Arrays.toString(chavan));

byte[]test= {'T','e','s','t'};
byte[]pra= {112,113,70,100};

String t=new String(test);
String p=new String(pra);
System.out.println(t);
System.out.println(p);*/

/*String []jay= {"jay","cha","van","tata","nana"};
int assi=1000;
String kk="";
for(String a:jay) {
	char [] jj=a.toCharArray();
	int value=jj[0];
	System.out.println(value);
	if(value<assi) {
		assi=value;
		kk=a;
	}
}
System.out.println(kk);*/

//pterson Number
int jay=145;
int temp=jay;

int sum=0;
while(jay>0) {
	int remi=jay%10;
	int prod=1;
	for(int i=1;i<=remi;i++) {
		prod=prod*i;
	}
	sum=sum+prod;
	jay=jay/10;
}
System.out.println(sum);
if(temp==sum) {
	System.out.println("piterson");
}else {
	System.out.println("not piterson");
}
//Content equal
//check only character sequence in any stringBuffer and bulder also string 
//but string equls method check character only string
/*
   String a="jaydeep";
  StringBuffer br=new StringBuffer("jaydeep");
  System.out.println(a.equals(br));//false
  System.out.println(a.contentEquals(br));//true
 
 
  String jay="jaydeep chavan";
System.out.println(jay.contains("jaydee"));//true
System.out.println(jay.contains("hak"));//flase

String s1="jay is good body";
String s2="jay is good body";
System.out.println(s1.contentEquals(s2));//true//all string should be same
String s3="jay is good";
String s4="jay is good Body";
System.out.println(s3.contentEquals(s1));//false
System.out.println(s3.contentEquals(s4));//false upper case should be match
if(s1.contentEquals(s4)) {
	System.out.println("correct");
}else {
	System.out.println("not correct");
}*/


/*String jay="jaydeep";// return type is boolen
String jay1="";
System.out.println(jay.isEmpty());
System.out.println(jay1.isEmpty());

String ab=new String("jay");
 //String ac=ab;
 String ac=ab.intern();
 System.out.println(ab==ac);      
 //before inern refer same memory heap and class memory       True
 //after intern refer diff memory heap and class memory       false
	
	
	//Match method in string return type is boolean
         String jay="jaydeepA12";
      //   System.out.println(jay.matches("[a-zA-Z0-9]+"));
         
         String []kk= {"jay","jayA","jay123","GHH","456","JA11"};
         for(String a:kk) {
        	 if(a.matches("[0-9A-Z]+")){
        		 System.out.println(a);
        	 }
         }


//////////////Trangle /////////////
int a = 7;
int b = 7;
int c = 0;
if (a == b && b == c && c == a) {
	System.out.println("Equilateral Trangle");
} else if (a == b || b == c || c == a) {
	System.out.println("Isoceles Trangle");
} else if (a != b || b != c || c != a) {
	System.out.println("scalene Trangle");
}
*/
}
}



