package ru.sv.rgBotBack.DAO.model;

import java.util.ArrayList;
import java.util.List;
public class WholeUserData {
    List<ServiceEntryWithOtherData> serviceEntryList;

    public WholeUserData() {
        this.serviceEntryList = new ArrayList<>();
    }

    public WholeUserData(List<ServiceEntryWithOtherData> serviceEntryList) {
        this.serviceEntryList = serviceEntryList;
    }

    public List<ServiceEntryWithOtherData> getServiceEntryList() {
        return serviceEntryList;
    }

    public void setServiceEntryList(List<ServiceEntryWithOtherData> serviceEntryList) {
        this.serviceEntryList = serviceEntryList;
    }

    public void addServiceEntryWithOtherDataToCollection(ServiceEntryWithOtherData serviceEntryWithOtherData) {
        serviceEntryList.add(serviceEntryWithOtherData);
    }


    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        data.append("<i><b>We find user:</b></i>\n" +
                serviceEntryList.get(0).getServiceEntry().getOwnerPersonAccountMobile() +
                "\n<i>Name: </i>" + serviceEntryList.get(0).getServiceEntry().getOwnerAccountName());
        for (int i = 0; i < serviceEntryList.size(); i++) {
            data.append("\n<b>" + (i + 1) + ")</b>");
            data.append(serviceEntryList.get(i).toString());
            data.append("\n");
        }
        return data.toString();
    }

    public List<String> bigToString() {
        List<String> listOfString = new ArrayList<>();
        StringBuilder data = new StringBuilder();

        data.append("<i><b>We find user:</b></i>\n" +
                serviceEntryList.get(0).getServiceEntry().getOwnerPersonAccountMobile() +
                "\n<i>Name: </i>" + serviceEntryList.get(0).getServiceEntry().getOwnerAccountName());
        listOfString.add(data.toString());

        for (int i = 0; i < serviceEntryList.size(); i++) {
            data = new StringBuilder();
            data.append("\n<b>" + (i + 1) + ")</b>");
            data.append(serviceEntryList.get(i).toString());
            data.append("\n");
            listOfString.add(data.toString());
        }
        return listOfString;
    }
}
