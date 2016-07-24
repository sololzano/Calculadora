/**
 * @author Carlos Solorzano, Jose Gerardo Molina, Marlon Hernandez
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * TEST metodo Push, clase Stack. Ingreso de algun numero al stack.
     */
    @Test
    public void testPush() {
        System.out.println("Push");
        Object element = 0;
        Stack instance = new Stack();
        instance.Push(element);
    }

    /**
     * TEST metodo Pop, clase Stack. Salida del elemento del stack, se espera retorno null.
     */
    @Test
    public void testPop() {
        System.out.println("Pop");
        Stack instance = new Stack();
        Object expResult = null;
        Object result = instance.Pop();
        assertEquals(expResult, result);
    }

    /**
     * TEST metodo Get, clase Stack. Se obtiene null, pero IsEmpty regresa boolean true.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Stack instance = new Stack();
        Object expResult = null;
        Object result = instance.get();
        assertEquals(expResult, result);
    }

    /**
     * TEST metodo Size, clase Stack. Se espera que un tamaño de cero.
     */
    @Test
    public void testSize() {
        System.out.println("Size");
        Stack instance = new Stack();
        int expResult = 0;
        int result = instance.Size();
        assertEquals(expResult, result);
    }

    /**
     * TEST metodo IsEmpty, clase Stack. Se espera que devuelva true, el stack esta vació.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        Stack instance = new Stack();
        boolean expResult = true;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
    }
    
}
