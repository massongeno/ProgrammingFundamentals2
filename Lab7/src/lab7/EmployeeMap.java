package lab7;

import java.util.Map;

public class EmployeeMap {

    public static void add(Map employeeMap, Employee employee)
    {
    employeeMap.put(employee.getIDNumber(), employee.getName());
    }

    public static String lookUp(Map employeeMap, int id)
    {
    return (String) employeeMap.get(id);
    }

}
