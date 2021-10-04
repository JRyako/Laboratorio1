class MainClass(){
    fun main(args: Array<String>){
        //Para debitar cuenta
        var cuenta=0
        var monto = 0
        fun validMonto(){
            println("Transaccion aceptada, has debitado L.$monto"+" de tu cuenta #$cuenta")
        }

        fun validMontoAcred(){
            println("Transaccion aceptada, has acreditado L.$monto"+" a tu cuenta #$cuenta")
        }

        fun invalidMonto(){
            println("Transaccion invalida, el monto debe ser entre 0 y 5000")
        }

        fun cuenta(){
            println("Ingrese el numero de cuenta a utilizar")
            cuenta = readLine().toString().toInt()
        }

        fun montoDebito(){
            println("Ingrese el monto a debitar")
            monto = readLine().toString().toInt()
            if (monto <= 0){
                invalidMonto()
                return
            }else if (monto > 5000){
                invalidMonto()
            }else{
                validMonto()
            }


        }

        //para acreditar
        fun cuentaAcreditar(){
            println("Ingrese el numero de cuenta para acreditar")
            cuenta = readLine().toString().toInt()
        }
        fun montoAcreditar(){
            println("Ingrese monto para acreditar")
            monto = readLine().toString().toInt()
            if (monto <= 0){
                invalidMonto()
                return
            }else if (monto > 10000){
                invalidMonto()
            }else{
                validMontoAcred()
            }
        }

        //Para Debitar
        cuenta()
        montoDebito()
        //Para Acreditar
        cuentaAcreditar()
        montoAcreditar()

        //Recargas Tigo
        var numeroTelefono = 0
        var montoRecargaTel = 0
        var tipoRecarga: Int
        var cuentaRecarga=0

        fun recargaExitosa() {
            println("Recarga Exitosa, has recargado L.$montoRecargaTel"+" al número $numeroTelefono"+" de tu cuenta #$cuentaRecarga")
        }

        fun cuentaRecarga() {
            println("Ingrese el numero de cuenta")
            cuentaRecarga = readLine().toString().toInt()
        }

        fun numero() {
            println("Ingrese el numero a recargar")
            numeroTelefono = readLine().toString().toInt()
        }



        fun montoRecarga() {
            println("Ingrese el monto de la recarga")
            montoRecargaTel = readLine().toString().toInt()
            recargaExitosa()
        }

        fun tipoRecarga() {
            println("Ingrese el tipo de recarga")
            println(
                "1 - Super recarga L.10" +'\n'+
                        "2 - Super recarga L.25" + '\n'+
                        "3 - Super recarga L.50" + '\n'+
                        "4 - Super recarga L.100"
            )
            tipoRecarga = readLine().toString().toInt()
            when (tipoRecarga) {
                1 -> println("Usted seleccionó la Super Recarga de L.10, se acreditará el paquete de L.10 al número $numeroTelefono")
                2 -> println("Usted seleccionó la Super Recarga de L.25, se acreditará el paquete de L.25 al número $numeroTelefono")
                3 -> println("Usted seleccionó la Super Recarga de L.50, se acreditará el paquete de L.50 al número $numeroTelefono")
                4 -> println("Usted seleccionó la Super Recarga de L.100, se acreditará el paquete de L.100 al número $numeroTelefono")
                else -> {
                    println("No se pudo realizar la transacción")
                }
            }
        }

        cuenta()
        numero()
        tipoRecarga()

        //Recarga Claro

        fun tipoRecargaClaro() {
            println("Ingrese el tipo de recarga")
            println(
                "1 - Superpack todo incluido 1GB L.10" + '\n' +
                        "2 - Superpack todo incluido 2GB L.25" + '\n'+
                        "3 - Superpack todo incluido 5GB L.50" + '\n'+
                        "4 - Superpack todo incluido 10GB L.100" + '\n'+
                        "5 - Superpack todo incluido 25Gb L.220"
            )
            tipoRecarga = readLine().toString().toInt()
            when (tipoRecarga) {
                1 -> println("Usted seleccionó el superpack de 1Gb, se acreditará el paquete de L.10 al número $numeroTelefono")
                2 -> println("Usted seleccionó el Superpack de 2Gb, se acreditará el paquete de L.25 al número $numeroTelefono")
                3 -> println("Usted seleccionó el Superpack de 5Gb, se acreditará el paquete de L.50 al número $numeroTelefono")
                4 -> println("Usted seleccionó el Superpack de 10Gb, se acreditará el paquete de L.100 al número $numeroTelefono")
                5 -> println("Usted seleccionó el Superpack de 25Gb, se acreditará el paquete de L.220 al número $numeroTelefono")
                else -> {
                    println("No se pudo realizar la transacción")
                }
            }
        }

        cuenta()
        numero()
        tipoRecargaClaro()

        //Enee
        var clavePrimaria=0
        var numFactura=0
        var montoPagar=0
        var cuentaDebitar=0
        var concepto = ""

        fun validMontoPagar(){
            println("Monto aceptado")
        }
        fun invalidMontoPagar() {
            println("Monto invalido, el monto deber ser mayor que 0")
        }

        fun fin(){
            println("Transaccion Finalizada, se cancelaron L.$montoPagar"+" al cliente con clave # $clavePrimaria"+" con factura $numFactura"+" de la cuenta # $cuentaDebitar"+" por concepto de:"+"$concepto")
        }

        fun clavePrimaria(){
            println("Ingrese su Clave Primaria")
            clavePrimaria = readLine().toString().toInt()
        }

        fun numFactura(){
            println("Ingrese su Numero de Factura")
            numFactura = readLine().toString().toInt()
        }

        fun cuentaDebitar(){
            println("Ingrese su Numero de Cuenta")
            cuentaDebitar = readLine().toString().toInt()
        }

        //validar monto a pagar
        fun montoPagar(){
            println("Ingrese el monto a cancelar")
            montoPagar = readLine().toString().toInt()
            if (montoPagar <= 0){
                invalidMontoPagar()
                return
            }else{
                validMontoPagar()
            }
        }

        fun concepto(){
            println("Ingrese el concepto de pago")
            concepto = readLine().toString()
        }

        clavePrimaria()
        numFactura()
        cuentaDebitar()
        montoPagar()
        concepto()
        fin()




        //Sanaa
        var Contrato=0
        var numFacturaSanaa=0


        fun contrato(){
            println("Ingrese su numero de contrato")
            Contrato = readLine().toString().toInt()
        }

        fun facturas(){
            println("Ingrese su número de mes de factura")
            numFacturaSanaa = readLine().toString().toInt()
            print(  "1 - Enero" +'\n'+
                    "2 - Febrero" + '\n'+
                    "3 - Marzo" + '\n'+
                    "4 - Abril " + '\n'+
                    "5 - Mayo" + '\n'+
                    "6 - Junio" + '\n'+
                    "7 - Julio" +'\n'+
                    "8 - Agosto" + '\n'+
                    "9 - Septiembre" + '\n'+
                    "10 - Octubre " + '\n' +
                    "11 - Noviembre" + '\n'+
                    "12 - Diciembre" + '\n'
            )
            numFacturaSanaa = readLine().toString().toInt()
            when (numFacturaSanaa) {
                1 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Enero de su contrato #$Contrato")
                2 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Febrero de su contrato #$Contrato")
                3 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Marzo de su contrato #$Contrato")
                4 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Abril de su contrato #$Contrato")
                5 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Mayo de su contrato #$Contrato")
                6 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Junio de su contrato #$Contrato")
                7 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Julio de su contrato #$Contrato")
                8 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Agosto de su contrato #$Contrato")
                9 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Septiembre de su contrato #$Contrato")
                10 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Octubre de su contrato #$Contrato")
                11 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Noviembre de su contrato #$Contrato")
                12 -> println("Usted selecciono la factura #$numFacturaSanaa correspondiente al mes de: Diciembre de su contrato #$Contrato")
                else -> {
                    println("No se pudo realizar la transaccion")
                }
            }
        }


        contrato()
        facturas()
        cuentaDebitar()
        montoPagar()
        concepto()
        fin()

    }
}

MainClass().main(arrayOf(""))