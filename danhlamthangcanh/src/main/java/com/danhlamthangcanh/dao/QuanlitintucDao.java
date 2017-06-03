package com.danhlamthangcanh.dao;

import java.util.List;

import com.danhlamthangcanh.model.*;

public interface QuanlitintucDao {
	public List<tintuc> getAllTintuc();
	public List<tintuc> get8Tintuc();
	public List<tintuc> get5TintucDulich();
	public List<tintuc> getAllTintucDulich();
	public List<tintuc> get5TintucSukien();
	public List<tintuc> getAllTintucSukien();
	public void InsertTintuc(tintuc tt);
	public void DeleteTintuc(long idtintuc);
	public tintuc getTintuc(long idtintuc);
	public void UpdateTintuc(tintuc tt);
	public List<tintuc> findDulich(String tentintuc);
	public List<tintuc> findSukien(String tentintuc);
} 
