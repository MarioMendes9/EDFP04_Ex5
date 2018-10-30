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
public class nQueues {

    private QueueADT<QueueADT> quee;

    public nQueues() {
        this.quee = new CircularArrayQueue<>();
    }

    public void juntaApenasNuma() {

        while (this.quee.size() != 1) {
            QueueADT<String> qu1 = this.quee.dequeue();
            QueueADT<String> qu2 = this.quee.dequeue();
            QueueADT<String> qu3 = new CircularArrayQueue<>();
            while (!qu2.isEmpty() && !qu1.isEmpty()) {
                if (qu1.first().compareTo(qu2.first()) < 0) {
                    qu3.enqueue(qu2.dequeue());
                    qu3.enqueue(qu1.dequeue());

                } else {
                    qu3.enqueue(qu1.dequeue());
                    qu3.enqueue(qu2.dequeue());

                }
            }
            while (!qu2.isEmpty()) {
                qu3.enqueue(qu2.dequeue());
            }
            while (!qu1.isEmpty()) {
                qu3.enqueue(qu1.dequeue());
            }
            quee.enqueue(qu3);
        }

    }

    public void creatQue(String s) {
        QueueADT<String> ss = new CircularArrayQueue<>();
        ss.enqueue(s);
        this.quee.enqueue(ss);
    }

    public QueueADT<QueueADT> getQuee() {
        return quee;
    }

}
