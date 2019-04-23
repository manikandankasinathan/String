package hashmap;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		
		ArrayList<String>l1=new ArrayList<String>();
		
		// TODO Auto-generated method stub

           l1.add("mani");
           l1.add("suji");
           l1.add("suryanathan");
           
          ListIterator<String> itr=l1.listIterator();
          System.out.println("Traversing elements in forward direction"); 
          while(itr.hasNext())
          
          {
        	  System.out.println("index:"+itr.nextIndex()+"value of:"+itr.next());
          }
      
          System.out.println("Traversing elements in backword direction"); 
          while(itr.hasPrevious())
          {
        	  System.out.println("index:"+itr.previousIndex()+"value of:"+itr.previous());
          }
	}

}
