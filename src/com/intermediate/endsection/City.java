package com.intermediate.endsection;

public class City {

    private Building[] buildings = new Building[4];

    public City() {
        Item[] bankItems = new Item[2];
        bankItems[0] = new Item("Letter opener", 1.5);
        bankItems[1] = new Item("Stamp", 2.5);
        buildings[0] = new Building("Bank", bankItems);

        Item[] mansionItems = new Item[2];
        mansionItems[0] = new Item("Pair of fancy shoes", 25.0);
        mansionItems[1] = new Item("Broken glass", 0.1);
        buildings[1] = new Building("Mansion", mansionItems);

        Item[] postOfficeItems = new Item[2];
        postOfficeItems[0] = new Item("Letter to Jenny", 1.5);
        postOfficeItems[1] = new Item("Pencil", 2.0);
        buildings[2] = new Building("Post Office", postOfficeItems);

        Item[] supermarketItems = new Item[2];
        supermarketItems[0] = new Item("A loaf of bread", 2.5);
        supermarketItems[1] = new Item("A bag of tea", 6.5);
        buildings[3] = new Building("Supermarket", supermarketItems);

    }

    public Building[] getBuildings() {
        return buildings;
    }
}
