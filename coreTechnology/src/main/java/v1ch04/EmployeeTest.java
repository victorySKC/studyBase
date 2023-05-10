package v1ch04;

import java.time.LocalDate;

/**
 * @author SiVincent
 * @description 说明一个类的方法
 * @date 2023/5/10
 */
public class EmployeeTest {
    public static void main(String[] args)
    {
        // fill the staff array with three Employee objects
        //这里是调用了构造器把？
        /**
         * •构造器与类同名
         * •每个类可以有一个以上的构造器
         * •构造器可以有 0 个、1 个或多个参数
         * •构造器没有返回值
         * •构造器总是伴随着 new 操作一起调用
         */
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay());
    }
}

class Employee
{
    private String name;
    private double salary;
    private LocalDate hireDay;
//构造器，这个是将上面3个域对应情况绑定了
    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

