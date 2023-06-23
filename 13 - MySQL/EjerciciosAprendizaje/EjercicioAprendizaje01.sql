USE personal;

/*1 - Obtener los datos completos de los empleados.*/
SELECT * FROM empleados;

/*2 - Obtener los datos completos de los departamentos.*/
SELECT * FROM departamentos;

/*3 - Listar el nombre de los departamentos.*/
SELECT nombre_depto FROM departamentos;

/*4 - Obtener el nombre y salario de todos los empleados.*/
SELECT nombre, sal_emp FROM empleados;

/*5 - Listar todas las comisiones.*/
SELECT comision_emp FROM empleados;

/*6 - Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.*/
SELECT * FROM empleados WHERE cargo_emp LIKE 'secretaria';

/*7 - Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.*/
SELECT * FROM empleados WHERE cargo_emp LIKE 'vendedor' ORDER BY nombre ASC;

/*8 - Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.*/
SELECT nombre, cargo_emp, sal_emp FROM empleados ORDER BY sal_emp ASC;

/*9 - Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real”*/
SELECT nombre_jefe_depto FROM departamentos WHERE ciudad LIKE 'Ciudad Real';

/*10 - Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.*/
SELECT nombre AS Nombre, cargo_emp AS Cargo FROM empleados;

/*11 - Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.*/
SELECT nombre AS Nombre, sal_emp AS Salario, comision_emp AS Comiciones FROM empleados WHERE id_depto = 2000 ORDER BY comision_emp ASC;

/*12 - Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del empleado y el total a pagar, en orden alfabético.*/
SELECT nombre AS Nombre, (sal_emp + comision_emp + 500) AS Salario_Total FROM empleados WHERE id_depto = 3000 ORDER BY nombre ASC;

/*13 - Muestra los empleados cuyo nombre empiece con la letra J.*/
SELECT nombre AS Nombre FROM empleados WHERE nombre LIKE 'j%';

/*14 - Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.*/
SELECT nombre AS Nombre, sal_emp AS Salario, comision_emp AS Comisiones, (sal_emp + comision_emp) AS Salario_Total FROM empleados WHERE comision_emp > 1000;

/*15 - Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.*/
SELECT nombre AS Nombre, sal_emp AS Salario, comision_emp AS Comisiones, (sal_emp + comision_emp) AS Salario_Total FROM empleados WHERE comision_emp = 0;

/*16 - Obtener la lista de los empleados que ganan una comisión superior a su sueldo.*/
SELECT nombre AS Nombre, sal_emp AS Salario, comision_emp AS Comisiones, (sal_emp + comision_emp) AS Salario_Total FROM empleados WHERE comision_emp > sal_emp;

/*17 - Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.*/
SELECT nombre AS Nombre, sal_emp AS Salario, comision_emp AS Comisiones, (sal_emp + comision_emp) AS Salario_Total FROM empleados WHERE comision_emp <=(sal_emp*0.30);

/*18*/
/*19*/
/*20*/
/*21*/
/*22*/
/*23*/
/*24*/
/*25*/
/*26*/
/*27*/
/*28*/