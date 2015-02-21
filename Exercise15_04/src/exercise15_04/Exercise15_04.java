/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise15_04;
import java.util.ArrayList;
/**
 *
 * @author Runyu Wang
 */
public class Exercise15_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void sort(ArrayList<Number> list){
    for(int i = 0; i<list.size()-1;i++){
        Number currentMin = list.get(i);
        int currentMinIndex = i;
        
        for (int j = i + 1; j< list.size();j++){
            if(currentMin.doubleValue() > list.get(j).doubleValue()){
                currentMin = list.get(j);
                currentMinIndex = j;
            }
        }
    
        if (currentMinIndex != i){
            list.set(currentMinIndex, list.get(i));
            list.set(i,currentMin);
        }
        }    
    }
}
