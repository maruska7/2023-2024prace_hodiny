public class Clovek {
    private String jmeno;
    private String prijmeni;
    private int rokNarozeni;

    public Clovek(String jmeno, String prijmeni, int rokNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }
    public String toString() {
        return jmeno + " " + prijmeni + " (" + rokNarozeni + ")";
    }

    public void setRokNarozeni(int pomocnaPromena) {
        this.rokNarozeni = pomocnaPromena;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }
}
