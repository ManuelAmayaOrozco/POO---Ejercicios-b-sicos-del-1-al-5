fun main(args: Array<String>) {
    /*
    Ejercicio 4.4
    1. Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca,
       el modelo, el número de caballos, el número de puertas y la matrícula. Crear el
       constructor del coche, así como los métodos estándar: getters, setters y toString().
    2. Para realizar getters y setters, añade el modificador private a los atributos de la clase y
       genera los métodos getColor(), setColor(), ..., así para todos los atributos.
    3. En el programa principal, instancia varios coches, muestra su información, cambia el color a
       algunos de ellos y vuelve a mostrarlos por pantalla.
    4. Realiza también una modificación al método setNumCaballos() para que no permita
       actualizar el atributo numCaballos con un valor interior a 70, ni superior a 700.
    5. Realiza otra modificación al método setNumPuertas() para que no se pueda actualizar con
       un valor inferior a 3, ni superior a 5... pero esta vez utiliza require.
    6. Para probar las modificaciones a los métodos anteriores, solicita al usuario el número de
       caballos para un coche y haz lo mismo para el número de puertas.
     */

    val coche1 = Coche("Rojo", "Volkswagen", "Golf", 500.0, 4, "SUPERMATRICULA")
    println("El coche 1 es de color ${coche1.getColor()}, es un ${coche1.getMarca()} ${coche1.getModelo()}, su número de caballos es ${coche1.getNumCaballos()}, tiene ${coche1.getNumPuertas()} puertas y su matrícula es ${coche1.getMatricula()}.")
    coche1.setColor()
    println("El coche 1 ahora es de color ${coche1.getColor()}.")
    val coche2 = Coche("Azul", "Peugeot", "Sans", 450.0, 4, "ENEFECTO")
    println("El coche 2 es de color ${coche2.getColor()}, es un ${coche2.getMarca()} ${coche2.getModelo()}, su número de caballos es ${coche2.getNumCaballos()}, tiene ${coche2.getNumPuertas()} puertas y su matrícula es ${coche2.getMatricula()}.")
    coche2.setNumCaballos()
    println("El coche 2 ahora tiene ${coche2.getNumCaballos()} caballos.")
    val coche3 = Coche("Amarillo", "Toyota", "Corola", 666.6, 3, "COMOUNCAMPEON")
    println("El coche 3 es de color ${coche3.getColor()}, es un ${coche3.getMarca()} ${coche3.getModelo()}, su número de caballos es ${coche3.getNumCaballos()}, tiene ${coche3.getNumPuertas()} puertas y su matrícula es ${coche3.getMatricula()}.")
    coche3.setNumPuertas()
    println("El coche 3 ahora tiene ${coche3.getNumPuertas()} puertas.")
}