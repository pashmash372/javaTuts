// Java program to illustrate creation of Object
// using newInstance() method of Constructor class
import java.lang.reflect.*;

public class ReflectionExample
{
    private String name;
    ReflectionExample()
    {
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public static void main(String[] args)
    {
        try
        {
            Constructor<ReflectionExample> constructor
                    = ReflectionExample.class.getDeclaredConstructor();
            ReflectionExample r = constructor.newInstance();
            r.setName("Abhilash");
            System.out.println(r.name);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
