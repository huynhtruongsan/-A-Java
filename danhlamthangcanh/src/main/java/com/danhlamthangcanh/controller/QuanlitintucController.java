package com.danhlamthangcanh.controller;

import java.io.IOException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.danhlamthangcanh.model.loaitin;
import com.danhlamthangcanh.model.taikhoan;
import com.danhlamthangcanh.model.tintuc;
import com.danhlamthangcanh.service.QuanlitintucServImpl;
import com.danhlamthangcanh.util.HibernateUtil;

@Controller
public class QuanlitintucController {
	
	QuanlitintucServImpl qltt = new QuanlitintucServImpl();
	
	@RequestMapping(value = "/admin/quan-li-tin-tuc",method = RequestMethod.GET)
	   public String quanlitintuc(ModelMap model) {
	     model.addAttribute("listNews", qltt.getAllTintuc());
	      return "admin/manager_tintuc";
	   }
	
	@RequestMapping(value = "/admin/quan-li-tin-tuc/them-tin-tuc",method = RequestMethod.GET)
	   public ModelAndView themtintuc() {
	      return new ModelAndView("admin/add_tintuc","command",new tintuc());
	}	
	
	@RequestMapping(value = "/admin/quan-li-tin-tuc/them-tin-tuc",method = RequestMethod.POST )
	   public String themtintucsubmit(@ModelAttribute("Spring")tintuc tt,
			   @RequestParam CommonsMultipartFile[] fileUpload) throws Exception{
		
		if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload) {
            	tintuc t = new tintuc();
            	t.setLoaitin(tt.getLoaitin());
            	t.setMotachitiet(tt.getMotachitiet());
            	t.setMotangan(tt.getMotangan());
            	t.setNgaydang(new Date());
            	t.setTentintuc(tt.getTentintuc());
                t.setHinhanh(aFile.getBytes());
                
                qltt.InsertTintuc(t);
            }
        }
	 
		return "redirect:/admin/quan-li-tin-tuc";
		
		
	   } 
	
	@RequestMapping(value = "/admin/quan-li-tin-tuc/xoa-tin-tuc",method = RequestMethod.GET)
	   public String xoatintuc(@RequestParam long idtintuc ) {
		qltt.DeleteTintuc(idtintuc);
		return "redirect:/admin/quan-li-tin-tuc";
	   } 
	
	@RequestMapping(value = "/admin/quan-li-tin-tuc/sua-tin-tuc",method = RequestMethod.GET)
	   public ModelAndView suatintuc(@RequestParam long idtintuc, Model model ) { 
		model.addAttribute("id", idtintuc);
		return new ModelAndView("admin/update_tintuc","command",qltt.getTintuc(idtintuc));
	   } 
	
	@RequestMapping(value = "/admin/quan-li-tin-tuc/sua-tin-tuc",method = RequestMethod.POST)
	   public String suatintucsubmit(@ModelAttribute("Spring")tintuc tt
			   ,@RequestParam CommonsMultipartFile[] fileUpload)throws Exception {
		if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload) {
            	tt.setHinhanh(aFile.getBytes());
            	 qltt.UpdateTintuc(tt);
            }
        } 
		return "redirect:/admin/quan-li-tin-tuc";
	   }
	
	@RequestMapping(value = "/admin/quan-li-tin-tuc/hien-thi-hinh-anh")
    public void showImage(HttpServletRequest request, HttpServletResponse response,
            @RequestParam long id) throws IOException {
        try {
            byte[] img = qltt.getTintuc(id).getHinhanh();
            if (img != null) {
                response.setContentType("image/jpeg");
                ServletOutputStream outputStream = response.getOutputStream();
                outputStream.write(img);
                outputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	
	
	 @ModelAttribute("loaitin")
	   public Map<loaitin, String> getLoaiTin()
	   {
		 	Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 	Transaction tran = session.beginTransaction();
		 	List<loaitin> listloaitin = session.createQuery("from loaitin").list();
		 	Map<loaitin, String> loaitin = new HashMap<loaitin, String>();
		 	 if(listloaitin != null && !listloaitin.isEmpty())
		        {
		            for(loaitin lt : listloaitin)
		            {
		                loaitin.put(lt, lt.getTenloai());
		            }
		        }
			
	        tran.commit();
	      return loaitin;
	   }
}
