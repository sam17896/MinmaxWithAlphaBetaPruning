package minmaxwithalpabetapruning;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHSAN
 */
public class Node {
    double value;
    boolean tailNode;
    
    List<Node> childs;
    
    Node(){
        childs = new ArrayList();
        tailNode = false;
    }
    
    
    Node(double value){
        this.value = value;
        childs = new ArrayList();
        tailNode = false;
    }
    
    
    
}
