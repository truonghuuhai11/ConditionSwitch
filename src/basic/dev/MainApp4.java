package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào hệ số a: ");
		double a = sc.nextDouble();
		System.out.println("Nhập vào hệ số b: ");
		double b = sc.nextDouble();
		System.out.println("Nhập vào hệ số c: ");
		double c = sc.nextDouble();

		double delta = b * b - 4 * a * c;

		switch (kiemTraDelta(delta)) {
		case "PhuongTrinhVoNghiem":
			System.out.println("Phương trình vô nghiệm.");
			break;
		case "PhuongTrinhCoMotNghiem":
			double x = -b / (2 * a);
			System.out.println("Phương trình có một nghiệm duy nhất x = " + x);
			break;
		case "PhuongTrinhCoHaiNghiem":
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có hai nghiệm x1 = " + x1 + " và x2 = " + x2);
			break;
		}
	}

	public static String kiemTraDelta(double delta) {
		if (delta < 0) {
			return "PhuongTrinhVoNghiem";
		} else if (delta == 0) {
			return "PhuongTrinhCoMotNghiem";
		} else {
			return "PhuongTrinhCoHaiNghiem";
		}
	}
}