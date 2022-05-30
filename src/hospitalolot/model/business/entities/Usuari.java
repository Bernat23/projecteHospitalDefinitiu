/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.business.entities;

/**
 *
 * @author usuario
 */
public class Usuari extends Entity {
    private String nom;
    private String contrasenya;
    private long idTreballador;

    public Usuari() {
    }
    
    public Usuari(String nom, String contrasenya, long idTreballador) {
        this.nom = nom;
        this.contrasenya = contrasenya;
        this.idTreballador = idTreballador;
    }

    public Usuari(long id, String nom, String contrasenya, long idTreballador) {
        super(id);
        this.nom = nom;
        this.contrasenya = contrasenya;
        this.idTreballador = idTreballador;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public long getIdTreballador() {
        return idTreballador;
    }

    public void setIdTreballador(int idTreballador) {
        this.idTreballador = idTreballador;
    }
    
    
}
