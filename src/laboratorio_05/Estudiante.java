/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_05;

import java.awt.font.TextAttribute;

/**
 *
 * @author ESTUDIANTE
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String codigo;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getTexto(){
        String texto;
        texto = nombre + "                                              ";
        texto = texto.substring(0,17)+ apellido
                + "                                             ";
        texto = texto.substring(0,34)+ codigo;
               
        return texto ;
    }
    //Constructor
    public Estudiante(String nombre,String apellido,String codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }
    
}
