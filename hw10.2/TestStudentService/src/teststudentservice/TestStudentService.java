/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudentservice;

/**
 *
 * @author wit_w
 */
public class TestStudentService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        add(999, "pon", 3.9);
        update(999, "jonh", 4.00);
        remove(999, " ", 0.00);
        
        
    }

    private static String add(int id, java.lang.String name, double gpa) {
        testclientservice.StudentDB_Service service = new testclientservice.StudentDB_Service();
        testclientservice.StudentDB port = service.getStudentDBPort();
        return port.add(id, name, gpa);
    }

    private static String remove(int id, java.lang.String name, double gpa) {
        testclientservice.StudentDB_Service service = new testclientservice.StudentDB_Service();
        testclientservice.StudentDB port = service.getStudentDBPort();
        return port.remove(id, name, gpa);
    }

    private static String update(int id, java.lang.String name, double gpa) {
        testclientservice.StudentDB_Service service = new testclientservice.StudentDB_Service();
        testclientservice.StudentDB port = service.getStudentDBPort();
        return port.update(id, name, gpa);
    }
    
}
