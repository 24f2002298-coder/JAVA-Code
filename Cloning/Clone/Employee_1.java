public class Employee_1 implements Cloneable {

  private String name;
  private double salary;

  public Employee_1(String n, double s) {
    name = n;
    salary = s;
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

  public static void main(String[] args) throws Exception {
    Employee_1 e1 = new Employee_1("Jack", 21500.0);
    Employee_1 e2 = (Employee_1) e1.clone();
    e2.setName("John"); // e1 not affected
    System.out.println(e1.getName());
    System.out.println(e2.getName());
  }
}
