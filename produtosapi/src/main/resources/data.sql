CREATE TABLE product (
    id VARCHAR(8) NOT NULL PRIMARY KEY,
    name VARCHAR(80) NOT NULL,
    description VARCHAR(255) DEFAULT('not description'),
    price DECIMAL(10,2),
    stock INT,
    remoto BOOLEAN NOT NULL DEFAULT FALSE
);


