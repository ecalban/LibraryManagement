package oop_basitKutuphaneYonetim;

public class Kisi {
	
	protected String kisiIsim;
	protected Long kisiTel;
	protected Long id;
	protected String eposta;
	
	public Kisi(String kisiIsim, Long kisiTel,Long id,String eposta) {
		this.kisiIsim = kisiIsim;
		this.kisiTel = kisiTel;
		this.id = id;
		this.eposta = eposta;
	}
	
	public void bilgiYaz() {
		System.out.println("İsim: " + kisiIsim);
		System.out.println("Telelefon numarası: " + kisiTel);
		System.out.println("Id: " + id);
		System.out.println("Eposta adresi: " + eposta);
	}
	
}
