package oop_basitKutuphaneYonetim;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class Main {

	static HashMap<Long, Calisan> calisanListesi = new HashMap<>();
	static HashMap<Long, Uye> uyeListesi = new HashMap<>();
	static HashMap<Long, Kitap> kitapListesi = new HashMap<>();
	
	public static void main(String[] args) {
		
		// kütüphanedeki kitapları oluşturup kitapListesi sözlüğüne kitapları ekliyoruz
		Kitap kitap1 = new Kitap(101L, "Sefiller", "Victor Hugo", 1862, "Roman", 1232, 5);
     	kitapListesi.put(kitap1.getKitapId(), kitap1);
		Kitap kitap2 = new Kitap(102L, "Kürk Mantolu Madonna", "Sabahattin Ali", 1943, "Roman", 177, 3);
		kitapListesi.put(kitap2.getKitapId(), kitap2);
		Kitap kitap3 = new Kitap(103L, "1984", "George Orwell", 1949, "Bilim Kurgu", 328, 8);
		kitapListesi.put(kitap3.getKitapId(), kitap3);
		Kitap kitap4 = new Kitap(104L, "Savaş ve Barış", "Lev Tolstoy", 1869, "Tarihi Roman", 1225, 4);
		kitapListesi.put(kitap4.getKitapId(), kitap4);
		Kitap kitap5 = new Kitap(105L, "İnce Memed", "Yaşar Kemal", 1955, "Roman", 436, 7);
		kitapListesi.put(kitap5.getKitapId(), kitap5);
		
		// çalışanları oluşturup calisanListesi sözlüğüne ekliyoruz
		Calisan calisan1 = new Calisan("Boni", 5334956927L, 201L, "boni@gmail.com", 17000, "03.06.2008");
		calisanListesi.put(calisan1.id, calisan1);
		Calisan calisan2 = new Calisan("Bony", 5369584554L, 202L, "bony@gmail.com", 17500, "01.06.2007");
		calisanListesi.put(calisan2.id, calisan2);
		Calisan calisan3 = new Calisan("Embombo", 5516857992L, 203L, "embombo@gmail.com", 18000, "09.02.2006");
		calisanListesi.put(calisan3.id, calisan3);		

		// üyeler oluşturup uyeListesi sözlüğüne ekliyoruz
		Uye uye1 = new Uye("Abdou", 5463356296L, 301L, "abdou@gmail.com", "04.09.2020", 0, true, 0L);
		uyeListesi.put(uye1.id,uye1);
		Uye uye2 = new Uye("Rezzack", 5435689578L, 302L, "abdou@gmail.com", "05.12.2021", 0, true, 0L);
		uyeListesi.put(uye2.id, uye2);
		Uye uye3 = new Uye("Traore", 5345689595L, 303L, "abdou@gmail.com", "09.10.2019", 0, true, 0L);
		uyeListesi.put(uye3.id, uye3);
		
		//oluşturduğumuz çalışanları calisanListesinden id leri ile erişip bilgilerini yazdırıyoruz
		calisanListesi.get(calisan1.id).bilgiYaz();
		System.out.println();
		calisanListesi.get(calisan2.id).bilgiYaz();
		System.out.println();
		calisanListesi.get(calisan3.id).bilgiYaz();
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		//oluşturduğumuz çalışanları calisanListesinden id leri ile erişip bilgilerini yazdırıyoruz
		uyeListesi.get(uye1.id).bilgiYaz();
		System.out.println();
		uyeListesi.get(uye2.id).bilgiYaz();
		System.out.println();
		uyeListesi.get(uye3.id).bilgiYaz();
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println();
		
		//oluşturduğumuz kitapları kitapListesinden id leri ile erişip bilgilerini yazdırıyoruz
		kitapListesi.get(kitap1.getKitapId()).kitapBilgiYaz();;
		System.out.println();
		kitapListesi.get(kitap2.getKitapId()).kitapBilgiYaz();;
		System.out.println();
		kitapListesi.get(kitap3.getKitapId()).kitapBilgiYaz();;
		System.out.println();
		kitapListesi.get(kitap4.getKitapId()).kitapBilgiYaz();;
		System.out.println();
		kitapListesi.get(kitap5.getKitapId()).kitapBilgiYaz();;
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
		//"Abdou" isimli üye "Sefiller" isimli kitabı 2 haftalığına ödünç alıyor ödünç alıyor
		LocalDate teslimAldığıTarih = LocalDate.now().plusWeeks(2);
		kitap1.kitabıOduncVer(uye1, kitap1, teslimAldığıTarih);
		
		//"Abdou kitabı aldıktan sonraki güncellenmiş durum
		System.out.println();
		uyeListesi.get(uye1.id).bilgiYaz();
		System.out.println();
		kitapListesi.get(kitap1.getKitapId()).kitapBilgiYaz();
		System.out.println();
		
		//"Abdou" isimli üye "Sefiller" isimli kitabı 4 hafta sonra getiriyor
		LocalDate teslimEttiğiTarhi = LocalDate.now().plusWeeks(4);
		kitap1.kitabıGeriAl(uye1, kitap1, teslimAldığıTarih, teslimEttiğiTarhi);
		
		//"Abdou kitabı teslim ettikten sonraki güncellenmiş durum
		System.out.println();
		uyeListesi.get(uye1.id).bilgiYaz();
		System.out.println();
		kitapListesi.get(kitap1.getKitapId()).kitapBilgiYaz();
	}

}
