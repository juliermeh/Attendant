/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.attendant;

import br.edu.ifpb.pod.p.P;
import br.edu.ifpb.pod.queue.Q;

/**
 *
 * @author Sinbad Heinstein
 */
public class Attendant implements A{

    private int count = 0;
    
    @Override
    public void perform(Q q) {
        P p = q.pop();
        if(p == null) return;
        double x = Math.random();
        double h = 0.3 + Math.pow(x, x);
        count += h;
    }

    @Override
    public void report() {
        System.out.println("Pessoas atendidas: " + count);
    }
    
}
