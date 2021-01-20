package p2562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		for(int j = 0; j < 9; j++) {
			list.add(Integer.parseInt(reader.readLine()));
		}
		int max = list.get(0);
		int next;
		for(int i = 1; i < list.size(); i++) {
			next = list.get(i);
			if(max < next) max = next;
		}
		System.out.printf("%d\n%d", max, list.indexOf(max)+1);
	}
}
