package ImmutableEmployeeClass;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("Springboot");

        Employee emp = new Employee(1,"Mohit",list);

        /* jab ham bad ma add keranga to add nahi hoga
        becaues after creating object ek bar constructor call
        hua to list immutable hogyi */

        list.add("sql");

        System.out.println(emp);

    }
}
