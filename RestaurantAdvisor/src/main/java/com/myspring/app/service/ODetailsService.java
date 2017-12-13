package com.myspring.app.service;

import java.util.List;
import com.myspring.app.dao.ODetailsDao;
import com.myspring.app.model.ODetails;


public class ODetailsService {
	
	public ODetailsService() {
		
	}
	
	public int insertODetails(List<ODetails> odetailsList) {
		ODetailsDao od = new ODetailsDao();
		int i;
		i = od.insertOrder(odetailsList);
		return i;	
	}
		
}
