/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.queue;

import br.edu.ifpb.pod.p.P;
import java.util.List;
/**
 *
 * @author Sinbad Heinstein
 */
public interface Queue {
    public List<P> queue();
    public P pop();
    public boolean push(P p);
}
