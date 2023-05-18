package org.example.model;

import java.util.ArrayList;

public class Parking {
    ArrayList<String> matriculas = new ArrayList<String>();
    String name;
    int size;
    public void setArrayListSize(int size){
        for(int i = 0; i < size; i++){
            matriculas.add(null);
        }
    }
    public Parking(String name, int size) {
        this.name = name;
        this.size = size;
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
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void entrada(String matricula, int plaza) throws ExcepcionesParking {
        int matriculasSize = matriculas.size();
        int matrSize = matricula.length();
        if(matrSize == 0 || matrSize < 4 || matrSize > 10){
            throw new ExcepcionesParking("La matricula esta equivocada");
        }
        if(plaza >= 0 && plaza < matriculas.size() && matriculas.get(plaza) != null){
            throw new ExcepcionesParking("La plaza esta ocupada");
        }
        if(matriculas.contains(matricula)){
            throw new ExcepcionesParking("La matricula ya esta en el parking");
        }
        System.out.println("La matricula " + matricula + " ha entrado en la plaza " + plaza);
        matriculas.set(plaza,matricula);
    }
    public int salida(String matricula) throws ExcepcionesParking {
        int matriculasSize = matriculas.size();
        if(matriculasSize == 0){
            throw new ExcepcionesParking("La matricula esta equivocada");
        }
        if(matriculas.contains(matricula)){
            matriculas.remove(matricula);
            System.out.println("La matricula " + matricula + " ha salido del parking");
            return 1;
        }
        if(matriculas.contains(matricula) == false){
            throw new ExcepcionesParking("La matricula no esta en el parking");
        }
        System.out.println("La matricula " + matricula + " ha salido del parking");
        return 0;
    }
    public int getPlazasTotales(){
        return matriculas.size();
    }
    public int getPlazasLibres(){
        return this.size - matriculas.size();
    }
    public int getPlazasOcupadas(){
        return matriculas.size();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< matriculas.size();i++){
            sb.append("Plaza: ").append(i+1).append(": ");
            if(matriculas.get(i) != null){
                sb.append(matriculas.get(i));
            }else{
                sb.append("Libre");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public void visualizar() {
        System.out.println("El parking " + name + " tiene las siguientes matriculas: " + matriculas);
    }

}
