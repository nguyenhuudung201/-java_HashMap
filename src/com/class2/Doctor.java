package com.class2;

public abstract   class Doctor {
    String name;
    String  Specialization;
    String Code;
    int Availability;
    public abstract void addNewPerson () throws Exception;
    public abstract void upDateDoctor() throws Exception;
    public abstract void displayAll();
    public Integer getId() {
        return new Integer(this.Availability);
    }
}
