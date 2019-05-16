
import java.util.Collections;
import java.util.ArrayList;

public class SortingDemo {
    
    public static void main(String[] args) {
        
        ArrayList<SortingDemo> empset = new ArrayList<>();
        
        SortingDemo e1 = new SortingDemo("E01",3400);
        SortingDemo e2 = new SortingDemo("E04",4500);
        SortingDemo e3 = new SortingDemo("E03",1200);
        SortingDemo e4 = new SortingDemo("E02",2300);
        
        empset.add(e1);
        empset.add(e2);
        empset.add(e4);
        empset.add(e3);
        Collections.sort(empset);
        System.out.println("SortingDemos in empset "
                + " are : ");
        for(Object ob:empset){
            System.out.println(ob);
        }
    
    }
}
