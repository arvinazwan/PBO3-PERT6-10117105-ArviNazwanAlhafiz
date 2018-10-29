//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class Main {
    public static void main(String[] args) {
        Bola b = new Bola();
        Tabung t = new Tabung();
        Kerucut k = new Kerucut();
        
        b.setR(7);
        System.out.println("Volume Bola : " + Math.ceil(b.hitungVolume()));
        
        t.setH(21);
        t.setR(10);
        System.out.println("Volume Tabung : " + Math.ceil(t.hitungVolume()));
        
        k.setR(14);
        k.setH(9);
        System.out.println("Volume Kerucut : " + Math.ceil(k.hitungVolume()));
    }
    
    
}
