package com.myspring.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myspring.app.model.Menu;
import com.myspring.app.util.ConnectionFactory;

public class MenuDao {

	public MenuDao() {
		
	}
	
	public List<Menu> getMenuItems(String restid) {
		SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession();
		List<Menu> r = new ArrayList<Menu>();
		try {
			r = session.selectList("com.mapper.MenuMapper.selectMenu",restid);
		} finally {
			session.close();
		}
		return r;
	}
}
