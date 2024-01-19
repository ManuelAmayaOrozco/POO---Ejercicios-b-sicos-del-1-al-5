class Coche(private var color: String, private var marca: String, private var modelo: String, numCaballos: Double, numPuertas: Int, private var matricula: String) {

    fun getColor(): String {
        return this.color
    }

    fun setColor() {
        print("Selecciona un color para el coche: ")
        this.color = readln()
    }

    fun getMarca(): String {
        return this.marca
    }

    fun setMarca() {
        print("Selecciona una marca para el coche: ")
        this.marca = readln()
    }

    fun getModelo(): String {
        return this.modelo
    }

    fun setModelo() {
        print("Selecciona un modelo para el coche: ")
        this.modelo = readln()
    }

    private var numCaballos = numCaballos
        set(value) {
            require(value >= 70) {"El número de caballos no puede ser menor de 70."}
            require(value <= 700) {"El número de caballos no puede ser mayor de 700."}
            field = value
        }

    fun getNumCaballos(): Double {
        return this.numCaballos
    }

    fun setNumCaballos() {
        print("Selecciona un número de caballos para el coche: ")
        this.numCaballos = readln().toDouble()
    }

    private var numPuertas = numPuertas
        set(value) {
            require(value >= 3) { "El número de puertas no puede ser menor de 3." }
            require(value <= 5) { "El número de puertas no puede ser mayor de 5." }
            field = value
        }

    fun getNumPuertas(): Int {
        return this.numPuertas
    }

    fun setNumPuertas() {
        print("Selecciona un número de puertas para el coche: ")
        this.numPuertas = readln().toInt()
    }

    fun getMatricula(): String {
        return this.matricula
    }

    fun setMatricula() {
        print("Selecciona una matrícula para el coche: ")
        this.matricula = readln()
    }
}