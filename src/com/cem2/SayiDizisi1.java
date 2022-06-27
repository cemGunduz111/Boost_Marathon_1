package com.cem2;

import java.util.Scanner;

public class SayiDizisi1 {

	Scanner scanner = new Scanner(System.in);

	public int[] ekle(int dizi[], int sayiEkle) {

		int yeniDizi[] = new int[dizi.length + 1];

		for (int i = 0; i < dizi.length; i++) {
			yeniDizi[i] = dizi[i];
		}
		yeniDizi[yeniDizi.length - 1] = sayiEkle;
		return yeniDizi;
	}

	public int[] sil(int dizi[], int sayiSil) {

		int silinecekAdet = 0;

		for (int i : dizi) {
			if (i == sayiSil)
				silinecekAdet++;
		}

		int yeniDizi[] = new int[dizi.length - silinecekAdet];
		int index = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (sayiSil != dizi[i]) {
				yeniDizi[index] = dizi[i];
				index++;
			}
		}

		return yeniDizi;
	}

	public int[] arayaEkle(int[] dizi, int arayaEklenecek, int index) {

		int[] yeniDizi = new int[dizi.length + 1];
		int yanaKaydir = 0;
		for (int i = 0; i < dizi.length; i++) {
			if (index == i) {
				yeniDizi[i] = arayaEklenecek;
				yeniDizi[i + 1] = dizi[i];
				yanaKaydir = 1;
			} else {
				yeniDizi[i + yanaKaydir] = dizi[i];
			}
		}
		return yeniDizi;
	}

	public void liste(int[] dizi) {

		String liste = "";
		for (int i : dizi) {
			liste = liste + i + " ";
		}
		System.out.println("---------------");
		System.out.println("Liste: " + liste);

	}
}