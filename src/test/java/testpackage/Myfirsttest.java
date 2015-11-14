package testpackage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Haroon on 07/11/2015.
 */
public class Myfirsttest {

    @Test
    public void testTestTest() {
        String greeting = getGreetingValue();
        assertEquals("Hello",greeting);
        //Validate the name is having more than 1 character
        String myName = "Testing";
        assertTrue(myName.length()<1);
        assertTrue(myName.contains("ting"));
    }

    public String getGreetingValue() {
        return "Hello";
    }
}
