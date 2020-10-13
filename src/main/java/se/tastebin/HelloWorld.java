package se.tastebin;


public class HelloWorld {

    private final String hello;
    private final String world;
    
    public HelloWorld(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    public String value() {
        return String.format("%s %s!", hello, world);
    }
    
    
}
