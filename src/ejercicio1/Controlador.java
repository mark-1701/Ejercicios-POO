package ejercicio1;

import java.util.Scanner;

public class Controlador {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inOp = new Scanner(System.in);

        double entrada;
        int op = 0;
        double saldo;
        int cuenta;
        boolean salir = true;

        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();

        System.out.println("---------------------");
        System.out.println("-----BIENVENDIO------");
        System.out.println("---------------------");
        System.out.print("Introduce el saldo inicial cuenta 1: ");
        entrada = in.nextDouble();
        cuenta1.saldo = entrada;
        System.out.print("\nIntroduce el saldo inicial cuenta 1: ");
        entrada = in.nextDouble();
        cuenta2.saldo = entrada;

        while (salir) {
            System.out.println("\nQue deseas hacer?"
                    + "\n1. Hacer un debito"
                    + "\n2. Hacer un credito"
                    + "\n3. Mostrar cuentas"
                    + "\n4. Salir");
            System.out.print("\nElige una opcion: ");
            op = inOp.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nCuanto dinero desea debitar? ");
                    saldo = in.nextDouble();
                    System.out.print("A que cuenta? 1o2 ");
                    cuenta = inOp.nextInt();

                    if (cuenta == 1) {
                        cuenta1.debito(saldo);
                    } else if (cuenta == 2) {
                        cuenta2.debito(saldo);
                    } else {
                        System.out.print("\ncuenta incorrecta");
                    }

                    break;
                case 2:
                    System.out.print("\nCuanto dinero desea acreditar? ");
                    saldo = in.nextDouble();
                    System.out.print("A que cuenta? 1o2 ");
                    cuenta = inOp.nextInt();

                    if (cuenta == 1) {
                        cuenta1.credito(saldo);
                    } else if (cuenta == 2) {
                        cuenta2.credito(saldo);
                    } else {
                        System.out.print("\ncuenta incorrecta");
                    }

                    break;
                case 3:
                    System.out.println("\nLa cuenta 1 ahora tiene: " + cuenta1.getSaldo());
                    System.out.println("La cuenta 2 ahora tiene: " + cuenta2.getSaldo());
                    break;
                case 4:
                    salir = false;
                    break;
                default:
                    System.out.println("Elegiste la opcion incorrecta");
                    break;
            } 

        }

        System.out.println("\nGRACIAS POR USAR EL SISTEMA");

    }
}
