package Lab18.part2;

import java.util.ArrayList;

public class Manager extends Employee{
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public Manager(String name, String jobTitle){
        super(name, jobTitle);
    }

    public void addEmployee(Employee emp) {
        this.employees.add(emp);
    }

    public String getInfo() {
        String info = super.getInfo();
        for (Employee emp : employees) {
            info += emp.getInfo();
        }

        return info;
    }
}
