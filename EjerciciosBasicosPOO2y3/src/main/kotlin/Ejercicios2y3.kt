class Persona(altura: Double, peso: Double) {
    var nombre: String = "Sin nombre"
        get() = field
        set(value) {
            require(value.trim().isNotEmpty()) {"El nombre no puede estar vacio."}
            field = value
        }

    var altura: Double = 0.0
        get() = field
        set(value) {
            require(value > 0) {"La altura no puede ser negativa."}
            field = value
        }

    var peso: Double = 0.0
        get() = field
        set(value) {
            require(value > 0) {"El peso no puede ser negativo."}
            field = value
        }

    var imc: Double = 0.0
        get() = peso / (altura * altura)
        set(value) {
            field = value
        }

    constructor(nombre: String, altura: Double, peso: Double) : this(altura, peso) {
        this.nombre = nombre
        this.altura = altura
        this.peso = peso
    }

    fun saludar() {
        println("¡Hola ${this.nombre}!")
    }

    fun obtenerIMC(): Double {
        return this.imc
    }

    fun alturaEncimaMedia(): Boolean {
        return if (this.altura >= 1.75) {
            true
        } else {
            false
        }
    }

    fun pesoEncimaMedia(): Boolean {
        return if (this.peso >= 70) {
            true
        } else {
            false
        }
    }

    fun mostrarDesc() {
        println("${this.nombre} con una altura de ${this.altura}m y un peso de ${this.peso}kg tiene un IMC de ${"%.2f".format(this.imc)} ${obtenerImcDesc()}.")
    }

    fun obtenerImcDesc(): String {
        var rang = ""
        if (this.imc in 18.5..24.9) {
            rang = "(peso saludable)"
        }
        else if (this.imc < 18.5){
            rang = "(peso insuficiente)"
        }
        else if (this.imc in 25.0..29.9) {
            rang = "(sobrepeso)"
        }
        else if (this.imc >= 30.0)  {
            rang = "(obesidad)"
        }
        return rang
    }
}

fun ejercicio4_2() {
    val persona1 = Persona(nombre = "Manuel", altura = 1.2, peso = 64.0)
    println("${persona1.nombre} tiene una altura de ${persona1.altura}m, pesa ${persona1.peso}kg y su IMC es ${"%.2f".format(persona1.imc)}.")
    print("Introduce un nuevo nombre para esta persona: ")
    persona1.nombre = readln()
    println("${persona1.nombre} tiene una altura de ${persona1.altura}m, pesa ${persona1.peso}kg y su IMC es ${"%.2f".format(persona1.imc)}.")

    val persona2 = Persona(nombre = "Felipe", altura = 6.4, peso = 89.0)
    println("${persona2.nombre} tiene una altura de ${persona2.altura}m, pesa ${persona2.peso}kg.")

    val persona3 = Persona(nombre = "Goob", altura = 7.0, peso = 69.0)
    println("${persona3.nombre} tiene una altura de ${persona3.altura}m, pesa ${persona3.peso}kg y su IMC es ${"%.2f".format(persona3.imc)}.")
    print("Introduce una nueva altura para esta persona: ")
    persona3.altura = readln().toDouble()
    print("Introduce un nuevo peso para esta persona: ")
    persona3.peso = readln().toDouble()
    persona3.imc = persona3.peso / (persona3.altura * persona3.altura)
    println("${persona3.nombre} tiene una nueva altura de ${persona3.altura}m, pesa ${persona3.peso}kg y su nuevo IMC es ${"%.2f".format(persona3.imc)}.")
}

fun ejercicio4_3() {
    val persona1 = Persona(altura = 1.5, peso = 45.0)
    persona1.saludar()
    persona1.mostrarDesc()
    val persona2 = Persona(nombre = "Gloopny", altura = 7.0, peso = 20.0)
    persona2.saludar()
    persona2.mostrarDesc()
    val persona3 = Persona(nombre = "Juej", altura = 1.72, peso = 64.7)
    persona3.saludar()
    persona3.mostrarDesc()
    val persona4 = Persona(nombre = "Schlougn", altura = 1.0, peso = 99.4)
    persona4.saludar()
    persona4.mostrarDesc()
    val persona5 = Persona(nombre = "Orgle", altura = 1.5, peso = 66.8)
    persona5.saludar()
    persona5.mostrarDesc()
}
