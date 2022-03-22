CREATE TABLE IF NOT EXISTS product
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(128) NOT NULL UNIQUE,
    description VARCHAR(20),
    price INTEGER
);
