/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author wit_w
 */
@WebService(serviceName = "CircleFormula")
public class CircleFormula {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "area")
    public double area(@WebParam(name = "radius") double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "circumference")
    public double circumference(@WebParam(name = "radius") double radius) {
        //TODO write your implementation code here:
        return 2 * Math.PI * radius;
    }
    
    
    
}
