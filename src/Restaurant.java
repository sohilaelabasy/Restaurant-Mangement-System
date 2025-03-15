import employee.Chefs;
import employee.Staff;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Restaurant {
    public static void main(String[] args) {
        Staff employee1 = new Staff();
        employee1.name = "mahmoud";
        employee1.staffId = 5656;
        employee1.salary = 2000;

        Staff employee2 = new Staff();
        employee2.name = "ahmed";
        employee2.staffId = 1234;
        employee2.salary = 3000;

        employee1.print();
        employee2.print();

        menu item1 = new menu();
        item1.title = "pizza";
        item1.price = 150.0;

        menu item2 = new menu();
        item2.title = "pasta";
        item2.price = 120.0;

        menu item3 = new menu();
        item3.title = "mushroom piccata";
        item3.price = 300.0;

        menu item4 = new menu();
        item4.title = "Shawrma";
        item4.price = 90.0;

        item1.print();
        item2.print();
        item3.print();
        item4.print();

        Chefs chef1 = new Chefs();
        chef1.name = "ahmed";
        chef1.qualifications[0]="cooking diploma";
        chef1.qualifications[1]="College of Tourism and Hotel Management";

        chef1.salary = 5000.0;

        Chefs chef2 = new Chefs();
        chef2.name = "ali";
        chef2.qualifications[0]="cooking diploma";
        chef2.qualifications[1]="College of Tourism and Hotel Management";

        chef2.salary = 4000.0;
        chef1.print();
        chef2.print();
    }
}