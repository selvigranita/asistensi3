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
 * @author dragontai
 */
public class Mahasiswaku implements Serializable{
    
    private int nim;
    private String nama;
    private String asal;
    private String kelas;
    
    public Mahasiswaku(){
    }

    public Mahasiswaku(int nim, String nama, String asal, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
        this.kelas = kelas;
    }
    
    public int getNIM(){
        return nim;
    }
    
    public void setNIM(int nim){
        this.nim = nim;
    }
    
    public String getNAMA(){
        return nama;
    }
    
    public void setNAMA(String nama){
        this.nama = nama;
    }

    public String getASAL(){
        return asal;
    }
    
    public void setASAL(String asal){
        this.asal = asal;
    }
    
    public String getKELAS(){
        return kelas;
    }
    
    public void setKELAS(String kelas){
        this.kelas = kelas;
    }
    
    @Override
    public String toString(){
        return "(" + nim + ") " + nama + " " + asal + " (" + kelas + ")";
    }
}
