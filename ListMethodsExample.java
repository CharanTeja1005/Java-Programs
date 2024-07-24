import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
 
public class ListMethodsExample {
    public static void main(String[] args) {
 
        //Intitialising list with a default size
        ArrayList<String> list = new ArrayList<>(7);
       
        //Adding elements at the end using add method
        list.add("apple");
        list.add("ball");
        list.add("cart");
        list.add("dog");
        list.add("elephant");
        list.add("fish");
        list.add("giraffe");
        list.add("hill");
 
        System.out.println(list);
 
        //Adding element at an index using add method
        list.add(4,"car");

        //Adding all elements to list
        list.addAll(Arrays.asList("ball", "bat"));
 
        System.out.println(list);
 
        //removing element at an index
        list.remove(4);
        System.out.println(list);
 
        //removing element by specifying the index
        list.remove("fish");
        System.out.println(list);
 
        //checking if an element is present in list
        if(list.contains("fish"))
            System.out.println("Object fish is present in the list");
        else
            System.out.println("Object fish is not present in the list");
 
        //accesing an element using get method
        System.out.println("The element at index position 2 is " + list.get(2));
 
        //to get the size of the arraylist
        System.out.println("The size of the arraylist is "+list.size());
 
        //to check if the list is empty or not
        if(list.isEmpty())
            System.out.println("The list is empty and does not have any elements");
        else
            System.out.println("The list is not empty");
       
        //To get an array of objects out of the given list
        Object[] arr = list.toArray();
       
        //To replace an element at a position using set method
        list.set(0,"ant");
        System.out.println(list);
 
        //To extract index of a specific object in the list using indexOf method
        int index = list.indexOf("elephant");
        if(index == -1)
            System.out.println("The element is not present in the list");
        else
            System.out.println("The element is present at the index "+index);
 
        //to clone an arraylist using clone method
        @SuppressWarnings("unchecked")
        ArrayList<String> copyList = (ArrayList<String>)list.clone();
        System.out.println(copyList);
 
        //to append all elements of another arraylist we use addAll method
        list.addAll(copyList);
        System.out.println(list);
 
        //To create a sublist in a certain range, we use subList
        List<String> sublist = list.subList(2, 6);
        System.out.println(sublist);
 
        //To clear an entire arraylist we use clear method
        System.out.println("The size of copyList before clear is "+copyList.size());
        copyList.clear();
        System.out.println("The size of copyList after clear is "+copyList.size());
    }
}