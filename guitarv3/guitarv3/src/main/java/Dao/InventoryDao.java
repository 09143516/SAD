package Dao;

import java.util.List;
import java.util.Map;

import Entity.Instruct;
import Entity.InstructSpec;

public interface InventoryDao {
	public List<Instruct> findAll();
	public void add(Instruct instruct);
}
