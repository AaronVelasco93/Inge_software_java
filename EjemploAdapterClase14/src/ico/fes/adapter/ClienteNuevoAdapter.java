/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.adapter;

import ico.fes.ClienteNuevo;

public class ClienteNuevoAdapter implements Cliente{

   private ClienteNuevo adaptado;
    
   public ClienteNuevoAdapter(ClienteNuevo cli){
   this.adaptado=cli;
   }

   @Override
   public void cobrarCuotaMensual(float cuota,float multa, float descuento){
       adaptado.cobrarCuotaMensual(cuota);
   }
   
    
    
    
}
