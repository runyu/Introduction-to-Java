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
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    
    public ComparableCircle(double radius){
        super(radius);
    }
    
    
    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }else if (getRadius() < o.getRadius()){
            return -1;
        }else{
            return 0;
        }
        
    }
    
}
