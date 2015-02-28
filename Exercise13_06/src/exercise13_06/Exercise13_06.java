/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise13_06;

/**
 *
 * @author Runyu Wang
 */
public class Exercise13_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(11);
        ComparableCircle c2 = new ComparableCircle(12);
        String str = "";
        
        if (c1.compareTo(c2) > 0){
            str = "c1";
        }else if (c1.compareTo(c2)<0){
            str = "c2";
        }else{
            str = "equal size";
        }
        System.out.println("the bigger one is " + str);
    }
    
}
