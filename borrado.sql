-- Borrar una inscripción específica 
DELETE FROM Inscripcion WHERE id_inscripcion = 1;

-- Borrar un alumno (esto eliminará todas sus inscripciones, asistencias, pagos y certificados)
DELETE FROM Alumno WHERE id_alumno = 2;

-- Borrar un curso (elimina inscripciones, asistencias, certificados asociados)
DELETE FROM Curso WHERE id_curso = 2;
