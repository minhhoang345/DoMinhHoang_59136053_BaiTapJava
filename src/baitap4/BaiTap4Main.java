/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author DELL
 */
public class BaiTap4Main 
{
    public static void main(String[] args) 
    {
        
        ChuyenXe cxNoiThanh1 = new XeNoiThanh(12, 50, "NT001", "Đỗ Minh Hoàng", "PH-001", 150000);
        ChuyenXe cxNoiThanh2 = new XeNoiThanh(8, 100, "NT002", "Đỗ Văn Pháp", "PH-002", 350000);
        ChuyenXe cxNoiThanh3 = new XeNoiThanh(9, 120, "NT003", "Thái Thành Đạt", "PH-003", 400000);
        ChuyenXe cxNgoaiThanh1 = new XeNgoaiThanh("Nha Trang", 3,"NT-004", "Ngô Bá Lộc", "PH-004", 100000);
        ChuyenXe cxNgoaiThanh2 = new XeNgoaiThanh("Sài Gòn", 4,"SG-004", "Ngô Văn Vượng", "PH-005", 360000);
        ChuyenXe cxNgoaiThanh3 = new XeNgoaiThanh("Đà Lạt", 1,"NT-004", "Nguyễn Hoàng Long", "PH-006", 160000);

        QuanLyChuyenXe ds = new QuanLyChuyenXe();
        ds.themChuyenXe(cxNoiThanh1);
        ds.themChuyenXe(cxNoiThanh2);
        ds.themChuyenXe(cxNoiThanh3);
        ds.themChuyenXe(cxNgoaiThanh1);
        ds.themChuyenXe(cxNgoaiThanh2);
        ds.themChuyenXe(cxNgoaiThanh3);
        
        System.out.println("Danh Sách Chuyến Xe: \n");
        ds.inDS();
        System.out.println("Doanh Thu Xe Ngoại Thành: "+ds.tinhDoanhThuXeNgoaiThanh());
        System.out.println("Doanh Thu Xe Nội Thành: "+ds.tinhDoanhThuXeNoiThanh());
        System.out.println("Tổng Doanh Thu: "+ds.tinhTongDoanhThu());
        
        
        
    }
}
