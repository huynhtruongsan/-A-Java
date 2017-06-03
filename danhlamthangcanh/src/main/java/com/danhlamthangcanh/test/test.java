package com.danhlamthangcanh.test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.danhlamthangcanh.model.*;
import com.danhlamthangcanh.util.HibernateUtil;

public class test {
	public static void main(String args[]){
		Date today = new Date(System.currentTimeMillis());
		
		/*Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		
		long a =1;
		loaitin lt = session.get(loaitin.class, a);
		taikhoan tk = session.get(taikhoan.class, a);
		
		tintuc tt = new tintuc();
		tt.setLoaitin(lt);
		tt.setTaikhoan(tk);
		tt.setMotachitiet("ĐIỆP SƠN ĐẸP TUYỆT");
		tt.setMotangan("ĐIỆP SƠN");
		tt.setTentintuc("Cảnh núi VÀ BIỂN");
		tt.setNgaydang(today);
		session.save(tt);
		
		System.out.println(tt.getNgaydang() + tt.getMotangan());
		tran.commit();
		session.close();*/
		
		/*taikhoan tk = new taikhoan();
		tk.setHoten("san");
		tk.setDienthoai("012345679");
		tk.setEmail("san@gmail.com");
		tk.setMatkhau("san123");
		tk.setQuyen(1);
		session.save(tk);
		tran.commit();*/
		
		
		/*loaitin lt1 = new loaitin();
		lt1.setTenloai("123");
		session.save(lt1);
		tran.commit();
		session.close();*/
		
		/*Đầu tiên ta khai báo một đối tượng today thuộc kiểu Date
		Date today=new Date(System.currentTimeMillis());
		
		Khai báo định dạng
		SimpleDateFormat timeFormat= new SimpleDateFormat(“hh:mm:ss dd/MM/yyyy”);
		
		Lấy thời gian thông qua hàm getTime sau đó chuyển sang string
		String s=timeFormat.format(today.getTime());*/
		
		/*Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		long a =1;
		   long b =2;
		loaitin loaia = session.get(loaitin.class, a);
		loaitin loaib = session.get(loaitin.class, b);
        tran.commit();
      Map<loaitin, String> loaitinn = new HashMap<loaitin, String>();
      loaitinn.put(loaia, loaia.getTenloai());
      loaitinn.put(loaib, loaib.getTenloai());
      for(Map.Entry m:loaitinn.entrySet()) 
    	   System.out.println(m.getKey()+" "+m.getValue());  
      System.out.println(loaia);*/
      //vấn đề thứ nhất: đã hiển thị trên view nhưng submit ko đúng yêu cầu
		//Sai 1 chổ thôi, theo mình phán đoán là ngay chổ form:select vì giá trị truyền vào là string
      // mặc dù map truyền vào là loaitin nhưng sau khi truyền vào form:select thì nó biến thành
      //String rồi, nên không khớp vs tyle trong class nữa.
      // vậy làm sao để cho value hiểu là truyền vào là loaitin.
      
		// Danh sách đã hiển thị lên nhưng chưa thay id bằng tên được
		// và chưa xóa gì ở đó lun
  
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tran = session.beginTransaction();
		tintuc t = new tintuc();
		long a = 1;
		t.setMotangan("á á");
		taikhoan tk = session.get(taikhoan.class, a);
		loaitin lt = session.get(loaitin.class, a);
		t.setTentintuc("á sasda xính đẹp");
		t.setMotachitiet("á");
		t.setLoaitin(lt);
		t.setTaikhoan(tk);
		session.save(t);
		tran.commit();
		 
	}

}
