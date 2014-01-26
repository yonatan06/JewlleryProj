package com.yoko.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.yoko.model.ImgDesc;

@Repository
public class ImgDescRepositoryImpl implements ImgDescRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	public void save(ImgDesc imgDesc) {
		em.persist(imgDesc);
		em.flush();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<ImgDesc> loadAll() {
		Query query = em.createQuery("Select i from ImgDesc i");
		
		List imgDescs = query.getResultList();
		
		return imgDescs;
	}

	
}
