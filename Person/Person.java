
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Personable
{
    private double weight;
    private int age;
    
    public Person(double w,int a)
    {
    weight = w;
    age = a;
    }
    public void deepCopy(Person object)
    {
      age = object.age;
      weight = object.weight;
    }
    public String toString()
    {
     String string = "";
     string = "This persons weight is: "+weight+"  Aged: "+age ;
     return string;
    }
}
