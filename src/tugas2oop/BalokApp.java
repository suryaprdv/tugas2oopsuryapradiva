/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2oop;

/**
 *
 * @author Asus SURYAPRADIVA 2201010582
 */
public class BalokApp {
    public static void main(String[] args) {
        
        HitungVolumeBalok balok1 = new HitungVolumeBalok();
        
        
        balok1.setPj(10);
        balok1.setLb(5);
        balok1.setTg(2);
        
        
        balok1.printHasil();
        balok1.printDimensi();
        
        
        System.out.println("Luas permukaan balok adalah: " + balok1.hitungLuasPermukaan() + " unit persegi");
        
        
        HitungVolumeBalok balok2 = new HitungVolumeBalok(6, 4, 3);
        
        
        balok2.printHasil();
        balok2.printDimensi();
        
        
        System.out.println("Luas permukaan balok adalah: " + balok2.hitungLuasPermukaan() + " unit persegi");
    }
}
    

