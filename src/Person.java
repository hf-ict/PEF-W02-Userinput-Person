
public class Person {

    private String firstname;
    private String lastname;
    private String street;
    private int zip;
    private String city;
    private double salary;

    public Person() {

    }
    public Person(String firstname, String lastname, String street, int zip, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
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
