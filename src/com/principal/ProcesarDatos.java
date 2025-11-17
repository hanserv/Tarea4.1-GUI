/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.principal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanse
 */
public class ProcesarDatos {
    //Atributes
    private String matricula;
    private String nombres;
    private String apellidos;
    private int cuatrimestre;
    
    // Getters and Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
    
    
    public void capturarDatos(String matricula,String nombres,String apellidos,int cuatrimestre) {
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuatrimestre = cuatrimestre;
    }
    
    public ProcesarDatos presentarDatos() {
        ProcesarDatos datos = new ProcesarDatos();
        datos.setMatricula(matricula);
        datos.setNombres(nombres);
        datos.setApellidos(apellidos);
        datos.setCuatrimestre(cuatrimestre);
        return datos;
    }
}
