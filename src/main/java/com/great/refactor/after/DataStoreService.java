package com.great.refactor.after;

public interface DataStoreService {
    public boolean markDateAsBooked(String date);
}

class DataStoreImplementation implements DataStoreService {
    public DataStoreImplementation() {
        System.out.println("set up database connection");
    }

    @Override
    public boolean markDateAsBooked(String date) {
        System.out.printf("write into database to book the date %s\n", date);
        return true;
    }
}
