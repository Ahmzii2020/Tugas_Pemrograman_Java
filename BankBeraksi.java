package Finance;
    public class BankBeraksi {
        public static void main (String args[]){
            Bank uangku = new Bank();
            uangku.getSaldo();
            uangku.simpanUang(500000);
            uangku.ambilUang(150000);
        }     
}