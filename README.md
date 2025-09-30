# 📌 Aproximación de π con el Método de Montecarlo

Este proyecto implementa el método de Montecarlo para aproximar el valor de π en dos versiones:

1. **Versión Secuencial (`MonteCarlo.java`)**
2. **Versión Paralela con Hilos (`MonteCarloHilos.java`)**

---

## 🔹 Descripción del Método
El método de Montecarlo se basa en generar puntos aleatorios dentro de un cuadrado de lado 1 y contar cuántos caen dentro de un círculo de radio 1 inscrito en dicho cuadrado.  
La proporción de puntos dentro del círculo con respecto al total se utiliza para aproximar el valor de π:

\[
\pi \approx 4 \times \frac{puntos\_en\_circulo}{puntos\_totales}
\]

---

## 🔹 Resultados de Ejecución

### Ejemplo con **1,000,000** muestras:

| Versión      | Tiempo (ms) | Puntos dentro | Aproximación de π | Error |
|--------------|-------------|---------------|-------------------|-------|
| Secuencial   | 46 ms       | ~785,000      | 3.1417            | 0.0001 |
| Paralelo (2 hilos) | 31 ms | ~785,000      | 3.1416            | 0.0000 |

---

## 🔹 Métricas de Rendimiento

- **Speedup (S):**
\[
S = \frac{T_{secuencial}}{T_{paralelo}} = \frac{46}{31} \approx 1.48
\]  
➡️ La versión con hilos es **1.48 veces más rápida**.

- **Eficiencia (E):**
\[
E = \frac{S}{N} \times 100 = \frac{1.48}{2} \times 100 \approx 74.2\%
\]  
➡️ Se obtiene un **74.2 % de eficiencia** con 2 hilos.

- **Overhead (O):**
\[
O = (N \times T_{paralelo}) - T_{secuencial} = (2 \times 31) - 46 = 16\ ms
\]  
➡️ El sistema incurre en **16 ms de gestión de hilos y sincronización**.

---

## 🔹 Conclusiones

- La paralelización mejora el rendimiento respecto a la versión secuencial.  
- El **speedup no es lineal** debido al overhead que introducen la creación y sincronización de hilos.  
- La **eficiencia del 74 %** es un resultado positivo para 2 procesadores, aunque no se aprovecha al 100 %.  
- Aumentar el número de hilos puede **no siempre mejorar el tiempo total**, ya que el overhead puede crecer más rápido que la ganancia.

---

## 🚀 Ejecución

Compilar y ejecutar versión secuencial:

```bash
javac MonteCarlo.java
java MonteCarlo
