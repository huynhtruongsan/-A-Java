package com.danhlamthangcanh.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.servlet.ModelAndView;

import com.danhlamthangcanh.model.taikhoan;
import com.danhlamthangcanh.model.tintuc;
import com.danhlamthangcanh.util.HibernateUtil;

public class QuanlitaikhoanDaoImpl implements QuanlitaikhoanDao {

	@Override
	public List<taikhoan> getAllTaikhoan() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<taikhoan> listtaikhoan = session.createQuery("from taikhoan").list();
	    tran.commit();
		return listtaikhoan;
	}

	@Override
	public int TestTaikhoan(taikhoan tk) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		List<taikhoan> listTK = session.createQuery("from taikhoan").list();
	    tran.commit();
	    
	    for(taikhoan t: listTK)
	    	if(tk.getEmail().equals(t.getEmail()) &&
	    		tk.getMatkhau().equals(t.getMatkhau()) &&t.getQuyen() == 1)
	    		return 1;
	    	
		return 0;
	}

	@Override
	public void DeleteTaiKhoan(long id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		session.delete(session.get(taikhoan.class, id));
	    tran.commit();
		
	}

	@Override
	public taikhoan getTaikhoan(long id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		taikhoan tk = session.get(taikhoan.class, id);
		tran.commit();
		return tk;
	}

	@Override
	public void UpdateTaikhoan(taikhoan tk) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		tk.setNgaytao(new Date());
		session.update(tk);
	     tran.commit();
		
	}

	@Override
	public void AddTaikhoan(taikhoan tk) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		tk.setNgaytao(new Date());
		session.save(tk);
	     tran.commit();
	}

}
