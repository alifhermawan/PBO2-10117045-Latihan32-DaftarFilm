/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan32.daftarfilm;

/**
 *
 * @author 
 * NAMA     : Alif Hermawan
 * KELAS    : PBO2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menampilkan daftar nama
 * -nama film yang sedang tayang saat ini
 */
public class Film {

    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parNama, String parGenre, double parRating,
            int parDuration) {

        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Durasion Film : " + filmDuration + " Menit\n");
    }
}
