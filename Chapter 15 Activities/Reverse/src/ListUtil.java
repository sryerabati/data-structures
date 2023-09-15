import java.util.*;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        LinkedList<String> temp = new LinkedList<>();
        ListIterator<String> tempIterator = strings.listIterator();
        while (tempIterator.hasNext())
        {
            temp.addFirst(tempIterator.next());
        }


    }
}