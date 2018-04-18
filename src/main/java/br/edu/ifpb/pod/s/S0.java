/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.s;

import br.edu.ifpb.pod.p.P;
import br.edu.ifpb.pod.queue.Queue;

/**
 *
 * @author Sinbad Heinstein
 */
public class S0 {
    
    private Queue q0;
    private Queue q1;
    private P p;
    
    public void PeopleQ0(){
        double x = Math.random();
        double e = 2.718281828;
        double f = 0.833 * Math.pow(e, -x);
        for (int i = 0; i <= f; i++){
            q0.push(p);
        } 
    }
    
    public void PeopleQ1(){
        double x = Math.random();
        double f = 2 * x;
        for (int i = 0; i <= f; i++){
            q1.push(p);
        } 
    }
            
}
