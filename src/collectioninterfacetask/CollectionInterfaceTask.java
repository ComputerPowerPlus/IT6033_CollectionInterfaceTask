/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectioninterfacetask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author CPP_Curriculum
 */
public class CollectionInterfaceTask {

    //creating 2 objects of concrete classes ArrayList and LinkedList
    private static ArrayList testArrayList = new ArrayList();
    private static LinkedList testLinkedList = new LinkedList();
    

    public static void main(String[] args) {
        // adding elements to the concrete classes
        testArrayList.add(3.14);
        testArrayList.add(2.72);
        testArrayList.add(1.13);
        
        testLinkedList.add(3.14);
        testLinkedList.add(2.72);
        testLinkedList.add(1.13);
        
        //printing out collection elements
        System.out.println("Array List:");
        for (Object o:testArrayList){
            System.out.println(o);
        }
        System.out.println("Linked List:");
        for (Object o:testLinkedList){
            System.out.println(o);
        }
        
        //checks if collections contain 3.14 and removes the element
        if (testArrayList.contains(3.14)){
            System.out.println("The ArrayList contains 3.14");
            testArrayList.remove(3.14);
        }
        else 
            System.out.println("The ArrayList list does not contain 3.14 element");
        
        
        if (testLinkedList.contains(3.14)){
            System.out.println("The LinkedList contains 3.14");
            testLinkedList.remove(3.14);
        }
        else 
            System.out.println("The LinkedList list does not contain 3.14 element");
        
        //printing out updated collections
        System.out.println("Updated Array List:");
        for (Object o:testArrayList){
            System.out.println(o);
        }
        System.out.println("Updated Linked List:");
        for (Object o:testLinkedList){
            System.out.println(o);
        }
    }    
}
