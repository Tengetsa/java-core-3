package DZ3;

public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    final String post;
    final private String phone;
    int salary;
    public int age;

    public Employee(String surname, String name, String patronymic, String post, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age =  age;
    }

//    public void info() {
//        System.out.println("Employee{" +
//                "surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", post='" + post + '\'' +
//                ", phone='" + phone + '\'' +
//                ", salary=" + salary +
//                ", age=" + age +
//                '}');
//
//    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "surname='" + surname + '\'' +
//                ", name='" + name + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", post='" + post + '\'' +
//                ", phone='" + phone + '\'' +
//                ", salary=" + salary +
//                ", age=" + age +
//                '}';
//    }

    @Override
    public String toString() {
        return String.format("Employee" +
                "surname='%s', 'name='%s', patronymic='%s'" +
                ", post='%s', phone='%s'" +
                ", salary=%d, age=%d`", surname, name, patronymic, post, phone, salary, age);
    }

    public void raisingSalary(int amount){
        this.salary += amount;
    }

    public static void raising(Employee[] empl, int age, int increment){
        for (Employee employee : empl) {
            if (employee.age > age) {
                employee.raisingSalary(increment);
            }
        }
    }

    public static void averageStatistics(Employee[] empl){
        int temp = 0;
        int tepm1 = 0;
        for (Employee employee : empl) {
            temp += employee.age;
            tepm1 += employee.salary;
        }
        temp /= empl.length;
        tepm1 /= empl.length;
        System.out.println("Средний возраст = " + temp);
        System.out.println("Средняя зарплата = " + tepm1);
    }

}
