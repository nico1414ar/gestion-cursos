-- Borrar una inscripción específica (esto eliminará también asistencias por FK con ON DELETE CASCADE)
DELETE FROM Inscripcion WHERE id_inscripcion = 1;

-- Borrar un alumno (esto eliminará todas sus inscripciones, asistencias, pagos y certificados)
DELETE FROM Alumno WHERE id_alumno = 2;

-- Borrar un curso (elimina inscripciones, asistencias, certificados asociados)
DELETE FROM Curso WHERE id_curso = 2;
