//package Praktikum02;

public class Sepeda {
    float kecepatan;
    int gear;
    
    public Sepeda () {
        kecepatan = 0;
        gear = 0;
    }
    
    public Sepeda (float newkecepatan, int newGear) {
        kecepatan = newkecepatan;
        gear = newGear;
    }
    
    public void tambahKecepatan(float increment){
        kecepatan += increment;
        if (kecepatan > 20) {
        kecepatan = 20;
        }
    }

    public void kurangiKecepatan(float decrement){
        kecepatan -= decrement;
        if (kecepatan < 0) {
            kecepatan = 0;
        }
    }

    public void cetakInfo(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=================");
    }
}