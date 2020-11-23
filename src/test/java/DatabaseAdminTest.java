
import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Reliable Bob", "HG986556K", 40000);
    }
    @Test
    public void employeeHasName(){
        assertEquals("Reliable Bob", databaseAdmin.getName());
    }
    @Test
    public void canSetEmployeeName(){
        databaseAdmin.setName("Lazy Bob");
        assertEquals("Lazy Bob", databaseAdmin.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("HG986556K", databaseAdmin.getNINumber());
    }
    @Test
    public void canSetNINumber(){
        databaseAdmin.setNINumber("HG9865539l");
        assertEquals("HG9865539l", databaseAdmin.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(40000, databaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canSetSalary(){
        databaseAdmin.setSalary(28000);
        assertEquals(28000, databaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000.50);
        assertEquals(50000.50, databaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(400, databaseAdmin.getBonus(), 0.01);
    }
}
