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
public class SinhVienBiz extends SinhVienPoly
{
    double diemMarketting;
    double diemSales;

    public SinhVienBiz(double diemMarketting, double diemSales, String hoTen, String nganh) 
    {
        super(hoTen, nganh);
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() 
    {
        return ((2*diemMarketting+diemSales)/3); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void xuat() 
    {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Điểm: "+getDiem()+"\n"+"Học lực: "+super.getHocLuc()+"\n");
    }
            
}
