package p3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] remains = new int[10];
		int remain;
		int count = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < 10; i++) remains[i] = Integer.parseInt(reader.readLine()) % 42;
		for(int i = 0; i < 42; i++) map.put(i,0);
		for(int i = 0; i < remains.length; i++) {
			remain = map.get(remains[i]);
			map.replace(remains[i], remain + 1);
			
		}
		for(int i = 0; i < 42; i++) if(map.get(i) > 0) count++;
		
		System.out.println(count);
	}

}
