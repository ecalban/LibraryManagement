package oop_basitKutuphaneYonetim;

public class Uye extends Kisi {
	
	private String uyelikTarihi; 
	private int kitapSayisi;
	private boolean uyelikDurumu;
	private Long kutuphaneyeBorcu;
	
	public Uye(String kisiIsim, Long kisiTel, Long id, String eposta,String uyelikTarihi,int kitapSayisi,boolean uyelikDurumu, Long kutuphaneyeBorcu) {
		super(kisiIsim, kisiTel, id, eposta);
		this.setUyelikTarihi(uyelikTarihi);
		this.setKitapSayisi(kitapSayisi);
		this.setUyelikDurumu(uyelikDurumu);
		this.setKutuphaneyeBorcu(kutuphaneyeBorcu);
	}

	public String getUyelikTarihi() {
		return uyelikTarihi;
	}
	public void setUyelikTarihi(String uyelikTarihi) {
		this.uyelikTarihi = uyelikTarihi;
	}
	public int getKitapSayisi() {
		return kitapSayisi;
	}
	public void setKitapSayisi(int kitapSayisi) {
		this.kitapSayisi = kitapSayisi;
	}
	public boolean getUyelikDurumu() {
		return uyelikDurumu;
	}
	public void setUyelikDurumu(boolean uyelikDurumu) {
		this.uyelikDurumu = uyelikDurumu;
	}
	public Long getKutuphaneyeBorcu() {
		return kutuphaneyeBorcu;
	}

	public void setKutuphaneyeBorcu(Long kutuphaneyeBorcu) {
		this.kutuphaneyeBorcu = kutuphaneyeBorcu;
	}
	
	public void bilgiYaz() {
		System.out.println("İsim: " + kisiIsim);
		System.out.println("Telefon numarası: " + kisiTel);
		System.out.println("Id: " + id);
		System.out.println("Eposta adresi: " + eposta);
		System.out.println("Üyenin bulundurduğu kitap sayısı: " + getKitapSayisi());
		System.out.println("Üyelik tarihi: " + getUyelikTarihi());
		System.out.println("Üyelik durumu: " + getUyelikDurumu());
		System.out.println("Kütüphaneye borcu: " + getKutuphaneyeBorcu());
		
	}



}
