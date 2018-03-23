/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import ico.fes.dao.ClienteDAO;
import ico.fes.dp.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jeshc
 */
public class Pruebas {

    public static void main(String[] args) {
        ClienteDAO cdao = new ClienteDAO();

        Cliente c = new Cliente("203", "UNAM", "rancho seco s/n", "Neza", 56230963, "jhc", "sss");
       
        Cliente cli = new Cliente();
       

        try {
            
            //INSERT
            if (cdao.insertar(c)) {
                JOptionPane.showMessageDialog(null, "Insertado correctamente!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar, revisar los datos");
            }
            
            /*
            //Busqueda ID
            String id;
                id="CT01";
           
            c = (Cliente) cdao.buscarPorId(id);
            
            System.out.println("ID: "+id+"- Responsable: " + c.getResponsable() + " Empresa: " 
                    + c.getEmpresa() + " Direccion: " + c.getDireccion()
                    + " Poblacion: " + c.getPoblacion());
            
            
            //Se aprobecha el ejemplo anterior para el update
           
            c.setEmpresa("Aragon-SAMP");
            cdao.update(c);
           */
            
           /*  
            //DELETE
            String delet;
            delet = "CT23";
            if (cdao.delete(delet)) {
                System.out.println("Regstro Eliminado");
            } else {

                JOptionPane.showMessageDialog(null, "Registro: " + delet + " ya a sido eliminado.");
            }
            */
            /*
            //Obtener todo
            ArrayList<Cliente> lista = cdao.obetenerTodo();
            for (Cliente cliente : lista) {
                System.out.println("Clave Cliente: " + cliente.getEmpresa()+" Empresa: "+cliente.getEmpresa()
                        +" Direccion:"+cliente.getDireccion()+" Poblacion: "+cliente.getPoblacion()
                        +" Telefono: "+cliente.getResponsable()+" Historial: "+cliente.getHistorial());
            }
             */
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
