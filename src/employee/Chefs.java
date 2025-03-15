package employee;

import java.util.Arrays;

public class Chefs {
    String name;
    private String []qualifications;
    private double salary;

    Chefs(String name , String []qualifications,double salary){
        this.name=name;
        this.qualifications=qualifications;
        this.salary=salary;
    }

    public void print(){
        System.out.println("name is: "+ name+"\nsalary is:"+ salary+"\nqualifications are:");
        System.out.println(Arrays.toString(qualifications));
        System.out.println("&&&&&&&&&&&");
    }
}
