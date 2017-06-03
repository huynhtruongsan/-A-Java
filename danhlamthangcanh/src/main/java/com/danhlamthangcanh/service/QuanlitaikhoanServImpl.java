package com.danhlamthangcanh.service;

import java.util.List;

import com.danhlamthangcanh.dao.QuanlitaikhoanDaoImpl;
import com.danhlamthangcanh.model.taikhoan;

public class QuanlitaikhoanServImpl implements QuanlitaikhoanServ {
	QuanlitaikhoanDaoImpl qltk = new QuanlitaikhoanDaoImpl();
	@Override
	public List<taikhoan> getAllTaikhoan() {
		// TODO Auto-generated method stub
		return qltk.getAllTaikhoan();
	}
	@Override
	public int TestTaikhoan(taikhoan tk) {
		// TODO Auto-generated method stub
		return qltk.TestTaikhoan(tk);
	}
	@Override
	public void DeleteTaikhoan(long id) {
		// TODO Auto-generated method stub
		qltk.DeleteTaiKhoan(id);
		
	}
	@Override
	public taikhoan getTaikhoan(long id) {
		// TODO Auto-generated method stub
		return qltk.getTaikhoan(id);
	}
	@Override
	public void UpdateTaikhoan(taikhoan tk) {
		// TODO Auto-generated method stub
		qltk.UpdateTaikhoan(tk);
		
	}
	@Override
	public void AddTaikhoan(taikhoan tk) {
		// TODO Auto-generated method stub
		qltk.AddTaikhoan(tk);
		
	}

}
