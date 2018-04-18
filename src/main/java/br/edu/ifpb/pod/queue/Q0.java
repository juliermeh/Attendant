/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.queue;

import br.edu.ifpb.pod.p.P;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sinbad Heinstein
 */
public class Q0 implements Queue{

    private P p;
    List<P> q;
    
    /* Método para criar lista de pessoas */
    @Override
    public List<P> queue() {
        q = new ArrayList();
        return q;
    }
    
    /* Método para remover pessoas da lista */
    @Override
    public P pop() {
        if(q.isEmpty()) return null;
        return q.remove(0);
    }
    
    /* Método para adicionar pessoas na lista */
    @Override
    public boolean push(P p) {
        if(q.size() == 100) {
            return false;
        }
        q.add(p);
        return true;
    }
    
}
