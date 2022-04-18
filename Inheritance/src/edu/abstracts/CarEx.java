package edu.abstracts;

import java.util.Scanner;

public class CarEx {
	public static void main(String[] args) {
		// 메뉴: 시동켜기, 출발하기, 운행, 멈춤, 시동끄기
		Scanner scn = new Scanner(System.in);

		// Sonata car = new Sonata();
		// Avante car = new Avante();

		Car car = null;
		car = new Sonata();
		car = new Avante();

		while (true) {

			System.out.println("==============================================");
			System.out.println("1.시동켜기 | 2.출발하기 | 3.운행 | 4.멈춤 | 5.시동끄기");
			System.out.println("==============================================");
			System.out.println("선택 >>> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				car.turnOn();
			} else if (menu == 2) {
				car.start();
			} else if (menu == 3) {
				car.run();
			} else if (menu == 4) {
				car.stop();
			} else if (menu == 5) {
				car.turnOff();
			} else {
				break;
			}

		}
		System.out.println("End of Program");
	}
}
