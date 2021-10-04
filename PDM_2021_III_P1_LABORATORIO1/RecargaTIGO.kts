class MainClass(){
    fun RecargaCLARO(args: Array<String>){
        val text: String?
        var opcion1= "recarga"
        var opcion2= "super"
        println("Ingrese 'recarga' para una recarga normal o 'super' para una super recarga: ")
        text= readLine()
        fun escoger(opcion1: String,opcion2: String)= if (text=="recarga") opcion1.Recarga() else opcion2.SuperRecarga
    }}MainClass().RecargaCLARO(arrayOf(""))


fun Recarga(){
    var numeroRec: Int
    var telefono: Int
    var otro: String
    println("Buen dia")
    println("Hay recargas de 15")
    println("Hay recargas de 25")
    println("Hay recargas de 50")
    println("Hay recargas de 100")
    println("Hay recargas de 150")
    println("Hay recargas de 200")
    println("Si desea otra suma escriba otro en el valor")
    println("Ingrese el valor que desea de recarga y si es superior a 200lps escriba otro: ")
    numeroRec= readLine()
    println("Ingrese el numero telefonico: ")
    telefono= readLine()
    if (numeroRec= 15) println("Su recarga de 15 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 25) println("Su recarga de 25 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 50) println("Su recarga de 50 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 100) println("Su recarga de 100 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 150) println("Su recarga de 150 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 200) println("Su recarga de 200 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= "otro") println("Ingrese el monto que desea recargar: ")
    otro= readLine().toString().toInt()
    println("Su recarga de "+otro+" lps ha sido correctamente debitado al numero: "+telefono)
}

fun SuperRecarga(){
    var numeroRec2: Int
    var telefono2: Int
    var otro2: String
    println("Buen dia, las super recargas traen internet y mensajes ilimitados")
    println("Hay super recarga de 15")
    println("Hay super recargas de 25")
    println("Hay super recargas de 50")
    println("Hay super recargas de 100")
    println("Hay super recargas de 150")
    println("Hay super recargas de 200")
    println("Si desea otra suma escriba otro en el valor")
    println("Ingrese el valor que desea de recarga y si es superior a 200lps escriba otro: ")
    numeroRec2= readLine()
    println("Ingrese el numero telefonico: ")
    telefono2= readLine()
    if (numeroRec= 15) println("Su super recarga de 15 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 25) println("Su super recarga de 25 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 50) println("Su super recarga de 50 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 100) println("Su super recarga de 100 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 150) println("Su super recarga de 150 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= 200) println("Su super recarga de 200 lps ha sido correctamente debitada al numero: "+telefono)
    if (numeroRec= "otro") println("Ingrese el monto que desea recargar: ")
    otro= readLine().toString().toInt()
    println("Su super recarga de "+otro+" lps ha sido correctamente debitado al numero: "+telefono)
}
}

