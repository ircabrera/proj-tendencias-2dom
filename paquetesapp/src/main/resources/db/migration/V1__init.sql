CREATE TABLE IF NOT EXISTS  cliente(
  id serial,
  cedula VARCHAR(10) NOT NULL,
  nombre VARCHAR(45) NULL,
  apellido VARCHAR(45) NULL,
  celular VARCHAR(10) NULL,
  PRIMARY KEY (id)
  );