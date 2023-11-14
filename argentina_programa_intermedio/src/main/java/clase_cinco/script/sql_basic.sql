	
	// Acceder a la base
	mysql -u root -p 


	show databases; // mostrar base de datos

	create database arg_prog_int; // Crear base de datos con el nombre "arg_prog_int"


	use arg_prog_int; // Selecciona la base de datos 


	show tables; // Mostrar las tablas

	Materia materia = new Materia();
	materia.setId(1);
	materia.setNombre("Matematica");

	persistencia.guardar(materia); // "Desmaterializacion"

	persistencia.traerMateria(1); // Materializar el objeto materia	

	// Crear tabla materia
	CREATE TABLE materia(
	id INT auto_increment PRIMARY KEY,
	nombre varchar(255) NOT NULL UNIQUE
	);

	describe materia; // Ver en detalle la relacion

	INSERT INTO materia(nombre) VALUES('Matematica'); // Inserción de un registro en la tabla materia
	INSERT INTO materia(nombre) VALUES(NULL); // Da error por la restriccion de null

	SELECT * FROM materia; // Devuelve los registros de la tabla materia
	SELECT nombre as name FROM materia; // Select con Alias "AS" 

	UPDATE materia set nombre = 'Matemática' where nombre = 'Matematica'; // Actualizar Materia

	DELETE FROM materia where nombre = 'Matemática'; // Eliminar Materia

	TRUNCATE TABLE materia; // Elimina los datos de la tabla

	DROP TABLE materia; // Elimina la tabla

	CREATE TABLE alumno(
	id INT auto_increment PRIMARY KEY,
	nombre varchar(255) NOT NULL,
	apellido varchar(255) NOT NULL
	);

	CREATE TABLE direccion(
	id INT auto_increment PRIMARY KEY,
	direccion varchar(255),
	alumno_id int,
	FOREIGN KEY(alumno_id) REFERENCES alumno(id)
	);

	INSERT INTO alumno(nombre, apellido) values("Jose", "Perez");

	INSERT INTO direccion(direccion, alumno_id) VALUES("Gral. Paz 351", 1);

	SELECT a.nombre, a.apellido, d.direccion FROM alumno a, direccion d WHERE d.alumno_id = a.id





	

	



