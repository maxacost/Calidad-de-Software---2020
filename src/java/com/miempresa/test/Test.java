/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.test;

import com.miempresa.dao.PreguntaDao;
import com.miempresa.dtos.PreguntaDto;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class Test {
    
    
    public static void main(String[] args) {
   
        PreguntaDao preguntaDao= new PreguntaDao();
        preguntaDao.sql_delete("235");
        /*ProductoDto productoDto = new ProductoDto("Arroz  ","Cereal","Desarrollo",3.8,50);*/
//        PreguntaDto preguntaDto = new PreguntaDto("fyrrgt","f","dasdasd","adsasdas","dad","adsdas","dasdasd","adsasdas","dad","adsdas","dasdasd","adsasdas","dad","adsdas","dasdasd","adsasdas","dad","adsdas","dasdasd","adsasdas");
     
//       if(preguntaDao.sql_insert(preguntaDto)){
//            System.out.println("Se agrego el producto con exito");
//        }else{
//            System.out.println("No agrego el producto con exito");
//        }
        
//        if(preguntaDao.sql_update(preguntaDto)){ 
//            System.out.println("Se actualizo el producto con  exito en la BD");
//        }else{
//           System.out.println("No se actualizo el producto con  exito en la BD");
//        }
   
//       ArrayList<PreguntaDto> preguntas = new ArrayList<>();
//        preguntas =preguntaDao.sql_selectAll();
//        for (PreguntaDto pregunta : preguntas) {
//            System.out.println("Producto :" + pregunta.getPregunta());
//            
//        }
//if(preguntaDao.sql_insertExam(preguntaDto)){
//            System.out.println("Se agrego el producto con exito");
//        }else{
//            System.out.println("No agrego el producto con exito");
//        }
//
//    if(preguntaDao.sql_selectByIdExam(10)){
//            System.out.println("Se agrego el producto con exito");
//        }else{
//            System.out.println("No agrego el producto con exito");
//    }
    
      
    }
    
}
