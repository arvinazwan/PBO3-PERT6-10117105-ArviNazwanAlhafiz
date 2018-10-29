//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class Main {
     public static void main(String[] args) {
        // TODO code application logic here
        Koordinat k1 = new Koordinat(2, 10, 5, 7);
        Koordinat k2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("Garis yang melalui titik (2,10) dan (5,7) "
                + "memiliki gradien sebesar " + k1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan (3,12) "
                + "memiliki gradien sebesar " + k2.hitungGradien());
    }
    
}
