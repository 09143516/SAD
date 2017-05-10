package cn.liyi.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.liyi.entity.Guitar;
import cn.liyi.service.GuitarService;

public class GuitarAction extends ActionSupport implements ModelDriven<Guitar>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GuitarService guitarService;
	public void setGuitarService(GuitarService guitarService) {
		this.guitarService = guitarService;
	}
	private Guitar guitar = new Guitar();
	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}
	@Override
	public Guitar getModel() {
		return guitar;
	}
	
	public String search(){
		HttpServletRequest request = ServletActionContext.getRequest();
		Guitar guitarInfo = guitarService.findByType(
				Double.parseDouble(request.getParameter("price")));
//		HttpServletResponse response = ServletActionContext.getResponse();
		if(guitarInfo!=null){
			request.setAttribute("guitarInfo", guitarInfo);
		}else{
			return "unSearched";
		}
		return "searched";
	}

	public String show(){
		return "success";
	}
	
	public String searchAll(){
		HttpServletRequest request = ServletActionContext.getRequest();
//		String price = request.getParameter("price");
//		String builder = request.getParameter("builder");
//		String parameter = request.getParameter("type");
		double price = guitar.getPrice();
		guitar.getBuilder();
		guitar.getType();
		List<Guitar> findAll = guitarService.findAll(guitar);
		if(findAll!=null){
			request.setAttribute("findAll", findAll);
			request.setAttribute("findAllSize",findAll.size());
		}else{
			return "unSearched";
		}
		return "searched";
	}
}
