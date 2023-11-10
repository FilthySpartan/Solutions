package Lab18.part2;

public class Program {

    public static void main(String[] args) {
        Manager man1 = new Manager("Trimm Krimpson", "Manager");
        Manager man2 = new Manager("Krimm Trimpson", "Middle Manager");
        Employee emp1 = new Employee("Todd Florward", "Marketing");
        Employee emp2 = new Employee("Phil Swanson", "Desk Jockey");
        SkilledWorker sw1 = new SkilledWorker("Chuck Gibbons", "Technician");

        man1.addEmployee(emp1);
        man1.addEmployee(emp2);
        man1.addEmployee(sw1);
        man1.addEmployee(man2);
        sw1.addSkill("Wrench wielding");
        sw1.addSkill("Screw driving");
        sw1.addSkill("Nail hammering");

        System.out.print(man1.getInfo());
    }
    
}
