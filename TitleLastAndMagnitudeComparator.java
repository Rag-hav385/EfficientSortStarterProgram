import java.util.*;
/**
 * Write a description of TitleLastAndMagnitudeComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry q1 , QuakeEntry q2){
        //System.out.println(q2.getInfo().substring(q2.getInfo().indexOf(",") + 1 , q1.getInfo().length()));
        if(q1.getInfo().substring(q1.getInfo().lastIndexOf(" ") + 1).compareTo(q2.getInfo().substring(q2.getInfo().lastIndexOf(" ") + 1))  < 0){
            return -1;
        }
        
        if(q1.getInfo().substring(q1.getInfo().lastIndexOf(" ") + 1).compareTo(q2.getInfo().substring(q2.getInfo().lastIndexOf(" ") + 1))  > 0){
            return 1;
        }
        
        if(q1.getInfo().substring(q1.getInfo().lastIndexOf(" ") + 1).compareTo(q2.getInfo().substring(q2.getInfo().lastIndexOf(" ") + 1))  == 0){
            return Double.compare(q1.getMagnitude() , q2.getMagnitude());
        }
        
        return 0;
    }
}
