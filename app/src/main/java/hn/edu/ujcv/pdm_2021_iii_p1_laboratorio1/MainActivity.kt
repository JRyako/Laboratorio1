package hn.edu.ujcv.pdm_2021_iii_p1_laboratorio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    object Main {
        fun mostrarMenu() {
            println("App")
            println("1- Cobrar ENEE")
            println("2- Cobrar SANAA")
            println("3- RecargaCLARO")
            println("4- RecargaTIGO")
            println("5- DebitarCuenta")
            println("6- AcreditarCuenta")
            println("7- Salir")
        }

        @JvmStatic
        fun main(args: Array<String>) {
            //Objeto Scanner
            val sc = Scanner(System.`in`)

            //Variable
            var respuestaUser = 0
            mostrarMenu()
            print("Su opcion: ")
            respuestaUser = sc.nextInt()
            respuestaUser = when (respuestaUser) {
                1, 2, 3, 4, 5, 6, 7 -> {
                    println("Escriba una opción correcta")
                    println(" ")
                    mostrarMenu()
                    print("Su opcion: ")
                    sc.nextInt()
                }
                else -> {
                    println("Escriba una opción correcta")
                    println(" ")
                    mostrarMenu()
                    print("Su opcion: ")
                    sc.nextInt()
                }
            }
        }
    }


}