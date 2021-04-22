// Nama     : Ahmad Fauzi
// NIM      : 11200930000020
// Kelas    : 2A Sistem Informasi
// Tanggal  : 22 April 2021
// Ujian Tengah Semester (UTS) Pemrograman Lanjutan
// Jawaban No.2 Menggunakan Polymorphism - overloading
package com.uts.pemrog;

/**
 *
 * @author Ahmad Fauzi
 */
public class Person {
    String name;
    int age;
        void person(String name, int age){
            this.name = name;
            this.age = age;
        }
        void print(){
            System.out.println("Nama : " + name);
            System.out.println("Umur : " + age);
        }
    public static void main(String []args) {

            Person person1 = new Person();
            person1.person("Joe Smitsh",24);
            person1.print();

            Person person2 = new Person();
            person2.person("Marry sharp",52);
            person2.print();



    }
}
    
