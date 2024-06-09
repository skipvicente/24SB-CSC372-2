package mod6;

public class GenerateStudent {

    public String studentNames;
    public Integer rollerNumber;
    public String address;

    //Student data construct
    public GenerateStudent(String inputStudentName, Integer inputRoll, String addrress){
        this.studentNames = inputStudentName;
        this.rollerNumber = inputRoll;
        this.address = addrress;
    }
}