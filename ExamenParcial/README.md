# Examen Parcial

- Pregunta 1

1. ¿Cuál es el resultado de la siguiente clase? (Adjunto en clase Panda, Pregunta 1)

El resultado se muestra en consola, como  se adjunta en la imagen. En el método main, se instancia la clase Panda en 'p1' y se le asigna 1 a su variable 'age'. Luego, se realiza un llamado al método check en el cual se analiza si la edad es menor a 5 y se entrega 'match' debido a que cumple dicha condición.\
![image](https://user-images.githubusercontent.com/57854488/201108412-047ce103-3179-4ba8-aad5-e3c927d53fc4.png)

2. ¿Cuál es el resultado del siguiente código?

El código no genera resultado, puesto que exite un error. Como se muestra en la imagen, en la línea 9, en el primer parámetro al llamado de 'check', se usa una exprensión lambda para asignar un climb, mas al no especificar el tipo de datos de 'h', el compilador lo asume como entero, el cual no presenta el método 'append()'.\
![image](https://user-images.githubusercontent.com/57854488/201116527-232050d9-1948-409a-970a-111986511b72.png)

3. ¿Qué lambda puede reemplazar la clase Secret1 para devolver el mismo valor?

Se implementa un main para probar la función lambda creada y se comprueba que tenga el mismo resultado.\
![image](https://user-images.githubusercontent.com/57854488/201560902-4ff1fc02-e966-49f4-b73b-7284be9a21e4.png)\
![image](https://user-images.githubusercontent.com/57854488/201561147-1cbf1cfe-bcdc-4d34-ab08-12de6b41d2bc.png)

4. Completa sin causar un error de compilación

Se añadió una iteración para mostrar el resultado final de chars, dado que el código original (líneas 6 a 9) no mostraban ningún error en la compilación. Asimismo, se incluyó un caso de prueba en el método main para verificar que se haya realizado la impresión. En la primera imagen, se muestran las modificaciones realizadas.\
![image](https://user-images.githubusercontent.com/57854488/201116592-6b5f60f6-9398-48a0-af13-03ca408d34b3.png)\
Mientras que en esta segunda imagen, se muestra la salida esperada en la consola.\
![image](https://user-images.githubusercontent.com/57854488/201113052-a0d7dd35-f8f2-4541-8eba-9e1b392cd314.png)

5. ¿Qué puedes decir del siguiente código?

Las líneas 10 y 11 (A y B) se ejecutan cuando la variable iterada 'i' es par, mientras que las líneas 14 y 15 (C y D), cuando 'i' es impar.\
![image](https://user-images.githubusercontent.com/57854488/201116692-12035259-9c12-48a9-bd81-079d61c67e30.png)\
Dado que en la iteración, 'i' se evalúan 3 valores (0, 1 y 2), para los valores pares (0 y 2), la instancia 'supplier' se le asigna una expresión lambda que retorna 'length' (que equivale a 3) y se retorna este valor. Por otro lado, para el valor impar (1), la instancia recibe el valor de 'i' a través de 'j' y retorna dicho valor en la salida a la consola. Por lo tanto, se genera la salida mostrada en la imagen.\
![image](https://user-images.githubusercontent.com/57854488/201114441-0a70ccb1-4875-4bd0-94a1-d8e83f1a72fd.png)

6. Inserta código sin causar un error de compilación

Análogamente al inciso 4, el programa original no muestra ningún error en la compilación. Sin embargo, dado que se pide la inserción de código entre las líneas 7 y 11, se incluye una impresión de la lista de caracteres original (previo al borrado de elementos). Asimismo, la impresión del resultado final se añade al método main, tal como se muestra en la imagen adjunta. \
![image](https://user-images.githubusercontent.com/57854488/201116314-f9adc169-26e0-447c-b0c4-3cc213248610.png)\
Se observa el resultado final en la segunda imagen.\
![image](https://user-images.githubusercontent.com/57854488/201116347-0f93953c-3f43-4f42-9d2a-beda0b410cc8.png)

• Pregunta 2

1. Ejecuta el programa y presenta los resultados y explica qué sucede.
Toda la ejecución del programa se realiza en el método main de la clase Airport (paquete Anterior). Primero, en las líneas 6 a 10, se instancia 2 variables de tipo Flight, correspondientes a vuelo económico y vuelo de negocios, y 2 variables de tipo Passenger, de los cuales uno es VIP y el otro no.\
![image](https://user-images.githubusercontent.com/57854488/201123315-cef79a5e-9bb2-4695-bcc0-853c93431314.png)\
Luego, de las líneas 12 a 15, se realizan llamados a los métodos de Flight (añadir y remover pasajeros). Según los diagramas de decisión, se esperan los siguientes resultados:
    * Línea 12: Se añade a 'cesar' a la lista de pasajeros de 'businessFlight', dado que es cliente VIP.
    * Línea 13: No se remueve a 'cesar' de la lista de pasajeros de 'businessFlight', dado que es cliente VIP.
    * Línea 14: No se añade a 'jessica' a la lista de pasajeros de 'businessFlight', ya que no es cliente VIP.
    * Línea 15: Se añade a 'jessica' a la lista de pasajeros de 'economyFlight, ya que no existen restricciones para este vuelo.\
![image](https://user-images.githubusercontent.com/57854488/201124218-277269ed-8bf3-4701-b562-96def64cfe5a.png)\
Asimismo, las líneas 17 a 24 se utilizan para imprimir los resultados en la consola de cada pasajero perteneciente a la lista de pasajeros de cada vuelo.\
![image](https://user-images.githubusercontent.com/57854488/201124485-c8791110-ca0d-4940-99d7-4a9083c06b5c.png)\
Por último, se muestra el resultado en la última imagen.\
![image](https://user-images.githubusercontent.com/57854488/201124593-ef4f5fa0-ab19-4aa7-97c7-e441b331ea24.png)

2. Si ejecutamos las pruebas con cobertura desde IntelliJ IDEA, ¿cuales son los resultados que se muestran?, ¿por qué crees que la cobertura del código no es del 100%?
Luego de ejecutar la clase de pruebas AirportTest con cobertura, se muestra que el resultado no es del 100% y, además, se observa que las 2 pruebas correspondientes al vuelo de negocios han fallado. Si observamos, el resultado mostrado por la consola, observamos que el resultado arrojado corresponde a la excepción lanzada por la clase Flight cuando se añade un vuelo de tipo desconocido. Por lo tanto, revisando los tipos disponibles, se reafirma que la cadena correspondiente a los vuelos de negocio es 'Negocios' y no 'Business', tal como se declaró en la línea 58 de la clase de prueba anidada.\
![image](https://user-images.githubusercontent.com/57854488/201126974-309dd5bb-1ce1-4370-a094-59cc9260cfc4.png)

3. ¿Por qué John tiene la necesidad de refactorizar la aplicación?

Como se mostró en la subpregunta anterior, es necesario que los nombres del tipo de vuelos de negocio coincidan, por lo que se requiere cambiar uno de los 2. Se opta por modificar la cadena en la línea 58 de la clase de pruebas. Se vuelve a ejecutar la clase de pruebas con cobertura y se muestra el nuevo resultado que corresponde al 100% de cobertura.\
![image](https://user-images.githubusercontent.com/57854488/201131365-fa28cc14-555a-422b-b8de-939ab322a7ca.png)

4. Revisa la Fase 2 de la evaluación y realiza la ejecución del programa y analiza los resultados.
En primer lugar, se reestructura la clase Flight al convertirla en abstracta y crear otras 2 clases que se extienden de dicha clase y corresponden a los vuelos económicos y de negocios.\
Una de las diferencias fundamentales en la clase de prueba respecto a la fase anterior es la inclusión de las nuevas clases EconomyFlight y BusinessFlight que se extienden de la clase abstrata Flight. Por ejemplo, en la imagen adjunta, se inicializa para ambos métodos de prueba una instancia de Flight en la línea 18. Además, se modifica el método setUp para que la variable instanciada se le asigne una nueva instancia de EconomyFlight en la línea 21. Esto se realiza análogamente para la segunda clase de prueba anidada correspondiente a los vuelos de negocio.\
![image](https://user-images.githubusercontent.com/57854488/201133683-616b6ffc-2b13-4d8c-b214-4250ea74df67.png)\
Se ejecuta con cobertura la clase de pruebas y se observa que todas las pruebas han pasado y el resultado es del 100% de cobertura.\
![image](https://user-images.githubusercontent.com/57854488/201134692-ebd9cbeb-646f-47fb-90be-4f91b77597a0.png)

5. La refactorización y los cambios de la API se propagan a las pruebas. Reescribe elarchivo Airport Test de la carpeta Fase 3. Y responde las siguientes preguntas:
● ¿Cuál es la cobertura del código ?
Dado que gran parte de la refactorización se aplicó en la fase 2, esta fase presenta ligeras modificaciones de nombres. La ejecución se realizó exitosamente y la cobetura del código fue del 100%.
![image](https://user-images.githubusercontent.com/57854488/201557574-667ae96b-55a9-4e1e-ac1c-96feadcc4df6.png)\
● ¿La refactorización de la aplicación TDD ayudó tanto a mejorar la calidad del código?
La refactorización permitió que el código se adapte mejor a los cambios nuevos, pues la reestructuración de los tipos de vuelo en subclases de un clase padre Vuelo permite mejor manejo de los métodos; así como también una mayor limpieza y organización del código. Por ejemplo, dentro de la clase BusinessFlight, se observa que los métodos sobreescriben al de la clase Flight y la lógica se encuentra implementada sin necesidad de condicionales.\
![image](https://user-images.githubusercontent.com/57854488/201558508-bed4e893-7457-4589-8ad2-320178be163c.png)\
De manera análoga, se implementa en la clase EconomyFlight.\
![image](https://user-images.githubusercontent.com/57854488/201558713-ed316bf6-6594-4107-a9c3-6157ac3a7390.png)

6. ¿En qué consiste está regla relacionada a la refactorización?. Evita utilizar y copiar respuestas de internet. Explica como se relaciona al problema dado en la evaluación.

Consite en el planteamiento dee pruebas, de acuerdo con la funcionalidad que se necesite añadir, previo a la generación del código. Mientras se tenga errores en el código, se procede a corregirlos. Luego, cuando la prueba pase sin errores es cuando se aplica la refactorización asegurando que el código siga con un correcto funcionamiento.

7. Escribe el diseño inicial de la clase llamada PremiumFlight y agrega a la Fase 4 en la carpeta producción.

Se implementa el diseño inicial de PremiumFlight en la que solo se sobreescriben los métodos y se retorna falso.\
![image](https://user-images.githubusercontent.com/57854488/201567695-766ecee2-31a5-4103-880d-1336eadb145a.png)

8. Ayuda a John e implementa las pruebas de acuerdo con la lógica comercial de vuelos premium de las figuras anteriores. Adjunta tu código en la parte que se indica en el código de la Fase 4. Después de escribir las pruebas, John las ejecuta.

Se agregan las pruebas correspondientes, similar a las otras 2 clases de prueba. Se presentan métodos de prueba que corresponden a los 2 tipos de pasajero.\
![image](https://user-images.githubusercontent.com/57854488/201569749-682d2548-2ef0-458e-a630-c342a47e4ddf.png)\
![image](https://user-images.githubusercontent.com/57854488/201571503-a22f2b59-62ed-49e3-b23a-d66639a7a1e3.png)

9. Agrega la lógica comercial solo para pasajeros VIP en la clase PremiumFlight. Guarda ese archivo en la carpeta Producción de la Fase 5.

La nueva clase de PremiumFlight se implementa siguiendo la lógica de los diagramas.\
![image](https://user-images.githubusercontent.com/57854488/201569552-0837c7aa-08a2-4ef2-9813-a0243d7c14a4.png)\
Por último, se ejecuta el código con cobertura y se obittene el resultado esperado.\
![image](https://user-images.githubusercontent.com/57854488/201571710-092f0031-b98f-4b9b-975c-d4cee4720d2d.png)

10. Ayuda a John a crear una nueva prueba para verificar que un pasajero solo se puede agregar una vez a un vuelo de manera que John ha implementado esta nueva característica en estilo TDD.

Se implementa una nueva prueba para los vuelos premium similar a como está implementado para los otros tipos de vuelo, de tal forma que haciendo uso de Set se verifique que solo se incluya un pasajero una vez.\
![image](https://user-images.githubusercontent.com/57854488/201572234-43566a1f-b0b7-4d1e-a2d8-c1f269023193.png)
Las pruebas pasan exitosamente con el 100% de cobertura.\
![image](https://user-images.githubusercontent.com/57854488/201572355-2d84adb8-3ac4-4592-ae08-e0af361118a8.png)

- Pregunta 3








