import Lab04.Person;

public class Student extends Person {
    private long UniversityRollNo;
    private double cpi ;


    public Student(int age, String name, char gender,long UniversityRollNo ,double cpi) {
        super(age, name, gender);
        this.cpi=cpi;
        this.UniversityRollNo=UniversityRollNo;
    }
    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    public long getUniversityRollNo() {
        return UniversityRollNo;
    }

    public void setUniversityRollNo(long universityRollNo) {
        UniversityRollNo = universityRollNo;
    }
    public void study(){
        System.out.println("University Roll No = " + UniversityRollNo + "Cpi " + cpi   );
    }
}







