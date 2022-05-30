/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.business.entities;

/**
 *
 * @author Bernat
 */
public class Torn extends Entity{
    
    private String horari;

    public Torn(String horari) {
        super();
        this.horari = horari;
    }
    

    public Torn(String horari, long id) {
        super(id);
        this.horari = horari;
    }

    public Torn() {
    }



    public String getHorari() {
        return horari;
    }

    public void setHorari(String horari) {
        this.horari = horari;
    }
    
    
}
