package uml_universidadj;

public class Persona {

    private String nombre;

    private int edad;
    
    private Domicilio domicilio;
    

    public Persona() {
        this("Noname",0, new Domicilio("Lne","Cne",0));
    }
    
    public Persona(String n, int e, Domicilio d) {
        this.nombre=n;
        this.edad=e;
        this.domicilio=d;
    }
    
    public Persona(String n, int e, String dL, String dC, int dN) {
        this.nombre=n;
        this.edad=e;
        this.domicilio=new Domicilio(dL,dC,dN);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String val) {
        this.nombre=val;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int val) {
        this.edad=val;
    }
   
    
    public Domicilio getDomicilio(){
        return this.domicilio;
    }
    
    
    public void setDomicilio(Domicilio dom){
        this.domicilio=dom;
    }

    @Override
    public String toString() {
        return ("Nombre: " +nombre + " Edad: " + edad + " Domicilio: " + domicilio);
    }
}
