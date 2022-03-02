package reflect;

import java.lang.reflect.Constructor;

public class GetConstructor {
    public static void main(String[] args) {
        Class<Employee> employeeClass = Employee.class;

        Constructor[] constructors1 = employeeClass.getConstructors();
        for(Constructor constructor : constructors1){
            System.out.println(constructor);
        }
    }
}
