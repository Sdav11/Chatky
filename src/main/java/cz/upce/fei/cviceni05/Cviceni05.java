package cz.upce.fei.cviceni05;

import java.util.Scanner;

public class Cviceni05 {
//Pole chatky

    public static void main(String[] args) {
        final int POCET_CHATEK = 10;
        Scanner scanner = new Scanner(System.in);

        int[] chatky = new int[POCET_CHATEK];
        int suma = 0;
                
        System.out.print("Zadej max kapacitu: ");
        int maxKapacita = scanner.nextInt();

        while (true) {
            System.out.print("Zadej pocet ubytovanych: ");
            int pocetUbytovanych = scanner.nextInt();
            
            if (pocetUbytovanych > maxKapacita) {
                System.err.println("Prekrocena kapacita chatky!");
                continue;
            }
            System.out.print("Zadej cislo chatky: ");
            int cisloChatky = scanner.nextInt();

            chatky[cisloChatky] = pocetUbytovanych;
                    
            for (int i = 0; i < chatky.length; i++) {
                System.out.println("Chatka " + i + " = " + chatky[i] + "");
                suma += chatky[i];
            }
            
        System.out.println("Celkova obsazenost: " + suma);
        suma = 0;
        System.out.println("Chcete ukoncit program? Zadejte 0 ");
        
        int exit = 0;
        exit = scanner.nextInt();
            if (exit == 0) {
                break;
            }
        }
    }
}
