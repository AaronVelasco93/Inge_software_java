
package ico.fes;


public class ClienteMoroso {
    
    private String nombre;//Agrego

    public ClienteMoroso(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual(float cuota, float multa){
        System.out.println("Estimado Sr(a):"+ nombre);
        System.out.println("Se encuentra atrasado en el pago");
        System.out.println("Se le impone una multa de: "+multa+"%");
        System.out.println("Cuota: $"+cuota);
        System.out.println("Multa: $"+cuota*(multa/100));
        System.out.println("Total: $"+(cuota+cuota*(multa/100)));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
