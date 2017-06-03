package com.danhlamthangcanh.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.danhlamthangcanh.model.loaitin;
import com.danhlamthangcanh.model.taikhoan;
import com.danhlamthangcanh.model.tintuc;
import com.danhlamthangcanh.service.QuanlitaikhoanServImpl;
import com.danhlamthangcanh.util.HibernateUtil;

@Controller
public class QuanlitaikhoanController {

	QuanlitaikhoanServImpl qltk = new QuanlitaikhoanServImpl();
	
	@RequestMapping(value = "/admin/quan-li-tai-khoan",method = RequestMethod.GET)
	   public String quanlitintuc(ModelMap model) {
	     model.addAttribute("listTaiKhoan", qltk.getAllTaikhoan());
	      return "admin/manager_taikhoan";
	   }
	
	@RequestMapping(value = "/admin/quan-li-tai-khoan/them-tai-khoan",method = RequestMethod.GET)
	   public ModelAndView themtaikhoan() {
	      return new ModelAndView("admin/add_taikhoan","command", new taikhoan());
	   }
	
	@RequestMapping(value = "/admin/quan-li-tai-khoan/them-tai-khoan",method = RequestMethod.POST)
	   public String themtaikhoansubmit(@ModelAttribute("Spring")taikhoan tk) {
		qltk.AddTaikhoan(tk);
	      return "redirect:/admin/quan-li-tai-khoan";
	   }
	
	@RequestMapping(value = "/admin/quan-li-tai-khoan/xoa-tai-khoan",method = RequestMethod.GET)
	   public String xoataikhoan(@RequestParam long idtaikhoan ) {
		qltk.DeleteTaikhoan(idtaikhoan);
		return "redirect:/admin/quan-li-tai-khoan";
	   } 
	
	@RequestMapping(value = "/admin/quan-li-tai-khoan/sua-tai-khoan",method = RequestMethod.GET)
	   public ModelAndView suataikhoan(@RequestParam long idtaikhoan ) {
		
		return new ModelAndView("admin/update_taikhoan","command",qltk.getTaikhoan(idtaikhoan));
	   } 
	
	@RequestMapping(value = "/admin/quan-li-tai-khoan/sua-tai-khoan",method = RequestMethod.POST)
	   public String suataikhoansubmit(@ModelAttribute("Spring")taikhoan tk) {
		qltk.UpdateTaikhoan(tk);
		return "redirect:/admin/quan-li-tai-khoan";
	   } 
	
	@ModelAttribute("quyen")
	 public Map<Integer, String> getQuyen()
	   {
	      Map<Integer, String> quyen = new HashMap<Integer, String>();
	      quyen.put(1, "Quản trị viên");
	      quyen.put(0, "Người dùng");
	      return quyen;
	   }
	
}
