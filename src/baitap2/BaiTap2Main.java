/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author DELL
 */
public class BaiTap2Main 
{
    public static void main(String[] args) 
    {
        QuanLyNhanVien ds = new QuanLyNhanVien();
        NhanVien nv1 = new NhanVien("Đỗ Minh Hoàng", 21, "15/12 Quốc Tuấn", 7000000, 300);
        NhanVien nv2 = new NhanVien("Phạm Văn Pháp", 21, "213 New York", 3500000, 100);
        NhanVien nv3 = new NhanVien("Nguyễn Long Hoàng", 21, "21 Lê Hồng Phong", 2500000, 200);
        NhanVien nv4 = new NhanVien("Phạm Vương Quý", 21, "13 Lê Đại Hành", 4500000, 90);
        NhanVien nv5 = new NhanVien("Vương Vân Gia", 21, "23/6 Máy Nước", 7500000, 130);
        ds.them(nv1);
        ds.them(nv2);
        ds.them(nv3);
        ds.them(nv4);
        ds.them(nv5);
        ds.inDS();
    }
    
}
