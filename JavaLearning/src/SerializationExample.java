// Java program to illustrate Serializing
// an Object.
import java.io.*;

class SerializationExample implements Serializable
{
    private String name;
    SerializationExample(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        try
        {
            SerializationExample d =
                    new SerializationExample("GeeksForGeeks");
            FileOutputStream f = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(d);
            oos.close();
            f.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
