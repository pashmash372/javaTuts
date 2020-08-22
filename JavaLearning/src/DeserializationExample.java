// Java program to illustrate creation of Object
// using Deserialization.
import java.io.*;

public class DeserializationExample
{
    public static void main(String[] args)
    {
        DeserializationExample d;
        try
        {
            System.out.println("inside Deserialization Example");
            FileInputStream f = new FileInputStream("/home/abhilash/javaTuts/file.txt");
            ObjectInputStream oos = new ObjectInputStream(f);
            d = (DeserializationExample)oos.readObject();
            System.out.println(d);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
//        System.out.println(d);
    }
}
