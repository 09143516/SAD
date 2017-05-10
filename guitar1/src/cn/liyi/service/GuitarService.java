package cn.liyi.service;

import java.util.List;

import cn.liyi.dao.GuitarDao;
import cn.liyi.entity.Guitar;

public class GuitarService {

	GuitarDao guitarDao;
	public void setGuitarDao(GuitarDao guitarDao) {
		this.guitarDao = guitarDao;
	}
	public Guitar findByType(double price) {
		return guitarDao.findByType(price);
	}
	public List<Guitar> findAll(Guitar guitar) {
		return guitarDao.findAll(guitar);
	}
}
