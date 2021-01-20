package p1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String S = reader.readLine();
		char[] s = S.toCharArray();
		int i, m = 0, count = 0;
		char c, max = 0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();

		for(i = 0; i < s.length; i++) {
			c = Character.toUpperCase(s[i]);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.replace(c,map.get(c)+1);
			}
			
			if(m < map.get(c)) {
				m = map.get(c);
				max = c;
			}
		}
		for(Integer n : map.values()) {
			if (n == m) count++;
		}
		
		System.out.println(count > 1 ? "?" : max);
	}

}
