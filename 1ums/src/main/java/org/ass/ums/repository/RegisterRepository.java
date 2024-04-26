package org.ass.ums.repository;

import java.util.List;

import org.ass.ums.entity.RegistorEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;


@Repository
public class RegisterRepository
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveUser(RegistorEntity registerEntity) {
		
		try {
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registerEntity);
			transaction.commit();
			
		}catch (Exception e) {
			
		}
	}
	
	public List<RegistorEntity> findAllUsers() {
		
		try {
			
			String hqlQuery="from RegistorEntity";
			Session session = sessionFactory.openSession();
			
		Query query=session.createQuery(hqlQuery);
			return query.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	  //return Collection.EMPTY_LIST;
		
		
		
	}

}
