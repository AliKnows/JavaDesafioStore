package Transacciones;

import Clases.Compra;
import Clases.TarjetaDeCredito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el limite de la tarjeta: ");
        double limite = teclado.nextDouble();
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito(limite);

        int opcion = 1;
        while (opcion !=0){
            System.out.println("Escribe el nombre de la compra: ");
            String nombre = teclado.next();

            System.out.println("El precio del producto: ");
            double valor = Double.valueOf(teclado.next());

            Compra compra1 = new Compra(valor, nombre);
            boolean compraRealizada = TarjetaDeCredito.Volvercom




        }

    }
}
