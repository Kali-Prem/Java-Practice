/*

Question 4:

Create an Employee class.

Private variable: salary

Salary cannot be negative

*/

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setSalary(50000);

        System.out.println("Your Salary is " + emp1.getSalary());
        
    }
}

// Employee Class
class Employee {
    private double salary;

    //Make a function to update the salary, that public function called Setter
    public void setSalary(double amount){
        salary = salary + amount;
    }
    //Make a function to access this salary, that public function is called Getter
    public double getSalary(){
        return salary;
    }
    
}