package com.asd.demom.app.tests.repository;

import com.asd.demom.app.tests.entity.Tests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestsRepository extends JpaRepository<Tests, Long> {

    public List<Tests> findByTitle(String title);

    public List<Tests> findByTitleLike(String title);

    public List<Tests> findByContentLike(String title);

}
