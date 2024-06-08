package BANCO;

import java.util.Scanner;

public class Pago_Servicios extends Cliente{
    double cant_pago;
    Cliente cliente;
    public Pago_Servicios(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pago_Servicios(double cant_pago) {
        this.cant_pago = cant_pago;
    }


    public double getCant_pago() {
        return cant_pago;
    }

    public void setCant_pago(double cant_pago) {
        this.cant_pago = cant_pago;
    }

    public void pagarLUz(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted actual mente cuenta con $" + cliente.getMonto());
        System.out.println("Ingrese la cantidad que debe al servicio de luz: ");
        cant_pago = (sc.nextDouble());

        while (cant_pago >= cliente.getMonto()){
            System.out.println("El cuenta NO tiene el suficiente monto para realizar esta accion");
            System.out.println("Ingrese la cantidad de nuevo: ");
            cant_pago = sc.nextDouble();
        }
        cliente.setMonto(cliente.getMonto() - cant_pago);
        System.out.println("Pago realizado con exito\nEl total de tu cuenta ahora es de " + cliente.getMonto());
    }

    public void pagarAgua(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted actual mente cuenta con $" + cliente.getMonto());
        System.out.println("Ingrese la cantidad que debe al servicio de luz: ");
        cant_pago = (sc.nextDouble());

        while (cant_pago >= cliente.getMonto()){
            System.out.println("El cuenta NO tiene el suficiente monto para realizar esta accion");
            System.out.println("Ingrese la cantidad de nuevo: ");
            cant_pago = sc.nextDouble();
        }
        cliente.setMonto(cliente.getMonto() - cant_pago);
        System.out.println("Pago realizado con exito\nEl total de tu cuenta ahora es de " + cliente.getMonto());
    }

    public void pagarInternet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Usted actual mente cuenta con $" + cliente.getMonto());
        System.out.println("Ingrese la cantidad que debe al servicio de luz: ");
        cant_pago = (sc.nextDouble());

        while (cant_pago >= cliente.getMonto()){
            System.out.println("El cuenta NO tiene el suficiente monto para realizar esta accion");
            System.out.println("Ingrese la cantidad de nuevo: ");
            cant_pago = sc.nextDouble();
        }
        cliente.setMonto(cliente.getMonto() - cant_pago);
        System.out.println("Pago realizado con exito\nEl total de tu cuenta ahora es de " + cliente.getMonto());
    }
}
