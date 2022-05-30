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
        int opcio;
        Scanner lector = new Scanner(System.in);
        System.out.println("MENÚ");
        System.out.println("1. ESCOLLIR GUÀRDIES");
        System.out.println("2. DESESCOLLIR GUÀRDIES");
        System.out.println("3. SUPLIR GUÀRDIA");
        opcio = lector.nextInt();
        Treballador t = new Treballador();
        switch (opcio) {
            case 1:
            {
                try {
                    t.mostrarGuardies();
                } catch (DAOException ex) {
                    System.out.println(ex);
                }
            }
            {
                try {
                    t.reservarGuardia();
                } catch (DAOException ex) {
                    System.out.println(ex);
                }
            }


            case 2:
            {
                try {
                    t.cancelarGuardia();
//                escollirGuardia();
                } catch (DAOException ex) {
                    System.out.println(ex);
                }
            }
        }
    }
}
