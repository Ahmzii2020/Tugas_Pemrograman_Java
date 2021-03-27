// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Prodi    : Sistem Informasi
// Tanggal  : 18 Maret 2021   
// Latihan Pertemuan 2 Karakteristik Pemrograman Berorientasi Objek
package BelajarTP2;
/* Eksekusi Program */
    public class SepedaBeraksi{
                    public static void main(String[] args) {
                            Sepeda sepedaku = new Sepeda();

                            sepedaku.setGir(1);
                            /* Variabel dapat di ubah ataupun tidak */
                            sepedaku.gir = 3; 			
                            System.out.println("Gir saat ini:" + sepedaku.getGir());
                    }
    }
