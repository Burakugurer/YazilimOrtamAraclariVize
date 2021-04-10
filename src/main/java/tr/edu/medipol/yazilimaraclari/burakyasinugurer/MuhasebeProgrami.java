package tr.edu.medipol.yazilimaraclari.burakyasinugurer;

import java.util.Scanner;

public class MuhasebeProgrami {
	
	
	public static void main(String[] args) {
		
		System.out.print(veriyolu());
	}
	
	
	private static class Ucret {
		int calisilanSaat;
		int saatlikUcret;
		int ucret;
	}
	
	
	public static int ucretHesapla(int calisilanSaat, int saatlikUcret) {
		int ucretHesapla =  calisilanSaat * saatlikUcret;
		return ucretHesapla;
		
		}
	
	public static int veriyolu() {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Calistiginiz saati girin: ");
        int calisilanSaat = scan.nextInt();
        System.out.println("Saatlik ucretinizi girin: ");
        int saatlikUcret = scan.nextInt();
       int ucretHesaplama = ucretHesapla(calisilanSaat,saatlikUcret);
       return ucretHesaplama;
		
	}
	
}