package com.cem2;

public class SayiDizisi {

	public static void main(String[] args) {

		SayiDizisi1 sayiDizisi1 = new SayiDizisi1();

		int dizi[] = new int[0];

		dizi = sayiDizisi1.ekle(dizi, 1);
		dizi = sayiDizisi1.ekle(dizi, 2);
		dizi = sayiDizisi1.ekle(dizi, 3);
		dizi = sayiDizisi1.ekle(dizi, 4);
		dizi = sayiDizisi1.ekle(dizi, 5);
		dizi = sayiDizisi1.ekle(dizi, 12);
		dizi = sayiDizisi1.ekle(dizi, 3);
		dizi = sayiDizisi1.ekle(dizi, 6);
		dizi = sayiDizisi1.ekle(dizi, 4);

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		dizi = sayiDizisi1.sil(dizi, 3);

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}

		System.out.println();

		sayiDizisi1.liste(dizi);

		dizi = sayiDizisi1.arayaEkle(dizi, 111, 2);

		sayiDizisi1.liste(dizi);

	}

}
