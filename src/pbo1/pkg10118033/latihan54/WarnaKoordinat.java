package pbo1.pkg10118033.latihan54;

public class WarnaKoordinat extends Koordinat{
    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
        System.out.println("Warna Koordinat : "+namaWarna);
        System.out.println("Koordinat Sumbu x : "+x+", y : "+y);
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}