package employee;

import java.util.Arrays;

public class Chefs {
    String name;
    private String []qualifications;
    private double salary;

   public Chefs(String name , String []qualifications,double salary){
        this.name=name;
        this.qualifications=qualifications;
        this.salary=salary;
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String[] getQualifications(){return qualifications;}
    public void setQualifications(String []qualifications){this.qualifications=qualifications;}

    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary=salary;}
}
