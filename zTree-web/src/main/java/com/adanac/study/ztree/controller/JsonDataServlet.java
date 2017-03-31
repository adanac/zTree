//package com.adanac.study.ztree.controller;
//
//import com.adanac.study.ztree.bean.Car;
//import com.adanac.study.ztree.util.DBCPUtil;
//import org.apache.commons.dbutils.QueryRunner;
//import org.apache.commons.dbutils.handlers.BeanListHandler;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.net.URLDecoder;
//import java.sql.SQLException;
//import java.util.List;
//
//@WebServlet(urlPatterns="/jsondata")
//public class JsonDataServlet extends HttpServlet {
//	QueryRunner qr = new QueryRunner(DBCPUtil.getDataSource());
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		String method = req.getParameter("method");
//		if("deletePp".equals(method)){
//			deletePp(req,resp);
//		}else if("addPp".equals(method)){
//			addPp(req,resp);
//		}else if("updatePp".equals(method)){
//			updatePp(req,resp);
//		}
//		resp.setCharacterEncoding("utf-8");
//		resp.setContentType("text/html;charset=utf-8");
//		String data = getData();
//		resp.getWriter().write(data);
//	}
//	//更新节点
//	private void updatePp(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException{
//		req.setCharacterEncoding("utf-8");
//		String id = req.getParameter("id");
//		id = URLDecoder.decode(id,"utf-8");
//		String name = req.getParameter("name");
//		name = URLDecoder.decode(name,"utf-8");
//		try {
//			String sql = "update car set name=? where id=?";
//			int update = qr.update(sql, name,id);
//			if(update==1){
//				System.out.println("修改成功");
//			}else{
//				System.out.println("修改失败");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	//增加节点
//	private void addPp(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		req.setCharacterEncoding("utf-8");
//		String pId = req.getParameter("pId");
//		pId = URLDecoder.decode(pId,"utf-8");
//		String name = req.getParameter("name");
//		name = URLDecoder.decode(name,"utf-8");
//
//		try {
//			String sql = "insert into car(pId,name) values(?,?)";
//			int update = qr.update(sql, pId,name);
//			if(update==1){
//				System.out.println("添加成功");
//			}else{
//				System.out.println("添加失败");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	//删除节点
//	private void deletePp(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.setCharacterEncoding("utf-8");
//
//		String id = req.getParameter("id");
//		id = URLDecoder.decode(id,"utf-8");
//		String sql = "delete from car where id=?";
//		try {
//			int update = qr.update(sql, id);
//			if(update==1){
//				System.out.println("删除成功");
//			}else{
//				System.out.println("删除失败");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		doPost(req, resp);
//	}
//	public  String getData(){
//
//		String sql = "select * from car";
//		JSONArray array = new JSONArray();
//		try {
//			List<Car> carList = qr.query(sql, new BeanListHandler<Car>(Car.class));
//			for (Car car : carList) {
//				JSONObject jsonObject = new JSONObject();
//				jsonObject.put("id",car.getId());
//				jsonObject.put("name",car.getName());
//				jsonObject.put("pId",car.getpId());
//				array.put(jsonObject);
//			}
//			System.out.println(array.toString());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return array.toString();
//	}
//
//}
