# Explorador de Archivos Concurrente (E/S e Hilos)

Trabajo práctico para la materia **Taller de Programación III** del Instituto Superior Politécnico. 

El objetivo de este proyecto es implementar un programa en Java que realice la búsqueda de un archivo específico navegando por los directorios del sistema de forma concurrente, combinando el manejo de Entrada/Salida (E/S) con múltiples hilos de ejecución (Threads).

## 📋 Requisitos de la Consigna

De acuerdo a lo planteado en clase, el programa debe procesar los siguientes parámetros:

* **Ruta de inicio (Entrada):** Directorio raíz `/` (explorando también todos sus subdirectorios).
* **Archivo objetivo:** `hola.txt`.
* **Límite de procesamiento:** 10 hilos de ejecución concurrentes.
* **Salida esperada:** Impresión por consola de la ruta absoluta de cada coincidencia encontrada (ejemplo: `/home/user/documentos/hola.txt`).

## 📂 Estructura del Proyecto

* `src/`: Contiene el código fuente en Java (lógica de búsqueda, gestor de hilos y la clase directora).
* `entorno-prueba/`: Estructura de carpetas de prueba (mock) para testear el algoritmo localmente sin necesidad de recorrer el disco duro completo.

## 🛠️ Tecnologías y Entorno
* Java (JDK 17)
* Conceptos aplicados: Multithreading, concurrencia, y manejo de sistemas de archivos (`java.io` / `java.nio`).