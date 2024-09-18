package com.mycompany.agency;



    // TODO 1: Make Intern a child of StaffEmploee DONE | Aaron

public class Intern extends StaffEmployee
{
    //-----------------------------------------------------------------
    //  TODO 2: Constructor: Sets up this intern using the specified DONE | Aaron
    //  information.
    //-----------------------------------------------------------------
    public Intern(String eName, String eAddress, String ePhone,String socialSecurityNumber,double payrate)
    {
        super(eName,eAddress,ePhone,socialSecurityNumber,payrate);
    }

    //-----------------------------------------------------------------
    // TODO 3:  Returns a zero pay value for this intern. DONE | Aaron
    //-----------------------------------------------------------------
    public double pay()
    {
      return 0;
    }
}
