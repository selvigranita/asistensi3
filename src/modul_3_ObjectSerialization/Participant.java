/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3_ObjectSerialization;
import java.io.Serializable;
import javax.swing.*;
/**
 *
 * @author selvi dwi granat
 */
public class Participant implements Serializable{
    
    private final String firstName;
    private final String lastName;
//    private int age;
    private final String age;

    public Participant(String firstName, String lastName, String age) {
        this.firstName = JOptionPane.showInputDialog(firstName);
        this.lastName = JOptionPane.showInputDialog(lastName);
        this.age =(JOptionPane.showInputDialog(age));
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
//    public int getAge(){
//        return age;
//    }
    public String getAge(){
        return age;
    }
//    public void setAge(int age){
//        this.age = age;
//    }
    
    @Override
    public String toString(){
        return firstName +" "+ lastName +" (" + age + ")";
    }
    
}
