// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Prodi    : Sistem Informasi
// Tanggal  : 18 Maret 2021   
// Latihan Pertemuan 2 Karakteristik Pemrograman Berorientasi Objek
package BelajarTP1;
/* Pembentukan Method */
    class Mobil {
            String warna;
            int tahunProduksi;

            public Mobil(String warna, int tahunProduksi){
                this.warna = warna;
                this.tahunProduksi = tahunProduksi;
            }

            public Mobil(){
            }

            void info(){
                 System.out.println("Warna: " + warna);
                 System.out.println("Tahun: " + tahunProduksi);
            }
    }
