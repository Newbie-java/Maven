package com.Crudas_bandymas.app;

import java.util.*;
import java.text.DecimalFormat;

public class Bandymas {
					public Scanner input;
					public DecimalFormat df;

	public Bandymas () {	
	}
		
	public void funkcija () {
			
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.#");

        double maxSkaicius = Double.MIN_VALUE; 
        double minSkaicius = Double.MAX_VALUE;

        int    kiekis       = 0; 
        double totalSkaicius = 0;

        System.out.println("Iveskite skaicius");
        while (input.hasNextDouble()) { 
        double skaicius = input.nextDouble();
            

            if (skaicius > maxSkaicius) {
                maxSkaicius = skaicius;
            }
            if (skaicius < minSkaicius) {
                minSkaicius = skaicius;
            }

            kiekis++;              
            totalSkaicius += skaicius;  
        }

        if (kiekis > 0) {                                        
            double vidurkis = totalSkaicius / kiekis;
            System.out.println("Nuskaityta skaiciu = " + kiekis);
            System.out.println("Maximumas = "  + maxSkaicius);
            System.out.println("Minimumas = "  + minSkaicius);
            System.out.println("Vidurkis = "  + (df.format(vidurkis)));
        } 
		
		else {
            System.out.println("Klaida: Neivedete duomenu!");
        }
	}
}