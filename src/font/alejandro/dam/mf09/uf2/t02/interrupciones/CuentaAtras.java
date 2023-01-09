package font.alejandro.dam.mf09.uf2.t02.interrupciones;

public class CuentaAtras extends Thread{
    private String nombre;
    private int segundosCuentaAtras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSegundosCuentaAtras() {
        return segundosCuentaAtras;
    }

    public void setSegundosCuentaAtras(int segundosCuentaAtras) {
        this.segundosCuentaAtras = segundosCuentaAtras;
    }

    public CuentaAtras(String nombre, int segundosCuentaAtras){
        this.nombre = nombre;
        this.segundosCuentaAtras = segundosCuentaAtras;
    }

    public void run() {
        while (segundosCuentaAtras > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo " + nombre + " interrumpido");
                return;
            }
            System.out.println("Hilo: " + nombre + " - Segundos: " + segundosCuentaAtras);
            segundosCuentaAtras--;
        }
    }
}
