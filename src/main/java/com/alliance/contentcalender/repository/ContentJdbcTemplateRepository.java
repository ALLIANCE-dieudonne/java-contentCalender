package com.alliance.contentcalender.repository;

import com.alliance.contentcalender.model.Content;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContentJdbcTemplateRepository {
    public final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static Object mapRow(ResultSet rs, int rowNum) throws SQLException{
        return new Content(rs.getInt("id"),
                rs.getString("title"),
                rs.getString("desc"),
                rs.getString("status"),
                rs.getString("content_type"),
                rs.getTimestamp("date_created").toString(),
                rs.getTimestamp("date_updated"),
                rs.getString("url")
                );


    }

}
