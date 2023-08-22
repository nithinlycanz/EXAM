class Person {
    String name, address, phn, email;

    Person(String n) {
        name = n;
    }

    public String toString() {
        return "Name: " + name + "\nclass: Person";
    }
}

class Student extends Person {
    Student(String n) {
        super(n);
    }

    enum Status {
        JUNIOR, SENIOR, SUPERSENIOR;
    }

    public String toString() {
        return "Name: " + name + "\nclass: Student";
    }
}

class Employee extends Person {
    Employee(String n) {
        super(n);
    }

    String office, date;
    double salary;

    public String toString() {
        return "Name: " + name + "\nclass: Employee";
    }
}

class Faculty extends Employee {
    Faculty(String n) {
        super(n);
    }

    String off_hrs, rank;

    public String toString() {
        return "Name: " + name + "\nclass: Faculty";
    }
}

class Staff extends Employee {
    Staff(String n) {
        super(n);
    }

    String title;

    public String toString() {
        return "Name: " + name + "\nclass: Staff";
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Person p = new Person("Ancy");
        Employee e = new Employee("Amrutha");
        Faculty f = new Faculty("Keerthimol");
        Staff s = new Staff("Akhil");

        System.out.println(p);
        System.out.println(e);
        System.out.println(f);
        System.out.println(s);
    }
}
