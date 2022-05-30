/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.business.entities;

import hospitalolot.model.persistence.dao.implementations.jdbc.JDBCGuardies;
import hospitalolot.model.persistence.dao.implementations.jdbc.utils.JDBCRelacio;
import hospitalolot.model.persistence.exception.DAOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernat
 */
public class Treballador extends Entity {

    private static Scanner lector = new Scanner(System.in);
    private static JDBCRelacio jrelacio = new JDBCRelacio();
    private static JDBCGuardies jguardies = new JDBCGuardies();
    private String nom;
    private String cognom;
    private Boolean temporal;

    public Treballador(String nom, String cognom, Boolean temporal) {
        this.nom = nom;
        this.cognom = cognom;
        this.temporal = temporal;
    }

    public Treballador(long id, String nom, String cognom, Boolean temporal) {
        super.setId(id);
        this.nom = nom;
        this.cognom = cognom;
        this.temporal = temporal;
    }

    public Treballador(long id, String nom, String cognom) {
        super.setId(id);
        this.nom = nom;
        this.cognom = cognom;
    }

    public Treballador() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    public void reservarGuardia() throws DAOException {
        //mostrarGuardies();
        long idGuardia = lector.nextLong();
        try {
            jrelacio.add(this.getId(), idGuardia);
        } catch (DAOException ex) {
            throw new DAOException();
        }
    }

    /**
     * Metode per cancel·lar les guàrdies apuntades per aquest treballador
     */
    public void cancelarGuardia() throws DAOException {
        long idGuardia = lector.nextLong();
        try {
            jrelacio.delete(this.getId(), idGuardia);
        } catch (DAOException ex) {
            throw new DAOException();
        }
    }
    
    public void mostrarGuardies() throws DAOException {
        try {
            List<Guardies> llista = new ArrayList<Guardies>();
            llista = jguardies.getAll();
            for (int i = 0; i < llista.size(); ++i){
                System.out.println(llista.get(i).toString());
                
            }
        } catch (DAOException ex) {
            throw new DAOException();
        }
    }

}
