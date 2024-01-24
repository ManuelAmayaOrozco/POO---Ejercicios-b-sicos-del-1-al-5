import java.lang.Exception

class Tiempo(hora: Int) {
    var hora: Int = hora
        set(value) {
            require(value <= 23) {"Error, el tiempo no puede pasar de las 23 horas."}
            field = value
        }

    init {
        if (hora > 23) {
            require(value <= 23) {"Error, el tiempo no puede pasar de las 23 horas."}
        }
    }

    var minuto: Int = 0
        set(value) {
            require (value < 60) {
                while (this.minuto >= 60) {
                    this.minuto = min - 60
                    this.hora = hora + 1
                }
            }
            field = value
        }

    init {
        while (this.minuto >= 60) {
            this.minuto = this.minuto - 60
            this.hora = this.hora + 1
        }
    }


    var segundo: Int = 0
        set(value) {
            require (value < 60) {
                while (this.segundo >= 60) {
                    this.segundo = this.segundo - 60
                    this.minuto = this.minuto + 1
                }
            }
            field = value
        }

    init {
        while (this.segundo >= 60) {
            this.segundo = this.segundo - 60
            this.minuto = this.minuto + 1
        }
    }

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

    fun incrementar(t: Tiempo): Boolean {

    }
}