import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Reliable Bob", "HG986556K", 120000, "Testing", 1500000);
    }
    @Test
    public void employeeHasName(){
        assertEquals("Reliable Bob", director.getName());
    }
    @Test
    public void canSetEmployeeName(){
        director.setName("Lazy Bob");
        assertEquals("Lazy Bob", director.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("HG986556K", director.getNINumber());
    }
    @Test
    public void canSetNINumber(){
        director.setNINumber("HG9865539l");
        assertEquals("HG9865539l", director.getNINumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(120000, director.getSalary(), 0.01);
    }
    @Test
    public void canSetSalary(){
        director.setSalary(28000);
        assertEquals(28000, director.getSalary(), 0.01);
    }
    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000.50);
        assertEquals(130000.50, director.getSalary(), 0.01);
    }
    @Test
    public void canGetPayBonus(){
        assertEquals(2400, director.getBonus(), 0.01);
    }
    @Test
    public void hasDeptName(){
        assertEquals("Testing", director.getDeptName());
    }
    @Test
    public void canSetDeptName(){
        director.setDeptName("DevOps");
        assertEquals("DevOps", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1500000, director.getBudget(), 0.01);
    }

    @Test
    public void canSetBudget(){
        director.setBudget(1500000.50);
        assertEquals(1500000.50, director.getBudget(), 0.01);
    }
    @Test
    public void raisedSalaryIsntNegative(){
        director.raiseSalary(-100000);
        assertEquals(120000, director.getSalary(), 0.01);
    }
    @Test
    public void newNameIsntNull(){
        director.setName(null);
        assertEquals("Reliable Bob", director.getName());
    }
}
