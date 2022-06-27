package com.cem1;

import java.util.Scanner;

public class Aritmetik {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aritmetik1 aritmetik1 = new Aritmetik1();

		int[] dizi = { 1, 2, 3, 4, 5 };
		int islem;
		System.out.print("Yapýlmasý Ýstenen Ýþlemi Seçin(1- Dört Ýþlem, 2- Alan Hesabý): ");
		islem = scanner.nextInt();
		scanner.nextLine();
		switch (islem) {

		case 1:
			String hesaplama;
			System.out.print("Yapýlmasý istenen iþlemi girin(topla, cikar, carp, bol): ");
			hesaplama = scanner.nextLine();
			System.out.println(aritmetik1.DortIslem(dizi, hesaplama));
			break;

		case 2:
			aritmetik1.AlanHesapla();
			break;

		default:
			break;
		}

	}

}
