import management.Manager;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Reliable Bob", "HG986556K", 40000, "Testing");
    }
    @Test
    public void employeeHasName(){
        assertEquals("Reliable Bob", manager.getName());
    }
    @Test
    public void canSetEmployeeName(){
        manager.setName("Lazy Bob");
        assertEquals("Lazy Bob", manager.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("HG986556K", manager.getNINumber());
    }
    @Test
    public void canSetNINumber(){
        manager.setNINumber("HG9865539l");
        assertEquals("HG9865539l", manager.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(40000, manager.getSalary(), 0.01);
    }
    @Test
    public void canSetSalary(){
        manager.setSalary(28000);
        assertEquals(28000, manager.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000.50);
        assertEquals(50000.50, manager.getSalary(), 0.01);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(400, manager.getBonus(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Testing", manager.getDeptName());
    }
}
