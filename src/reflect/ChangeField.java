package reflect;

import java.lang.reflect.Field;

public class ChangeField {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Class employeeClass = employee.getClass();

        try {
            Field[] field = employeeClass.getDeclaredFields();
            System.out.println("변경 전 : " + employee);

            field[0].set(employee,"Park");
            field[1].set(employee,"HoonHee");
            field[2].set(employee, 10000);

            System.out.println("변경 후 : " + employee);

        } catch ( IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
