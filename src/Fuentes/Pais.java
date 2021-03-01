
package Fuentes;

//@author Andrés Ponce

import java.sql.*;
import java.util.ArrayList;
 
public class Pais implements Entidad{
    private int idPais;
    private String nombrePais;

    public Pais() {
        this.idPais = 0;
        this.nombrePais = "";
    }

    public Pais(int id_Pais, String nombrePais) {
        this.idPais = id_Pais;
        this.nombrePais = nombrePais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int id_Pais) {
        this.idPais = id_Pais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "PAIS";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idPais +",\'" + this.nombrePais +"\')");
    }
    
    @Override
    public String toQuery() {
        return ("ID_Pais = " + this.idPais + ", Nombre = \'" + this.nombrePais + "\'");
    }
    
    @Override
    public String toString() {
        return "Código ISO 3166-1: " + idPais + "\nNombre: " + nombrePais;
    }
}
