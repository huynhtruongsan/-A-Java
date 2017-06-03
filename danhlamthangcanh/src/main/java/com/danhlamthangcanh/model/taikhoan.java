package com.danhlamthangcanh.model;

import java.util.Date;

public class taikhoan {
	private long idtaikhoan;
    private String hoten;
    private String email;
    private String matkhau;
    private String dienthoai;
    private int quyen;
    private Date ngaytao;
    
    public taikhoan(){}

	public long getIdtaikhoan() {
		return idtaikhoan;
	}
	public void setIdtaikhoan(long idtaikhoan) {
		this.idtaikhoan = idtaikhoan;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	public int getQuyen() {
		return quyen;
	}
	public void setQuyen(int quyen) {
		this.quyen = quyen;
	}
	public Date getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}
	
}
