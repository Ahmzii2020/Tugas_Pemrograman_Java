// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Kelas    : 2A Sistem Informasi
// Tanggal  : 22 April 2021
// Ujian Tengah Semester (UTS) Pemrograman Lanjutan
package com.uts.pemrog;

/**
 *
 * @author Ahmad Fauzi
 */
public class MatematikaCanggih {
    int hasil;
    double hasilmodulus;

    void pertambahan (int a, int b){
        hasil = a + b;
        System.out.println("Pemjumlahan : " + a +" + "+ b +" = " + getHasil() );
    }
    void perkalian (int a, int b){
        hasil = a * b;
        System.out.println("Perkalian :  " + a +" * "+ b +" = " + getHasil() );
    }

    int getHasil() {
        return hasil;
    }

    void modulus(double a, double b){
        hasilmodulus = a % b;
        System.out.println("Modulus : " + a +" % "+ b +" = " + getHasilmodulus() );
    }
    double getHasilmodulus() {
        return hasilmodulus;
    }
}

