/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxwithalpabetapruning;

/**
 *
 * @author AHSAN
 */
public class MinmaxWithAlpaBetaPruning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree t = new Tree();
        Node node = new Node();
        t.root = node;
        
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        
        Node node4 = new Node(3);
        Node node5 = new Node(12);
        Node node6 = new Node(8);
        
        Node node7 = new Node(2);
        Node node8 = new Node(6);
        Node node9 = new Node(5);
        
        Node node10 = new Node(14);
        Node node11 = new Node(5);
        Node node12 = new Node(2);
        
        node4.tailNode = true;
        node5.tailNode = true;
        node6.tailNode = true;
        node7.tailNode = true;
        node8.tailNode = true;
        node9.tailNode = true;
        node10.tailNode = true;
        node11.tailNode = true;
        node12.tailNode = true;
        
        
        node.childs.add(node1);
        node.childs.add(node2);
        node.childs.add(node3);
        
        node1.childs.add(node4);
        node1.childs.add(node5);
        node1.childs.add(node6);
        
        node2.childs.add(node7);
        node2.childs.add(node8);
        node2.childs.add(node9);
        
        node3.childs.add(node10);
        node3.childs.add(node11);
        node3.childs.add(node12);
        
        AlphaBeta player = new AlphaBeta();
        double alpha = Double.NEGATIVE_INFINITY;
        double beta = Double.POSITIVE_INFINITY;
        node.value = player.minimax(node, 2, true,alpha,beta);
        
        System.out.println(t.root.value);
        System.out.println(player.counter);
        
        
    }
    
}
