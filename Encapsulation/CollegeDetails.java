package Encapsulation;
/*Print college names(any 5 colleges) and departments - IT , CS , MECH , ECE , EEE , AERO , AUTO , EI - Should use private variables for the department name and college . (Apply encapsulation)

 */
import java.util.ArrayList;
import java.util.List;

public class CollegeDetails {

    private String collegeName;
    private List<String> departmentDetails;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<String> getDepartmentDetails() {
        return departmentDetails;
    }

    public void setDepartmentDetails(List<String> departmentDetails) {
        this.departmentDetails = departmentDetails;
    }


    public static void main(String[] args) {
        //Creating collegeDetails object and setting its name as well departments
        CollegeDetails[] colleges = new CollegeDetails[5];

        colleges[0] =new CollegeDetails();
        colleges[0].setCollegeName("IIT Delhi");
        colleges[0].setDepartmentDetails(new ArrayList<String>(List.of("IT", "CS", "MECH", "ECE", "AERO")));

        colleges[1] =new CollegeDetails();
        colleges[1].setCollegeName("NIIT");
        colleges[1].setDepartmentDetails(new ArrayList<>(List.of("IT", "ECE", "CS", "AERO")));


        colleges[2] =new CollegeDetails();
        colleges[2].setCollegeName("BIT");
        colleges[2].setDepartmentDetails(new ArrayList<>(List.of("IT", "EEE", "AERO", "AUTO","CS", "ECE")));

        colleges[3] =new CollegeDetails();
        colleges[3].setCollegeName("UCE");
        colleges[3].setDepartmentDetails(new ArrayList<>(List.of("IT", "CS", "AERO")));

        colleges[4] =new CollegeDetails();
        colleges[4].setCollegeName("CET");
        colleges[4].setDepartmentDetails(new ArrayList<>(List.of("IT", "CS")));

        for (int i = 0; i < 5; i++) {
            System.out.println("College Name: " + colleges[i].getCollegeName());
            System.out.println("Departments:");

            for (int j = 0; j < colleges[i].departmentDetails.size(); j++) {
                System.out.println(colleges[i].getDepartmentDetails().get(j));
            }
        }
    }
}