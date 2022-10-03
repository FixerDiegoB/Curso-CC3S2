La salida de esta pregunta, tal como se muestra en la imagen, es "qpzj".

![image](https://user-images.githubusercontent.com/57854488/193583483-01c4c42f-acb1-4422-91eb-8386c1b5cc3d.png)

Desde el método main, se imprime el método view de una nueva instancia de la clase Fennec. Esta instancia se realiza con el constructor de la línea 35, el cual recibe un entero. Dado que la clase Fennec se extiende de Fox y esta, a su vez, se extiende de Canine, se realiza una secuencia de llamados a los constructores:
- Se invoca al constructor de Fennec de la línea 35.
- Este invoca al constructor de Fox de la línea 28, pues ingresa una cadena como parámetro.
- Este invoca en la línea 29 a su otro constructor de Fox de la línea 24 y, por herencia, se invoca al constructor por defecto de Canine de la línea 8.

El retorno se hace en la secuencia inversa, por lo que cada uno añade al atributo logger una letra en ese orden (q - p - z - j). Esta cadena es la que se imprime al final.
