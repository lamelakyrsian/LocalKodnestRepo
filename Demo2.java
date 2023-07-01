package Com;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two value");
		int y=scan.nextInt();
		int z=scan.nextInt();
		System.out.println("Before swapping");
		System.out.println("The value you enter are y="+y+" z="+z);
		int temp=y;
		y=z;
		z=temp;
		System.out.println("After swapping");
		System.out.println("The value are y="+y+" z="+z);
	}

}
