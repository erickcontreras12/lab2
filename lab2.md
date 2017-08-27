# lab2
Esta es la documentación del segundo laboratorio del área práctica del curso de Programación Avanzada perteneciente a
el segudo ciclo del año 2017. Para empezar es necesario responder a 4 preguntas que serán introductorias a los
temas trabajados y a las herramientas que fueron utilizadas para realizar está documentación y los ejercicios presentados.
1. ¿Qué es GitHub?
> GitHub es una plataforma de desarrollo con multiples herramientas que permiten a distintos usuarios almacenar sus repositorios de código
> y también permite el trabajo cooperativo para los proyectos que requieren trabajo en equipo o son de caracter cooperativo.
2. ¿Qué es EclipseChe?
> Es una herramienta desarrollada por Eclipse pensada para aquellos usuarios que poseen ordenadores que no cumplen con los requisitos
> necesarios para soportar un IDE profesional, así que EclipseChe puede ser considerado como un IDE en línea que tiene la capacidad de
> ser utilizado para programar en varios lenguajes como lo son Java, SQL, C++, entre otros.
3. ¿Qué diferencia hay entre agregación y herencia?
> La agregación es el método de reutilización de código en donde para que se de una clase crea instancias de objetos que tienen
> propiedades y funcionalidad de otra. Mientras que en la herencia no hay necesidad de generar instancias porque la nueva clase
> extiende las características de la clase ya existente.
4. ¿Qué relación existe entre herencia y polimorfismo?
> El polimorfismo de igual forma a las dos anteriores es una forma de optimizar la funcionalidad reusando código y como su nombre 
> indica lo que hace es "tomar muchas formas". El polimorfismo funciona de igual manera que la herencia pero solo con métodos y no
> extiende a la clase existente porque los métodos bien pueden ser de clases totalmente independientes entre sí.
## Documentación 
Primero para ingresar al proyecto es necesario utilizar el comando "cd" seguido de el nombre del nombre de la carpeta a la que vamos a ingresar.



![](https://image.ibb.co/heQUCQ/img.png)


Seguido de esto verificamos la version de java y de javac(compilador de java) que tiene nuestro ordenadory después de haber verificado que nuestro ordenador tiene lo necesario para continuar ya podemos proseguir a crear las clases necesarias para cada ejercicio propuesto.
![](https://image.ibb.co/hznWRk/img5.png)
### Agregación
#### Clases
##### Clase Point.Java
1. Propiedades:
> * x:int
> * y:int
2. Métodos y Procedimientos:
> - Point()
> - Point(x:int, y:int)
> - Getters y Setters para ambas propiedades
> - toString():String
> - distance(x:int, y:int):double
> - distance(otro:Point):double
> - distance():double

![](https://image.ibb.co/iMHbsQ/img2.png)
![](https://image.ibb.co/kdupCQ/img11.png)
Los procedimientos de nombre distance son 3, y no hay error en ello porque son los parametros de cada uno lo que los hace únicos a cada unos de ellos y estos tres procedimientos son los que más explicación necesitan. Los tres métodos realizan la misma acción, caluclar la distancia desde el punto que ingresa el usuario en la clase Main hasta un punto diferente que es declarado en los parámetros de cada función.

- distance(x:int, y:int):double / Calcula la distancia a un punto de coordenadas (x,y), y el usuario ingresa individualmente y directamente el valor de "x" y "y"
- distance(otro:Point):double / Calcula la distancia a un punto de coordenadas (x,y), en este el usuario ahora ingresa las coordenadas haciendo uso de un objeto por lo que es necesario utilizar un parámetro del tipo Point
- distance():double / Está función que no está declarada para recibir parámetros calcula la distancia del punto ingresado por el usuario al punto (0,0)



##### Clase Line.Java
1. Propiedades:
> * begin:Point
> * end:Point
2. Métodos y Procedimientos:
> - Line(begin:Point, end:Point)
> - Line(x2:int, y2:int, x2:int, y2:int)
> - Getters y Setters para ambas propiedades
> - toString():String
> - getLength(): double

![](https://image.ibb.co/hijZe5/img12.png)

La función getLength() genera una instancia que llama a la función distance(otro:Point) para calcular la longitud de la línea tomando como primer punto begin y como el parámetro el punto end.

##### Clase Main.Java
Esta clase es la clase principal del ejercicio, es aquí donde generamos las instancias para utilizar la clase Point.java y Line.java
y hacer uso de sus procedimientos y funciones.
![](https://image.ibb.co/hiWrRk/main.png)


#### Funcionalidad
Usamos el comando "dir" en la terminal para ver el directorio de las carpetas que hay dentro de la carpeta actual que es src y ya hecho esto, el comando "javac" seguido de un guión y la siguiente estructura 'paquete/nombreClase.java' para compilar cada una de las clases del proyecto. En este caso ya que nuestro primer ejercicio es de agregación utilizamos el paquete "agregacion" y así poder utilizar las clases que este posee
![](https://image.ibb.co/kURQmk/img6.png)

Sabemos que las clases compilaron y no hay ningún error en el código fuente ya que al darle enter a cada uno de las ejecuciones para compilar cada clase, la terminal volvió a darnos la línea principal para volver a ejecutar otro comando. Ya que todas las clases están compiladas, corremos la clase principal del proyecto usando el comando "java" seguido de un guíon y la sentencia 'paquete.nombreClase'

![](https://image.ibb.co/gsR2XQ/img7.png)

### Herencia
#### Clases
##### Clase Person.java
![](https://image.ibb.co/eJ9d6k/img1.png)
![](https://image.ibb.co/bxqwsQ/img3.png)
![](https://image.ibb.co/d6ycz5/img8.png)
![](https://image.ibb.co/ma24e5/img9.png)

##### Clase Main.java
![](https://image.ibb.co/jgZBRk/main1.png)
#### Funcionalidad
![](https://image.ibb.co/egLJ6k/img10.png)
## Enlaces de referencia
- [Guía del laboratorio](https://github.com/tuxtor/prograavanzada2017/blob/master/lab/01-Laboratorio01.md)
- [Guía de sintaxis Markdown](https://daringfireball.net/projects/markdown/syntax)
