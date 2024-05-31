/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2oop;

/**
 *
 * @author Asus SSURYAPRADIVA 2201010582
 */
public class HitungVolumeBalok {
     private double panjang;
    private double lebar;
    private double tinggi;
    
    
    public HitungVolumeBalok() {
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
    }
    
    
    public HitungVolumeBalok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    
    public void setPj(double npj) {
        this.panjang = npj;
    }
    
    
    public void setLb(double nlb) {
        this.lebar = nlb;
    }
    
    
    public void setTg(double ntg) {
        this.tinggi = ntg;
    }
    
   
    public double hitungVolume() {
        return this.panjang * this.lebar * this.tinggi;
    }
    
   
    public void printHasil() {
        System.out.println("Volume balok adalah: " + hitungVolume() + " unit kubik");
    }

    
    public double hitungLuasPermukaan() {
        return 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
    }

    
    public void printDimensi() {
        System.out.println("Dimensi balok:");
        System.out.println("Panjang: " + this.panjang + " unit");
        System.out.println("Lebar: " + this.lebar + " unit");
        System.out.println("Tinggi: " + this.tinggi + " unit");
    }
}
    

