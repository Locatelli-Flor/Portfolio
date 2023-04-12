#Prueba diagnóstica Algoritmos y Estructuras de Datos: UT0_TA1

# 1) a) Función promedioDeHoras: devuelve un vector HORAS[] que contenga el promedio de las temperaturas de la semana a
# cada una de las horas del día.

Temp = [[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23],
[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23],
[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23],
[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23],
[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23],
[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23],
[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23]]

Horas = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]

def promedioDeHoras():
    for i in Temp:
        for j in range(23):
            Horas[j] += i[j]

    for i in range(23):
        Horas[i] = Horas[i] / 7

    return Horas

print(promedioDeHoras())

# 1) b) Función promedioDeDías: devuelve un vector DIAS [] que contenga el promedio de las temperaturas para cada uno de
# los días de la semana.

Dias = [0,0,0,0,0,0,0]

def promedioDeDias():
    contador = 0

    for i in Temp:
        for j in i:
            Dias[contador] += j

        Dias[contador] = Dias[contador] / 24
        contador += 1

    return Dias

print(promedioDeDias())

# 1) c) Función hayNegativos: devuelve el valor verdadero si hay alguna temperatura, de todas las registradas, que sea menor
# que cero, y falso en caso contrario.

def hayNegativos():
    for i in Temp:
        for j in i:
            if j < 0:
                return True
            
    return False

print(hayNegativos())

# 2) a) Expresa en notación simbólica matemática la función indicada: 
# x = 0
# for i in range(1, n+1):
# x += i

# La función describe la suma de Gauss, la sumatoria de i = 1 hasta n de i

# 2) b) Puede ser sustituido por uno equivalente usando la sentencia de control de repetición “while”. De las siguientes
# sentencias presentadas, elije las que correspondan y ubícalas en la secuencia correcta.

"""
Sentencias desordenadas y sin elección: Versión Python
• x += i
• x = i + x
• x = 0
• }
• i = i + 1;
• while x <= n:
• {
• i = 0
• i = 1 + i
• while i <= n:
• i =+ i
• while i >= n:
"""

# Sentencias ordenadas: Python

"""
x = 0
i = 0

while i <= n:
    x += i
    i = i + 1;
"""

"""
Sentencias desordenadas y sin elección: Versión C#
• x = x + i;
• }
• i = i + 1;
• while (x <= n)
• {
• x = 0;
• }
• while (i++)
• i =+ i
• x =+ 1
• while (i = 1)
"""

# Sentencias ordenadas: C#
"""
x = 0;

while(x <= n)
{
    x = x + i;
    i = i + 1;
}
"""

# 2) c) ¿qué otras construcciones alternativas pueden ser utilizadas para resolver el mismo problema, en iguales condiciones?

# En C# se puede implementar con un do while cambiando la condición de iteración.

# 2) d) Si en la función anterior se conoce el valor de n=1000 ¿qué valor de x resultará?

# Si n vale 1000, entonces aplicando la suma de Gauss el resultado tiene que ser 1000 x 1001 / 2, es decir 500500

# Para saber si es correcto aplicamos el algoritmo cambiando la n por 1000 y comprobamos el resultado

x = 0
for i in range(1, 1000+1):
    x += i

print(x)
