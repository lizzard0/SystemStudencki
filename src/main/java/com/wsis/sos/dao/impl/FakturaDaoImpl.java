package com.wsis.sos.dao.impl;

import com.wsis.sos.dao.FakturaDao;
import com.wsis.sos.entity.Faktura;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class FakturaDaoImpl implements FakturaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Faktura findById(Long id) {
        return entityManager.find(Faktura.class, id);
    }

    @Override
    public List<Faktura> findAll() {
        TypedQuery<Faktura> query = entityManager.createQuery(
            "SELECT f FROM Faktura f ORDER BY f.dataWystawienia DESC", Faktura.class);
        return query.getResultList();
    }

    @Override
    public void save(Faktura faktura) {
        entityManager.persist(faktura);
    }

    @Override
    public void update(Faktura faktura) {
        entityManager.merge(faktura);
    }

    @Override
    public void delete(Long id) {
        Faktura faktura = findById(id);
        if (faktura != null) {
            entityManager.remove(faktura);
        }
    }

    @Override
    public List<Faktura> findByKonto(Long kontoId) {
        TypedQuery<Faktura> query = entityManager.createQuery(
            "SELECT f FROM Faktura f WHERE f.kontoId = :kontoId ORDER BY f.terminPlatnosci", 
            Faktura.class);
        query.setParameter("kontoId", kontoId);
        return query.getResultList();
    }

    @Override
    public List<Faktura> findByNumerFaktury(String numerFaktury) {
        TypedQuery<Faktura> query = entityManager.createQuery(
            "SELECT f FROM Faktura f WHERE f.numerFaktury = :numerFaktury", 
            Faktura.class);
        query.setParameter("numerFaktury", numerFaktury);
        return query.getResultList();
    }

    @Override
    public List<Faktura> findByStatus(String status) {
        TypedQuery<Faktura> query = entityManager.createQuery(
            "SELECT f FROM Faktura f WHERE f.status = :status", 
            Faktura.class);
        query.setParameter("status", status);
        return query.getResultList();
    }

    @Override
    public List<Faktura> findByTerminPlatnosciBefore(Date date) {
        TypedQuery<Faktura> query = entityManager.createQuery(
            "SELECT f FROM Faktura f WHERE f.terminPlatnosci < :date AND f.status != 'OPLACONA'", 
            Faktura.class);
        query.setParameter("date", date);
        return query.getResultList();
    }

    @Override
    public List<Faktura> findZalegle() {
        Date today = new Date();
        return findByTerminPlatnosciBefore(today);
    }

    @Override
    public List<Faktura> findByKwotaGreaterThan(Float minKwota) {
        TypedQuery<Faktura> query = entityManager.createQuery(
            "SELECT f FROM Faktura f WHERE f.kwota > :minKwota", 
            Faktura.class);
        query.setParameter("minKwota", minKwota);
        return query.getResultList();
    }

    @Override
    public Float sumaFakturByKonto(Long kontoId) {
        TypedQuery<Float> query = entityManager.createQuery(
            "SELECT SUM(f.kwota) FROM Faktura f WHERE f.kontoId = :kontoId", 
            Float.class);
        query.setParameter("kontoId", kontoId);
        Float result = query.getSingleResult();
        return result != null ? result : 0.0f;
    }
}