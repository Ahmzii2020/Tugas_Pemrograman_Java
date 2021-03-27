// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Prodi    : Sistem Informasi
// Tanggal  : 18 Maret 2021   
// Latihan Pertemuan 2 Karakteristik Pemrograman Berorientasi Objek
package BelajarTP1;
/* Class SepedaGunung Mewarisi Class Sepeda */
public class SepedaGunung extends Sepeda{ 
	private int sadel;
	void setSadel (int jumlah) { 
		sadel = getGir() - jumlah;
	} 
	int getSadel(){
		return sadel;
	}
}