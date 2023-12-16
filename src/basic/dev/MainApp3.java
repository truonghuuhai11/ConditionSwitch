package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập vào một tháng trong năm: ");
		int thang = sc.nextInt();

		int soNgay;
		
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			soNgay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			soNgay = 30;
			break;
		case 2:
			soNgay = 28;
			break;
		default:
			System.out.println("Tháng không hợp lệ.");
			return;
		}

		System.out.println("Tháng " + thang + " có " + soNgay + " ngày.");
	}
}
