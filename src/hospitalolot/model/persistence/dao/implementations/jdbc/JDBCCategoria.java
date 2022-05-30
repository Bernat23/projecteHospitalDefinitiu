/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.persistence.dao.implementations.jdbc;

import hospitalolot.model.business.entities.Categoria;
import hospitalolot.model.business.entities.Torn;
import hospitalolot.model.persistence.dao.contract.CategoriaDAO;
import hospitalolot.model.persistence.dao.implementations.jdbc.mysql.MySQLConnection;
import hospitalolot.model.persistence.exception.DAOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernat
 */
public class JDBCCategoria implements CategoriaDAO {
    @Override
    public Categoria get(long id) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("Select * from categoria where idCategoria = ?");
            query.setLong(1, id);
            ResultSet result = query.executeQuery();
            if(result.next()){
                Categoria c = new Categoria(result.getString("tipus"), result.getLong("idCategoria"));
                return c;
            }
            return null;
        } catch (SQLException ex) {
            throw new DAOException();
        }

    }

    @Override
    public List<Categoria> getAll() throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("Select * from categoria");
            ResultSet result = query.executeQuery();
            List<Categoria> llista = new ArrayList<>();
            while (result.next()) {
                llista.add(get(result.getInt("idCategoria")));
               
            }
            return llista;
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }







    @Override
    public void add(Categoria t) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("INSERT INTO categoria() values(?)", Statement.RETURN_GENERATED_KEYS);
            query.setString(1, t.getTipus());
            query.executeUpdate();
            ResultSet rst = query.getGeneratedKeys();
            if(rst.next()){
                t.setId(rst.getInt(1));
            }
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }

    @Override
    public void delete(Categoria t) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("DELETE FROM TORN WHERE idCategoria = ?");
            query.setLong(1, t.getId());
            query.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }

    @Override
    public void update(Categoria c) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("UPDATE TORN SET HORARI = ? WHERE idCategoria = ?");
            query.setString(1, c.getTipus());
            query.setString(2, Long.toString(c.getId()));
        } catch (SQLException ex) {
            Logger.getLogger(JDBCTorn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
