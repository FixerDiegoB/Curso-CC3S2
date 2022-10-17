Se puede observar que los cambios realizados permite que se realice un Build de la clase sin que aparezca ningún error de compilación.

![image](https://user-images.githubusercontent.com/57854488/193589676-8d4315c6-3706-41f1-9df6-3d493854c6dc.png)

Dado que la superclase Howler no tiene ningún constructor por defecto (sin parámetros), todos los constructores de la subclase Wolf deben hacer llamado al único constructor público de Howler, ubicado en la línea 2. Por lo tanto, añadir una invocación con un parámetro de tipo long resuelve el error de compilación.
