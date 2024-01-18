fun main(args: Array<String>) {
    /*
    Ejercicio 4.2
    1. Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc.
       metros con decimales) y su imc.
    2. Crear un constructor primario con todos los atributos, excepto nombre e imc. Este último
       atributo se calcula en función del peso y la altura. Por tanto no se debe poder modificar, pero
       si consultar.
    3. Crear un constructor secundario que también incluya el nombre de la persona cómo
       parámetro.
    4. Implementa el método toString, representación del objeto en forma de String: override
       fun toString() = ""
    5. En el main() a) crear 3 personas diferentes (la primera sin nombre) utilizando el constructor
       primario y secundario y b) mostrarlas por consola. A continuación, realizar lo siguiente:
       - Sobre la persona 1: a) modificar su nombre y para ello debes solicitarlo al usuario por
         consola. No puede ser nulo o vacio. b) Mostrar por consola sólo el nombre, peso y
         altura.
       - Sobre la persona 3: a) Mostrar el peso, altura y imc. b) Modificar la altura, por ejemplo a
         1.80 c) Mostrar el peso, altura y imc.
       - Sobre la persona 2; a) Modificar la altura para que tenga el mismo valor que la persona
         3. b) Mostrar la persona 2 y persona 3. c) Comparar si las dos personas son iguales, y
         mostrar el resultado.
    */
    ejercicio4_2()

    /*
    Ejercicio 4.3
    1. Actualizar el ejercicio 1 para añadir a la clase el siguiente comportamiento:
       - Debe saludar con su nombre... saludar():String
       - Debe retornar si altura por encima de la media (solo si altura >= 1.75)...
         alturaEncimaMedia():Boolean
       - Debe retornar si peso por encima de la media (solo si peso >= 70)...
         alturaEncimaMedia():Boolean
       - Sería conveniente añadir también un método obtenerImcDesc() para usar en
         mostrarDesc(), que implemente el retorno de la descripción del rango de tipo de imc al
         que equivale su cálculo.

    Nota: * Si el IMC es menos de 18.5, se encuentra dentro del rango de "peso insuficiente". * Si
    el IMC está entre 18.5 y 24.9, se encuentra dentro del rango de "peso saludable". * Si el IMC
    está entre 25.0 y 29.9, se encuentra dentro del rango de "sobrepeso". * Si el IMC es 30.0 o
    superior, se encuentra dentro del rango de "obesidad".

       - Debe implementar también un método que muestre una descripción completa de la
         persona... mostrarDesc(). Por ejemplo, este método mostrará por pantalla algo así:
         "Julia con una altura de 1.72m y un peso 64.7kg tiene un IMC de 21,87 (peso saludable)".

    2. Crear en el main() una estructura de datos con 4 o 5 personas más, recorrer la estructura y
       por cada persona debe saludar y mostrar su descripción completa.
    3. Finalmente, revisa el IDE e intenta actualizar el modificador de visibilidad de los métodos de
       tu clase cómo os estará indicando... veréis que los métodos que realmente no van a ser
       llamados desde fuera de la clase te recomienda que sean privados a la misma. De esta
       manera estamos encapsulando estos métodos para que se puedan utilizar zolo desde
       dentro de la clase y no sean públicos.
     */
    //ejercicio4_3()
}