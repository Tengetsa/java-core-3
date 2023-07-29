package DZ3;

import java.util.Objects;

public class Director extends Employee{

    public Director(String surname, String name, String patronymic, String post, String phone, int salary, int age) {
        super(surname, name, patronymic, post, phone, salary, age);
    }

    public void raisingSalary(int amount){
        this.salary += amount;
    }

    public static void raising(Employee[] empl, int age, int increment){
        for (Employee employee : empl) {
            if (employee.age > age && !Objects.equals(employee.post, "Director")) {
                employee.raisingSalary(increment);
            }
        }
    }
}
