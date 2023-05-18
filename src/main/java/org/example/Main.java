package org.example;

import org.example.Ejemplo.Datos.*;
import org.example.Ejemplo.Datos.*;
import org.example.Ejemplo.Excepciones.AccesoDatosEx;
import org.example.model.Division;
import org.example.model.ExcepcionesParking;
import org.example.model.IndeterminacionEx;
import org.example.model.Parking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws AccesoDatosEx {
        /*
        Division division = null;
        try {
            division = new Division(5, 0);
            division.visualizarOperacion();
        } catch (IndeterminacionEx e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        System.out.println("Continuamos con el flujo del programa");
*/
        /*
        AccesoDatos accesoDatos = new ImplementacionOracle();
        accesoDatos.simularError(false);
        ejecutar(accesoDatos, "listar");
         */

        try{
            Parking parking = new Parking("Parking", 10);
            parking.setArrayListSize(parking.getSize());
            System.out.println(parking.toString());
            ArrayList<String> matriculas = new ArrayList<>();
            parking.entrada("1231231qweqweqw2312314", 4);
            parking.entrada("1235", 3);
            parking.entrada("1236", 2);
            System.out.println(parking.toString());

            parking.salida("1234");
            System.out.println(parking.getPlazasTotales());
            System.out.println(parking.getPlazasLibres());
            System.out.println(parking.getPlazasOcupadas());
            //parking.setMatriculas(matriculas);
            System.out.println(parking.toString());
        }catch (ExcepcionesParking ex) {
            ex.printStackTrace(System.out);
        }catch (Exception ex){
            System.out.println("Error general");
            ex.printStackTrace(System.out);
        }
        finally {
            System.out.println("Procesar finally es opcional, siempre se ejecuta");

        }

        }
    public static void ejecutar(AccesoDatos datos,String operacion) {
        try{
            if(operacion.equals("listar")){
                datos.listar();
            }
            else if(operacion.equals("insertar")){
                datos.insertar();
            }
            else{
                System.out.println("No se proporciono ninguna operacion conocida");
            }
        }catch (AccesoDatosEx ex){
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);

        }catch (Exception ex){
            System.out.println("Error general");
            ex.printStackTrace(System.out);
        }
        finally {
            System.out.println("Procesar finally es opcional, siempre se ejecuta");

        }

    }
}