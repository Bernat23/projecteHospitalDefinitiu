/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package hospitalolot.controller;

import hospitalolot.model.business.entities.Treballador;
import hospitalolot.model.business.entities.Usuari;
import hospitalolot.model.persistence.dao.implementations.jdbc.JDBCTreballador;
import hospitalolot.model.persistence.dao.implementations.jdbc.JDBCUsuari;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import hospitalolot.model.persistence.dao.implementations.jdbc.mysql.MySQLConnection;
import hospitalolot.model.persistence.exception.DAOException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class FXMLDocumentController implements Initializable {

    private JDBCUsuari usuari;

    @FXML
    private Label lblUsuari;
    @FXML
    private Label lblContrasenya;
    @FXML
    private TextField txtUsuari;
    @FXML
    private PasswordField txtContrasenya;
    @FXML
    private Button btnIniciarSessio;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usuari = new JDBCUsuari();
    }

    @FXML
    private void btnIniciarSessio(ActionEvent event) throws DAOException {
        JDBCUsuari usuariDAO = new JDBCUsuari();
        Usuari u = new Usuari();
        String contrasenyaEntrada = txtContrasenya.getText();

        u = usuariDAO.getUsuari(contrasenyaEntrada);
        
        JDBCTreballador treballadorDAO = new JDBCTreballador();
        Treballador t = treballadorDAO.get(u.getIdTreballador());
    }
}
