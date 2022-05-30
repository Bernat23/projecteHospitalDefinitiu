/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.view.console;

import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import hospitalolot.model.business.entities.Guardies;
import hospitalolot.model.business.entities.Treballador;
import hospitalolot.model.persistence.dao.implementations.jdbc.JDBCGuardies;
import hospitalolot.model.persistence.exception.DAOException;
import hospitalolot.view.gui.HospitalOlot;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernat
 */
public class main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Pàgina d'Inici");
        stage.setScene(scene);

        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Base de dades desconnectada");
    }

    public static void main(String[] args) {
    }
    
    public void menuAdministrador(Treballador t) {
        int opcio;
            Scanner lector = new Scanner(System.in);
            System.out.println("MENÚ");
            System.out.println("1. ESCOLLIR GUÀRDIES");
            System.out.println("2. DESESCOLLIR GUÀRDIES");
            System.out.println("3. SUPLIR GUÀRDIA");
            System.out.println("4. AFEGIR GUÀRDIA");
            System.out.println("5. AVISAR TREBALLADORS QUE HI HA PLACES LLIURES");
            System.out.println("6. SUPRIMIR GUÀRDIA");

    }

    public void menuTreballador(Treballador t) {
        try {
            int opcio;
            Scanner lector = new Scanner(System.in);
            System.out.println("MENÚ");
            System.out.println("1. ESCOLLIR GUÀRDIES");
            System.out.println("2. DESESCOLLIR GUÀRDIES");
            System.out.println("3. SUPLIR GUÀRDIA");
           
            opcio = lector.nextInt();
            switch (opcio) {
                case 1:
                    t.mostrarGuardies();
                    t.reservarGuardia();
                    break;
                case 2:
                    t.cancelarGuardia();
            }
        } catch (DAOException ex) {
            Logger.getLogger(HospitalOlot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
