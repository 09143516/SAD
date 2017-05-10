package cn.liyi.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.liyi.entity.Guitar;

public class GuitarDao extends HibernateDaoSupport{

	public Guitar findByType(double price) {
		String hql = "from Guitar where price = ?";
		List list = this.getHibernateTemplate().find(hql, price);
		if(list!=null&&list.size()>0){
			return (Guitar)list.get(0);
		}
		return null;
	}

	public List<Guitar> findAll(Guitar guitar) {
		String hql = "from Guitar where price=? and builder=? and type=?";
		Object[] value = {guitar.getPrice(),guitar.getBuilder(),guitar.getType()};
		List list = this.getHibernateTemplate().find(hql, value);
		if(list!=null&&list.size()>0){
			return list;
		}
		return null;
	}

}
