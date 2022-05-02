public class Applicant {
    private String lastName, firstName, phone, email, address, zipCode, region, languages, major, university;
    private double gpa;


    //constructor
    public Applicant(String lastName, String firstName, String phone, String email, String address, String zipCode,
                     String region, String languages, double gpa, String major, String university){
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.zipCode = zipCode;
        this.region = region;
        this.languages = languages;
        this.gpa = gpa;
        this.major = major;
        this.university = university;

    }

    //method to find gpa >= 3.5
    public boolean compareGPA(Applicant person){
        if(person.gpa >= 3.5){
            return true;
        }
        return false;

    }

    public String getLanguage(){
        return languages;
    }
    public double getGPA(){
        return gpa;
    }


    public String toString() {
        return lastName + "," + firstName + "," + phone + "," + email + "," + address + "," + zipCode + "," + region
                + ", " + languages + ", " + gpa + "," + major + "," + university;
    }
}
