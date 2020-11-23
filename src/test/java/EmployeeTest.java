import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void before(){
        employee = new Employee("Reliable Bob", "HG986556K", 40000);
    }
    @Test
    public void employeeHasName(){
        assertEquals("Reliable Bob", employee.getName());
    }
    @Test
    public void canSetEmployeeName(){
        employee.setName("Lazy Bob");
        assertEquals("Lazy Bob", employee.getName());
    }
}
