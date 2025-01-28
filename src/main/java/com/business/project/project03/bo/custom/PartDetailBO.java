package com.business.project.project03.bo.custom;

import com.business.project.project03.bo.SuperBO;
import com.business.project.project03.model.PartDTO;
import com.business.project.project03.model.PartDetailDTO;
import com.business.project.project03.model.VehicleDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface PartDetailBO extends SuperBO {
    boolean placeOrder(List<PartDetailDTO> partDetailDTOS) throws SQLException, ClassNotFoundException ;
    PartDTO searchPart(String partId) throws SQLException, ClassNotFoundException;
    PartDTO findPart(String partId) throws SQLException, ClassNotFoundException;
    VehicleDTO findVehicle(String vehicleId) throws SQLException, ClassNotFoundException;
    ArrayList<PartDTO> getAllPartIds() throws SQLException, ClassNotFoundException;
    ArrayList<VehicleDTO> getAllVehicleIds() throws SQLException, ClassNotFoundException;
}
