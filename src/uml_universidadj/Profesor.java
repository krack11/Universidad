package uml_universidadj;

public class Profesor extends Persona {

    private String materia;

    private String cargo;

    public Profesor() {
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String val) {
        this.materia=val;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String val) {
        this.cargo=val;
    }

    @Override
    public String toString() {
        return ("Materia: " +materia+ " Cargo: " + cargo + " " + super.toString());
    }
}
