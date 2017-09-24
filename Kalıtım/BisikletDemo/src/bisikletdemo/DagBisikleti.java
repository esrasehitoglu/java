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
public class DagBisikleti extends Bisiklet{
    
    int ekVites=1;
    int tekerlekKalinligi=1;
    
   void DagBisikleti(){
    
        System.out.println("***Dağ Bisikleti***");
    }
    void tekerlekKalinligi(int yeniDeger){
    
        tekerlekKalinligi=yeniDeger;
        System.out.println("Tekerlek Kalınlığı:"+tekerlekKalinligi+" cm");
    }
     void ekvitesDegistir(int yeniDeger) {
         ekVites = yeniDeger;
    }
}
