package com.wsis.sos.dao.impl;

import com.wsis.sos.dao.StudentDao;
import com.wsis.sos.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student findById(Long id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery(
            "SELECT s FROM Student s ORDER BY s.nazwisko, s.imie", Student.class);
        return query.getResultList();
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    public void delete(Long id) {
        Student student = findById(id);
        if (student != null) {
            entityManager.remove(student);
        }
    }

    @Override
    public Student findByAlbumNumber(String numerAlbumu) {
        try {
            TypedQuery<Student> query = entityManager.createQuery(
                "SELECT s FROM Student s WHERE s.numerAlbumu = :numerAlbumu", Student.class);
            query.setParameter("numerAlbumu", numerAlbumu);
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Student findByPesel(String pesel) {
        try {
            TypedQuery<Student> query = entityManager.createQuery(
                "SELECT s FROM Student s WHERE s.pesel = :pesel", Student.class);
            query.setParameter("pesel", pesel);
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Student findByEmail(String emailUczelniany) {
        try {
            TypedQuery<Student> query = entityManager.createQuery(
                "SELECT s FROM Student s WHERE s.emailUczelniany = :email", Student.class);
            query.setParameter("email", emailUczelniany);
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Student> findByKierunek(Long kierunekId) {
        TypedQuery<Student> query = entityManager.createQuery(
            "SELECT s FROM Student s WHERE s.kierunekId = :kierunekId AND s.aktywny = true", 
            Student.class);
        query.setParameter("kierunekId", kierunekId);
        return query.getResultList();
    }

    @Override
    public List<Student> findByActive(Boolean aktywny) {
        TypedQuery<Student> query = entityManager.createQuery(
            "SELECT s FROM Student s WHERE s.aktywny = :aktywny", Student.class);
        query.setParameter("aktywny", aktywny);
        return query.getResultList();
    }

    @Override
    public List<Student> findByName(String imie, String nazwisko) {
        TypedQuery<Student> query = entityManager.createQuery(
            "SELECT s FROM Student s WHERE s.imie LIKE :imie AND s.nazwisko LIKE :nazwisko", 
            Student.class);
        query.setParameter("imie", "%" + imie + "%");
        query.setParameter("nazwisko", "%" + nazwisko + "%");
        return query.getResultList();
    }
}