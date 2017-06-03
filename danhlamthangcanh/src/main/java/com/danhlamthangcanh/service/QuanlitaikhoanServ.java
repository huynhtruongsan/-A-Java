package com.danhlamthangcanh.service;

import java.util.List;

import com.danhlamthangcanh.model.taikhoan;

public interface QuanlitaikhoanServ {
	public List<taikhoan> getAllTaikhoan();
	public taikhoan getTaikhoan(long id);
	public int TestTaikhoan(taikhoan tk);
	public void DeleteTaikhoan(long id);
	public void UpdateTaikhoan(taikhoan tk);
	public void AddTaikhoan(taikhoan tk);
}
