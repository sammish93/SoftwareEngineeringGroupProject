package no.hiof.groupproject.interfaces;

import no.hiof.groupproject.models.vehicle_types.Vehicle;
import no.hiof.groupproject.tools.db.RetrieveVehicleDB;

public interface DeserialiseVehicle {
    //returns a Vehicle based on a specific users_id primary key
    static Vehicle deserialiseSpecificId(int id) {
        return RetrieveVehicleDB.retrieveFromId(id);
    }

    //returns a Vehicle based on a specific regNo
    static Vehicle deserialiseSpecificEmail(String regNo) {
        return RetrieveVehicleDB.retrieveFromRegNo(regNo);
    }
}