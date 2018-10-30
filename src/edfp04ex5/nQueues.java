/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edfp04ex5;

import java.util.Comparator;

/**
 *
 * @author mario
 */
public class nQueues implements Comparator<String>{

    private QueueADT<QueueADT> quee;

    public nQueues() {
        this.quee = new CircularArrayQueue<>();
    }

    public void juntaApenasNuma() {

        while (this.quee.size() != 1) {
            QueueADT<String> qu1 = this.quee.dequeue();
            QueueADT<String> qu2 = this.quee.dequeue();
            QueueADT<String> qu3 = new CircularArrayQueue<>();
            
            qu3=this.une(qu1,qu2);

            quee.enqueue(qu3);
        }

    }
    
     public QueueADT<String> une(QueueADT<String> a1,QueueADT<String> a2){
        QueueADT<String> qu3 = new CircularArrayQueue<>();
        while(!a1.isEmpty() && !a2.isEmpty()){
            String n;
            //Se a1 < a2 entao retorna negativo, senao positivo 
            if(this.compare(a1.first(), a2.first())<0){
                n=a1.dequeue();
            }
            else{
                n=a2.dequeue();
                
            }
            qu3.enqueue(n);
        }
       while(!a1.isEmpty()){
           qu3.enqueue(a1.dequeue());
       }
       while(!a2.isEmpty()){
           qu3.enqueue(a2.dequeue());
       }
       
       return qu3;
    }
    

    public void creatQue(String s) {
        QueueADT<String> ss = new CircularArrayQueue<>();
       
        ss.enqueue(s);
        this.quee.enqueue(ss);
    }

    public QueueADT<QueueADT> getQuee() {
        return quee;
    }

    @Override
    public int compare(String o1, String o2) {
        return (o1.length()-o2.length());
    }
}