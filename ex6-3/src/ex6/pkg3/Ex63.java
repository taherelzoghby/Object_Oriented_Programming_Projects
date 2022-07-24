
package ex6.pkg3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex63 {
    public static void main(String[] args) {
        movablePoint t=new movablePoint(4,5,10,20);
        movablePoint t1=new movablePoint(4,2,10,20);
        movablePoint t2=new movablePoint(4,1,10,20);
        movablePoint t3=new movablePoint(2,3,6,20);
        movablePoint t11=new movablePoint(1,1,1,1);
        List<movablePoint> a=new ArrayList<movablePoint>(Arrays.asList(t,t1,t2,t3));
        a.add(4,t11);
        for(movablePoint tt:a){
            System.out.println(tt.toString());
        }
        Collections.sort(a);
        for(movablePoint tt:a){
            System.out.println(tt.toString());
        }
        
   
    }
    
}
