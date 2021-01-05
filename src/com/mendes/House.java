package com.mendes;

/**
 * Created by mendesmustafa on 05.01.2021.
 */

public class House {

    private String city;
    private String district;
    private String street;
    private int yearOfHouse;
    private int countOfRoom;
    private int countOfToilet;
    private int countOfBathroom;
    private int countOfBalcony;
    private boolean isDoublex;
    private boolean hasPool;
    private boolean hasGarden;
    private boolean hasBalcony;
    private boolean hasParking;

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setYearOfHouse(int yearOfHouse) {
        this.yearOfHouse = yearOfHouse;
    }

    public void setCountOfRoom(int countOfRoom) {
        this.countOfRoom = countOfRoom;
    }

    public void setCountOfToilet(int countOfToilet) {
        this.countOfToilet = countOfToilet;
    }

    public void setCountOfBathroom(int countOfBathroom) {
        this.countOfBathroom = countOfBathroom;
    }

    public void setCountOfBalcony(int countOfBalcony) {
        this.countOfBalcony = countOfBalcony;
    }

    public void setDoublex(boolean doublex) {
        isDoublex = doublex;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    @Override
    public String toString() {
        return "House{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                ", yearOfHouse=" + yearOfHouse +
                ", countOfRoom=" + countOfRoom +
                ", countOfToilet=" + countOfToilet +
                ", countOfBathroom=" + countOfBathroom +
                ", countOfBalcony=" + countOfBalcony +
                ", isDoublex=" + isDoublex +
                ", hasPool=" + hasPool +
                ", hasGarden=" + hasGarden +
                ", hasBalcony=" + hasBalcony +
                ", hasParking=" + hasParking +
                '}';
    }
}
