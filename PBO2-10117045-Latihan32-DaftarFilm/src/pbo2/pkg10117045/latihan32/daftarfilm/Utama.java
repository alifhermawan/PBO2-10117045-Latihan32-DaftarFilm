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
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("===Daftar Film Sedang Tayang===\n");
        Film pilem = new Film();
        pilem.filmName = "Venom";
        pilem.filmGenre = "Action, Horror, Scifi";
        pilem.filmRating = 8.5;
        pilem.filmDuration = 120;
        pilem.nowPlaying(pilem.filmName, pilem.filmGenre, pilem.filmRating, pilem.filmDuration);

        Film pilem1 = new Film();
        pilem1.filmName = "Small Foot";
        pilem1.filmGenre = "Animation";
        pilem1.filmRating = 9.0;
        pilem1.filmDuration = 96;
        pilem1.nowPlaying(pilem1.filmName, pilem1.filmGenre, pilem1.filmRating, pilem1.filmDuration);

        Film pilem2 = new Film();
        pilem2.filmName = "Crazy Rich Asian";
        pilem2.filmGenre = "Comedy";
        pilem2.filmRating = 7.8;
        pilem2.filmDuration = 119;
        pilem2.nowPlaying(pilem2.filmName, pilem2.filmGenre, pilem2.filmRating, pilem2.filmDuration);

        Film pilem3 = new Film();
        pilem3.filmName = "Asih";
        pilem3.filmGenre = "Horror";
        pilem3.filmRating = 6.0;
        pilem3.filmDuration = 100;
        pilem3.nowPlaying(pilem3.filmName, pilem3.filmGenre, pilem3.filmRating, pilem3.filmDuration);
    }

}
