CREATE TABLE departamentos (id_dept INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(255) NOT NULL, localidad VARCHAR(255), PRIMARY KEY (id_dept));

CREATE TABLE empleados (id_emp INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(255) NOT NULL, fecha DATE NOT NULL, sueldo DOUBLE NOT NULL, id_dept INT, PRIMARY KEY (id_emp));

ALTER TABLE empleados ADD CONSTRAINT fk_empleados FOREIGN KEY (id_dept) REFERENCES departamentos (id_dept);