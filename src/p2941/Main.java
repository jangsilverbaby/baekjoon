package p2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String S = reader.readLine();
		String[] s = S.split("");
		String c;
		int count = 0, count1 = 0, count2 = 0, count3 = 0;
		for(int i = 0; i < s.length - 1; i++) {
			c = String.format("%s%s", s[i], s[i+1]);
			switch(c) {
			case "c=":
			case "c-":
			case "d-":
			case "lj":
			case "nj":
			case "s=":
			case "z=":
				count2 +=1;
				
			}
		}
		for(int i = 1; i < s.length - 1; i++) {
			c = String.format("%s%s%s",s[i-1], s[i], s[i+1]);
			switch(c) {
			case "dz=":
				count3 +=1;
			}
		}
		if(count3 > 0) count2 -= count3;	
		count1 = s.length - (2 * count2 + 3 * count3);
		if(count1 < 0) count1 = 0;
		count = count1 + count2 + count3;
		
		System.out.println(count);
		
	}


}
