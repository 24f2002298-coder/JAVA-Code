class Date implements Cloneable {
	private int date, month, year;

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

	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // create copy of date and return as object
	}
}

class Employee_3 implements Cloneable {
	private String name;
	private double salary;
	private Date dob;

	public Employee_3(String n, double s, Date d) {
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

	public Object clone() throws CloneNotSupportedException {
		Employee_3 newemp = (Employee_3) super.clone();
		Date newbday = (Date) dob.clone();
		newemp.dob = newbday;
		return newemp;
	}

	public static void main(String[] args) throws Exception {
		Employee_3 e1 = new Employee_3("Jack", 21500.0, new Date(14, 11, 2023));
		Employee_3 e2 = (Employee_3) e1.clone();
		e2.setname("John"); 
		e2.setbday(07, 07, 2023);

		System.out.println(e1);
		System.out.println(e2);

	}
}