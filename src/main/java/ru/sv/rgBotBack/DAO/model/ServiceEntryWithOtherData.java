package ru.sv.rgBotBack.DAO.model;

import java.util.ArrayList;
import java.util.List;
public class ServiceEntryWithOtherData {
    private ServiceEntry serviceEntry;
    private TyreSet tyreSet;
    private List<Tyre> tyreList;
    private Vehicle vehicle;

    public ServiceEntryWithOtherData() {
        this.tyreList = new ArrayList<>();
    }

    public ServiceEntryWithOtherData(ServiceEntry serviceEntry, TyreSet tyreSet, List<Tyre> tyreList, Vehicle vehicle) {
        this.serviceEntry = serviceEntry;
        this.tyreSet = tyreSet;
        this.tyreList = tyreList;
        this.vehicle = vehicle;
    }

    public ServiceEntry getServiceEntry() {
        return serviceEntry;
    }

    public void setServiceEntry(ServiceEntry serviceEntry) {
        this.serviceEntry = serviceEntry;
    }

    public TyreSet getTyreSet() {
        return tyreSet;
    }

    public void setTyreSet(TyreSet tyreSet) {
        this.tyreSet = tyreSet;
    }

    public List<Tyre> getTyreList() {
        return tyreList;
    }

    public void setTyreList(List<Tyre> tyreList) {
        this.tyreList = tyreList;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        data.append("<b>Service entry</b>");
        data.append(serviceEntry.toString());
        if (tyreSet != null) {
            data.append(tyreSet.toString());
        }
        if (tyreList != null && tyreList.size() > 0) {
            for (int i = 0; i < tyreList.size(); i++) {
                data.append(tyreList.get(i).toString());
            }

        }
        if (vehicle != null) {
            data.append(vehicle.toString());
        }
        return data.toString();
    }
}
