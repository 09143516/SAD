package SqliteDao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import Dao.InventoryDao;
import Entity.Instruct;



public class InventoryDaoImpl extends HibernateDaoSupport implements InventoryDao{
	private List<Instruct> instructs;

	@Override
	public List<Instruct> findAll() {
		List<Instruct> list=(List<Instruct>)this.getHibernateTemplate().find("from Instruct instruct");
		System.out.println(list);
		return list;		
	}

	@Override
	public void add(Instruct instruct) {
		this.getHibernateTemplate().save(instruct);		
	}
	
}
