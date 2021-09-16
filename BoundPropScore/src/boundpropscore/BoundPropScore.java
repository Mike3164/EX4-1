/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropscore;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class BoundPropScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            MyBean mybean = new MyBean();
            Listener1 listener1 = new Listener1();
            Listener1 listener2 = new Listener1();
            mybean.addPropertyChangeListener(listener1);
            mybean.addPropertyChangeListener(listener2);
        Scanner inp = new Scanner(System.in);
        String score;
        boolean off = true;
        while(off){
            System.out.print("Enter Score ");
            score = inp.nextLine();
             if(score.equals("")){off = false;}
             else{
            mybean.setScore(score);}
               
            
        }
    }
    
}
