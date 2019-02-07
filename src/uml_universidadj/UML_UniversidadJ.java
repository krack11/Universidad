/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml_universidadj;

/**
 *
 * @author alumno
 */
public class UML_UniversidadJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Domicilio d1 = new Domicilio("Madrid","Sol",45);
        
                
        d1.setCalle("Sol");
        d1.setLocalidad("Madrid");
        d1.setNumero(14);
        
        p1.setEdad(22);
        p1.setNombre("Julio");
        
        
        Domicilio d2;
        d2=new Domicilio("Aravaca","Rue Percebe", 13);
        System.out.println("Domicilio d1->"+d1);
        System.out.println("Domicilio d2->"+d2);
        
        Persona p2 = new Persona();
        System.out.println("Persona p2->"+p2);
        
        Persona p3 = new Persona("Pepito",15,new Domicilio("Majadahonda","Mayor",27));
        Persona p4 = new Persona("Juanito",17,"Alcorcon","Mayor2",33);
        Persona p5 = new Persona("Juanote",27,d1);
        
        System.out.println("Persona p3->" +p3);
        System.out.println("Persona p4->" +p4);
        System.out.println("Persona p5->" +p5);
        
        Estudiante e1 = new Estudiante("Informatica",1111, "Agapito",20,"Mordor","Orco",20);
        Estudiante e2 = new Estudiante("Fisica",2222,p3);
        p3.setNombre("NombreModificado");
        System.out.println("Alumno e1->"+e1);
        System.out.println("Alumno e2 ->" +e2);
        System.out.println("Persona p3 ->" +p3);
        
        Estudiante [] estu = new Estudiante[4];
        estu[0]= e1;
        estu[1]=e2;
        estu[2]=e1;
        estu[3]=new Estudiante("Matematicas",3333,"Felix",21,"Pozuelo","Cruz",0);
        for(int i =0;i<estu.length;i++){
        System.out.println("Estu"+i+"\t"+estu[i]);
    }

        
       
        
        
    }
    
}
