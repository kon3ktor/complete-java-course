package com.expert.streams.flatmap;

import java.util.List;
import java.util.Objects;

public class CarDealership {

    String name;
    List<String> carBrands;

    public CarDealership(String name, List<String> carBrands) {
        this.name = name;
        this.carBrands = carBrands;
    }

    public String getName() {
        return name;
    }

    public List<String> getCarBrands() {
        return carBrands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return Objects.equals(name, that.name) && Objects.equals(carBrands, that.carBrands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, carBrands);
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", carBrands=" + carBrands +
                '}';
    }
}
