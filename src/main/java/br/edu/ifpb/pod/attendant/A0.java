/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.attendant;

import br.edu.ifpb.pod.p.P;
import br.edu.ifpb.pod.queue.Queue;

/**
 *
 * @author Sinbad Heinstein
 */
public class A0 implements Attendant{

    private int count = 0;
    
    /* Método para contar a quantidade de pessoas atendidas */
    @Override
    public void perform(Queue q) {
        P p = q.pop();
        if(p == null) return;
        double x = Math.random();
        double h = 0.3 + Math.pow(x, x);
        count += h;
    }
    
    /* Método para exibir quantas pessoas foram atendidas */
    @Override
    public void report() {
        System.out.println("Pessoas atendidas: " + count);
    }
    
}
