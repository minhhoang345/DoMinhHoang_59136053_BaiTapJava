/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author DELL
 */
public class NhanVien 
{
    String ten;
    int tuoi;
    String diachi;
    double tienluong;
    int tonggiolam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diachi, double tienluong, int tonggiolam)
    {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tonggiolam = tonggiolam;
    }
    
    public String getThongTin()
    {
        return "Tên: "+ ten +"\n"
                +"Tuổi: " + tuoi+"\n"
                +"Địa chỉ: "+ diachi +"\n"
                +"Tiền lương: "+ tienluong +"\n"
                +"Tổng giờ làm: "+ tonggiolam +"\n"
                +"Thưởng: " +tinhThuong();     
    }
    public double tinhThuong()
    {
        if (tonggiolam>=200)
        {
            return tienluong *0.2;
        } 
        else 
        {
            if (tonggiolam>=100) 
            {
                return tienluong *0.1;
            } else
            {
                return 0;
            }
        }
    }
}
