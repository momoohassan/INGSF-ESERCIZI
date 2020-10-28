package Esercitazione.Numeriprimi;

import static org.junit.Assert.*;



import java.util.Arrays;
import java.util.LinkedList;

 

import org.junit.Before;
import org.junit.Test;

 

import org.junit.BeforeClass;;
public class PrimiTest {
    private static Primi primi;
    
    @Before
    public void prepare1() {
    primi= new Primi();    
    }

 

    @Test
    public void primeNumberGen() {
        assertEquals(new LinkedList<Integer>(), primi.primeNumberGen(1));
        assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), primi.primeNumberGen(20));

 

    }
    @Test
    public void isPrimeWorks() {
        assertTrue(primi.primo(2));
        assertFalse(primi.primo(9));

    }

 

}
