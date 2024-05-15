
package mundoPc.Modelo;


public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRaton;
    
    //constructor
    public Raton(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        idRaton = ++contadorRaton;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + "'} '" + super.toString(); 
    }
    
    
}