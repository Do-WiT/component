/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservice;

import entity.Student;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author wit_w
 */
@WebService(serviceName = "StudentDB")
public class StudentDB {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "add")
    public String add(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        
        DatabaseControl.persist(new Student(id, name, gpa));
        
        return "inserted successfully";
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "update")
    public String update(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        //TODO write your implementation code here:new 
        DatabaseControl.update(new Student(id, name, gpa));
        
        return "updated successfully";
    }
    
    
    @WebMethod(operationName = "remove")
    public String remove(@WebParam(name = "id") int id, @WebParam(name = "name") String name, @WebParam(name = "gpa") double gpa) {
        //TODO write your implementation code here:new 
        DatabaseControl.remove(new Student(id, name, gpa));
        
        return "remove successfully";
    }
    
}
