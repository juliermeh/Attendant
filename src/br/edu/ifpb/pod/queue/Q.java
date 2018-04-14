/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.queue;

import br.edu.ifpb.pod.p.P;
/**
 *
 * @author Sinbad Heinstein
 */
public interface Q {
    P queue();
    P pop();
    Q push();
}
