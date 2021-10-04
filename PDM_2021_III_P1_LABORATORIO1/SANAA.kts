class MainClass(){
    fun SANAA(args: Array<String>){
        var Contrato= 0
        var numFacturaSanaa= 0

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

    }
}

