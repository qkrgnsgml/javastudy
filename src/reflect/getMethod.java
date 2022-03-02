package reflect;

import java.lang.reflect.Method;

public class getMethod {
    public static void main(String[] args) {
        Class<Employee> employeeClass = Employee.class;

        Method[] methods = employeeClass.getDeclaredMethods();


        for (Method method : methods) {
            System.out.println("method = " + method);
        }

    }
}
