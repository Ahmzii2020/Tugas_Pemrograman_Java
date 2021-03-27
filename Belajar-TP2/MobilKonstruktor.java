// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Prodi    : Sistem Informasi
// Tanggal  : 18 Maret 2021   
// Latihan Pertemuan 2 Karakteristik Pemrograman Berorientasi Objek
package BelajarTP2;
/* Eksekusi Program */
    public class MobilKonstruktor{
       public static void main(String[] args){
            Mobil mobilku = new Mobil("Merah", 2003);
            mobilku.info();

            Mobil mobilmu = new Mobil();
            mobilmu.info();
            }
    }
