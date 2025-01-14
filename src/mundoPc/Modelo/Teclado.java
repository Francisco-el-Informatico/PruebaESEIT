/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundoPc.Modelo;

/**
 *
 * @author ADMIN
 */
public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;
    
    //constructor
    public Teclado(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        idTeclado = ++contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + "'}'" + super.toString();
    }

    
}
