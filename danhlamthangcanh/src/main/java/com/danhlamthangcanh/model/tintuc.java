package com.danhlamthangcanh.model;
import java.util.Date;

public class tintuc {

	private long idtintuc;
    private String tentintuc;
    private byte[] hinhanh;
    private String motangan;
    private String motachitiet;
    private Date ngaydang;
    private loaitin loaitin;
    private taikhoan taikhoan;
    
    public tintuc(){}
    public tintuc(String ten, String tangan, String chitiet, Date ngay, loaitin l,taikhoan tk, byte[] hinhanh){
    	this.tentintuc = ten;
    	this.motangan = tangan;
    	this.motachitiet = chitiet;
    	this.ngaydang = ngay;
    	this.loaitin = l;
    	this.taikhoan = tk;
    	this.hinhanh = hinhanh;
    }
    
	public long getIdtintuc() {
		return idtintuc;
	}
	public void setIdtintuc(long idtintuc) {
		this.idtintuc = idtintuc;
	}
	public String getTentintuc() {
		return tentintuc;
	}
	public void setTentintuc(String tentintuc) {
		this.tentintuc = tentintuc;
	}
	public byte[] getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(byte[] hinhanh) {
		this.hinhanh = hinhanh;
	}

	public loaitin getLoaitin() {
		return loaitin;
	}
	public void setLoaitin(loaitin loaitin) {
		this.loaitin = loaitin;
	}
	public String getMotangan() {
		return motangan;
	}
	public void setMotangan(String motangan) {
		this.motangan = motangan;
	}
	public String getMotachitiet() {
		return motachitiet;
	}
	public void setMotachitiet(String motachitiet) {
		this.motachitiet = motachitiet;
	}
	public java.util.Date getNgaydang() {
		return ngaydang;
	}
	public void setNgaydang(java.util.Date ngaydang) {
		this.ngaydang = ngaydang;
	}
	public taikhoan getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(taikhoan taikhoan) {
		this.taikhoan = taikhoan;
	}
	
}
