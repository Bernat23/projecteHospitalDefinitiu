/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.persistence.dao.implementations.jdbc.utils;

import hospitalolot.model.business.entities.Treballador;
import hospitalolot.model.persistence.dao.contract.RelacioDAO;
import hospitalolot.model.persistence.dao.implementations.jdbc.mysql.MySQLConnection;
import hospitalolot.model.persistence.exception.DAOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Bernat
 */
public class JDBCRelacio implements RelacioDAO{

    @Override
    public Object get(long id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(long idTreballador, long idGuardia) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("INSERT INTO relacio(idTreballador ,idGuardies) values(?, ?)");
            query.setLong(1, idTreballador);
            query.setLong(2, idGuardia);
            query.executeUpdate();
            ResultSet rst = query.getGeneratedKeys();
            if(rst.next()){
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void delete(long idTreballador,long idGuardia) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("DELETE FROM relacio WHERE idTreballador = ? AND idGuardies = ?");
            query.setLong(1, idTreballador);
            query.setLong(2, idGuardia);
            query.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);;
        }
    }

    @Override
    public void update(Object t) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Object t) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Object t) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
