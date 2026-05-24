/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author USER
 */
public class Mobil {

    String merk;
    String warna;
    int tahun;
    int kecepatan;
    double harga;

    public Mobil() {
        merk = "Toyota";
        warna = "Hitam";
        tahun = 2020;
        kecepatan = 120;
        harga = 200000000;
    }

    public Mobil(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
        tahun = 2021;
        kecepatan = 140;
        harga = 300000000;
    }

    public Mobil(String merk, String warna, int tahun,
                 int kecepatan, double harga) {

        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.kecepatan = kecepatan;
        this.harga = harga;
    }

    public void tampilData() {
        System.out.println("Merk      : " + merk);
        System.out.println("Warna     : " + warna);
        System.out.println("Tahun     : " + tahun);
        System.out.println("Kecepatan : " + kecepatan + " km/jam");
        System.out.println("Harga     : Rp" + harga);
    }

    public String kategoriMobil() {

        if (harga >= 800000000) {
            return "Mobil Mewah";
        } else if (harga >= 300000000) {
            return "Mobil Menengah";
        } else {
            return "Mobil Standar";
        }
    }

    public void create() {
        System.out.println(
            "INSERT INTO mobil VALUES ('" +
            merk + "','" + warna + "'," +
            tahun + "," + kecepatan + "," +
            harga + ");"
        );
    }

    public void read() {
        System.out.println("SELECT * FROM mobil;");
    }

    public void update() {
        System.out.println(
            "UPDATE mobil SET warna='" + warna +
            "', tahun=" + tahun +
            ", kecepatan=" + kecepatan +
            ", harga=" + harga +
            " WHERE merk='" + merk + "';"
        );
    }

    public void delete() {
        System.out.println(
            "DELETE FROM mobil WHERE merk='" + merk + "';"
        );
    }
}
