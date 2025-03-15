import employee.Chefs;
import employee.Staff;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Restaurant {
    public static void main(String[] args) {
        Staff employee1 = new Staff("mahmoud",2000,5656);
        Staff employee2 = new Staff("ahmed",3000,1234);

        employee1.print();
        employee2.print();


        Menu item1 = new Menu("Pizza",150.0);
        Menu item2 = new Menu("Pasta",120.0);
        Menu item3 = new Menu("mushroom piccata",300.0);
        Menu item4 = new Menu("shawrma",90.0);

        item1.print();
        item2.print();
        item3.print();
        item4.print();

        String []qualifications={"cooking diploma","College of Tourism and Hotel Management"};


        Chefs chef1 = new Chefs("ahmed",qualifications,5000.0);
        Chefs chef2 =new Chefs("ali",qualifications,4000.0);

        chef1.print();
        chef2.print();
    }
}