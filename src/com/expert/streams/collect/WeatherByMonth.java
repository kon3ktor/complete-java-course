package com.expert.streams.collect;

import java.util.Objects;

public class WeatherByMonth {

    private String month;
    private int dayTimeTemperature;
    private int nightTimeTemperature;

    public WeatherByMonth(String month, int dayTimeTemperature, int nightTimeTemperature) {
        this.month = month;
        this.dayTimeTemperature = dayTimeTemperature;
        this.nightTimeTemperature = nightTimeTemperature;
    }

    public String getMonth() {
        return month;
    }

    public int getDayTimeTemperature() {
        return dayTimeTemperature;
    }

    public int getNightTimeTemperature() {
        return nightTimeTemperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherByMonth that = (WeatherByMonth) o;
        return dayTimeTemperature == that.dayTimeTemperature && nightTimeTemperature == that.nightTimeTemperature && Objects.equals(month, that.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, dayTimeTemperature, nightTimeTemperature);
    }

    @Override
    public String toString() {
        return "WeatherByMonth{" +
                "month='" + month + '\'' +
                ", dayTimeTemperature=" + dayTimeTemperature +
                ", nightTimeTemperature=" + nightTimeTemperature +
                '}';
    }
}
