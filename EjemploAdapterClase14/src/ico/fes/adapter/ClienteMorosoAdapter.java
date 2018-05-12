/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.adapter;
import ico.fes.ClienteMoroso;

/**
 *
 * @author S1PC1
 */
public class ClienteMorosoAdapter  implements Cliente{
    
    
    private ClienteMoroso adaptado;
    
    public ClienteMorosoAdapter(ClienteMoroso cli){
        this.adaptado=cli;
    
    }

    @Override
    public void cobrarCuotaMensual(float cuota, float muta, float descuento) {
    
        adaptado.cobrarCuotaMensual(cuota, muta);
        
        
    }

    

    
    
    
    
}
