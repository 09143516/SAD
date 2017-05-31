package Action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import Entity.Instruct;
import Service.InventoryService;
import net.sf.json.JSONObject;

public class InventoryAction extends ActionSupport {
	private String instructMap;
	private String serialNumber;
	private Double price;
	private InventoryService inventoryService;	
	private Map<String,Object> dataMap=new HashMap();	
	public String add(){		
		Map properties=(Map)JSONObject.fromObject(instructMap);		
		inventoryService.add(serialNumber, price, properties);
		return SUCCESS;
	}
	public String search(){
		Map properties=(Map)JSONObject.fromObject(instructMap);
		List<Instruct> list=inventoryService.search(properties);
		dataMap.put("list", list);
		System.out.println(list);
		return SUCCESS;
	}
	public String getInstructMap() {
		return instructMap;
	}
	public void setInstructMap(String instructMap) {
		this.instructMap = instructMap;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setInventoryService(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}
}
