package p1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine(), " ");
		int x = Integer.parseInt(token.nextToken());
		int y = Integer.parseInt(token.nextToken());
		int w = Integer.parseInt(token.nextToken());
		int h = Integer.parseInt(token.nextToken());
		
		int distance[] = {x,y,w-x,h-y};
		int min = distance[0];
		
		for(int i = 1; i < distance.length; i++) {
			if(min > distance[i]) min = distance[i];
		}
		System.out.print(min);
		
	}

}
