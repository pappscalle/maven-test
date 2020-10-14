package se.tastebin;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HelloWorldShould {
    
    @Test
    public void returnHelloWorld() {
        assertEquals(new HelloWorld("Hello", "World").value(), "Hello World!");
    }
    
    
}
