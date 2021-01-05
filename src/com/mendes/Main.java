package com.mendes;

public class Main {

    public static void main(String[] args) {

        House house = HouseBuilder.startBuilder("Istanbul", "Besiktas", "Meydan")
                .setYearOfHouse(2020)
                .setCountOfRoom(4)
                .setCountOfBalcony(2)
                .setHasBalcony(true)
                .setCountOfToilet(1)
                .setHasGarden(false)
                .build();
        House house1 = HouseBuilder.startBuilder("Adana", "Yuregir", "Kiremithane")
                .build();

        printHouse(house);
        printHouse(house1);
    }

    public static void printHouse(House house) {
        System.out.println("Info House: " + house);
        System.out.println("************");
    }
}
