package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static edu.eci.cvds.tdd.registry.Gender.*;
import static org.junit.Assert.fail;

public class AgeTest {
    @Test
    public void shouldMayorAge(){
        int age1 = 18;
        int age2 = 1000;
        try{
            boolean result = Edad.edad(age1);
            boolean result1 = Edad.edad(age2);
            Assert.assertEquals(result, false);
            Assert.assertEquals(result1, false);
        }catch (Exception e){
            fail();
        }

    }
    @Test
    public void shouldMinorAge(){
        int age1 = 0;
        int age2 = 17;
        try{
            boolean result = Edad.edad(age1);
            boolean result1 = Edad.edad(age2);
            Assert.assertEquals(result, true);
            Assert.assertEquals(result1, true);
        }catch(Exception e){
            fail();
        }

    }
    @Test
    public void shouldInvalidAge(){
        int age1 = -1;
        try{
            Edad.edad(age1);
            fail();
        }catch (Exception e){
            Assert.assertEquals(e.getMessage(), "Edad Invalida.");
        }
    }
}
