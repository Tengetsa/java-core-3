package DZ3;

import java.util.Arrays;

/**
 * 1.
 * – Создать класс ”Сотрудник”с полями: ФИО, должность, телефон, зарплата, возраст;
 * – Написать метод выводящую всю доступную информацию об объекте с использованием форматирования строк.
 * – Создать массив из 5 сотрудников
 * – Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Возраст и размер повышения должны быть параметрами метода.
 * – Написать тот же метод повышения в качестве статического в классе сотрудника. Метод должен принимать в качестве параметра массив сотрудников.
 * – Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль.
 * 2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
 * модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.**/

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
