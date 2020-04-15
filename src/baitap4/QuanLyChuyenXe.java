/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class QuanLyChuyenXe 
{
    public ArrayList<ChuyenXe> ds = new ArrayList<ChuyenXe>();
    
    public void themChuyenXe(ChuyenXe cx)
    {
        ds.add(cx);      
    }
    
    public void inDS()
    {
        for(int i=0;i<ds.size();i++)
        {
            ds.get(i).inThongTinChuyenXe();
            System.out.println("-------------");
        }
    }
    public double tinhDoanhThuXeNoiThanh()
    {
        double doanhThuNoi=0;
        for(int i =0;i<ds.size();i++)
        {
            if(ds.get(i) instanceof XeNoiThanh)
            {
                doanhThuNoi=doanhThuNoi+ds.get(i).getDoanhThu();
            }
        }
        return doanhThuNoi;
    }   
    
    public double tinhDoanhThuXeNgoaiThanh()
    {
        double doanhThuNgoai=0;
        for(int i =0;i<ds.size();i++)
        {
            if(ds.get(i) instanceof XeNgoaiThanh)
            {
                doanhThuNgoai=doanhThuNgoai+ds.get(i).getDoanhThu();
            }
        }
        return doanhThuNgoai;
    }
    
    public double tinhTongDoanhThu()
    {
        return tinhDoanhThuXeNgoaiThanh()+tinhDoanhThuXeNoiThanh();
    }
}
