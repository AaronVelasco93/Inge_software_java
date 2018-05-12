package ico.fes;

public class ClienteNuevo {
    
    private String nombre;

    public ClienteNuevo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public void cobrarCuotaMensual(float cuota) {
        System.out.println("Estimado Sr(a):"+ nombre);
        System.out.println("Gracisa por elegirnos");
        System.out.println("Para seguir contando con los beneficios de"
                + " pago oportuno pague:");
        System.out.println("Cuota: $" + cuota + " antes del fin de mes");
    }

}
