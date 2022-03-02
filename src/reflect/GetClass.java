package reflect;

import java.lang.reflect.Modifier;

public class GetClass {
    public static void main(String[] args) {
        Employee employee = new Employee();

        Class klass = employee.getClass();



        System.out.println( "Class name: " + klass.getName());
        System.out.println(
                "Class super class: " + klass.getSuperclass());

        int mods = klass.getModifiers();
        System.out.println(
                "Class is public: " + Modifier.isPublic(mods));
        System.out.println(
                "Class is final: " +  Modifier.isFinal(mods));
        System.out.println(
                "Class is abstract: " + Modifier.isAbstract(mods));

    }

}

