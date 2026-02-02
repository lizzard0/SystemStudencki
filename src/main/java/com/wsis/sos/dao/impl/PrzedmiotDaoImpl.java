package com.wsis.sos.dao.impl;

import com.wsis.sos.dao.PrzedmiotDao;
import com.wsis.sos.entity.Przedmiot;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class PrzedmiotDaoImpl implements PrzedmiotDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Przedmiot findById(Long id) {
        return entityManager.find(Przedmiot.class, id);
    }

    @Override
    public List<Przedmiot> findAll() {
        TypedQuery<Przedmiot> query = entityManager.createQuery(
            "SELECT p FROM Przedmiot p ORDER BY p.nazwa", Przedmiot.class);
        return query.getResultList();
    }

    @Override
    public void save(Przedmiot przedmiot) {
        entityManager.persist(przedmiot);
    }

    @Override
    public void update(Przedmiot przedmiot) {
        entityManager.merge(przedmiot);
    }

    @Override
    public void delete(Long id) {
        Przedmiot przedmiot = findById(id);
        if (przedmiot != null) {
            entityManager.remove(przedmiot);
        }
    }

    @Override
    public List<Przedmiot> findByKod(String kod) {
        TypedQuery<Przedmiot> query = entityManager.createQuery(
            "SELECT p FROM Przedmiot p WHERE p.kod = :kod", Przedmiot.class);
        query.setParameter("kod", kod);
        return query.getResultList();
    }

    @Override
    public List<Przedmiot> findByNazwa(String nazwa) {
        TypedQuery<Przedmiot> query = entityManager.createQuery(
            "SELECT p FROM Przedmiot p WHERE LOWER(p.nazwa) LIKE LOWER(:nazwa)", 
            Przedmiot.class);
        query.setParameter("nazwa", "%" + nazwa + "%");
        return query.getResultList();
    }

    @Override
    public List<Przedmiot> findByProwadzacy(Long prowadzacyId) {
        TypedQuery<Przedmiot> query = entityManager.createQuery(
            "SELECT p FROM Przedmiot p WHERE p.prowadzacyId = :prowadzacyId AND p.aktywny = true", 
            Przedmiot.class);
        query.setParameter("prowadzacyId", prowadzacyId);
        return query.getResultList();
    }

    @Override
    public List<Przedmiot> findByKategoria(Long kategoriaId) {
        TypedQuery<Przedmiot> query = entityManager.createQuery(
            "SELECT p FROM Przedmiot p WHERE p.kategoriaId = :kategoriaId", 
            Przedmiot.class);
        query.setParameter("kategoriaId", kategoriaId);
        return query.getResultList();
    }

    @Override
    public List<Przedmiot> findActive() {
        TypedQuery<Przedmiot> query = entityManager.createQuery(
            "SELECT p FROM Przedmiot p WHERE p.aktywny = true ORDER BY p.nazwa", 
            Przedmiot.class);
        return query.getResultList();
    }

    @Override
    public List<Przedmiot> findByEctsRange(Integer minEcts, Integer maxEcts) {
        TypedQuery<Przedmiot> query = entityManager.createQuery(
            "SELECT p FROM Przedmiot p WHERE p.ects BETWEEN :minEcts AND :maxEcts", 
            Przedmiot.class);
        query.setParameter("minEcts", minEcts);
        query.setParameter("maxEcts", maxEcts);
        return query.getResultList();
    }
}