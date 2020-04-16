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
    String diaChi;
    double tienLuong;
    int tongGioLam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongGioLam)
    {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLam = tongGioLam;
    }
    
    public String getThongTin()
    {
        return "Tên: "+ ten +"\n"
                +"Tuổi: " + tuoi+"\n"
                +"Địa chỉ: "+ diaChi +"\n"
                +"Tiền lương: "+ tienLuong +"\n"
                +"Tổng giờ làm: "+ tongGioLam +"\n"
                +"Thưởng: " +tinhThuong();     
    }
    public double tinhThuong()
    {
        if (tongGioLam>=200)
        {
            return tienLuong *0.2;
        } 
        else 
        {
            if (tongGioLam>=100) 
            {
                return tienLuong *0.1;
            } else
            {
                return 0;
            }
        }
    }
}
