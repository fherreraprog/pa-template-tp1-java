Carreras: Analista de Sistemas y Licenciatura en Sistemas
Asignatura: Programación de Algoritmos
Trabajo Práctico Nº 1
Tema: JAVA

# 1. Contestar las siguientes consignas referentes a las operaciones de casting.

Dadas las siguientes declaraciones de variables:

# int A, B, R1;

# double C, D, R2;

Dadas las siguientes asignaciones: A = 5;
B = 3;
C = 2.5;
D = 2.0;
Indicar que resultado tendrán las siguientes operaciones:
R1 = A / B;
R2 = A / C;
R2 = A * D;
R1 = A * (int) D;
R1 = (int) (C* D);
R1 = A * (int) D;
A++; A..........
B = A++; B............. A...............

# 2. Resolver el siguiente ejercicio de igual manera que el punto anterior.

Dadas las siguientes declaraciones de variables:

# int A, B, X;

# double C, D, Y;

Dadas las siguientes asignaciones:
A = 5;
B = 3;
C = 7.5;
D = 2.0;
a) Indicar el valor de X e Y que resultado tendrán las siguientes operaciones:
X = A / B

# X = (int) (A * D) / (int) (C / A)

## Y = A / B

# Y = (double) (A / B)

# Y = (double) A * D / (int) C

# Y = (double) A * D

# Y = (double) (A * D) / ( C * (int) D)

# Y = A * (int) D

# Y = (int) (A * (int) D)


Carreras: Analista de Sistemas y Licenciatura en Sistemas
Asignatura: Programación de Algoritmos
Trabajo Práctico Nº 1
Tema: JAVA
A continuación, se desarrollan ejercicios de los Trabajo Prácticos 2, 3 y 4 , los cuales deben ser convertidos
de pseudocódigos a código Java.
Tema: Algoritmo

# 3. Se tienen 3 variables A, B y C enteras. Escribir un algoritmo que intercambie entre si sus valores, para que

# queden finalmente de la siguiente forma:

- B y C toman el valor de A.
- A toma el valor original de C
Ejemplo:
Si A tiene el valor 1, B tiene el valor 2, y C tiene el valor 3, entonces debería quedar B con 1, C con
1 y A con 3.
Nota: sólo se debe utilizar una variable auxiliar como ayuda.
Tema: Selección

# 4. Dado tres números, escribir el mayor de ellos. Asumir que los tres números son distintos.

```
Análisis
Entrada/s: 3 números (entero)
Salida/s: número mayor de los 3 ingresados (entero)
Diseño – PROCESO: Ingresar 3 números enteros.
Comparar números buscando el mayor de los 3.
Mostrar el mayor de los 3 números enteros.
Algoritmo:
escribir “Ingrese 3 números enteros”
leer NRO1, NRO2, NRO
si (NRO1 > NRO2 & NRO1 > NRO3)
escribir “El mayor es : ”, NRO
sino
si (NRO2 > NRO1 & NRO2 > NRO3)
escribir “El mayor es :”, NRO
sino
escribir “El mayor es :”, NRO
```
# 5. Ingresar un día de la semana y si se trata de uno de los días de la cátedra resolución escribir “HOY TENGO

# RESOLUCION”. Identificando a los días de la siguiente manera: ‘L’ para Lunes, ‘M’ para Martes, ‘I’ para

# Miércoles, ‘J’ para Jueves, ‘V’ para Viernes, ‘S’ para Sábado y ‘D’ para Domingo. Se puede agregar el caso

# dónde la letra ingresada no sea alguna de las nombradas anteriormente.

Tema: Iteración

# 6. Leer tres números enteros dentro de las variables NUM1, NUM2 y NUM3 respectivamente y calcular e

# imprimir el producto y la suma de ellos. Repita la operación anterior, pero esta vez, para los tres valores utilizar

# una sola variable (NUM).

```
Análisis
Entrada/s: 3 números (entero)
Salida/s: producto y suma de los 3 números ingresados
```

Carreras: Analista de Sistemas y Licenciatura en Sistemas
Asignatura: Programación de Algoritmos
Trabajo Práctico Nº 1
Tema: JAVA
Diseño – PROCESO: - Ingresar 3 números enteros

- Calcular producto
- Calcular Suma
- Mostrar resultados
Algoritmo 1 :
leer NUM1, NUM2, NUM
PRODUCTO = NUM1 * NUM2 * NUM
SUMA = NUM1 + NUM2 + NUM
escribir “Suma de enteros: ”, SUMA
escribir “Producto de enteros” , PRODUCTO
Algoritmo 2 :
PRODUCTO = 1;
SUMA = 0;
CONT = 1;
mientras (CONT <= 3) {
leer NUM;
SUMA = SUMA + NUM;
PRODUCTO = PRODUCTO * NUM;
CONT = CONT + 1;
}
escribir “Suma de enteros: ”, SUMA;
escribir “Producto de enteros” , PRODUCTO;


