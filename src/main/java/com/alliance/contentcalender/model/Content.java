package com.alliance.contentcalender.model;

import com.alliance.contentcalender.model.Status;
import com.alliance.contentcalender.model.Type;

import java.time.LocalDateTime;

public record Content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {

}
