/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextAttribute;

import java.util.LinkedList;

/**
 *
 * @author wit_w
 */
public class StudentQueue {
    private LinkedList<Integer> ids = new LinkedList<>();

    public int getId(int id) {
        for (Integer id1 : ids) {
            if (id == id1)
                return id;
        }
        return -1;
    }

    public void setNewId(int id) {
        this.ids.add(id);
    }
    
    public void removeId(int id){
        this.ids.remove(id);
    }
    
    
    
}
