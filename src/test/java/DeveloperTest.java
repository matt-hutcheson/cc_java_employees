import staff.Employee;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Reliable Bob", "HG986556K", 40000);
    }
    @Test
    public void employeeHasName(){
        assertEquals("Reliable Bob", developer.getName());
    }
    @Test
    public void canSetEmployeeName(){
        developer.setName("Lazy Bob");
        assertEquals("Lazy Bob", developer.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("HG986556K", developer.getNINumber());
    }
    @Test
    public void canSetNINumber(){
        developer.setNINumber("HG9865539l");
        assertEquals("HG9865539l", developer.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(40000, developer.getSalary(), 0.01);
    }
    @Test
    public void canSetSalary(){
        developer.setSalary(28000);
        assertEquals(28000, developer.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10000.50);
        assertEquals(50000.50, developer.getSalary(), 0.01);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(400, developer.getBonus(), 0.01);
    }
}
