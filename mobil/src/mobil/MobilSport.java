/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author USER
 */
public class MobilSport extends Mobil {

    int turbo;
    String modeBalap;

    public MobilSport(String merk, String warna,
                      int tahun, int kecepatan,
                      double harga,
                      int turbo, String modeBalap) {

        super(merk, warna, tahun, kecepatan, harga);

        this.turbo = turbo;
        this.modeBalap = modeBalap;
    }

    public void nitro() {
        System.out.println("Nitro diaktifkan!");
    }

    public void tampilSport() {
        System.out.println("Turbo      : " + turbo);
        System.out.println("Mode Balap : " + modeBalap);
    }
}