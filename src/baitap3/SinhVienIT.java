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
public class SinhVienIT extends SinhVienPoly
{
    double diemJava;
    double diemCss;
    double diemHTML;

    public SinhVienIT(double diemJava, double diemCss, double diemHTML, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHTML = diemHTML;
    }

    
    
    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    @Override
    public double getDiem() 
    {
        return ((2*diemJava +diemHTML +diemCss)/4); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Điểm: "+getDiem()+"\n"+"Học lực: "+super.getHocLuc()+"\n");
    }
}
