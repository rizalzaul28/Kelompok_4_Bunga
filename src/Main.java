/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rizan
 */
public class Main {

    public static void main(String[] args) {

        Bunga_Edelweis fr = new Bunga_Edelweis();

        fr.setnama_ilmiah("Leontopolium alpinum");
        fr.setWarna("Putih atau keperakan ditengahnya kuning");
        fr.setIklim("Sejuk hingga dingin");
        fr.setTanah("Berbatu");
        fr.setHewan_penyerbuk("Lebah dan kupu-kupu");

        System.out.println("\n\t\t\tBunga Edelweis");
        System.out.println("Nama Ilmiah       : " + fr.getnama_ilmiah());
        System.out.println("Warna             : " + fr.getWarna());
        System.out.println("Iklim             : " + fr.getIklim());
        System.out.println("Tanah             : " + fr.getTanah());
        System.out.println("Hewan Penyerbuk   : " + fr.getHewan_penyerbuk());
        
        
        Bunga_Kamboja bunga = new Bunga_Kamboja();

        bunga.setnama_ilmiah("Plumeria rubra");
        bunga.setWarna("Putih dengan pusat Kuning");
        bunga.setIklim("Tropis");
        bunga.setTanah("Berdrainase baik");
        bunga.setHewan_penyerbuk("Lebah");

        System.out.println("\n\t\t\tBunga Kamboja");
        System.out.println("Nama Ilmiah       : " + bunga.getnama_ilmiah());
        System.out.println("Warna             : " + bunga.getWarna());
        System.out.println("Iklim             : " + bunga.getIklim());
        System.out.println("Tanah             : " + bunga.getTanah());
        System.out.println("Hewan Penyerbuk   : " + bunga.getHewan_penyerbuk());
        
        
        Bunga_Matahari fm = new Bunga_Matahari();

        fm.setnama_ilmiah("Heliantus anuus");
        fm.setWarna("Kuning");
        fm.setIklim("Sub tropis");
        fm.setTanah("Tanah yang berdrainase baik, kaya nutrisi");
        fm.setHewan_penyerbuk("Lebah");

        System.out.println("\n\t\t\tBunga Matahari");
        System.out.println("Nama Ilmiah       : " + fm.getnama_ilmiah());
        System.out.println("Warna             : " + fm.getWarna());
        System.out.println("Iklim             : " + fm.getIklim());
        System.out.println("Tanah             : " + fm.getTanah());
        System.out.println("Hewan Penyerbuk   : " + fm.getHewan_penyerbuk());
    }
}
