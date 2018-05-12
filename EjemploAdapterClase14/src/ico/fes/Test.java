
package ico.fes;


public class Test {
    
    public static void main(String[] args) {
        Object[] carteraClientes = {new ClienteNuevo("Aaron"),new ClienteMoroso("Jesus"), new ClienteNuevo("Ana")};//Agrego cliente
        
        float cuota=500.0f;
        float multa=5.0f;
        float descuento=10.0f;
        
        
        for (Object cliente : carteraClientes) {
            if (cliente.getClass().getSimpleName().equals("ClienteNuevo")) {
                ((ClienteNuevo)cliente).cobrarCuotaMensual(cuota);
            }else if ( cliente.getClass().getSimpleName().equals("ClienteMoroso")){
                ((ClienteMoroso)cliente).cobrarCuotaMensual(cuota,multa);
            }else if (cliente.getClass().getSimpleName().equals("ClientePremium")) {//Agrego
                 ((ClienteMoroso)cliente).cobrarCuotaMensual(cuota,descuento);
            }
        }
    }
    
}
