package com.bosch.sbs.java.interfaces;

public interface IdentityDataExtractor {
    //write logic of connecting to system
    //Extracting the specific data
    //aggregating it to the required output format
    //returning it
    //Error Handling

    public abstract IdentityData extractData() throws ConnectionException, DataFormatException, DataReadException;

}
