
package com.mycompany.tpijava095;

import jakarta.persistence.Entity;



/**
 * @author FacuPro
 */
public class Equipo1 extends Equipo implements Torneo{
    
    public Equipo1() {
       
        
        super("River", 11, 7, "Marcelo Gallardo", 1, 3, true);
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + super.getNombre() + ", Partidos Jugados: " + this.getPartidosJugados() + ", Puntos: " + this.getPuntos());
    }

    @Override
    public void jugarPartido(Equipo equipo1) {
       this.setPartidosJugados(+1);
    }

    @Override
    public void resultadoPartido(Equipo equipo1, Equipo equipo2) {
        
    }

}
