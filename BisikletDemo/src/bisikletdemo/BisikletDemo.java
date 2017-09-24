/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bisikletdemo;

/**
 *
 * @author Esra
 */
public class BisikletDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // İki farklı bisiklet tanımlayalım.
        Bisiklet bisiklet1 = new Bisiklet();
        Bisiklet bisiklet2 = new Bisiklet();

        // Metotları çağıralım...
        
        bisiklet1.pedaldevriDegistir(50);
        bisiklet1.hizlan(10);
        bisiklet1.vitesDegistir(2);
        bisiklet1.durumuYazdir();

        bisiklet2.pedaldevriDegistir(50);
        bisiklet2.hizlan(10);
        bisiklet2.vitesDegistir(2);
        bisiklet2.pedaldevriDegistir(40);
        bisiklet2.hizlan(10);
        bisiklet2.vitesDegistir(3);
        bisiklet2.durumuYazdir();
        
    }
    
}
