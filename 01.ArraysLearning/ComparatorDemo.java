import java.util.Comparator;
public class ComparatorDemo implements Comparator{
    //The type ComparatorDemo must implement the inherited abstract method 
	//Comparator.compare(Object, Object)

    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;
        String s2=(String)o2;
        // Alternative way
		// String s1 = o1.toString();
		// String s2 = o2.toString();

        // for sorting ascendng(+1,-1) and descending order(-1,+1)
        // int result=s1.compareTo(s2);
        // if(result>0){
        //     return +1;
        // }
        // else if(result<0){
        //     return -1;
        // }
        // else{
        //     return 0;
        // }

        // Comparingn length wise sorting
        if(s1.length()>s2.length()){
            return +1;
        }
        else if(s1.length()<s2.length()){
            return -1;
        }
        else{
            return 0;
        }

    }
    
}
