package com.cem3;

public class CustomStringTR {

	public static void main(String[] args) {

		CustomStringTR1 custom = new CustomStringTR1();

		custom.ifade = "�lk boost maratonum";

		System.out.println(custom.uzunluk());
		System.out.println(custom.kesme(6));
		System.out.println(custom.kesme(4, 6));
		System.out.println(custom.harfNe(5));
		System.out.println(custom.iceriyorMu("oos"));
		System.out.println(custom.neIleBasliyor("�"));
		System.out.println(custom.neIleBitiyor("num"));
		System.out.println(custom.harfDegistir("o", "x"));
		System.out.println(custom.esitMi("ilk boost maratonum"));
		System.out.println(custom.esitMi2("ilk boost maratonum"));
		System.out.println(custom.indexNumarasiNe("s"));

	}

}
