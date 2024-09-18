package com.mycompany.agency;



    // TODO 1: Make TempEmploee a child of StaffEmploee DONE | Aaron

public class TempEmploee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmploee(String eName, String eAddress, String ePhone, String socSecNumber, double rate, int hoursWorked)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO2: Adds the specified number of hours to this employee's accumulated hours. DONE | Aaron
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        this.hoursWorked = this.hoursWorked + moreHours;
    }

    //-----------------------------------------------------------------
    // TODO3: Computes and returns the pay for this hourly employee. DONE | Aaron
    //-----------------------------------------------------------------
    public double pay()
    {
        return this.hoursWorked * this.payRate;

    }

    //-----------------------------------------------------------------
    // TODO4: Returns information about this hourly employee as a string. DONE | Aaron
    //-----------------------------------------------------------------
    public String toString()
    {
        return "Name: " + name
                +"\n" + "Address: " + address
                +"\n" + "Phone: " + phone
                +"\n" + "Social Security Number: " + socialSecurityNumber
                +"\n" + "Current hours: " + hoursWorked;
    }
}
