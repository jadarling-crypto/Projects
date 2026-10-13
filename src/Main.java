import java.io.FileNotFoundException;

public class Main {
    /**
     * Johnny Darling
     */
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 2) {
            System.out.println("Aw shoot Captain, we need filenames!");
            return;
        }

        MedicalOffice office = new MedicalOffice();
        office.readMedicalOfficeData(args[0]);

        // Mission requirement: add yourself!
        Patient newPat = new Patient(102, "Mariyah", "Curb", 'F', "10/19/2006", "Dr. Moore");
        office.addPatient(newPat);
        Appointment newAppt = new Appointment(102, "02/27/2026", "Dr. Moore", 65.0, 150.0, 98.6, 80, 120, 80, "Initial visit - likes frogs");
        newPat.addAppointment(newAppt);

        office.sortData(); // Level 4 Sort
        office.saveMedicalOfficeData(args[1]);

        // Level 3 requirement: demonstrate the search
        office.displayAppointment(102, "02/27/2026");

        System.out.println("Mission accomplished, Captain. Data saved to " + args[1]);
    }
}
