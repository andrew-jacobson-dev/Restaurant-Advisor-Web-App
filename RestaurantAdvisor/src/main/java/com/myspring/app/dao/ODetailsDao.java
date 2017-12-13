package com.myspring.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myspring.app.model.ODetails;

public class ODetailsDao {
	
	public ODetailsDao() {
		
	}
	
	public int insertOrder(List<ODetails> odetailsList) {
		SqlSession session = com.myspring.app.util.ConnectionFactory.getSqlSessionFactory().openSession();
		int result = 1;
		try {
			for(int i=0; i < odetailsList.size(); i++) {
				result = session.insert("com.mapper.OrderMapper.insertODetails",odetailsList.get(i));
			}
			session.commit();
		} finally {
			session.close();
		}
		return result;		
	}
}
