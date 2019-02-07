package uml_universidadj;

public class Estudiante extends Persona {

    private String carrera;

    private int nMatricula;

    public Estudiante() {
    }
    
    public Estudiante(String car, int nMat,String nom, int ed,String lo, String ca,int num) {
        super(nom,ed,lo,ca,num);
        this.carrera=car;
        this.nMatricula=nMat;
    }
    
    public Estudiante(String car, int nMat, Persona  p) {
        super(p.getNombre(),p.getEdad(),p.getDomicilio());
        this.carrera=car;
        this.nMatricula=nMat;
    }
    
    

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String val) {
        this.carrera = val;
    }

    public int getNMatricula() {
        return this.nMatricula;
    }

    public void setNMatricula(int val) {
        this.nMatricula=val;
    }

    @Override
    public String toString() {
        return ("Carrera: " + this.carrera + " nMatricula: " + this.nMatricula + super.toString());
    }
}
