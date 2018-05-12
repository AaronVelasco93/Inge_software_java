//Clase -> ClienteNuevoAdapter 
package ico.fes.adapter;
import ico.fes.ClienteNuevo;//importar

public class ClienteNuevoAdapter implements Cliente {

    private ClienteNuevo adaptado;

    public ClienteNuevoAdapter(ClienteNuevo cli) {
        this.adaptado = cli;
    }

    @Override
    public void cobrarCuotaMensual(float cuota, float multa, float descuento) {
        adaptado.cobrarCuotaMensual(cuota);
    }

}
