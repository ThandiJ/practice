
/**
 * Write a description of class Driver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver 
{
   public static void main(String [] args)
   {
    Personable node;
    Person ojay = new Person(90.5,21);
    Dog lucky = new Dog(12.3,10);
    Person roger = new Person(80,25);
   roger.deepCopy(ojay);
    Container con = new Container<Person,Dog,Person>(ojay,lucky,roger);
    node = con;
    System.out.print(node.toString());
    ojay.deepCopy(roger);
    
    //ode = roger;
   // System.out.print(node.toString());
   }
}
