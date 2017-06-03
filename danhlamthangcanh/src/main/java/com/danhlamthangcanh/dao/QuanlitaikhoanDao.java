package com.danhlamthangcanh.dao;

import java.util.List;

import com.danhlamthangcanh.model.*;

public interface QuanlitaikhoanDao {
	public List<taikhoan> getAllTaikhoan();
	public taikhoan getTaikhoan(long id);
	public int TestTaikhoan(taikhoan tk);
	public void DeleteTaiKhoan(long id);
	public void UpdateTaikhoan(taikhoan tk);
	public void AddTaikhoan(taikhoan tk);
}
