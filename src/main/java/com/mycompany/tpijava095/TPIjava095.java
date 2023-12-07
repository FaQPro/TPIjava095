/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpijava095;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author FacuPro
 */
public class TPIjava095 {

    public static void main(String[] args) {
       //Crear equipos usando clases hijas que heredan de clase abstracta 
        //Equipo1 River = new Equipo1();
        //Equipo2 Racing = new Equipo2();
        // usa cada equipo sus metodos abstractos de diferente manera 
        //River.mostrarInformacion();
        //Racing.mostrarInformacion();
        //Equipo fecha = new Equipo();
        
        //fecha.resultadoPartido(River, Racing);
        
        String hql = "SELECT * FROM equipo";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("TPIjava095");
        EntityManager entityManager = fabrica.createEntityManager();
        Query query = entityManager.createQuery(hql);
        List<Equipo> equipos = query.getResultList();
        
        
        
      
        
        
    }
}
