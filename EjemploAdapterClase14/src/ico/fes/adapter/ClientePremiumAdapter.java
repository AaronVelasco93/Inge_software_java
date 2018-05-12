
package ico.fes.adapter;
import ico.fes.ClientePremium;
public class ClientePremiumAdapter implements Cliente{

    
        private ClientePremium adaptado;
        
        
        public ClientePremiumAdapter(ClientePremium cli){
        this.adaptado=cli;
        
        }

    @Override
    public void cobrarCuotaMensual(float cuota, float muta, float descuento) {
        adaptado.cobrarCuotaMensual(cuota, descuento);
    }
        
        
        
    
    
    
    
}
