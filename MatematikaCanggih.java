// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Prodi    : Sistem Informasi
// Tanggal  : 18 Maret 2021   
// Tugas Pertemuan 2 Karakteristik Pemrograman Berorientasi Objek
package BelajarTP1;
/*Inherit dari Class Matematika*/
    public class MatematikaCanggih extends Matematika{
        void modulus(int a, int b){
            System.out.println("Modulus : "+ a +" % "+ b +" = "+ (a%b));
        }
        void modulus(int a, int b,int c){
            System.out.println("Modulus : "+ a +" % "+ b +" % "+ c +" = "+ (a%b%c));
        }
        void modulus(double a, double b){
            System.out.println("Modulus : "+ a +" % "+ b +" = "+ (a%b));
        }
        void modulus(double a, double b, double c){
            System.out.println("Modulus : "+ a +" % "+ b +" % "+ c +" = "+ (a%b%c));
        }
    }