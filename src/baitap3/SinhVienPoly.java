/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author DELL
 */
public abstract class SinhVienPoly 
{
    String hoTen;
    String nganh;


    
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc()
    {
        if (getDiem()<5) 
        {
            return "Học Sinh Yếu";     
        } 
        else 
        {
            if (getDiem()<6.5) 
            {
                return "Học Sinh Trung Bình";
            } else 
            {
                if (getDiem()<7.5) 
                {
                    return "Học Sinh Khá";
                } else 
                {
                    if (getDiem()<9) 
                    {
                        return "Học Sinh Giỏi";
                    } else 
                    {
                        if(getDiem()<=10)
                        return "Học Sinh Xuất Sắc";
                    }
                }
            }
        }
        return " ";
    }
    
    public void xuat(){
        System.out.println("Họ Tên: "+hoTen+"\n"+"Ngành: "+nganh);  
    }
    
    
}
