package ServiceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import Dao.InventoryDao;
import Entity.Instruct;
import Entity.InstructSpec;
import Entity.Inventory;
import Service.InventoryService;
@Transactional
public class InventoryServiceImpl implements InventoryService{
	private InventoryDao inventoryDao;
	@Override
	public void add(String serialNumber, Double price, Map properties) {
		InstructSpec instructSpec=new InstructSpec(properties);
		Instruct instruct=new Instruct(serialNumber, price, instructSpec);
		Inventory inventory=new Inventory();		
		inventory.addInstruct(instruct);
		inventoryDao.add(instruct);
	}
	@Override
	public List<Instruct> search(Map properties) {
		InstructSpec instructSpec=new InstructSpec(properties);
		List<Instruct> list=inventoryDao.findAll();
		Inventory inventory=new Inventory(list);
		List<Instruct> instructs=inventory.serach(instructSpec);
		return instructs;
	}
	public void setInventoryDao(InventoryDao inventoryDao) {
		this.inventoryDao = inventoryDao;
	}	
}
