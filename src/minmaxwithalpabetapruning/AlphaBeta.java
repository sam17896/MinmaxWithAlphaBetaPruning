/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxwithalpabetapruning;

import static java.lang.System.in;

/**
 *
 * @author AHSAN
 */
public class AlphaBeta {
    int depth;
    int counter = 0;
    
    Node node = new Node();
    
    double minimax(Node node, int depth, boolean me, double alpha, double beta){
        if(depth==0 || node.tailNode){
            counter++;
            return evaluate(node);
        }
        double bestValue = 0;
        if(me){
            bestValue = alpha;
            for(Node n : node.childs){
                double v = minimax(n,depth-1,false,alpha,beta);
                bestValue = Math.max(bestValue,v);
                if (bestValue > alpha)
                    alpha = bestValue; //you have found a better move
                if (alpha >= beta)
                    return alpha;
                
            }
            
        
        }
        else{
            bestValue = beta;
            for(Node n: node.childs){
                double m = minimax(n,depth-1,false,alpha,beta);
                bestValue = Math.min(bestValue, m);
                if (bestValue < beta)
                    beta = bestValue; ///you have found a better move
                if (alpha >= beta)
                    return beta;
            }
            return bestValue;
        }
        return bestValue;
    }
    
    double evaluate(Node node){
      //  System.out.println(node.value);
        return node.value;
    }
}
