package mundoPc;

import mundoPc.Modelo.Computadora;
import mundoPc.Modelo.Monitor;
import mundoPc.Modelo.Raton;
import mundoPc.Modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        //System.out.println(ratonLenovo);
        
        Teclado tecladoLenovo = new Teclado("Usb", "Lenovo");
        //System.out.println(tecladoLenovo);
        
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        //System.out.println(monitorLenovo);
        
        //Creamos un objeto de tipo Computadora
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadoraLenovo);
        
    }
    
}
