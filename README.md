# examen_administrator
# Diego Andres Riveros Lopez

## El api tiene las siguientes funciones
### •	Crear estudiantes: El API permitirá agregar estudiantes proporcionando su información (nombre, edad, ciudad), la zona horaria será extraída del sistema.
### •	Generar un examen: Cuando se crea un estudiante, de inmediato, el API generará automáticamente un examen para él. Este examen constará de 5 preguntas al azar, con un peso de 20 puntos cada una para un total de 100.
###     o	Cada pregunta tendrá un título, opciones (si es de opción múltiple) y una respuesta correcta.
### •	Agregar preguntas: El API también permitirá agregar preguntas al banco de preguntas.
### •	Citación para presentación del examen: Después de generar el examen para el estudiante, el API devolverá indicando la fecha y hora según su zona horaria, para presentar el examen.
### •	Resolver y enviar respuestas: Una vez que el estudiante ha resuelto el examen, enviará sus respuestas al API para su evaluación. El API comparará las respuestas proporcionadas con las respuestas correctas almacenadas previamente en el banco de preguntas.
### •Calificación: Después de comparar las respuestas del estudiante con las respuestas correctas, el API calculará la calificación del examen y la devolverá al estudiante, de igual manera, se podrá consultar la calificación de cada estudiante por su documento de ### identificación.
## Tenga en cuenta lo siguiente
### •	La aplicación es 100% funcional
### •	Se debe realizar el backup en MYSQL de la base de datos.
### •	Para cada método, requiere diversos parámetros en el body y/o en la cabeza, se debe tener preguntas en el banco de preguntas para poder asignar el examen.
### •	El API corre en el puerto 1989
### •	Se adiciona dump de la BD con preguntas y tablas creadas, así mismo, una colección de postman con los métodos descritos, todo esto en la carpeta ANEXOS.
