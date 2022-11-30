package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* String name="Jaydeep";
   String name1="Jaydeel";
  System.out.println(name.compareTo(name1));
    if(name.length()==name1.length()) {
    	try {
			for(int i=0;i<name1.length();i++) {
				if(name.charAt(i)==name1.charAt(i)) {
					System.out.println(name.charAt(i)+" same character");
				}else {
					System.out.println("not eaual both string");
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("String is not equal");
		}
    	
    }*/
		
		//state-teste 
	/*	String s="elbow";
		String s1="below";
		if(s.length()==s1.length()) {
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s1.length();j++) {
				if(s.charAt(i)==s1.charAt(j)) {
					System.out.println(s.charAt(i)+"is available");
					break;
				}if(j==s.length()-1) {
					System.out.println(j);
					if(s.charAt(i)==s1.charAt(j)) {
						System.out.println(s.charAt(i)+"is available");
				}else {
					System.out.println(s.charAt(i)+"not present");
				}
			}
		}
	}

}*/
	/*	String jay1="jaydeep chavan";
		char [] jay=jay1.toCharArray();
		for(int i=0;i<jay.length;i++) {
			int count=1;
			for(int j=i+1;j<jay.length;j++) {
				if(jay[i] == jay[j]&&jay[i]!=' ') {
					count++;
					jay[j]='0';//avoid printing visited character
				}
			}
			if(count==2&&jay[i]!='0') {//duplicate if count is greater than 1 
				System.out.println(jay[i]+"..comes.."+count+"..times");
			}
		}*/
	/*	String jay="character";
	
		for(int i=0;i<jay.length();i++) {
			int count=1;
		for(int j=i+1;j<jay.length();j++) {
			if(jay.charAt(i)==jay.charAt(j)) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(jay.charAt(i)+"comes"+count+"times");
		}
		}*/
	/*	String kaka="jaydeep jay";
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<kaka.length();i++) {
			hs.add(kaka.charAt(i));
		}
   	System.out.println(hs);
		
		String s="good morining";
	    String ans="";
	            
           
	           while(s.length()>0)
	        {
	           char ch = s.charAt(0);
	            ans+= ch;//temp=temp+aa;
	            s = s.replace(ch+"",""); //Replacing all occurrence of the current character by a spaces
	        }
	   System.out.println("after removing all duplicate letters:"+ans);
	    */
	/*	String name="sampada";
		//System.out.println(name.replace("n", ""));
		System.out.println("jaydeep");
		System.out.println("chavan");
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					System.out.println(name.replaceAll(Character.toString(name.charAt(i)), ""));
				}
			}
		}*/
		char []jayp= {'a','b','c','d'};
		String a=new String(jayp);
		System.out.println(a);
		String kaka="jaydeep";
		char[]pp=kaka.toCharArray();
		char ii='a';
		String i=Character.toString(ii);
		ArrayList e=new ArrayList(Arrays.asList(jayp));
		System.out.println(e);

	/*	int jay[]= {1,2,3,4,6,8,2};int sum=0,sum1=0;
		int ele=30;
		boolean falg=false;
		for(int i=0;i<jay.length;i++) {
			if(ele==jay[i]) {
				System.out.println(jay[i]+"available");
				falg=true;
			}
		}
		if(falg==false) {
			System.out.println("not available");
		}*/
	/*	String a="jaydeep";
		String b="chavan";
		a=a+b;
		b=a.substring(0, 7);
		a=a.substring(7,13);
		System.out.println(a);
		System.out.println(b);*/
		/*	int []jay= {3,4,6,7,3,7,9};
	     
		for(int i=0;i<jay.length;i++) {
			int temp;
			for(int j=i+1;j<jay.length;j++) {
				if(jay[i]>jay[j]) {
					
					temp=jay[i];
				//	System.out.println(jay[i]);
				jay[i]=jay[j];
				jay[j]=temp;
				//System.out.println(temp);
				}
			}
		}
		for(int a:jay) {
			System.out.println(a);
		}*/
		/*	String []kaka= {"jay","cha","kaka","pra"};
			for(int i=0;i<kaka.length;i++) {
				String temp="";
				for(int j=i+1;j<kaka.length;j++) {
					if(kaka[i].compareTo(kaka[j])<0) {
						temp=kaka[i];
						kaka[i]=kaka[j];
						kaka[j]=temp;
					}
				}
			}
			for(String kk:kaka) {
				System.out.println(kk);
			}*/
		/*	String kk[]= {"jay","cha","van","papa"};
			int ascc=000;
			String small="";
			for(String jj:kk) {
			//char[]pp=jj.toCharArray();
			int charVal=pp[0];
			if(charVal>ascc) {
				ascc=charVal;
				small=jj;
			}
			}
			System.out.println(small);*/
		/* int a=1;int b=10;int c=10;
		   if(a==b&&b==c) {
			   System.out.println("both are same");
		   }else if(a>b&&a>c) {
			   System.out.println("a is greater");
		   }else if(b>a&&b>c) {
			   System.out.println("b is greater");
		   }else if(c>a&&c>b) {
			   System.out.println("c is greater");
		   }
		   else if(a==b&&c>a) {
			   System.out.println("c is greater a b same");
		   }else if(b==c&&a>c) {
			   System.out.println(" ais greater b  c same");
			   
		   }else if(c==a && b>a) {
			   System.out.println(" b is greater c a same");
		   }
		   else if(a==b) {
			   System.out.println("a b same c is smaller");
			   
		   }else if(b==c) {
			   System.out.println("b c same a is smalller");
		   }else if(a==c) {
			   System.out.println(" a c same b is smaller");
		   }*/
		
		/* String jay="fhhakltliolw";//print capital and diff positon do work
		   String []kk= jay.split("");
		   for(int i=1;i<kk.length;i+=2) {
			   System.out.print(kk[i]);
		   }*/
		   String ok="jaydeepchavanfgkdsg";//ch and ds
		   System.out.println(ok.substring(7, 9)+ok.substring(16, 18));
		   
		   
			/*    String jay="jaydeep is good autoamtion tester in the pune city tester city pune tester is is";
			String []str=jay.split(" ");
			int count;
			HashMap<String,Integer>hm=new HashMap<String,Integer>();
			for(int i=0;i<str.length;i++) {
				if(hm.containsKey(str[i])) {
					count=hm.get(str[i]);
					hm.put(str[i], count+1);
				}
				else {
					hm.put(str[i],1);
				}
			}
			System.out.println(hm);   */
		   
	/*	 //copy array
			int []jay= {1,2,3,4,5,6};
			int []jay1=jay;
			jay[4]=999;//change value;
			for(int i=0;i<jay.length;i++) {
				System.out.print("origanal "+jay[i]+"\t");
				
			}
			for(int j=0;j<jay1.length;j++) {
				System.out.print("copy "+jay1[j]+"\t");
			}*/
		   
		   //Anagram
		   
		   String jay1="jaydeep";
			  String jay2="jaydeel";
			    // check if length is same
			    if(jay1.length() == jay2.length()) {

			      // convert strings to char array
			      char[] charArray1 = jay1.toCharArray();
			      char[] charArray2 = jay2.toCharArray();

			      // sort the char array
			      Arrays.sort(charArray1);
			      Arrays.sort(charArray2);

			      // if sorted char arrays are same
			      // then the string is anagram
			      boolean result = Arrays.equals(charArray1, charArray2);

			      if(result) {
			        System.out.println(jay1 + " and " + jay2 + " are anagram.");
			      }
			      else {
			        System.out.println(jay1 + " and " + jay2 + " are not anagram.");
			      }
			    }
			    else {
			      System.out.println(jay1 + " and " + jay2 + " are not anagram.");
			    }
	}
	
}
