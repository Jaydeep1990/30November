package array;

public class JavaCharacter {
public static void main(String[] args) {
	String jay="jaydeep AUTOMATION 4567 chvan";
	String newString="";String loww="";
	int upp=0;int low=0;int digit=0;int count=0;
/*	for(int i=0;i<jay.length();i++) {
		char a=jay.charAt(i);
	char aa=	Character.toUpperCase(a);
	//	System.out.println(jay.charAt(i));
		//System.out.println((int)jay.charAt(i));
		if(Character.isUpperCase(a)) {
		//	upp++;
		//	System.out.println(a);
		}else if(Character.isDigit(a)) {
		//	digit++;
		//	System.out.println(a);
		}
		if(aa=='A'||aa=='E'||aa=='I'||aa=='U'||aa=='O') {
			  count++;
		}
	}
	System.out.println("upper case"+upp);
	System.out.println("lower case"+digit);
	System.out.println("count.."+count);*/
	
	//new string
	for(int i=0;i<jay.length();i++) {
		char a=jay.charAt(i);
		/*if(Character.isUpperCase(a)) {
			newString=newString+a;
			
		}else if(Character.isLowerCase(a)) {
			loww=loww+a;
		}*/
		
		/*if(Character.isUpperCase(a)) {
			newString=newString+Character.toLowerCase(a);
		}else {
			newString=newString+Character.toUpperCase(a);
		}*/
		newString=a+newString;//reverse string
		
	}
	//System.out.println(newString+" "+loww);
//	System.out.println(newString);
	if(newString.equals(jay)) {
	//	System.out.println("palandrom String");
	}else {
		//System.out.println("not palandrom String");
	}
	
	String cha="jaydeep chavan";
	String cha1="";
	for(int i=0;i<cha.length();i++) {
		char aa=cha.charAt(i);
		aa+=2;
		cha1=cha1+aa;
	}
	System.out.println(cha1);
}
}
