package Com;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two value");
		int y=scan.nextInt();
		int z=scan.nextInt();
		y=y+z;
		z=y-z;
		y=y-z;
		System.out.println("After swapping");
		System.out.println("value of y and z are y="+y+"z="+z);
	

	}

}
