
CREATE TABLE Users (
  username varchar(20) NOT NULL,
  password varchar(20),
  role varchar(20),
  PRIMARY KEY (username) 
) ;
INSERT INTO "Users" ("username", "password", "role") VALUES('Sally', '1' 'Admin');
INSERT INTO "Users" ("username", "password", "role") VALUES('Bob', '1' 'Driver')
INSERT INTO "Users" ("username", "password", "role") VALUES('John', '1' 'customer')

