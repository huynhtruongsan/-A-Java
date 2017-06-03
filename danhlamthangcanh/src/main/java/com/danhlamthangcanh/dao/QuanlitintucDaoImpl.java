package com.danhlamthangcanh.dao;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.danhlamthangcanh.model.taikhoan;
import com.danhlamthangcanh.model.tintuc;
import com.danhlamthangcanh.util.HibernateUtil;

public class QuanlitintucDaoImpl implements QuanlitintucDao {

	@Override
	public List<tintuc> getAllTintuc() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<tintuc> l = session.createQuery("from tintuc order by idtintuc desc").list();
	     tran.commit();
		return l;
	}

	@Override
	public void InsertTintuc(tintuc tt) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		long a = 1;
		taikhoan tk = session.get(taikhoan.class, a);
		tt.setTaikhoan(tk);
		session.save(tt);
	     tran.commit();
	}

	@Override
	public void DeleteTintuc(long idtintuc) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		tintuc tt = session.get(tintuc.class, idtintuc);
		session.delete(tt);
		tran.commit();
	}

	@Override
	public tintuc getTintuc(long idtintuc) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		tintuc tt = session.get(tintuc.class, idtintuc);
		tran.commit();
		return tt;
		
	}

	@Override
	public void UpdateTintuc(tintuc tt) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		long a = 1;
		taikhoan tk = session.get(taikhoan.class, a);
		tt.setTaikhoan(tk);
		tt.setIdtintuc(tt.getIdtintuc());
		session.update(tt);
	     tran.commit();
		
	}

	@Override
	public List<tintuc> get5TintucDulich() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<tintuc> listdulich = session.createQuery("from tintuc where idloaitin = 1 order by idtintuc desc").setMaxResults(5).list();
		tran.commit();
		return listdulich;
	}
	
	@Override
	public List<tintuc> getAllTintucDulich() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<tintuc> listdulich = session.createQuery("from tintuc where idloaitin = 1 order by idtintuc desc").list();
		tran.commit();
		return listdulich;
	}

	@Override
	public List<tintuc> getAllTintucSukien() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<tintuc> listsukien = session.createQuery("from tintuc where idloaitin = 2 order by idtintuc desc").list();
		tran.commit();
		return listsukien;
	}

	@Override
	public List<tintuc> get5TintucSukien() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<tintuc> listdulich = session.createQuery("from tintuc where idloaitin = 2 order by idtintuc desc").setMaxResults(5).list();
		tran.commit();
		return listdulich;
	}

	@Override
	public List<tintuc> get8Tintuc() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<tintuc> l = session.createQuery("from tintuc order by idtintuc desc").setMaxResults(8).list();
	     tran.commit();
		return l;
	}

	@Override
	public List<tintuc> findDulich(String tentintuc) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
	     
		String hql = "FROM tintuc WHERE (tentintuc LIKE :a OR motachitiet LIKE:a OR motangan LIKE:a) "
				+ " and idloaitin =:b order by idtintuc desc";
		Query query = session.createQuery(hql);
		query.setParameter("a","%"+tentintuc+"%");
		query.setParameter("b",1);
		List<tintuc> l = query.list();
		tran.commit();
		return l;
	}

	@Override
	public List<tintuc> findSukien(String tentintuc) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
	     
		String hql = "FROM tintuc WHERE (tentintuc LIKE :a OR motachitiet LIKE:a OR motangan LIKE:a) "
				+ " and idloaitin =:b order by idtintuc desc";
		Query query = session.createQuery(hql);
		query.setParameter("a","%"+tentintuc+"%");
		query.setParameter("b",2);
		List<tintuc> l = query.list();
		tran.commit();
		return l;
	}

}
