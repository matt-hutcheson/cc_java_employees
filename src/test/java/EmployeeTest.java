import staff.Employee;
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
    @Test
    public void hasNINumber(){
        assertEquals("HG986556K", employee.getNINumber());
    }
    @Test
    public void canSetNINumber(){
        employee.setNINumber("HG9865539l");
        assertEquals("HG9865539l", employee.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(40000, employee.getSalary());
    }
    @Test
    public void canSetSalary(){
        employee.setSalary(28000);
        assertEquals(28000, employee.getSalary());
    }
}
