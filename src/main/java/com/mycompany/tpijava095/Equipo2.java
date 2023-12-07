
package com.mycompany.tpijava095;

/**
 * @author FacuPro
 */
public class Equipo2 extends Equipo implements Torneo{
    
    public Equipo2() {
        super("Racing", 11, 7, "Gago", 1, 0, true);
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
