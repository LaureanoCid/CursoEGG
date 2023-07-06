USE nba;
SELECT * FROM equipos;
SELECT * FROM estadisticas;
SELECT * FROM jugadores;
SELECT * FROM partidos;

-- CANDADO A
-- Posicion (2):
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo. 
SELECT COUNT(*) FROM estadisticas WHERE asistencias_por_partido = (SELECT MAX(asistencias_por_partido) FROM estadisticas);

-- Clave (14043):
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea centro o esté comprendida en otras posiciones.
SELECT SUM(peso) FROM jugadores 
WHERE posicion LIKE '%C%' AND nombre_equipo IN (SELECT nombre FROM equipos WHERE conferencia LIKE 'East');

-- CANDADO B
-- Posicion (3):
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de jugadores que tiene el equipo Heat.
SELECT COUNT(*) FROM estadisticas WHERE asistencias_por_partido > (SELECT COUNT(*) FROM jugadores WHERE nombre_equipo LIKE 'Heat');

-- Clave (3480):
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
SELECT COUNT(*) FROM partidos WHERE temporada LIKE '%99%';

-- CANDADO C
-- Posicion (1):
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a 195, y a eso le vamos a sumar 0.9945.
SELECT (COUNT(*)/(SELECT COUNT(*) FROM jugadores WHERE peso >= 195)+0.9945) FROM jugadores INNER JOIN equipos ON jugadores.nombre_equipo = equipos.nombre
WHERE procedencia LIKE 'Michigan' AND nombre_equipo IN (SELECT nombre FROM equipos WHERE conferencia LIKE 'WEST');

-- Clave (631):
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
-- tapones por partido. Además, este resultado debe ser, donde la división sea central.
SELECT FLOOR(AVG(estadisticas.puntos_por_partido)+COUNT(estadisticas.asistencias_por_partido)+SUM(estadisticas.tapones_por_partido))
FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo
INNER JOIN equipos ON jugadores.nombre_equipo = equipos.nombre
WHERE division LIKE 'Central';

-- CANDADO D
-- Posicion (4):
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado
SELECT ROUND(tapones_por_partido) FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo
WHERE estadisticas.jugador = (SELECT codigo FROM jugadores WHERE nombre LIKE 'Corey Maggette') AND estadisticas.temporada LIKE '00/01'; 

-- Clave (191):
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido de todos los jugadores de procedencia argentina.
SELECT FLOOR(SUM(estadisticas.puntos_por_partido)) FROM estadisticas INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo 
WHERE jugadores.procedencia LIKE 'Argentina';