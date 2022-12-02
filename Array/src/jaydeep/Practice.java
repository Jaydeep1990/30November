package jaydeep;

import java.util.Arrays;
import java.util.Collections;

public class Practice {

	public static void main(String[] args) {
	
               String jay="jaydeep is good automation tester";
		String name="jaydeep chavan";
		
	char[]array=  name.toCharArray();
	for(int i=0;i<array.length;i++) {
		int count=1;
		for(int j=i+1;j<array.length;j++) {
			if(array[i]==array[j]&&array[i]!=' ') {
				count++;
				array[j]='0';
			}
		}
		if(count==3&&array[i]!='0') {
			System.out.println(array[i]+".comes"+count+".times");
		}
	}
	
	}
	}
	


		





