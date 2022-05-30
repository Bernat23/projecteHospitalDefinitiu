/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalolot.model.persistence.dao.implementations.jdbc;

import hospitalolot.model.business.entities.Usuari;
import hospitalolot.model.persistence.dao.contract.UsuariDAO;
import hospitalolot.model.persistence.exception.DAOException;
import hospitalolot.model.persistence.dao.implementations.jdbc.mysql.MySQLConnection;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

/**
 *
 * @author usuario
 */
public class JDBCUsuari implements UsuariDAO {

    @Override
    public Usuari get(long id) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("Select * from usuaris where idUsuari = ?");
            query.setLong(1, id);
            ResultSet result = query.executeQuery();
            Usuari u = new Usuari(result.getLong("idUsuari"), result.getString("NomUsuari"), result.getString("contrasenya"), result.getLong("idTreballador"));
            if (result.next()) {
                return u;
            }
            return null;
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }
    
    public Usuari getUsuari(String contrasenya) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("Select * from usuaris where contrasenya = ?");
            query.setString(1, contrasenya);
            ResultSet result = query.executeQuery();
            Usuari u = new Usuari(result.getLong("idUsuari"), result.getString("NomUsuari"), result.getString("contrasenya"), result.getLong("idTreballador"));
            if (result.next()) {
                return u;
            }
            return null;
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }

    @Override
    public List<Usuari> getAll() throws DAOException {
        try {
            Statement query = MySQLConnection.getInstance().getConnection().createStatement();
            ResultSet result = query.executeQuery("Select * from usuaris");
            List<Usuari> llista = new ArrayList<Usuari>();

            //LA DEIXO PER QUAN TINGUI FET EL DAO DE LES ALTRES CLASSES JA QUE SINÓ NO PODEN AFEGIR EL TREBALLADOR
            while (result.next()) {
                llista.add(new Usuari(result.getInt("idUsuaris"), result.getString("NomUsuari"), result.getString("contrasenya"), result.getInt("idTreballador")));
            }
            return llista;
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }

    @Override
    public void add(Usuari t) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("INSERT INTO usuaris(NomUsuari, contrasenya, idTreballador) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            query.setString(1, t.getNom());
            query.executeUpdate();

            query.setString(2, t.getContrasenya());
            query.executeUpdate();

            query.setLong(3, t.getIdTreballador());
            query.executeUpdate();
            ResultSet rst = query.getGeneratedKeys();
            if (rst.next()) {
                t.setId(rst.getInt("idUsuaris"));
            }
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }

    @Override
    public void delete(Usuari t) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("DELETE FROM usuaris WHERE idUsuaris = ?");
            query.setLong(1, t.getId());
            query.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }

    @Override
    public void update(Usuari t) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("UPDATE usuaris SET NomUsuari = ? WHERE idUsuaris = ?");
            query.setString(1, t.getNom());
            query.setLong(2, t.getId());
            query.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }

    public void updateContrasenya(Usuari t) throws DAOException {
        try {
            PreparedStatement query = MySQLConnection.getInstance().getConnection().prepareStatement("UPDATE usuaris SET contrasenya = ? WHERE idUsuaris = ?");
            query.setString(1, t.getContrasenya());
            query.setLong(2, t.getId());
            query.executeUpdate();
        } catch (SQLException ex) {
            throw new DAOException();
        }
    }


}
