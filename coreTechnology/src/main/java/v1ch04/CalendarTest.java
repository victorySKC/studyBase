package v1ch04;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author SiVincent
 * @description 日期的测试类
 * @date 2023/5/10
 */
public class CalendarTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); //新建日期类，使用的是静态方法 new的话要有构造器
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, . . . , 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();

    }
}
