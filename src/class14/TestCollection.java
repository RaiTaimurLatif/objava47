/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author shahzad
 */
public class TestCollection {

    public static void main ( String[] args ){
        //        Sorted    Duplicate   Ordered
        // Set    No        Yes         No
        // List   No/Yes    Yes         Yes
        // Map    Yes       No          Yes
        
        // Set - HashSet, LinkedHashSet, TreeSet, EnumSet
        // List - Vector, ArrayList, Stack, LinkedList, Queue
        // Map - Hashtable, HashMap, WeakHashMap, LinkedHashMap
        
        Set<String> s = new HashSet<>() ;
        List<String> l = new ArrayList<>() ;
        Map<String, Integer> m = new HashMap<>() ;
        
        Vector<String> vec = new Vector<>() ;
        
        
    }
}
