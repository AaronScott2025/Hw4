package com.mycompany.agency;


    // TODO 1: Make StaffEmployee a child of StaffMember DONE | Aaron

public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: Sets up this staff employee with the specified information. DONE | Aaron
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    // TODO 3: complete the implementation of toString to return information 
    //          about a staff employee as a string. DONE | Aaron
    //-----------------------------------------------------------------
    public String toString()
    {
        return "Name: " + name
                +"\n" + "Address: " + address
                +"\n" + "Phone: " + phone
                +"\n" + "Social Security Number: " + socialSecurityNumber;
    }

    //-----------------------------------------------------------------
    // TODO 4:  Returns the pay rate for this staff employee. DONE | Aaron
    //-----------------------------------------------------------------
    public double pay()
    {
       return payRate;
    }
}
