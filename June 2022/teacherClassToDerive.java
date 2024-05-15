// Write a Java program to create a Teacher
//class and derive PGT, TGT and PRT classes
//from Teacher class. Define appropriate
//construction for all the classes. Also define
//a method to display information of Teacher.
//Make necessary assumptions as required

class Teacher {
    String name;
    int age;
    Teacher (String name,int age) {
        this.name=name;
        this.age=age;
    }
    void Display () {
        System.out.println("----------Teacher Information-----------");
        System.out.println("Name: "+name+"\n"+"Age: "+age);
    }
}

class PGT extends Teacher {
    String qualification;
    PGT (String n,int a,String qualification) {
        super(n,a);
        this.qualification=qualification;
    }
    void displayQualification () {
        System.out.println("Qualifications: "+qualification);
    }
}
class TGT extends Teacher {
    String department;
    TGT (String n,int a,String department) {
        super(n,a);
        this.department=department;
    }
    void displayDepartment () {
        System.out.println("Department: "+department);
    }
}
class PRT extends Teacher {
    String gender;
    PRT (String n, int a, String gender) {
        super(n,a);
        this.gender=gender;
    }
    void displayGender () {
        System.out.println("Gender: "+gender);
    }
}

public class teacherClassToDerive {
    public static void main (String[] args) {
        PGT pgtTeacher=new PGT("Mr. A",32,"B.Tech");
        TGT tgtTeacher=new TGT("Mr. B",69,"Narcotics");
        PRT prtTeacher=new PRT("Mr. X",105,"F");

        pgtTeacher.Display();
        pgtTeacher.displayQualification();

        tgtTeacher.Display();
        tgtTeacher.displayDepartment();

        prtTeacher.Display();
        prtTeacher.displayGender();
    }
}