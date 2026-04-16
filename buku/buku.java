package buku;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class buku {
   public static void main(String[] args) {
    Set<String> buku = new TreeSet<String>();
    
    //Value 
    buku.add("Dilan 1990");
    buku.add("Dilan 1991");
    buku.add("Laskar pelangi");
    buku.add("Mahaguru");
    buku.add("Mengejar Matahari");
    buku.add("Milea");
    buku.add("Perahu Kertas");
    
    Tampilan(buku);
    Pinjam(buku, "Mahaguru");
    Tampilan(buku);
    
    
   }  
    public static void Tampilan(Set<String> buku){
    System.out.println("Daftar Buku : ");
    for (Iterator<String> iterator = buku.iterator(); iterator.hasNext();) {
        String string = iterator.next();
        System.out.println(string);
        }
    }

    public static void Pinjam(Set<String> buku, String judul) {
        if (buku.contains(judul)){
            System.out.println("\nBuku " + judul + " ada\n");
            buku.remove(judul);
        }else{
            System.out.println("\nBuku "  + judul + " tidak ada\n");
        }
        
    }
}