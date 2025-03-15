public class Staff {
    String name;
    double salary;
    int staffId;

    Staff(String name, double salary, int staffId) {
        this.name = name;
        this.salary = salary;
        this.staffId = staffId;

    }

    public void print() {
        System.out.println("name is: " + name + "\nsalary is:" + salary + "\nstaffId is:" + staffId);
        System.out.println("------------");
    }
}
