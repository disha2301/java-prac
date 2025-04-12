package com.gevernova.objectmodeling.universityfaculty;
// Main class
public class UniversityFaculty {
    public static void main(String[] args) {
        University uni = new University("NovaTech University");

        // Adding units (composition)
        uni.addUnit("Software Engineering");
        uni.addUnit("Data Science");

        // Creating faculty (aggregation)
        Faculty disha = new Faculty("Disha Yadav");
        Faculty om = new Faculty("Om Sharma");

        // Adding faculty to university
        uni.addFaculty(disha);
        uni.addFaculty(om);

        // Display university info
        uni.showDetails();

        // Delete university (removes units only)
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("\nFaculty still exists after university deletion:");
        disha.showInfo();
        om.showInfo();
    }
}
