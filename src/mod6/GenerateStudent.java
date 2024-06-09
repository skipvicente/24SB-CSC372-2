package mod6;

public class GenerateStudent {

    public String studentNames;
    public Integer rollNumber;
    public String address;

    //Student data construct
    public GenerateStudent(String inputStudentName, Integer inputRoll, String addrress){
        this.studentNames = inputStudentName;
        this.rollNumber = inputRoll;
        this.address = addrress;
    }
}