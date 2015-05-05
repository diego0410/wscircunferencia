/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diego;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author DIEGO
 */
@WebService(serviceName = "circunferencia")
public class circunferencia {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "area")
    public Double getArea(@WebParam(name = "r") Double r){
        return Math.PI * (r * r);
    }
    
    @WebMethod(operationName = "circunferencia")
    public Double getcircunferencia(@WebParam(name = "r") Double r){
        return 2 * Math.PI * r;
}
}
