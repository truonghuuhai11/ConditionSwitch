package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào số a: ");
		int a = sc.nextInt();
		System.out.print("Nhập vào số b: ");
		int b = sc.nextInt();
		System.out.print("Nhập vào số c: ");
		int c = sc.nextInt();

		switch (kiemTraCacCanh(a, b, c)) {
		case "TamGiac":
			System.out.println("Ba số " + a + ", " + b + ", " + c + " là các cạnh của một tam giác.");
			break;
		default:
			System.out.println("Ba số " + a + ", " + b + ", " + c + " không tạo thành một tam giác.");
			break;
		}
	}

	public static String kiemTraCacCanh(int a, int b, int c) {
		if (a + b > c && a + c > b && b + c > a) {
			return "TamGiac";
		} else {
			return "KhongPhaiTamGiac";
		}
	}
}
