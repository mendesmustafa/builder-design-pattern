package com.mendes;

/**
 * Created by mendesmustafa on 05.01.2021.
 */

public class HouseBuilder {

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

    public static HouseBuilder startBuilder(String city, String district, String street) {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.city = city;
        houseBuilder.district = district;
        houseBuilder.street = street;
        return houseBuilder;
    }

    public House build() {
        House house = new House();
        house.setCity(city);
        house.setDistrict(district);
        house.setStreet(street);
        house.setYearOfHouse(yearOfHouse);
        house.setCountOfRoom(countOfRoom);
        house.setCountOfToilet(countOfToilet);
        house.setCountOfBathroom(countOfBathroom);
        house.setCountOfBalcony(countOfBalcony);
        house.setDoublex(isDoublex);
        house.setHasPool(hasPool);
        house.setHasGarden(hasGarden);
        house.setHasBalcony(hasBalcony);
        house.setHasParking(hasParking);
        return house;
    }

    public HouseBuilder setYearOfHouse(int yearOfHouse) {
        this.yearOfHouse = yearOfHouse;
        return this;
    }

    public HouseBuilder setCountOfRoom(int countOfRoom) {
        this.countOfRoom = countOfRoom;
        return this;
    }

    public HouseBuilder setCountOfToilet(int countOfToilet) {
        this.countOfToilet = countOfToilet;
        return this;
    }

    public HouseBuilder setCountOfBathroom(int countOfBathroom) {
        this.countOfBathroom = countOfBathroom;
        return this;
    }

    public HouseBuilder setCountOfBalcony(int countOfBalcony) {
        this.countOfBalcony = countOfBalcony;
        return this;
    }

    public HouseBuilder setDoublex(boolean doublex) {
        isDoublex = doublex;
        return this;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    public HouseBuilder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public HouseBuilder setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
        return this;
    }

    public HouseBuilder setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
        return this;
    }
}
