import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create Scanner object
        Scanner scanner = new Scanner(System.in);

        //read data from console
        System.out.print("Name: ");
        String lastname = scanner.nextLine();

        System.out.print("Vorname: ");
        String firstname = scanner.nextLine();

        System.out.print("Strasse: ");
        String street = scanner.nextLine();

        System.out.print("Plz: ");
        int zip = scanner.nextInt();
        ////nextInt reads only the number, without the line break
        scanner.nextLine(); //remove the linebreak

        System.out.print("Ort: ");
        String city = scanner.nextLine();

        System.out.print("Gehalt: ");
        double salary = scanner.nextDouble();

        //close Scanner object
        scanner.close();

        //create Person object with its data
        Person p = new Person();
        p.setLastname(lastname);
        p.setFirstname(firstname);
        p.setStreet(street);
        p.setZip(zip);
        p.setCity(city);
        p.setSalary(salary);

        //print data
        p.print();
    }

}
