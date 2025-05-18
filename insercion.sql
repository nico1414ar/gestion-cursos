-- Insertar alumnos
INSERT INTO Alumno (nombre, apellido, dni, email, telefono) VALUES
('Juan', 'Pérez', '12345678', 'juan.perez@mail.com', '1112345678'),
('María', 'Gómez', '87654321', 'maria.gomez@mail.com', '1198765432');

-- Insertar cursos
INSERT INTO Curso (nombre, descripcion, duracion, fecha_inicio, cupo) VALUES
('Curso de Java', 'Introducción a Java', 40, '2025-06-01', 30),
('Taller de Diseño Web', 'HTML, CSS y JavaScript', 30, '2025-07-10', 25);

-- Insertar inscripciones
INSERT INTO Inscripcion (id_alumno, id_curso, fecha_inscripcion) VALUES
(1, 1, '2025-05-15'),
(2, 2, '2025-05-20');

-- Insertar asistencias
INSERT INTO Asistencia (id_inscripcion, fecha, estado) VALUES
(1, '2025-06-02', 'Presente'),
(1, '2025-06-03', 'Ausente'),
(2, '2025-07-11', 'Presente');

-- Insertar pagos
INSERT INTO Pago (id_alumno, monto, fecha_pago, metodo_pago) VALUES
(1, 1000.00, '2025-05-16', 'Tarjeta de crédito'),
(2, 800.00, '2025-05-21', 'Efectivo');

-- Insertar certificados
INSERT INTO Certificado (id_alumno, id_curso, fecha_emision) VALUES
(1, 1, '2025-07-01');
