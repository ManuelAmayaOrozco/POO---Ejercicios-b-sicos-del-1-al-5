class Tiempo(hora: Int) {
    var hora: Int = hora

    var minuto: Int = 0

    var segundo: Int = 0

    constructor(hora: Int, minuto: Int) : this(hora){
        this.hora = hora
        this.minuto = minuto
        this.segundo = 0
    }

    constructor(hora: Int, minuto: Int, segundo: Int) : this(hora){
        this.hora = hora
        this.minuto = minuto
        this.segundo = segundo
    }

    override fun toString(): String {
        return "${"%02d".format(this.hora)}h ${"%02d".format(this.minuto)}m ${"%02d".format(this.segundo)}s"
    }
}