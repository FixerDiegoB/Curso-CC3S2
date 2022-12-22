# Práctica Calificada 4

- Pregunta 1

1. ¿Se necesita la infraestructura SOA para integrar los dos nuevos servicios?



2. El servicio de evaluación de campañas necesita manejar una gran cantidad de datos ¿Sería mejor utilizar la replicación de datos, la integración a nivel de interfaz de usuario o las llamadas de servicio para acceder a grandes cantidades de datos?



3. ¿Cuál de estas opciones de integración suele ofrecer SOA?



4. ¿Debe el servicio integrarse al portal existente o tener su propia interfaz de usuario?



5. ¿Cuáles son los argumentos a favor de cada opción?



6. ¿Deberías implementar la nueva funcionalidad, el equipo de CRM?



- Pregunta 2

En un sistema basado en microservicios puede haber diferentes tipos de comunicación; sin embargo, debe haber un tipo de comunicación predominante. ¿Cuál escogerías? ¿Qué otros están permitidos además? ¿En qué situaciones? ¿Utilizarías la replicación de datos en un sistema basado en microservicios? ¿En qué áreas? ¿Cómo lo implementarías?

El tipo de comunicación predominante en un sistema basado en microservicios es a través de mensajes y mediante un middleware de mensajería. Es una forma eficiente y escalable de comunicación entre sus componentes, pues permite la integración y el intercambio de datos entre servicios de manera rápida y sencilla, sin la necesidad de acoplar estrictamente los componentes entre sí. Además puede ser utilizada tanto para la comunicación síncrona como asíncrona. Asimismo, otras 2 formas de comunicación incluyen:
    - Comunicación mediante llamadas HTTP: Esta es una opción comúnmente utilizada debido a la facilidad de implementación y a su compatibilidad con la mayoría de los lenguajes de programación.
    - Comunicación mediante RPC: Permite a un proceso el envío de una solicitud a otro proceso y esperar su procesamiento y una respuesta. Esto puede ser útil en entornos en los que se requiere una comunicación síncrona y se desea una mayor integración entre los microservicios.

Por otro lado, la replicación de datos en un sistema basado en microservicios resulta útil en situaciones en las que se requiere alta disponibilidad o tolerancia a fallos y en áreas donde la disponibilidad y el acceso a los datos es crítico para el funcionamiento del sistema. Por ejemplo, en un sistema de gestión de inventario, es importante que los datos sobre el inventario estén disponibles en todo momento para que los empleados puedan realizar su trabajo de manera eficiente, por lo que se puede replicar los datos a través de varias instancias del microservicio o incluso a través de diferentes regiones geográficas. Para implementar la replicación de datos en un sistema basado en microservicios, se suele seguir el siguiente flujo:
    - Determinar qué datos son críticos para el sistema y necesitan ser replicados.
    - Diseñar la arquitectura de replicación para asegurar que los datos sean replicados de manera eficiente y segura.
    - Utilizar herramientas como bases de datos distribuidas (como Cassandra o MongoDB) o sistemas de mensajería para implementar la replicación de datos.
    - Monitorear y probar la replicación para asegurar que los datos se repliquen correctamente y que el sistema funcione de manera eficiente.
    
- Pregunta 3



- Pregunta 4

Completa las actividades 21 y 22 del curso. Muestra cada uno de los pasos seguidos.

• Actividad 21:















