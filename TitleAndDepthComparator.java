import java.util.*;
/**
 * Write a description of TitleAndDepthComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleAndDepthComparator implements Comparator<QuakeEntry> {
    public int compare (QuakeEntry qe1 , QuakeEntry qe2){
        if(qe1.getInfo().compareTo(qe2.getInfo()) < 0){
            return -1;
        }
        
        if(qe1.getInfo().compareTo(qe2.getInfo()) > 0){
            return 1;
        }
        
        if(qe1.getInfo().compareTo(qe2.getInfo()) == 0){
            Double.compare(qe1.getDepth() , qe1.getDepth());
        }
        
        return 0;
        
    }

}
