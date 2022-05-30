/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.business.entities;

import java.util.Date;
import java.time.LocalDate;

/**
 *
 * @author Bernat
 */
public class Guardies extends Entity{
    
    private Unitat u;
    private Torn t;
    private Categoria c;
    private LocalDate dia;
    private byte quantitatTreballadors;

    public Guardies() {
    }

    public Unitat getU() {
        return u;
    }

    public Torn getT() {
        return t;
    }

    public Categoria getC() {
        return c;
    }

    public Guardies(Unitat u, Torn t, Categoria c, LocalDate dia, byte quantitatTreballadors) {
        this.u = u;
        this.t = t;
        this.c = c;
        this.dia = dia;
        this.quantitatTreballadors = quantitatTreballadors;
    }

    public Guardies(Unitat u, Torn t, Categoria c, byte quantitatTreballadors) {
        this.u = u;
        this.t = t;
        this.c = c;
        this.quantitatTreballadors = quantitatTreballadors;
    }

    public Guardies(Unitat u, Torn t, Categoria c, LocalDate dia, byte quantitatTreballadors, long id) {
        super.setId(id);
        this.u = u;
        this.t = t;
        this.c = c;
        this.dia = dia;
        this.quantitatTreballadors = quantitatTreballadors;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public byte getQuantitatTreballadors() {
        return quantitatTreballadors;
    }

    public void setQuantitatTreballadors(byte quantitatTreballadors) {
        this.quantitatTreballadors = quantitatTreballadors;
    }

    public void setU(Unitat u) {
        this.u = u;
    }

    public void setT(Torn t) {
        this.t = t;
    }

    public void setC(Categoria c) {
        this.c = c;
    }
   
    
}
