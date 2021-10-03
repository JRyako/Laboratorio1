import java.sql.DriverManager.println
import java.util.*

fun ENEE(args: Array<String>) {
//Enee
    var clavePrimaria = 0
    var numFactura = 0
    var montoPagar = 0
    var cuentaDebitar = 0
    var concepto = ""

    fun validMontoPagar() {
        println("Monto aceptado")
    }

    fun invalidMontoPagar() {
        println("Monto invalido, el monto deber ser mayor que 0")
    }

    fun fin() {
        println("Transaccion Finalizada, se cancelaron L.$montoPagar" + " al cliente con clave # $clavePrimaria" + " con factura $numFactura" + " de la cuenta # $cuentaDebitar" + " por concepto de:" + "$concepto")
    }

    fun clavePrimaria() {
        println("Ingrese su Clave Primaria")
        clavePrimaria = readLine().toString().toInt()
    }

    fun numFactura() {
        println("Ingrese su Numero de Factura")
        numFactura = readLine().toString().toInt()
    }

    fun cuentaDebitar() {
        println("Ingrese su Numero de Cuenta")
        cuentaDebitar = readLine().toString().toInt()
    }

    //validar monto a pagar
    fun montoPagar() {
        println("Ingrese el monto a cancelar")
        montoPagar = readLine().toString().toInt()
        if (montoPagar <= 0) {
            invalidMontoPagar()
            return
        } else {
            validMontoPagar()
        }
    }

    fun concepto() {
        println("Ingrese el concepto de pago")
        concepto = readLine().toString()
    }

    clavePrimaria()
    numFactura()
    cuentaDebitar()
    montoPagar()
    concepto()
    fin()
}




