import employee.Chefs;
import employee.Staff;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Restaurant {
    public static void main(String[] args) {
        Staff employee1 = new Staff("mahmoud", 2000, 5656);
        Staff employee2 = new Staff("ahmed", 3000, 1234);

        employee1.setName("ali");
        employee1.setSalary(3000);
        employee1.setStaffId(12345);

        employee2.setName("saif");
        employee2.setSalary(5000);
        employee2.setStaffId(5555);

        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getStaffId());

        System.out.println("");

        System.out.println(employee2.getName());
        System.out.println(employee2.getSalary());
        System.out.println(employee2.getStaffId());

        System.out.println("");


        Menu item1 = new Menu("Pizza", 150.0);
        Menu item2 = new Menu("Pasta", 120.0);
        Menu item3 = new Menu("mushroom piccata", 300.0);
        Menu item4 = new Menu("shawrma", 90.0);

        item1.setTitle("burger");
        item1.setPrice(150);

        item2.setTitle("red sauce pasta");
        item2.setPrice(140.5);

        item3.setTitle("white sauce pasta");
        item3.setPrice(130.8);

        item4.setTitle("waffles");
        item4.setPrice(30.0);

        System.out.println(item1.getTitle());
        System.out.println(item1.getPrice());

        System.out.println("" );

        System.out.println(item2.getTitle());
        System.out.println(item2.getPrice());

        System.out.println("" );

        System.out.println(item3.getTitle());
        System.out.println(item3.getPrice());

        System.out.println("" );


        System.out.println(item4.getTitle());
        System.out.println(item4.getPrice());
        System.out.println("");


        String[] chefQualifications = {"cooking diploma", "College of Tourism and Hotel Management"};

        String[] chefQualifications2 = {"cooking", "College of Tourism and Hotel Management"};

        Chefs chef1 = new Chefs("ahmed", chefQualifications, 5000.0);
        Chefs chef2 = new Chefs("ali", chefQualifications, 4000.0);
        chef1.setName("omar");
        chef1.setQualifications(chefQualifications2);
        chef1.setSalary(6000.5);
        System.out.println(chef1.getName());
        String[] qualifications = chef1.getQualifications();
        for (String qualifcation : qualifications) {
            System.out.println(qualifcation);
        }

        System.out.println("");

        chef2.setName("eyaad");
        chef2.setQualifications(chefQualifications2);
        chef2.setSalary(6000.5);
        System.out.println(chef2.getName());

        for (String qualifcation : qualifications) {
            System.out.println(qualifcation);
        }


    }
}