package uap.mains;

import java.util.Scanner;
import uap.models.Sphere;
import uap.models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Rafani Wasi'unnikmah Siregar");
        System.out.println("245150701111029");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");

        System.out.print("Isikan Radius (besar) : ");
        double R = input.nextDouble(); 
        System.out.print("Isikan radius (kecil) : ");
        double r = input.nextDouble(); 

        Torus torus = new Torus(R, r);
        torus.printInfo();
        int kgTorus = torus.konversiKg(torus.getMassa());
        System.out.println("Massa dalam kg : " + kgTorus);
        System.out.println("Biaya kirim : Rp" + torus.hitungBiayaKirim(kgTorus));

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");

        System.out.print("Isikan radius : ");
        double radius = input.nextDouble(); 

        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        int kgSphere = sphere.konversiKg(sphere.getMassa());
        System.out.println("Massa dalam kg : " + kgSphere);
        System.out.println("Biaya kirim : Rp" + sphere.hitungBiayaKirim(kgSphere));
        System.out.println("=============================================");

        input.close();
    }
}
