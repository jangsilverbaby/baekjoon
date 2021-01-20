package p2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		String[] al = a.split("");
		String[] bl = b.split("");
			
		int r1 = Integer.valueOf(a) * Integer.valueOf(bl[2]);
		int r2 = Integer.valueOf(a) * Integer.valueOf(bl[1]);
		int r3 = Integer.valueOf(a) * Integer.valueOf(bl[0]);
		int r4 = r1 + r2*10 + r3*100;
				
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
