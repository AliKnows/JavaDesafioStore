import Clases.CuentaEnDinero;
import Clases.Producto;

import java.util.Scanner;

public class PrincipalMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("Escriba el limite de la tarjeta: ");
        //Ingresa datos a la terjata
        double saldo1 = teclado.nextDouble();
        var cuenta = new CuentaEnDinero(saldo1);
        String descripcionProducto;
        double precioProducto;
        do {
            System.out.println("Escriba la descripcion de la compra:");
            descripcionProducto = teclado.toString();
            System.out.println("Escriba el precio de la compra:");
            precioProducto = teclado.nextDouble();
            System.out.println("Escriba 0 para salir o 1 para continuar: ");
            opcion = teclado.nextInt();

        } while (opcion != 0);

        Producto prod1 = new Producto(descripcionProducto, precioProducto);

        System.out.println("El saldo es: " + cuenta.getSaldo());
    }
}
