package p2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();	
		int ar = a - 1;
		int br = b - 45;
		
		if (br >= 0) System.out.printf("%d %d", a,br);
		else if (ar >= 0 && br < 0) System.out.printf("%d %d", ar, br + 60);
		else if (ar < 0 && br < 0) System.out.printf("%d %d", ar + 24, br + 60);
		else System.out.printf("%d %d", a,b);
	}
}
