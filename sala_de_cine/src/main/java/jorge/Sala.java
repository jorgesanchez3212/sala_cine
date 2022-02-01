package jorge;

import jorge.Color;

import java.util.Scanner;

public class Sala {
    private String estadoSala;
    private int sumarContabilidad = 0;
    private int restarContabilidad = 0;
    private int a = 0;
    private int b = 0;
    private  String scanner;
    int reservar = 0;
    int anular = 0;
    int comprar1 = 0;
    int confirmarReserva = 0;
    int contadorComprar = 0;

    Scanner sc = new Scanner(System.in);

    int filas = 5;
    int columnas = 9;
    String [][] butacas = new String[filas][columnas];


    public Sala() {
        sumarContabilidad = sumarContabilidad();
        restarContabilidad = restarContabilidad();

    }

    public int contadorComprar1(){
        comprar1++;
        return comprar1;
    }

    public void comprar1(){
        contadorComprar1();
        sumarContabilidad();
        if(contadorComprar==0){
            matriz();
            contadorComprar++;
        }
        else{
            matrizMostrar();
        }
        System.out.println("Elige una fila");
        scanner = sc.next();
        if (scanner.equals("A")) {
            a = 0;

        } else if (scanner.equals("B")) {
            a=1;

        } else if (scanner.equals("C")) {
            a = 2;
        }else if (scanner.equals("D")) {
           a = 3;
        } else if (scanner.equals("E")) {
           a = 4;
        }

        System.out.println("Elige una columna");
        scanner = sc.next();
        if (scanner.equals("1")) {
            b = 0;

        } else if (scanner.equals("2")) {
            b = 1;

        } else if (scanner.equals("3")) {
            b = 2;
        }else if (scanner.equals("4")) {
            b = 3;
        } else if (scanner.equals("5")) {
            b = 4;
        }else if (scanner.equals("6")) {
           b = 5;
        }else if (scanner.equals("7")) {
            b = 6;
        }else if (scanner.equals("8")) {
            b = 7;
        }else if (scanner.equals("9")) {
            b = 8;
        }

        matrizModificarCompra(a,b);


    }
    public void matrizMostrar(){
        System.out.println("  1 2 3 4 5 6 7 8 9");

        for(int i = 0;i<filas;i++){
            if (i == 0){
                System.out.print("A" + Color.VERDE);
            }else if (i == 1){
                System.out.print("B"+ Color.VERDE);
            }else if (i == 2){
                System.out.print("C"+ Color.VERDE);
            }else if (i == 3){
                System.out.print("D"+ Color.VERDE);
            }else{
                System.out.print("E"+ Color.VERDE);
            }
            for(int j = 0; j<columnas; j++){
                System.out.print(butacas [i][j] );

            }
            System.out.println("");
        }
    }
    public void matrizModificarCompra(int aa, int bb){
        butacas[aa][bb]= Color.ROJO+"[]" + Color.RESET ;

        System.out.println("  1 2 3 4 5 6 7 8 9");

        for(int i = 0;i<filas;i++){
            if (i == 0){
                System.out.print("A" + Color.VERDE);
            }else if (i == 1){
                System.out.print("B"+ Color.VERDE);
            }else if (i == 2){
                System.out.print("C"+ Color.VERDE);
            }else if (i == 3){
                System.out.print("D"+ Color.VERDE);
            }else{
                System.out.print("E"+ Color.VERDE);
            }
            for(int j = 0; j<columnas; j++){
                System.out.print(butacas [i][j] );

            }
            System.out.println("");
        }

    }
    public int contadorAnular(){
        anular++;
        return anular;
    }


    public void anular(){
        contadorAnular();
        restarContabilidad();
    }

    public int contadorReservar(){
        reservar++;
        return reservar;
    }

    public void reservar(){
        reservar++;
        if(contadorComprar==0){
            matriz();
            contadorComprar++;
        }
        else{
            matrizMostrar();
        }
        System.out.println("Elige una fila");
        scanner = sc.next();
        if (scanner.equals("A")) {
            a = 0;

        } else if (scanner.equals("B")) {
            a=1;

        } else if (scanner.equals("C")) {
            a = 2;
        }else if (scanner.equals("D")) {
            a = 3;
        } else if (scanner.equals("E")) {
            a = 4;
        }

        System.out.println("Elige una columna");
        scanner = sc.next();
        if (scanner.equals("1")) {
            b = 0;

        } else if (scanner.equals("2")) {
            b = 1;

        } else if (scanner.equals("3")) {
            b = 2;
        }else if (scanner.equals("4")) {
            b = 3;
        } else if (scanner.equals("5")) {
            b = 4;
        }else if (scanner.equals("6")) {
            b = 5;
        }else if (scanner.equals("7")) {
            b = 6;
        }else if (scanner.equals("8")) {
            b = 7;
        }else if (scanner.equals("9")) {
            b = 8;
        }
            matrizModificarReserva(a,b);
    }

    public void matrizModificarReserva(int aa, int bb){
        butacas[aa][bb]= Color.MORADO+"[]" + Color.RESET ;

        System.out.println("  1 2 3 4 5 6 7 8 9");

        for(int i = 0;i<filas;i++){
            if (i == 0){
                System.out.print("A" + Color.VERDE);
            }else if (i == 1){
                System.out.print("B"+ Color.VERDE);
            }else if (i == 2){
                System.out.print("C"+ Color.VERDE);
            }else if (i == 3){
                System.out.print("D"+ Color.VERDE);
            }else{
                System.out.print("E"+ Color.VERDE);
            }
            for(int j = 0; j<columnas; j++){
                System.out.print(butacas [i][j] );

            }
            System.out.println("");
        }

    }


    public int contadorConfirmarReserva(){
        confirmarReserva++;
        return confirmarReserva;
    }
    //Al confirmar una reserva se hace automaticamente la compra
    public void confirmarReserva(){
        contadorConfirmarReserva();
       sumarContabilidad();
        if(contadorComprar==0){
            matriz();
            contadorComprar++;
        }
        else{
            matrizMostrar();
        }
        System.out.println("Elige una fila");
        scanner = sc.next();
        if (scanner.equals("A")) {
            a = 0;

        } else if (scanner.equals("B")) {
            a=1;

        } else if (scanner.equals("C")) {
            a = 2;
        }else if (scanner.equals("D")) {
            a = 3;
        } else if (scanner.equals("E")) {
            a = 4;
        }

        System.out.println("Elige una columna");
        scanner = sc.next();
        if (scanner.equals("1")) {
            b = 0;

        } else if (scanner.equals("2")) {
            b = 1;

        } else if (scanner.equals("3")) {
            b = 2;
        }else if (scanner.equals("4")) {
            b = 3;
        } else if (scanner.equals("5")) {
            b = 4;
        }else if (scanner.equals("6")) {
            b = 5;
        }else if (scanner.equals("7")) {
            b = 6;
        }else if (scanner.equals("8")) {
            b = 7;
        }else if (scanner.equals("9")) {
            b = 8;
        }
        matrizModificarReservaConfirmar(a,b);
    }


    public void matrizModificarReservaConfirmar(int aa, int bb){
        butacas[aa][bb]= Color.ROJO+"[]" + Color.RESET ;

        System.out.println("  1 2 3 4 5 6 7 8 9");

        for(int i = 0;i<filas;i++){
            if (i == 0){
                System.out.print("A" + Color.VERDE);
            }else if (i == 1){
                System.out.print("B"+ Color.VERDE);
            }else if (i == 2){
                System.out.print("C"+ Color.VERDE);
            }else if (i == 3){
                System.out.print("D"+ Color.VERDE);
            }else{
                System.out.print("E"+ Color.VERDE);
            }
            for(int j = 0; j<columnas; j++){
                System.out.print(butacas [i][j] );

            }
            System.out.println("");
        }

    }
    public int sumarContabilidad(){
        sumarContabilidad = sumarContabilidad + 6;
        return sumarContabilidad;
    }

    public int restarContabilidad(){
        sumarContabilidad = sumarContabilidad - 6;
        return sumarContabilidad;
    }

    public void contabilidad(){
        int contabilidad = 0;
        contabilidad = sumarContabilidad-restarContabilidad;
        System.out.println(Color.AMARILLO+ "El dinero recaudado de las entradas es de " + contabilidad + "€" +Color.RESET);
    }



//establece y muestra la matriz por defecto entera verde
    //metodo llamado al comienzo del programa
    public void matriz(){

        System.out.println("  1 2 3 4 5 6 7 8 9");

        for(int i = 0;i<filas;i++){
            if (i == 0){
                System.out.print("A" + Color.VERDE);
            }else if (i == 1){
                System.out.print("B"+ Color.VERDE);
            }else if (i == 2){
                System.out.print("C"+ Color.VERDE);
            }else if (i == 3){
                System.out.print("D"+ Color.VERDE);
            }else{
                System.out.print("E"+ Color.VERDE);
            }
            for(int j = 0; j<columnas; j++){
                System.out.print(butacas [i][j] = Color.VERDE+"[]" + Color.RESET);

            }
            System.out.println("");
        }
    }

    public void mostrarDatos() {
        System.out.println("jorge.Sala:");
        System.out.println("Comprada: " +comprar1 + " entradas");
        System.out.println("Reservada: " +reservar + " entradas");
        System.out.println("Confirmada: " +confirmarReserva + " entradas");
        System.out.println("Anulada: " +anular + " entradas");
    }


}
