/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3_ObjectSerialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializationDemo {
    
    public void serialize(List<Mahasiswaku> pList, String fileName){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(pList);
        } catch (IOException ex) {
            System.out.println("a problem accured during serialization \n"
                    + ex.getMessage());
        }
    }
    
    public List<Mahasiswaku> deserialize(String fileName){
        List<Mahasiswaku> pList = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            pList = (List<Mahasiswaku>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.printf("a problem accured deserializing %s%n", fileName);
            System.out.println(ex.getMessage());
        }
        return pList;
    }

    void seri(List<Mahasiswaku> participants, String ebismillah_smt_5IP_searchMahasiswaser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
