
import kotlin.random.Random

fun main() {
    var lista = mutableListOf<Int>()
    var dado1=dado()

    var dado2=dado(1,3)

    var dado3=dado(1,6)



    repeat(100){

        var sumatoria=0

        var player=jugador()

        repeat(100){
            player.sumaResultados += (dado1.aletorio() + dado2.aletorio() + dado3.aletorio())

        }
        lista.add(player.sumaResultados)



    }

    println(lista)




}
class dado(min:Int=1,max:Int=6){
    var min=min
    var max=max
    init {
        darValores(min,max)
    }
    fun darValores(nMin:Int,nMax:Int){
        min=nMin
        max=nMax
    }

    fun aletorio():Int{
        return Random.nextInt(min,max+1)
    }

}

class jugador{

    var sumaResultados:Int=0

}

