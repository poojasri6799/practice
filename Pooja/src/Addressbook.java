import java.util.*;
import java.lang.*;
public class Addressbook {
    static String FirstName;
    static String LastName;
    static Scanner sc = new Scanner(System.in);
    static Personinformation person;
    static ArrayList <String> information;
    public static void AddData(){
        information = new ArrayList <>();
        person = new Personinformation(FirstName,LastName);
        System.out.println("Enter First Name");
        person.setFirstName(sc.next());
        information.add(person.getFirstName());
        System.out.println("Enter Last Name");
        person.setLastName(sc.next());
        information.add(person.getLastName());
    }
    public static void main (String[] args){
        AddData();

    }
}
