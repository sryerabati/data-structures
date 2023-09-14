import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Diana");
        staff.addLast("Harry");
        staff.addLast("Romeo");
        staff.addLast("Tom");
        
        // The list is currently: Diane -> Harry -> Romeo -> Tom
        /*
         * The listIterator method creates a new list iterator
         * that is positioned at the head of the list.
         * The "|" is used to represent the iterator position
         */

        ListIterator<String> iterator = staff.listIterator(); // |DHRT

        /* The next method advances the iterator to the next element in the list. */
        iterator.next(); // D|HRT

        /* The next method also returns the element thiat the iterator is passing. */
        String name = iterator.next(); // DH|RT
        System.out.println(name); // Prints Harry
        System.out.println("Expected: Harry");

        /* The add method for iterators inserts an element at the iterators position 
         * The iterator is then positione after the elemtent that was inserted
        */
        iterator.add("Juliet"); // DHJ|RT
        iterator.add("Nina"); // DHJN|RT
        /*The remove method removes the element returned by the last call
         * to next or previous.
         * The remove method can only be called once after calling next or previous
         * The remove method cannot be called after calling add.
         */
        iterator.next(); // DHJNR|T
        iterator.remove(); // DHJN|T
        System.out.println(staff);
        System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");

        /*The set method updates the element returned by the last call to 
        next or previous */
        iterator.previous(); // DHJ|NT
        iterator.set("Albert"); // DHJA|T

        /*The hasNext method returns true if the list has another element.
         * It is often used in the condition off a while loop
         */
        iterator = staff.listIterator();
        while (iterator.hasNext())
        {
            String n = iterator.next();
            if (n.equals("Juliet"))
            {                               // DHJ|AT
                iterator.remove();          //DH|AT

            }
        }
                                            //DHAT|

        

        //Enhanced for loop work with linked list
        for (String n : staff)
        {
            System.out.print(n+" ");
        }

        System.out.println("Expected: Diana Harry Albert Tom");
        

        /** Cannot modify a linked list while also using an iterator
         * unless you use the iterator to do it
         */
           
        iterator = staff.listIterator();
        while(iterator.hasNext()){
            String n = iterator.next();
            if(n.equals("Harry")){
                //staff.remove("Diana");
            }
        }
      

    }   

}
