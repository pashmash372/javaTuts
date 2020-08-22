// Java program to illustrate creation of Object
// using clone() method
public class CloneExample implements Cloneable
{
    public CloneExample() {
        System.out.println("Clone Example constructor");
        System.out.println("Oh hi hi I am feeling so high ");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    String name = "GeeksForGeeks";

    public static void main(String[] args)
    {
        CloneExample obj1 = new CloneExample();
        try
        {
            CloneExample obj2 = (CloneExample) obj1.clone();
            System.out.println(obj2.name);
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
