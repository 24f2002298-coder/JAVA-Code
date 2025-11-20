public class Employee {

    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(Employee e) {
        name = e.name;
        salary = e.salary;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Jack", 21500.0);
        Employee e2 = new Employee(e1);
        System.out.println(e1.getName());

        e2.setName("John"); // e1 not been updated
        System.out.println(e1.getName());
        System.out.println(e2.getName());
    }
}

