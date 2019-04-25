CREATE TABLE  IF NOT EXISTS CUSTOMER (
    id SERIAL primary key,
    first_name varchar(50),
    last_name varchar(50),
    email varchar(500)
);



CREATE TABLE  IF NOT EXISTS PURCHASES (
    ID SERIAL PRIMARY KEY,
    customer int,
    amount decimal,
    purchase_time TIMESTAMP WITH TIME ZONE
    );

