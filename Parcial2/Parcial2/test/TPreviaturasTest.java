/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Flori
 */
public class TPreviaturasTest {
    
    public TPreviaturasTest() {
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

    @Test
    public void testObtenerSecuenciaCritica() {
        System.out.println("obtenerSecuenciaCritica");
        LinkedList<TVertice> laSecuencia = new LinkedList();
        TVertice v = new TVertice("v1", 1);
        TVertice v2 = new TVertice("v2", 2);
        TVertice v3 = new TVertice("v3", 3);
        TArista a1 = new TArista(v.getEtiqueta(), v2.getEtiqueta(), 0);
        TArista a2 = new TArista(v2.getEtiqueta(), v3.getEtiqueta(), 0);
        TArista a3 = new TArista(v2.getEtiqueta(), v.getEtiqueta(), 0);
        
        ArrayList<TVertice> v = new ArrayList();
        
        v.add(v);
        v.add(v2);
        v.add(v3);
        
        ArrayList<TAristas> a = new ArrayList();
        
        a.add(a1);
        a.add(a2);
        a.add(a3);

        TPreviaturas p = new TPreviaturas();
        int expResult = 0;
        int result = instance.obtenerSecuenciaCritica(laSecuencia);
        assertEquals(expResult, result);
    }
    
}
