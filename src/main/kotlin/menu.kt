class menu(principal:String,bebida:Int,postre:Int){

    constructor():this("",0,0)


    var IVA : Double = 0.21
    var descuento : Double = 0.0
        get():Double{
            return field
        }
        set(valor:Double){
            field=valor
        }
    var principal:String = principal
        get():String{
            return field
        }
        set(valor:String){
            field=valor.uppercase()
        }
    var bebida:Int = bebida
        get():Int{
            return field
        }
        set(valor:Int){
            field=valor
        }
    var postre:Int=postre
        get():Int{
            return field
        }
        set(valor:Int){
            field=valor
        }


    fun menuPrincipal(){
        println("_________________________________________\n" +
                "Elija entre los diferentes platos principales:\n" +
                "Entrecot (15€)\n" +
                "Pez Espada (12€)\n" +
                "Carrillada (10€)\n" +
                "Dorada (20€)\n" +
                "Otros (13€)\n" +
                "_________________________________________\n")
        principal = readln()

    }
    fun menuBebida(){
        println("_________________________________________\n" +
                "Elija entre las diferentes bebidas:\n" +
                "1 – Refresco (1€)\n" +
                "2 – Vino (1,5€)\n" +
                "3 - Otros (2€)\n" +
                "_________________________________________\n")
        bebida = readln().toInt()
    }
    fun menuPostre(){
        println("_________________________________________\n" +
                "Elija entre los diferentes postres:\n" +
                "1 – Fruta (2€)\n" +
                "2 – Helado (3€)\n" +
                "3 - Otros (4€)\n" +
                "_________________________________________\n")
        postre = readln().toInt()

    }
    var cambiobebida : String = ""
    var cambiopostre : String = ""
    var precioiva : Double = 0.0
    fun importe():String{
        var preciofinal : Double = 0.0
        when (principal) {
            "ENTRECOT" -> preciofinal+=15
            "PEZ ESPADA" -> preciofinal+=12
            "CARRILLADA" -> preciofinal+=10
            "DORADA" -> preciofinal+=20
            "OTROS" -> preciofinal+=13

        }
        when (bebida) {
            1-> {
                preciofinal += 1
                cambiobebida = "Refresco"
            }
            2 -> {
                preciofinal+=1.5
                cambiobebida = "Vino"
            }
            3 -> {
                preciofinal+=2
                cambiobebida = "Otros"
            }

        }
        when (postre) {
            1-> preciofinal+=2
            2 -> preciofinal+=3
            3 -> preciofinal+=4

        }
        precioiva = (preciofinal * IVA) + preciofinal
        return ("El importe de su menú SIN IVA es de: $preciofinal €\n" +
                "El importe de su menú CON IVA es de: $precioiva €")


    }
    fun mostrarMenuFinal(){
        when (postre) {
            1-> cambiopostre = "Fruta"
            2 -> cambiopostre = "Helado"
            3 -> cambiopostre = "Otros"
        }
        when (bebida) {
            1-> cambiobebida = "Refresco"
            2 -> cambiobebida = "Vino"
            3 -> cambiobebida = "Otros"
        }



        println("-------------- MENÚ ELEGIDO --------------\n" +
                "Plato principal: ${principal.uppercase()}\n" +
                "_________________________________________\n" +
                "Bebida: $cambiobebida\n" +
                "_________________________________________\n" +
                "Postre: $cambiopostre\n" +
                "_________________________________________\n" +
                importe())

    }



}