## Desafío 3 - Generador de Enteros Aleatorios en Java

Este programa en Java genera una secuencia de números enteros aleatorios entre 0 y 10. Cada número generado se muestra en pantalla junto con un mensaje que indica si es par o impar. Además, el programa va acumulando la suma de los valores generados y detiene el procesamiento cuando la suma supera el valor 25. Al finalizar, se muestra en pantalla la suma total calculada.

### Características principales

- Generación de números aleatorios entre 0 y 10.
- Indicación en pantalla de si cada número es par o impar.
- Acumulación de la suma de los valores generados.
- Finalización automática cuando la suma supera 25.
- Visualización de la suma total al terminar.

### Ejemplo de salida

```
Número generado: 2 - Es par
Número generado: 7 - No es par
Número generado: 5 - No es par
Número generado: 8 - Es par
La suma total calculada es: 27
```

### Fundamento

La solución utiliza la clase `Random` de Java para la generación de números aleatorios y un ciclo `while` para controlar el flujo del programa. El operador `%` permite determinar la paridad de cada número generado. Toda la lógica garantiza que se cumplan los requisitos especificados en el desafío.

### Requerimientos


```
JDK
Apache NetBeans
```
