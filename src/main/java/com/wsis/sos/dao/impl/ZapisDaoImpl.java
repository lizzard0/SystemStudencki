package com.wsis.sos.dao.impl;

import com.wsis.sos.dao.ZapisDao;
import com.wsis.sos.entity.Zapis;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class ZapisDaoImpl implements ZapisDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Zapis findById(Long id) {
        return entityManager.find(Zapis.class, id);
    }

    @Override
    public List<Zapis> findAll() {
        TypedQuery<Zapis> query = entityManager.createQuery(
            "SELECT z FROM Zapis z ORDER BY z.dataZapisu DESC", Zapis.class);
        return query.getResultList();
    }

    @Override
    public void save(Zapis zapis) {
        entityManager.persist(zapis);
    }

    @Override
    public void update(Zapis zapis) {
        entityManager.merge(zapis);
    }

    @Override
    public void delete(Long id) {
        Zapis zapis = findById(id);
        if (zapis != null) {
            entityManager.remove(zapis);
        }
    }

    @Override
    public List<Zapis> findByStudent(Long studentId) {
        TypedQuery<Zapis> query = entityManager.createQuery(
            "SELECT z FROM Zapis z WHERE z.studentId = :studentId ORDER BY z.rokAkademicki DESC, z.semestr DESC", 
            Zapis.class);
        query.setParameter("studentId", studentId);
        return query.getResultList();
    }

    @Override
    public List<Zapis> findByPrzedmiot(Long przedmiotId) {
        TypedQuery<Zapis> query = entityManager.createQuery(
            "SELECT z FROM Zapis z WHERE z.przedmiotId = :przedmiotId", 
            Zapis.class);
        query.setParameter("przedmiotId", przedmiotId);
        return query.getResultList();
    }

    @Override
    public List<Zapis> findByStudentAndSemestr(Long studentId, Integer semestr) {
        TypedQuery<Zapis> query = entityManager.createQuery(
            "SELECT z FROM Zapis z WHERE z.studentId = :studentId AND z.semestr = :semestr", 
            Zapis.class);
        query.setParameter("studentId", studentId);
        query.setParameter("semestr", semestr);
        return query.getResultList();
    }

    @Override
    public List<Zapis> findByRokAkademicki(String rokAkademicki) {
        TypedQuery<Zapis> query = entityManager.createQuery(
            "SELECT z FROM Zapis z WHERE z.rokAkademicki = :rokAkademicki", 
            Zapis.class);
        query.setParameter("rokAkademicki", rokAkademicki);
        return query.getResultList();
    }

    @Override
    public List<Zapis> findByStatus(String status) {
        TypedQuery<Zapis> query = entityManager.createQuery(
            "SELECT z FROM Zapis z WHERE z.status = :status", 
            Zapis.class);
        query.setParameter("status", status);
        return query.getResultList();
    }

    @Override
    public List<Zapis> findByStudentAndPrzedmiot(Long studentId, Long przedmiotId) {
        TypedQuery<Zapis> query = entityManager.createQuery(
            "SELECT z FROM Zapis z WHERE z.studentId = :studentId AND z.przedmiotId = :przedmiotId", 
            Zapis.class);
        query.setParameter("studentId", studentId);
        query.setParameter("przedmiotId", przedmiotId);
        return query.getResultList();
    }

    @Override
    public Integer countZapisyByPrzedmiot(Long przedmiotId) {
        TypedQuery<Long> query = entityManager.createQuery(
            "SELECT COUNT(z) FROM Zapis z WHERE z.przedmiotId = :przedmiotId AND z.status = 'ZAPISANY'", 
            Long.class);
        query.setParameter("przedmiotId", przedmiotId);
        return query.getSingleResult().intValue();
    }
}