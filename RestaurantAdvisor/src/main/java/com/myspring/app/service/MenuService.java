package com.myspring.app.service;

import java.util.ArrayList;
import java.util.List;

import com.myspring.app.dao.MenuDao;
import com.myspring.app.model.Menu;

public class MenuService {

	public MenuService() {
		
	}
	
	public List<Menu> getMenuItems(String restid){
		List<Menu> menuItems = new ArrayList<Menu>();
		MenuDao menuDao = new MenuDao();
		menuItems = menuDao.getMenuItems(restid);
		return menuItems;
	}
}
