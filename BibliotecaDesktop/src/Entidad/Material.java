/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author admin
 */
public class Material {
    public String ubicacion,titulo,autor;
    public int CantTotal,CantPrestada,CantDisp;
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantTotal() {
        return CantTotal;
    }

    public void setCantTotal(int CantTotal) {
        this.CantTotal = CantTotal;
    }

    public int getCantPrestada() {
        return CantPrestada;
    }

    public void setCantPrestada(int CantPrestada) {
        this.CantPrestada = CantPrestada;
    }

    public int getCantDisp() {
        return CantDisp;
    }

    public void setCantDisp(int CantDisp) {
        this.CantDisp = CantDisp;
    }
    
    public String IDinterno(){
        String IDinterno="";
        return IDinterno;
        //tengo planiado generar aqui el codigo pero tendriamos que obtener el tipo y substraer las 3 primeras letras 
    }
}
