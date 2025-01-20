
public class Person {

    private String firstname;
    private String lastname;
    private String street;
    private int zip;
    private String city;
    private double salary;


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void print() {
        System.out.println("*******************");
        System.out.println(firstname + " " + lastname);
        System.out.println(street);
        System.out.println(zip + "-" + city);
        System.out.println(salary);
    }

}
