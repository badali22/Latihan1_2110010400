package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika amin = new Matematika(0,0);
        
        System.out.println("Hasil Penjumlahan: "+amin.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+amin.setPengurangan());
        System.out.println("Hasil Perkalian: "+amin.setPerkalian());
        System.out.println("Hasil Pembagian: "+amin.setPembagian());

                
    }
}
