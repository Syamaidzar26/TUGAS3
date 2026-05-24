/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {

        Mobil mobil1 = new Mobil();

        Mobil mobil2 = new Mobil("Honda", "Merah");

        Mobil mobil3 = new Mobil(
            "BMW",
            "Putih",
            2024,
            250,
            1200000000
        );

        System.out.println("=== MOBIL 1 ===");
        mobil1.tampilData();
        System.out.println(mobil1.kategoriMobil());
        mobil1.create();
        mobil1.read();
        mobil1.update();
        mobil1.delete();

        System.out.println("\n=== MOBIL 2 ===");
        mobil2.tampilData();
        System.out.println(mobil2.kategoriMobil());

        System.out.println("\n=== MOBIL 3 ===");
        mobil3.tampilData();
        System.out.println(mobil3.kategoriMobil());

        MobilSport sport = new MobilSport(
            "Ferrari",
            "Kuning",
            2025,
            340,
            5000000000.0,
            2,
            "Race Mode"
        );

        System.out.println("\n=== MOBIL SPORT ===");
        sport.tampilData();
        sport.tampilSport();
        sport.nitro();
        System.out.println(sport.kategoriMobil());

        sport.create();
        sport.read();
        sport.update();
        sport.delete();
    }
}
