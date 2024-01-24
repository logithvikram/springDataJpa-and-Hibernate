package com.example.spring_jpa.Repo;

import com.example.spring_jpa.model.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
@Modifying
@Transactional
@Query("update Author a set a.age= :age where  a.id = :id")
int updateAuthor(int age, int id);

    @Modifying
    @Transactional
    @Query("update Author a set a.age= :age")
    void updateAllAuthorsAge(int age);
}
