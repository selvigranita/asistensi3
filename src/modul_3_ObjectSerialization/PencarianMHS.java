/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3_ObjectSerialization;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Modul_3_ObjectSerialization.Mahasiswaku;

public class PencarianMHS extends DefaultTableModel{
    
    private List<Mahasiswaku> list = new ArrayList<Mahasiswaku>();
    
    public void setList(List<Mahasiswaku> list){
        this.list = list;
    }
    
    public void add(int index, Mahasiswaku element) {
        list.add(index, element);
    }

    public String getColumName(int column) {
        switch(column){
            case 0:
                return "NIM";
            case 1:
                return "NAMA";
            case 2:
                return "ASAL";
            case 3:
                return "KELAS PRAKTIKUM";
            default:
                return null;
             
            
        }
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNIM();
            case 1:
                return list.get(rowIndex).getNAMA();
            case 2:
                return list.get(rowIndex).getASAL();
            case 3:
                return list.get(rowIndex).getKELAS();
            default:
                return null;
        } 
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
     
}
