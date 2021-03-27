package Finance;
  class Bank {
        int saldo = 100000;
            void simpanUang(int simpanSaldo){
                saldo += simpanSaldo;
                System.out.println("Simpann uang : Rp."+ simpanSaldo);
                System.out.println("Saldo saat ini : Rp."+ saldo +"\n");
            }
            void ambilUang(int ambilSaldo){
                saldo -= ambilSaldo;
                System.out.println("Ambil uang : Rp."+ ambilSaldo);
                System.out.println("Saldo saat ini : Rp."+ saldo +"\n");
            }
            void getSaldo(){
                System.out.println("Selamat Datang di Bank ABC\n" 
                                    + "Saldo saat ini : Rp."+ saldo + "\n");
            }
        }
