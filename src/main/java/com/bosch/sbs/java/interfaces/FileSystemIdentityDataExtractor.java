package com.bosch.sbs.java.interfaces;

public class FileSystemIdentityDataExtractor implements IdentityDataExtractor{
    @Override
    public IdentityData extractData() {
        return null;
    }
}

/**
 * It is possible that the implementation does not have the need of that exception.
 * Suppose you create an interface for doing IO action. But someone provides an implementation
 * that does not use IO but stores everything in memory. An IOException will never get thrown
 * and it is not necessary for the interface implementor to declare the exception in the throws clause.
 *
 * In the other way around however you can not throw more exceptions in your implementor that
 * are not specified by your interface.
 *
 */
