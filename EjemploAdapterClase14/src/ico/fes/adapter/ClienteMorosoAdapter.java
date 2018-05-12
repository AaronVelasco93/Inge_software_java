//Clase -> ClienteMorosoAdapter
package ico.fes.adapter;
import ico.fes.ClienteMoroso;//IMPORTAR

public class ClienteMorosoAdapter implements Cliente {

    private ClienteMoroso adaptado;

    public ClienteMorosoAdapter(ClienteMoroso cli) {
        this.adaptado = cli;

    }

    @Override
    public void cobrarCuotaMensual(float cuota, float muta, float descuento) {

        adaptado.cobrarCuotaMensual(cuota, muta);

    }

}
