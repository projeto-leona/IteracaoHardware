/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leona.hardware.RetrieveServices;

import br.leona.hardware.model.Service;

/**
 *
 * @author Admin_2
 */
public interface RetrieveService {
     
    abstract Service getService();
    
    abstract String getServiceType();
    
    
}