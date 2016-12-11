
public class Student {
	private String ime;
	private String prezime;
	private String brIndeksa;
	private int godinaUpisa;
	private int provera;
	
	public String getIme() {
		return ime;
	}
	
	
	public Student(String ime, String prezime, String brIndeksa, int godinaUpisa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brIndeksa = brIndeksa;
		this.godinaUpisa = godinaUpisa;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	public int getGodinaUpisa() {
		return godinaUpisa;
	}
	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}
	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", brIndeksa=" + brIndeksa + ", godinaUpisa="
				+ godinaUpisa + "]";
	}
	
	
}
