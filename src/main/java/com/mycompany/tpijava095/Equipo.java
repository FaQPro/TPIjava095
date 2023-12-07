
package com.mycompany.tpijava095;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Random;

/**
 * @author FacuPro
 */
@Entity
@Table (name="equipo")
public class Equipo implements Torneo{
    
    @Column
    @Id
    private String nombre;
    @Basic
    private int titulares;
    private int suplentes;
    private String directorTecnico;
    private int partidosJugados;
    private int puntos;
    private boolean estado;

    public Equipo() {
    }

    public Equipo(String nombre, int titulares, int suplentes, String directorTecnico, int partidosJugados, int puntos, boolean estado) {
        this.nombre = nombre;
        this.titulares = titulares;
        this.suplentes = suplentes;
        this.directorTecnico = directorTecnico;
        this.partidosJugados = partidosJugados;
        this.puntos = puntos;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTitulares() {
        return titulares;
    }

    public void setTitulares(int titulares) {
        this.titulares = titulares;
    }

    public int getSuplentes() {
        return suplentes;
    }

    public void setSuplentes(int suplentes) {
        this.suplentes = suplentes;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
// METODOS CRUD
    
    
     public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Partidos Jugados: " + partidosJugados + ", Puntos: " + puntos);
    }

    @Override
    public void jugarPartido(Equipo equipo1) {
   
    }

       public int obtenerResultadoAleatorio() {
        Random random = new Random();
        return random.nextInt(11);
    }
       
       
    @Override
    public void resultadoPartido(Equipo Equipo1, Equipo Equipo2) {
        
         int resultadoEquipo1 = obtenerResultadoAleatorio();
         int resultadoEquipo2 = obtenerResultadoAleatorio();

        System.out.println("Resultados del partido:");
        System.out.println("Equipo " + Equipo1.getNombre()+ ": " + resultadoEquipo1);
        System.out.println("Equipo " + Equipo2.getNombre() + ": " + resultadoEquipo2);
    
         // Determinar al ganador
        if (resultadoEquipo1 > resultadoEquipo2) {
            Equipo1.puntos+=3;  // Ganador Equipo1
            System.out.println("El equipo " + Equipo1.getNombre()+ " es el ganador.");
        } else if (resultadoEquipo2 > resultadoEquipo1  || resultadoEquipo1<resultadoEquipo2 ) {
            Equipo2.puntos+=3;  // Ganador Equipo2
            System.out.println("El equipo " + Equipo2.getNombre()+ " es el ganador.");
        } else{
            Equipo1.puntos+=1;  // Empate de equipo1 
            Equipo2.puntos+=1;  // Empate de equipo2
            System.out.println("Partido Empatado");
        }
        
 
    }

    @Override
    public Equipo crearEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Equipo modificarEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean eliminarEquipo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

 
  
    
}
