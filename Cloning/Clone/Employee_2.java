class Date {

	private int date;
	private int month;
	private int year;

	public Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return date + "/" + month + "/" + year;
	}

	public void update(int dd, int mm, int yy) {
		this.date = dd;
		this.month = mm;
		this.year = yy;
	}

}

public class Employee_2 implements Cloneable {

	private String name;
	private double salary;
	private Date dob;

	public Employee_2(String n, double s, Date d) {
		name = n;
		salary = s;
		dob = d;
	}

	public void setname(String n) {
		name = n;
	}

	public void setbday(int dd, int mm, int yy) {
		this.dob.update(dd, mm, yy);
	}

	public String toString() {
		return name + " " + salary + " " + dob;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Date d1 = new Date(14, 11, 2023);
		Employee_2 e1 = new Employee_2("Jack", 21500.0, d1);
		Employee_2 e2 = (Employee_2) e1.clone();
		e2.setname("John"); 
		e2.setbday(07, 07, 2023);
		
		System.out.println(e1);
		System.out.println(e2);
	}
}