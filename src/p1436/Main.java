package p1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int count = 0;
		int num = 0;

		while(count < N) {
			num++;
			if(Integer.toString(num).contains("666")) {
				count ++;
			}
		}
		System.out.print(num);
	}

}
