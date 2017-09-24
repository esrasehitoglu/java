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
public class Bisiklet {
    
    int pedaldevri = 0;
    int hiz = 0;
    int vites = 1;

    void pedaldevriDegistir(int yeniDeger) {
         pedaldevri = yeniDeger;
    }

    void vitesDegistir(int yeniDeger) {
         vites = yeniDeger;
    }

    void hizlan(int arttir) {
         hiz=hiz+arttir;   
    }

    void yavasla(int azalt) {
         hiz=hiz-azalt;
    }

    void durumuYazdir() {
         System.out.println("Pedal Devri:" +
             pedaldevri + " Hız:" + 
             hiz + " Vites:" + vites);
    }

    
}
