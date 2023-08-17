CREATE TABLE IF NOT EXISTS Content(
        id INTEGER AUTO_INCREMENT,
        title varchar(300) NOT NULL,
        desc text,
        status VARCHAR(28) NOT NULL,
        content_type VARCHAR(58) NOT NULL,
        date_created TIMESTAMP NOT NULL,
        date_updated TIMESTAMP,
        url VARCHAR(25),
        primary key (id)
 );

-- INSERT INTO Content(title,desc,status,content_type,date_created)
-- VALUES('this is the title','this is funny','IDEA','ARTICLE',CURRENT_TIMESTAMP);