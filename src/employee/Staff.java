package employee;

public class Staff {
    String name;
    private double salary;
    int staffId;

   public Staff(String name, double salary, int staffId) {
        this.name = name;
        this.salary = salary;
        this.staffId = staffId;

    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getSalary(){return salary;}
    public void setSalary(double salary){this.salary=salary;}

    public int getStaffId(){return staffId;}
    public void setStaffId(int staffId){this.staffId=staffId;}

}
