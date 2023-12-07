
package com.mycompany.tpijava095;

/*
 * @author FacuPro
 */
public interface Torneo {
    
    public Equipo crearEquipo ();
    
     public Equipo modificarEquipo();
    
     public boolean eliminarEquipo();
     //return this.estado = false;
        
   public void jugarPartido(Equipo equipo1); 
   public void resultadoPartido(Equipo Equipo1, Equipo Equipo2) ;
   
}
