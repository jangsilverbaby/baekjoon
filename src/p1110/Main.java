package p1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] sl;
		String s = reader.readLine();
		int count = 0;
		int result = 0;
		String newNum;

		if(s.length() < 2) { 
			s = "0" + s;
			sl = s.split("");	
		}else {		
			s = s;
			sl = s.split("");
		}
		while(true) {	
			count++;
			result =Integer.parseInt(sl[0]) + Integer.parseInt(sl[1]);
			if(result > 9) {
				String ss = String.valueOf(result);
				result = Integer.parseInt(ss.split("")[1]);
			}
			newNum = sl[1] + String.valueOf(result);
			if(s.equals(newNum)) break;
			sl[0] = sl[1];
			sl[1] = String.valueOf(result);
		}
		System.out.println(count);
		reader.close();
	}
}
