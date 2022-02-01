package jorge;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String scanner;
        String salir;


        Scanner sc = new Scanner(System.in);
        Sala matriz = new Sala();
            for(int i = 0; i<45; i++) {
                System.out.println("Elige una opción: comprar, anular, reservar, confirmar o salir");
                scanner = sc.next().trim().toLowerCase();
                if (scanner.equals("comprar")) {
                    matriz.comprar1();
                } else if (scanner.equals("anular")) {
                    matriz.anular();
                }else if (scanner.equals("reservar")) {
                    matriz.reservar();
                } else if (scanner.equals("confirmar")) {
                    matriz.confirmarReserva();
                }else if (scanner.equals("salir")) {
                    matriz.matrizMostrar();
                    matriz.contabilidad();
                    matriz.mostrarDatos();
                    System.exit(0);
                }

            }

    }

}

