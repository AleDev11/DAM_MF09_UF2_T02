package font.alejandro.dam.mf09.uf2.t02.interrupciones;

import java.util.Scanner;

public class GestionHilos {
    public void iniciarEjecucionHilos() {
        CuentaAtras cuentaAtras1 = new CuentaAtras("ID1", 120);
        CuentaAtras cuentaAtras2 = new CuentaAtras("ID2", 125);
        CuentaAtras cuentaAtras3 = new CuentaAtras("ID3", 130);
        CuentaAtras cuentaAtras4 = new CuentaAtras("ID4", 135);

        cuentaAtras1.start();
        cuentaAtras2.start();
        cuentaAtras3.start();
        cuentaAtras4.start();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el ID del hilo a interrumpir: ");
            String id = sc.nextLine();
            switch (id) {
                case "1":
                    cuentaAtras1.interrupt();
                    break;
                case "2":
                    cuentaAtras2.interrupt();
                    break;
                case "3":
                    cuentaAtras3.interrupt();
                    break;
                case "4":
                    cuentaAtras4.interrupt();
                    break;
                case "-1":
                    System.out.println("Fin de la ejecución");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ID no válido");
            }
        }
    }
}
