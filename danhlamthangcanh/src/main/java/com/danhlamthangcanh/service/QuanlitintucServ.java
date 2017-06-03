package com.danhlamthangcanh.service;

import java.util.List;

import com.danhlamthangcanh.model.tintuc;

public interface QuanlitintucServ {
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
	public List<tintuc> FindDulich(String tentintuc);
	public List<tintuc> FindSukien(String tentintuc);
}
