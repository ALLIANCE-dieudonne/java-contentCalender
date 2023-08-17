package com.alliance.contentcalender.repository;

import com.alliance.contentcalender.model.Content;
import com.alliance.contentcalender.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    List<Content> findAllByTitleContains(String title);

    @Query("""
            SELECT * FROM Content where status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);

}
