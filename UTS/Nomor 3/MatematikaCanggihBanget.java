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
public class MatematikaCanggihBanget extends MatematikaCanggih {
    void pertambahanEmpat (int a, int b, int c, int d){
        hasil = a + b + c + d;
        System.out.println("Pertambahan Empat : " + a +" + "+ b +" + " + c +" + "  + d + " = "+ getHasil() );
    }
}
