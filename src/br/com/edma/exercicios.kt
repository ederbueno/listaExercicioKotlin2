package br.com.edma

import java.awt.desktop.PrintFilesEvent
import java.util.ArrayList

fun somaImprima(umNumeroA: Int, umNumeroB: Double, umaCadeiaDeTexto: String){

       println("A= " + umNumeroA)
       println("B= " +umNumeroB)
       println("Texto= " + umaCadeiaDeTexto)
       println("Soma A + B= " + (umNumeroA + umNumeroB))
       println("Difença entre A - B= " + (umNumeroA - umNumeroB))
}

fun analisarNumerosInteiros(primeiroNumero: Int, segundoNumero: Int) : Boolean{
       return (primeiroNumero < segundoNumero)
}

fun analisarNumeroImpar(numeroImpar: Int) : Boolean{
       return (numeroImpar % 2 != 0 && numeroImpar > 10)
}

fun addArrayList(tamanhoArray: Int): ArrayList<Int>{
       val list = arrayListOf<Int>()
       for(x in 0..tamanhoArray){
              list.add(x)
       }
       return list
}

fun somaElementosArray(list: ArrayList<Int>) : Int{
      var sum = 0
      for(k in list){
              sum += k
      }
       return sum
}

fun somaElementosParesArray(list: ArrayList<Int>) : Int{
       var sum = 0
       for(k in list){
         if(k % 2 == 0)
              sum += k
       }
       return sum
}

fun elementosParesArrayImprime(list: ArrayList<Int>) : ArrayList<Int>{
       var sum = 0
       val arrayPares = arrayListOf<Int>()
       for(k in list){
           if(k % 2 == 0)
             arrayPares.add(k)
       }
       return arrayPares
}

fun main() {

       println("#############")
       println("Execercício 1")
       println("#############")
       somaImprima(5, 10.00, "Teste para Realizar o exercicio")
       println("#############")
       println("Execercício 2")
       println("#############")
       println(analisarNumerosInteiros(10,11))
       println("#############")
       println("Execercício 3")
       println("#############")
       println(analisarNumeroImpar(14))
       println("#############")
       println("Execercício 4")
       println("#############")
       println(somaElementosArray(addArrayList(4)))
       println("#############")
       println("Execercício 5")
       println("#############")
       println(somaElementosParesArray(addArrayList(4)))
       println("#############")
       println("Execercício 6")
       println("#############")
       println(elementosParesArrayImprime(addArrayList(10)))
}



