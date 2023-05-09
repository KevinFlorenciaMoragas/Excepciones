/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Ejemplo.Datos;

import org.example.Ejemplo.Excepciones.AccesoDatosEx;
import org.example.Ejemplo.Excepciones.EscrituraDatosEx;
import org.example.Ejemplo.Excepciones.LecturaDatosEx;

/**
 *
 * @author eduardodiamar
 */
public class ImplementacionOracle implements AccesoDatos{
    private boolean simularError;

    public boolean isSimularError() {
        return simularError;
    }
    public void setSimularError(boolean simularError) {
        this.simularError = simularError;
    }

    @Override
    public void insertar() throws AccesoDatosEx {
        if(simularError){
            throw new LecturaDatosEx("Error de acceso a datos");
    }else{
            System.out.println("Insertar desde ORACLE");
        }

    }

    @Override
    public void listar()throws AccesoDatosEx {
        if(simularError){
            throw new LecturaDatosEx("Error de acceso a datos");
        }
        else {
            System.out.println("Listar desde ORACLE");
        }

    }


    @Override
    public void simularError(boolean simularError) throws AccesoDatosEx {
        this.simularError = simularError;
    }

}
