/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex5;

/**
 *
 * @author mario
 */
public class EDFP04EX5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(" Mario".compareTo(" Jorge"));
        
        nQueues n=new nQueues();
        n.creatQue(" Mario");
        n.creatQue(" Jorgee");
        n.creatQue(" Mendessss");
        n.creatQue(" leiteeeeeeeee");
        n.creatQue(" celoricooooooooooooo");
        
        n.juntaApenasNuma();
        System.out.println(n.getQuee().first().toString());
                
           
        
    }
    
}
