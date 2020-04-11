/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class QuanLyNhanVien implements IQuanLy
{

    ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
    

    @Override
    public void them(NhanVien nv) 
    {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ds.add(nv);
    }

    @Override
    public void inDS()
    {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        for(NhanVien i:ds)
        {
            
            System.out.println(i.getThongTin());
            System.out.println("-----------");
        }
    }

}
