package oop_basitKutuphaneYonetim;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kitap {
	
	private Long kitapId;
	private String kitapIsmi;
	private String kitapYazarIsmi;
	private int kitapYayimYili;
	private String kitapTuru;
	private int kitapSayfaSayisi;
	private int kitapStokAdedi;
	private LocalDate kitapTeslimEdilenTarih;
	private LocalDate kitapTeslimEdilecekTarih;
	
	public Kitap(Long kitapId, String kitapIsmi, String kitapYazarIsmi, int kitapYayimYili, String kitapTuru, int kitapSayfaSayisi, int kitapStokAdedi) {
		this.kitapId = kitapId;
		this.kitapIsmi = kitapIsmi;
		this.kitapYazarIsmi = kitapYazarIsmi;
		this.kitapYayimYili = kitapYayimYili;
		this.kitapTuru = kitapTuru;
		this.kitapSayfaSayisi = kitapSayfaSayisi;
		this.kitapStokAdedi = kitapStokAdedi;

	}

	public Long getKitapId() {
		return kitapId;
	}
	public void setKitapId(Long kitapId) {
		this.kitapId = kitapId;
	}
	public String getKitapIsmi() {
		return kitapIsmi;
	}
	public void setKitapIsmi(String kitapIsmi) {
		this.kitapIsmi = kitapIsmi;
	}
	public String getKitapYazarIsmi() {
		return kitapYazarIsmi;
	}
	public void setYazarIsmi(String kitapYazarIsmi) {
		this.kitapYazarIsmi = kitapYazarIsmi;
	}
	public int getKitapYayimYili() {
		return kitapYayimYili;
	}
	public void setKitapYayimYili(int kitapYayimYili) {
		this.kitapYayimYili = kitapYayimYili;
	}
	public String getKitapTuru() {
		return kitapTuru;
	}
	public void setKitapTuru(String kitapTuru) {
		this.kitapTuru = kitapTuru;
	}
	public int getKitapSayfaSayisi() {
		return kitapSayfaSayisi;
	}
	public void setKitapSayfaSayisi(int kitapSayfaSayisi) {
		this.kitapSayfaSayisi = kitapSayfaSayisi;
	}
	public int getKitapStokAdedi() {
		return kitapStokAdedi;
	}
	public void setKitapStokAdedi(int kitapStokAdedi) {
		this.kitapStokAdedi = kitapStokAdedi;
	}
	public LocalDate getKitapTeslimEdilenTarih() {
		return kitapTeslimEdilenTarih;
	}

	public void setKitapTeslimEdilenTarih(LocalDate kitapTeslimEdilenTarih) {
		this.kitapTeslimEdilenTarih = kitapTeslimEdilenTarih;
	}
	public LocalDate getKitapTeslimEdilecekTarih() {
		return kitapTeslimEdilecekTarih;
	}

	public void setKitapTeslimEdilecekTarih(LocalDate kitapTeslimEdilecekTarih) {
		this.kitapTeslimEdilecekTarih = kitapTeslimEdilecekTarih;
	}



	public void kitapBilgiYaz() {
		System.out.println("Kitap id:" + getKitapId());
		System.out.println("Kitap ismi:" + getKitapIsmi());
		System.out.println("Kitap yazar ismi:" + getKitapYazarIsmi());
		System.out.println("Kitap yayım yılı:" + getKitapYayimYili());
		System.out.println("Kitap türü:" + getKitapTuru());
		System.out.println("Kitap sayfa sayısı:" + getKitapSayfaSayisi());
		System.out.println("Kitap stok adedi:" + getKitapStokAdedi());
	}
	
	public void kitabıOduncVer(Uye uye, Kitap kitap, LocalDate teslimEdilecekTarih) {
		if(kitap.getKitapStokAdedi()>0) {
			uye.setKitapSayisi(uye.getKitapSayisi()+1);
			kitap.setKitapStokAdedi(kitap.getKitapStokAdedi()-1);
			kitap.setKitapTeslimEdilecekTarih(teslimEdilecekTarih);
			System.out.println(uye.kisiIsim + " adlı kişi " + kitap.getKitapIsmi() + " isimli kitabı " + kitap.getKitapTeslimEdilecekTarih() + " tarihinde teslim etmek üzere ödünç aldı. Kitabın kalan adedi " + kitap.getKitapStokAdedi() + ".");
		}
		else {
			System.out.println(kitap.getKitapIsmi() + " adlı kitap stokta mevcut değil.");
		}
	}
	
	public void kitabıGeriAl(Uye uye, Kitap kitap, LocalDate teslimEdilecekTarih ,LocalDate teslimEdilenTarih) {
		if(ChronoUnit.DAYS.between(teslimEdilecekTarih, teslimEdilenTarih)>0){
			
			uye.setKitapSayisi(uye.getKitapSayisi()-1);
			kitap.setKitapStokAdedi(kitap.getKitapStokAdedi()+1);
			System.out.println("Kitap teslim tarihine göre " + ChronoUnit.DAYS.between(teslimEdilecekTarih, teslimEdilenTarih) + " gün geç teslim edildi.");
			System.out.println("Kütüpaheneye olan borcunuz: " + ChronoUnit.DAYS.between(teslimEdilecekTarih, teslimEdilenTarih)*50 + "tl(geç bıraktığınız gün başına 50 tl kesildi.)");
			uye.setKutuphaneyeBorcu(uye.getKutuphaneyeBorcu()+ChronoUnit.DAYS.between(teslimEdilecekTarih, teslimEdilenTarih)*50);
			kitap.setKitapTeslimEdilecekTarih(null);
			kitap.setKitapTeslimEdilenTarih(null);
		}
		else {
			uye.setKitapSayisi(uye.getKitapSayisi()-1);
			kitap.setKitapStokAdedi(kitap.getKitapStokAdedi()+1);
			System.out.println("Kitap teslim tarihine " + ChronoUnit.DAYS.between(teslimEdilecekTarih, teslimEdilenTarih) + " gün kala teslim edildi.");
			kitap.setKitapTeslimEdilecekTarih(null);
			kitap.setKitapTeslimEdilenTarih(null);
		}
		
	}


}
