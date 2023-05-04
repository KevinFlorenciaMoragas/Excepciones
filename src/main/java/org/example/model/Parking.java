package org.example.model;

import java.util.ArrayList;

public class Parking {
    ArrayList<String> matriculas = new ArrayList<String>();
    String name;
    public Parking(String name) {
        this.name = name;
    }
    public Parking() {
    }

    public ArrayList<String> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<String> matriculas) {
        this.matriculas = matriculas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void entrada(String matricula, int plaza) throws ExcepcionesParking {
        int matriculasSize = matriculas.size();
        if(matriculasSize == 0 || matriculasSize < 4){
            throw new ExcepcionesParking("El parking esta vacio");
        }
        if(plaza > 0){
            throw new ExcepcionesParking("La plaza esta ocupada");
        }
        if(matriculas.contains(matricula)){
            throw new ExcepcionesParking("La matricula ya esta en el parking");
        }
        matriculas.add(matricula);
    }
    public int salida(String matricula) throws ExcepcionesParking {
        int matriculasSize = matriculas.size();
        if(matriculasSize == 0){
            return 0;
        }
        if(matriculas.contains(matricula)){
            matriculas.remove(matricula);
            return 1;
        }
        if(matriculas.contains(matricula) == false){
            throw new ExcepcionesParking("La matricula no esta en el parking");
        }
        return 0;
    }
    public void visualizar() {
        System.out.println("El parking " + name + " tiene las siguientes matriculas: " + matriculas);
    }

}
