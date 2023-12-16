package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào một số nguyên n: ");
		int n = sc.nextInt();

		switch (n % 15) {
		case 0:
			System.out.println("Số " + n + " chia hết cho cả 3 và 5.");
			break;
		case 3:
			System.out.println("Số " + n + " chia hết cho 3.");
			break;
		case 5:
			System.out.println("Số " + n + " chia hết cho 5.");
			break;
		default:
			System.out.println("Số " + n + " không chia hết cho cả 3 và 5.");
		}
	}
}
