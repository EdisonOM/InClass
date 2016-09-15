/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class InClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    List<String>myFirstList = new ArrayList();
    myFirstList.add("Apple");
   myFirstList.add("orange");
   myFirstList.add("green");
//    for (String s : myFirstList){
//        System.out.println(s);
        for (int i = 0; i< myFirstList.size();i++){
         System.out.println(myFirstList.get(i));
        }
   Animal bob = new Animal("Roar");
   bob.speak();
    }
    }
    
//}