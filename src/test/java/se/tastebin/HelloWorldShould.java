package se.tastebin;

import se.tastebin.HelloWorld;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HelloWorldShould {
    
    @Test
    public void returnHelloWorl() {
        assertEquals(new HelloWorld("Hello", "World").value(), "Hello World!");
    }
    
    
}
