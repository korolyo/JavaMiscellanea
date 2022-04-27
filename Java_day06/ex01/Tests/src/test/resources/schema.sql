DROP SCHEMA PUBLIC CASCADE;
CREATE TABLE if not exists product (
    id      INT NOT NULL ,
    name    VARCHAR(130),
    price   INT
);
