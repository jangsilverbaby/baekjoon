package p10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder builder = new StringBuilder();
		String s = reader.readLine();
		char[] array;
		Map<Character,Integer> map = new HashMap<Character,Integer>();

		array = s.toCharArray();
		for(int i = (int)'a'; i <= (int)'z'; i++) {
			map.put((char)i, -1);
		}
		for(int i = (int)'a'; i <= (int)'z'; i++) {
			for(int j = s.length()-1; j >= 0; j--) {
				if (array[j] == (char)i) {
					map.replace((char)i, j);
				}
			}
			builder.append(map.get((char)i)).append(" ");
		}
		System.out.println(builder);
	}

}
