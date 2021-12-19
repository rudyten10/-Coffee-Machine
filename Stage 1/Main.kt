enum class Rainbow(val color:String, val number:Int){
    RED("RED", 1),
    ORANGE("ORANGE", 2),
    YELLOW("YELLOW",3),
    GREEN("GREEN", 4),
    BLUE("BLUE", 5),
    INDIGO("INDIGO", 6),
    VIOLET("VIOLET", 7);


    fun getNumberx() = number

    fun getColorx() = color

}

enum class Country (val currency: String) {//, val currency: String
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar")

//    fun getCurrencyx () {
//        if (currency != "D")
//        currency
//    }
}

fun main() {
    // put your code here
    //val (a, b) = "Canada Australia".split(" ")
    val (a, b) = "Spain Francse".split(" ")
    //println(a)
    //println(b)
    //println(Country.values())
    //println(Country.valueOf(a).currency)
    try {
        //println(Country.valueOf(b).currency)
        println(Country.valueOf(a).currency == Country.valueOf(b).currency)
    } catch (e: IllegalArgumentException) {
        println(false)
    }

    //val x = Country.
    //if (i in x.)

//    for (ii in Country.values()) {
//        if (ii.name == a){
//            println("DDDDDDDDDDDDDDD")
//        }
//        println(ii)
//    }
}


fun xxxmain() {
    //val color = readLine()!!.toUpperCase()
    val color = "red"
    // put your code here

    println(color)
    println(Rainbow.values())

    for (ii in Rainbow.values()) {
        if (color == ii.getColorx()) println(ii.getNumberx())

    }

    //val xObj = Rainbow
    //println(Rainbow.color.getNumber())
}

fun mcain(args: Array<String>) {

    println(Rainbow.valueOf("RED"))
    for (xx in Rainbow.values()) {
        println(xx)
        val c = xx.getColorx()
        if (c == "Green") {
            println("BOOOOOOOO")
            //println(xx.getNum())
        }
        println(xx.getColorx())
        //if (color.toUpperCase() == enum.name) return true
    }


//    fun isRainbow(color: String) : Boolean {
//        for (enum in Rainbow2.values()) {
//            if (color.toUpperCase() == enum.name) return true
//        }
//        return false
//    }

//    val poop = "RED"
//    Rainbow2.getNum("2")
    //println(r.getNum())

    //val input :Rainbow2. = "orange".toUpperCase()
    //val color = Rainbow.BLUE.color
    //val color = Rainbow2.BLUE.color2
    //val num = Rainbow2.BLUE.numx
//    println(color)
//    println(Rainbow2.BLUE.num)
//    println(Rainbow2.BLUE.num)
    //input.Ra
    //..Rainbow2
    //println(Rainbow2.input.getNum())
    //for (i in Rainbow2) {
    //    println(i)
///
  //  }

    //val high = DangerLevel.HIGH
    ///val medium = DangerLevel.MEDIUM

    //println(high.getLevel() > medium.getLevel()) // true

    //val col = Rainbow2.
    //println(col.Rainbow2.col)
//    println(Rainbow.RED)
//    println(Rainbow.RED.name)
//    println(Rainbow.YELLOW.ordinal)
//    println(Rainbow.YELLOW.toString())



    //Rainbow.YELLOW.pp()
    //println(Rainbow.YELLOW.pp())
}
