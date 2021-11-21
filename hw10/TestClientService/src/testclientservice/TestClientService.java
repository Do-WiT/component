/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclientservice;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

/**
 *
 * @author wit_w
 */
public class TestClientService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("area of circle : " + area(5));
        System.out.println("circumference of circle : " + circumference(5));
    }

    private static double area(double raduis) {
        
        serviceclient.CircleFormula_Service service = new serviceclient.CircleFormula_Service();
        serviceclient.CircleFormula port = service.getCircleFormulaPort();
        return port.area(raduis);
        
    }

    private static double circumference(double radius) {
        serviceclient.CircleFormula_Service service = new serviceclient.CircleFormula_Service();
        serviceclient.CircleFormula port = service.getCircleFormulaPort();
        return port.circumference(radius);
    }
    
    
}
