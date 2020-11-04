package com.excersise.entities.repository;

import com.excersise.entities.model.Delivery;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DeliveryRepository {

  @PersistenceContext
  EntityManager entityManager;

  public void persist(Delivery delivery) {
    entityManager.persist(delivery);
  }

  public List<Delivery> findDeliveriesByName(String name){
    TypedQuery<Delivery> query = entityManager.createNamedQuery("Delivery.findDeliveryByName", Delivery.class);
    query.setParameter("name", name);
    return query.getResultList();
  }

  public Delivery find(Long id) {
    return entityManager.find(Delivery.class, id);
  }

  public Delivery merge(Delivery delivery){
    return entityManager.merge(delivery);
  }

  public void delete(Long id) {
    Delivery delivery = entityManager.find(Delivery.class, id);
    entityManager.remove(delivery);
  }


}
