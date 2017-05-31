package MysqlDao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import Dao.InventoryDao;
import Entity.Instruct;



public class InventoryDaoImpl extends HibernateDaoSupport implements InventoryDao{
	private List<Instruct> instructs;

	@Override
	public List<Instruct> findAll() {
		System.out.println("mysql");
		List<Instruct> list=(List<Instruct>)this.getHibernateTemplate().find("from Instruct instruct");
		return list;
	}

	@Override
	public void add(Instruct instruct) {
		this.getHibernateTemplate().save(instruct);		
	}
	
}
