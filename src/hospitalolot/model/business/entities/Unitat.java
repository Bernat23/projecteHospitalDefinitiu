/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.business.entities;

/**
 *
 * @author Bernat
 */
public class Unitat extends Entity{
    
    private String tipus;



    public Unitat() {
    }

    public Unitat(long id, String tipus) {
        super(id);
        this.tipus = tipus;
    }

 
    public Unitat( String tipus) {
        this.tipus = tipus;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    
    
}
