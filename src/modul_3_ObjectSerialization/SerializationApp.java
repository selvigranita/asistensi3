/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3_ObjectSerialization;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author dragontai
 */
public class SerializationApp {
    
    public static void main(String[] args) {
        List<Participant> participants = new ArrayList<Participant>();
        try {
            int b = Integer.parseInt(JOptionPane.showInputDialog("Number Of Participants"));
//        participants.add(new Participant("Dee", "aja", 22));
//        participants.add(new Participant("Ami", "Fahmi", 21));
//        participants.add(new Participant("Haya", "Hayati", 20));
//        participants.add(new Participant("Aya", "Hayati", 19));
        for (int i = 0; i < b; i++) {
            participants.add(new Participant("First Name", "Last Name", "Age"));
        }
        
        
        System.out.println("Participants : " + participants);
        
        SerializationDemo demo = new SerializationDemo();
//        demo.serialize(participants, "mahasiswa.ser");
        System.out.println("serialization is done");
        
        System.out.println("Desrialize object...");
        List<Mahasiswaku> newList = demo.deserialize("mahasiswa.ser");
        System.out.println("New List: " + newList);
        } catch (Exception e) {
            System.out.println("isi sek bro..");
        }
        
        
    }
}
