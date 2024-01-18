class Rectángulo(base: Double, altura: Double) {
    var base: Double = base
        get() = field
        set(value) {
            require(value > 0) {"La base no puede ser negativa."}
            field = value
        }

    var altura: Double = altura
        get() = field
        set(value) {
            require(value > 0) {"La altura no puede ser negativa."}
            field = value
        }

    var area: Double = 0.0
        get() = this.base * this.altura
        private set(value) {
            field = value
        }

    var perimetro: Double = 0.0
        get() = (this.base * 2) + (this.altura * 2)
        private set(value) {
            field = value
        }
}