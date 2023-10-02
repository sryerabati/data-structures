import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map <String, String> grades = new HashMap<>(); 

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("Name: "); 
                String name = in.next(); 
                System.out.println("Grade: ");
                String grade = in.next(); 
                grades.put(name, grade); 

            } else if (input.equals("R"))
            {
                System.out.println("Name: "); 
                String name = in.next(); 
                grades.remove(name); 

            } else if (input.equals("M"))
            {
                System.out.println("Name: "); 
                String name = in.next(); 
                System.out.println("Grade: ");
                String grade = in.next(); 
                grades.put(name, grade); 
    
            } else if (input.equalsIgnoreCase("P"))
            {
                Set <String> set = grades.keySet(); 
                for(String key: set)
                {
                    System.out.println(key+": "+grades.get(key)); 
                }
            } else
            {
                done = true;
            }
        }
    }
}