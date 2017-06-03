package com.danhlamthangcanh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.danhlamthangcanh.model.*;
import com.danhlamthangcanh.service.QuanlitaikhoanServImpl;
import com.danhlamthangcanh.util.HibernateUtil;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {
	
	QuanlitaikhoanServImpl qltk = new QuanlitaikhoanServImpl();
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView admin(ModelMap model, HttpServletRequest request){
		 return new ModelAndView("admin/login","command", new taikhoan());
	}
	
	@RequestMapping(value = "/admin/index", method = RequestMethod.GET)
	public ModelAndView admin(ModelMap model){
		 return new ModelAndView("admin/index");
	}
	
	
	@RequestMapping(value = "/admin", method = RequestMethod.POST)
	public ModelAndView adminpost(ModelMap model, HttpServletRequest request,
			@ModelAttribute("Spring")taikhoan tk){
		HttpSession ss = request.getSession();
	    if(qltk.TestTaikhoan(tk) == 1)
	    	{
	    	ss.setAttribute("tk", "1");
	    	return new ModelAndView("admin/index");
	    	}
	    else{
	    	model.addAttribute("erro", "Bạn đã nhập sai tài khoản hoặc mật khẩu");
	    	return new ModelAndView("admin/login","command",new taikhoan());
	    	}
		 
	}
	
	@RequestMapping(value = "/admin/dang-xuat", method = RequestMethod.GET)
	public ModelAndView admin( HttpServletRequest request){
		HttpSession ss = request.getSession();
		ss.invalidate();
		return new ModelAndView("admin/login","command",new taikhoan());
	}
	
	
	

}