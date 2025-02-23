package lk.ijse.pos.leyard.bo.custom;

import lk.ijse.pos.leyard.bo.SuperBO;
import lk.ijse.pos.leyard.model.DriverDTO;
import lk.ijse.pos.leyard.view.tdm.DriverTM;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DriverBO extends SuperBO {
    ArrayList<DriverDTO> getAll() throws SQLException, ClassNotFoundException;
    void save(DriverDTO driver) throws SQLException, ClassNotFoundException;
    void update(DriverDTO driver) throws SQLException, ClassNotFoundException;
    void delete(String id) throws SQLException, ClassNotFoundException;
    String generateNewID()  throws SQLException, ClassNotFoundException;
    void generateReport() throws SQLException, ClassNotFoundException;
    ArrayList<String> getAllDriverIds() throws SQLException, ClassNotFoundException;
    DriverTM findById(String selectedDriverId) throws SQLException, ClassNotFoundException;
}
