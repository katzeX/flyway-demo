CREATE TABLE mentor(
     id_mentor int PRIMARY KEY,
     first_name varchar(25),
     last_name varchar(25))

CREATE TABLE intern(
    id_intern int PRIMARY KEY,
    first_name varchar(25),
    last_name varchar(25),
    mentor_id int FOREIGN KEY REFERENCES mentor(id_mentor))


