package Service;

import java.util.List;
import java.util.Map;

import Entity.Instruct;

public interface InventoryService {
	public void add(String serialNumber,Double price,Map properties);
	public List<Instruct> search(Map properties);
}
