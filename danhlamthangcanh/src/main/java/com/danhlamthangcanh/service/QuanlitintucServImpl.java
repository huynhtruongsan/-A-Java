package com.danhlamthangcanh.service;

import java.util.List;

import com.danhlamthangcanh.dao.QuanlitintucDaoImpl;
import com.danhlamthangcanh.model.tintuc;

public class QuanlitintucServImpl implements QuanlitintucServ {
	
	QuanlitintucDaoImpl qltt = new QuanlitintucDaoImpl();
	
	@Override
	public List<tintuc> getAllTintuc() {
		// TODO Auto-generated method stub
		return qltt.getAllTintuc();
	}

	@Override
	public void InsertTintuc(tintuc tt) {
		// TODO Auto-generated method stub
		qltt.InsertTintuc(tt);
	}

	@Override
	public void DeleteTintuc(long idtintuc) {
		// TODO Auto-generated method stub
		qltt.DeleteTintuc(idtintuc);
	}

	@Override
	public tintuc getTintuc(long idtintuc) {
		// TODO Auto-generated method stub
		return qltt.getTintuc(idtintuc);
	}

	@Override
	public void UpdateTintuc(tintuc tt) {
		// TODO Auto-generated method stub
		qltt.UpdateTintuc(tt);
	}

	@Override
	public List<tintuc> get5TintucDulich() {
		// TODO Auto-generated method stub
		return qltt.get5TintucDulich();
	}

	
	@Override
	public List<tintuc> getAllTintucDulich() {
		// TODO Auto-generated method stub
		return qltt.getAllTintucDulich();
	}

	@Override
	public List<tintuc> getAllTintucSukien() {
		// TODO Auto-generated method stub
		return qltt.getAllTintucSukien();
	}

	@Override
	public List<tintuc> get5TintucSukien() {
		// TODO Auto-generated method stub
		return qltt.get5TintucSukien();
	}

	@Override
	public List<tintuc> get8Tintuc() {
		// TODO Auto-generated method stub
		return qltt.get8Tintuc();
	}

	@Override
	public List<tintuc> FindDulich(String tentintuc) {
		// TODO Auto-generated method stub
		return qltt.findDulich(tentintuc);
	}

	@Override
	public List<tintuc> FindSukien(String tentintuc) {
		// TODO Auto-generated method stub
		return qltt.findSukien(tentintuc);
	}
	
	

}
