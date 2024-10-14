package oop_basitKutuphaneYonetim;

public class Calisan extends Kisi {

	private int calisanMaas;
	private String iseGirisTarihi;

	public Calisan(String kisiIsim, Long kisiTel, Long id, String eposta, int calisanMaas, String iseGirisTarihi) {
		super(kisiIsim, kisiTel, id, eposta);
		setCalisanMaas(calisanMaas);
		setIseGirisTarihi(iseGirisTarihi);
	}

	public int getCalisanMaas() {
		return calisanMaas;
	}
	public void setCalisanMaas(int calisanMaas) {
		this.calisanMaas = calisanMaas;
	}
	public String getIseGirisTarihi() {
		return iseGirisTarihi;
	}
	public void setIseGirisTarihi(String iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}
	
	public void bilgiYaz() {
		System.out.println("İsim: " + kisiIsim);
		System.out.println("Telefon numarası: " + kisiTel);
		System.out.println("Id: " + id);
		System.out.println("Eposta adresi: " + eposta);
		System.out.println("Çalışan maaşı: " + getCalisanMaas());
		System.out.println("Çalışanın işe giriş tarihi : " + getIseGirisTarihi());

	}
}
