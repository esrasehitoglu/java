/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Esra
 */
public class JavaApplication1 {
      public static void main(String[] args) {
        // TODO code application logic here
        insan ali=new insan(); // ram'de yasayan bir hale geldi.
        ali.boy=180;
        ali.kilo=80;
        ali.yas=22;
        //println ekrana basma işlemini yapar, "" içerisinde yazılan ifadeler string değerlerdir. 
        //+ operatörü birleştirme işlemini yapar.
        System.out.println("Ali'nin yaşı:"+ali.yas+" Ali'nin boyu:"+ali.boy+" Ali'nin kilosu:"+ali.kilo);
        insan veli=new insan(); // ram'de yasayan bir hale geldi.
        veli.boy=170;
        veli.kilo=70;
        veli.yas=23;
        System.out.println("Veli'nin yaşı:"+veli.yas+" Veli'nin boyu:"+veli.boy+" Veli'nin kilosu:"+veli.kilo);
         ali.yemek();
         veli.yemek();
         System.out.println("***** YEMEKTEN SONRA *****:");
         System.out.println("Ali'nin yaşı:"+ali.yas+" Ali'nin boyu:"+ali.boy+" Ali'nin kilosu:"+ali.kilo);
         System.out.println("Veli'nin yaşı:"+veli.yas+" Veli'nin boyu:"+veli.boy+" Veli'nin kilosu:"+veli.kilo);
         ali.maas=100;
         ali.zam(20);
        System.out.println("Ali'nin zamlı maaşı: "+ali.maas);
        ali.zam(30);
        System.out.println("Ali'ye tekrar zam yapılmıştır.Ali'nin yeni maaşı: "+ali.maas);         
    }
    
}
