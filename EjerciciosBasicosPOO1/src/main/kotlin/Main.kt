fun main(args: Array<String>) {
    /*
    Ejercicio 4.1
    1. Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del
       constructor y los métodos para calcular el area y el perimetro.
    2. Opcionalmente se puede crear el método toString() para mostrar información sobre el
       rectángulo. override fun toString() = ""
    3. En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y
       perímetros.
     */

    val rectangulo1 = Rectángulo(10.0, 20.0)
    println("El primer rectángulo tiene una base de ${rectangulo1.base}cm y una altura de ${rectangulo1.altura}cm")
    println("Su area es de ${rectangulo1.area}cm^2 y su perímetro es de ${rectangulo1.perimetro}cm.")
    val rectangulo2 = Rectángulo(18.0, 12.0)
    println("El primer rectángulo tiene una base de ${rectangulo2.base}cm y una altura de ${rectangulo2.altura}cm")
    println("Su area es de ${rectangulo2.area}cm^2 y su perímetro es de ${rectangulo2.perimetro}cm.")
    val rectangulo3 = Rectángulo(15.5, 9.8)
    println("El primer rectángulo tiene una base de ${rectangulo3.base}cm y una altura de ${rectangulo3.altura}cm")
    println("Su area es de ${rectangulo3.area}cm^2 y su perímetro es de ${rectangulo3.perimetro}cm.")
}