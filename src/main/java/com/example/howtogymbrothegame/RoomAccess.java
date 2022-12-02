package com.example.howtogymbrothegame;

public class RoomAccess {
    //Communication-class between the days

    //Private constructor to hinder other classes to create an object of this class
    private RoomAccess(){}

    //Creating an object of the class
    private static final RoomAccess instance = new RoomAccess();

    //This method will get the attribute from the object.
    //It is also the connection from the other classes to the data this class
    public static RoomAccess getInstance(){
        return instance;
    }

    //Attributes
    private boolean AccessFriday;
    private boolean AccessSaturday;
    private boolean AccessSunday;



    public boolean isAccessFriday() {
        return AccessFriday;
    }

    public void setAccessFriday(boolean accessFriday) {
        this.AccessFriday = accessFriday;
    }

    public boolean isAccessSaturday() {
        return AccessSaturday;
    }

    public void setAccessSaturday(boolean accessSaturday) {
        this.AccessSaturday = accessSaturday;
    }

    public boolean isAccessSunday() {
        return AccessSunday;
    }

    public void setAccessSunday(boolean accessSunday) {
        this.AccessSunday = accessSunday;
    }
}
