package org.prograd;

public class InputsCollector {
    int number_of_days;
    int number_of_cities;

    public int getNumber_of_days() throws IllegalArgumentException{
        if(number_of_days > 0)
        return number_of_days;
        else
            throw new IllegalArgumentException("Invalid Number of Days");
    }

    public void setNumber_of_days(int number_of_days) {
        this.number_of_days = number_of_days;
    }

    public int getNumber_of_cities() throws IllegalArgumentException{
        if(number_of_cities > 0)
        return number_of_cities;
        else
            throw new IllegalArgumentException("Invalid Number of Cities");
    }

    public void setNumber_of_cities(int number_of_cities) {
        this.number_of_cities = number_of_cities;
    }
}