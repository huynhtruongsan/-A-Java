package com.danhlamthangcanh.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.danhlamthangcanh.model.tintuc;
import com.danhlamthangcanh.service.QuanlitintucServImpl;
import com.danhlamthangcanh.util.HibernateUtil;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	QuanlitintucServImpl qltt = new QuanlitintucServImpl();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Model model) {
		model.addAttribute("listdulich", qltt.get5TintucDulich()); 
		model.addAttribute("listsukien", qltt.get5TintucSukien()); 
		return new ModelAndView("home","command",new tintuc());
	}
	@RequestMapping(value = "/timkiem", method = RequestMethod.GET)
	public ModelAndView timkiem(@RequestParam String tentintuc, Model model) {
		
		model.addAttribute("listdulich", qltt.FindDulich(tentintuc)); 
		model.addAttribute("listsukien", qltt.FindSukien(tentintuc));
		return new ModelAndView("home","command",new tintuc());
	}
	
	@RequestMapping(value = "/sukien",method = RequestMethod.GET)
	   public String sukien(ModelMap model) {
        model.addAttribute("listtt", qltt.getAllTintucSukien());
	      return "sukien";
	   }
	
	@RequestMapping(value = "/dulich",method = RequestMethod.GET)
	   public String dulich(ModelMap model) {
	        model.addAttribute("listtt", qltt.getAllTintucDulich());
	        model.addAttribute("list8", qltt.get8Tintuc());
	        return "dulich";
	   }
	
	@RequestMapping(value = "/dulich/chi-tiet-tin-tuc",method = RequestMethod.GET)
	   public String chitiettintucdulich(@RequestParam long idtintuc, Model model) {
		model.addAttribute("cttt", qltt.getTintuc(idtintuc));
		return "chitiettintuc";
	   } 
	
	@RequestMapping(value = "/sukien/chi-tiet-tin-tuc",method = RequestMethod.GET)
	   public String chitiettintucsukien(@RequestParam long idtintuc, Model model) {
		model.addAttribute("cttt", qltt.getTintuc(idtintuc));
		return "chitiettintuc";
	   } 
	
	
	
}
