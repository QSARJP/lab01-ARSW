
# Compile and run instructions

## Para ejecutar CountThread: 
mvn exec:java -Dexec.mainClass="edu.escuelaing.arsw.lab01CaycedoOspina.threads.CountThreadMain"

## Para ejecutar PiDigits: 
mvn exec:java -Dexec.mainClass="edu.escuelaing.arsw.lab01CaycedoOspina.math.Main"

## Para ejecutar las pruebas: 
mvn test

# Part I - Introduction to Java Threads

Se creo tres instancias de threads los cuales tenian diferentes rangos de datos

![](img/1.png)

Los resultados de las 3 implementaciones es el sigueinte, con el metodo Start():

![](img/3.png)

Los resultados de las 3 implementaciones es el sigueinte, con el metodo Run():


![](img/4.png)


La salida cambia debido a que en el caso de metodo run en ningun momento s einicializan 
los threads dando asi la ejecucion de un metodo el cual contiene un ciclo hasta terminar 
su tarea. En cambio con Strat() al inicalizarce los threads cada uno tiene un tiempo 
determinado de ejecucion.


# Part II - BBP Formula Exercise

La paralelización se realizo mediante un thread el cual llamaba la funicion Pidigit.getDigit()
un numeor de veces dependiendo de cuantos threads se queria realizar. El metodo en cargado de realizar 
la particion se encuentra en la clase PiDigit como calcularThread el cual recibe como parametros el numero de thread,
el comienzo y los numeros que se van a definir.


# Part III - Performance Evaluation
Debido al tiempo de ejecucion del 1'000.000 se paso a realizar los sigueintes ejemplos con 100.000
## Single thread. 
![](img/single.png)
### Tiempo: 
2.1326164

## As many threads as processing cores. 
![](img/many.png)
### Tiempo: 
1.1383019

## So many threads as double processing cores. 
![](img/double.png)
### Tiempo: 
0.9916208

## 200 threads.
![](img/200.png)
### Tiempo: 
0.6210134

## 500 threads.
![](img/500.png)
### Tiempo: 
1.37616

1.

2.

3.




