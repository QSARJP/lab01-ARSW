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


