package p1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String[] array = new String[N];
		int count = 0;
		for(int i = 0; i < N; i++) {
			count += continuity(reader.readLine());
		}
		
		System.out.println(count);
	
	}
	
	public static int continuity(String S) {
		String[] s = S.split("");
		ArrayList list = new ArrayList();
		int count = 1;
		for(int i = 0; i < s.length - 1; i++) {
			if(s[i].equals(s[i+1])) { // String 무조건 equals!!!!
				list.add(s[i]);
			} else {
				if(list.contains(s[i+1])) {
					count = 0;
					break;
				} else {
					list.add(s[i]);
				}
			}
		}

		return count;
	}

}
