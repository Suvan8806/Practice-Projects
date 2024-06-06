package AutoPartsMap;

import java.util.Scanner;

import java.util.*;

public class Part implements Comparable<Part> {
    private String name;
    private int partNumber;
    private String make;
    private String model;
    private int year;
    
    public Part(String name, int partNumber, String make, String model, int year) {
        this.name = name;
        this.partNumber = partNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    @Override
    public int compareTo(Part other) {
        int makeComparison = this.make.compareTo(other.make);
        if (makeComparison != 0) {
            return makeComparison;
        }
        
        int modelComparison = this.model.compareTo(other.model);
        if (modelComparison != 0) {
            return modelComparison;
        }

        int yearComparison = Integer.compare(this.year, other.year);
        if (yearComparison != 0) {
            return yearComparison;
        }

        return this.name.compareTo(other.name);
    }
    
    @Override
    public String toString() {
        return make + " " + model + " " + year + "  " + name + " " + partNumber;
    }
}