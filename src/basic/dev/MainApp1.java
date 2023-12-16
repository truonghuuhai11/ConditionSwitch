package basic.dev;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập một số nguyên: ");
		int n = sc.nextInt();

		switch (kiemTraSoNguyen(n)) {
		case 1:
			System.out.println(n + " là số nguyên dương");
			break;
		case -1:
			System.out.println(n + " là số nguyên âm");
			break;
		default:
			System.out.println(n + " không phải là số nguyên dương hay âm");
			break;
		}
	}

	static int kiemTraSoNguyen(int n) {
		if (n > 0) {
			return 1;
		} else if (n < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
