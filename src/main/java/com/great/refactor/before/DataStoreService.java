package com.great.refactor.before;

public class DataStoreService {
    public DataStoreService() {
        System.out.println("set up database connection");
    }

    public boolean markDateAsBooked(String date) {
        System.out.printf("write into database to book the date %s\n", date);
        return true;
    }
}
