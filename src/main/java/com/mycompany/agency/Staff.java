package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList DONE - Sabrina.

        staffList[0] = new StaffEmployee("Bobby","123 Fake Street","(847) 625-7272","222-22-2222",45.2);
        staffList[1] = new StaffEmployee("Ferb","456 Fake Street","(646) 741-8520","111-11-1111",25.6);
        staffList[2] = new StaffEmployee("Sandy","789 Fake Street","(929) 963-9635","333-33-3333",35.5);
        staffList[3] = new StaffEmployee("Darwin","357 Fake Street","(646) 258-8456","444-44-4444",23.0);
        staffList[4] = new StaffEmployee("Mable","951 Fake Street","(847) 485-1236","666-66-6666",47.2);
        staffList[5] = new StaffEmployee("Lilly","852 Fake Street","(929) 621-7372","555-55-5555",23.0);

//        ((Executive)staffList[0]).awardBonus(500.00);
//
//        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println("Employee " + (count+1));
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
