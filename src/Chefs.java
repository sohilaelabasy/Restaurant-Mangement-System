import java.util.Arrays;

public class Chefs {
    String name;
    String []qualifications=new String[2];
    double salary;
    public void print(){
        System.out.println("name is: "+ name+"\nsalary is:"+ salary+"\nqualifications are:");
        System.out.println(Arrays.toString(qualifications));
        System.out.println("&&&&&&&&&&&");
    }
}
