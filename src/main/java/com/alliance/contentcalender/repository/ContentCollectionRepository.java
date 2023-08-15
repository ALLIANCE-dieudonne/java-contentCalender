package com.alliance.contentcalender.repository;

import com.alliance.contentcalender.model.Content;
import com.alliance.contentcalender.model.Status;
import com.alliance.contentcalender.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    public final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {

    }


    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void add() {
        Content c = new Content(1, "my first title", "this is it", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), null, "");
        content.add(c);
    }

}
