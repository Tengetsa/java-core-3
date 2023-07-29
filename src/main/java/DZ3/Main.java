package DZ3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Employee ivan = new Employee("Ovchinnikov", "Ivan","Igorevich",
//                "developer","8(495)000-11-22", 50000, 1985);
//        Employee victor = new Employee("Razenberg", "Victor", "Petrovich",
//                "fitter", "8(495)111-22-33", 42000,1991);
//        Employee pavel = new Employee("Ilgov", "Pavel", "Aleksandrovich",
//                "project manager", "8(495)222-33-44", 52000,1987);
//        Employee aleksandr = new Employee("Zakharov", "Aleksandr", "Ivanovich",
//                "driver", "8(495)333-44-55", 48000,1967);
//        Employee vasili = new Employee("Chmatko", "Vasili", "Sergeevich",
//                "security", "8(495)444-55-66", 31000,1981);

//        employeeIvan.info();
//        System.out.println(employeeIvan);

//        Employee[] company = {ivan, victor, pavel, aleksandr, vasili};

        Employee[] employees = {new Employee("Ovchinnikov", "Ivan","Igorevich", "developer","8(495)000-11-22", 50000, 1985),
                new Employee("Razenberg", "Victor", "Petrovich","fitter", "8(495)111-22-33", 42000,1991),
                new Employee("Ilgov", "Pavel", "Aleksandrovich",  "project manager", "8(495)222-33-44", 52000,1987),
                new Employee("Zakharov", "Aleksandr", "Ivanovich","driver", "8(495)333-44-55", 48000,1967),
                new Employee("Chmatko", "Vasili", "Sergeevich", "security", "8(495)444-55-66", 31000,1981),
                new Director("Gerasima", "Nadejda", "Petrovna", "Director", "8(342)326-43-23", 60000,1982)
        };

        System.out.println(Arrays.toString(employees));

//        raissing(employees, 45, 5000);
        Employee.raising(employees, 45, 5000);
        System.out.println(Arrays.toString(employees));

        Employee.averageStatistics(employees);
        Director.raising(employees, 45, 5000);
        System.out.println(Arrays.toString(employees));
    }

    private static void raissing(Employee[] empl, int age, int increment){
        for (Employee employee : empl) {
            if (employee.age > age) {
                employee.raisingSalary(increment);
            }
        }
    }

}
