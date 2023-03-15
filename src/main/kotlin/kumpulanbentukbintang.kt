fun main(){
    val sb = segitigabintang()
    sb.piramidabintang()
    println()
    val st = segitigaterbalik()
    st.bintangterbalik()
    println()
    val bk = belahketupatbintang()
    bk.belahketupat()
    println()
    val siltang=silangbintang()
    siltang.silangbintang()
    println()
    val ss = segitigabintangsiku()
    ss.segitigasiku()
    println()
    val plusstar = plusbintang()
    plusstar.plusbintang()

}

//1
class segitigabintang() {
    fun piramidabintang() {
        val rows = 8
        var q = 0

        for (i in 1..rows) {
            for (space in 1..rows - i) {
                print("  ")
            }

            while (q != 2 * i - 1) {
                print("* ")
                ++q
            }

            println()
            q = 0
        }
    }
}

//2
class segitigaterbalik() {
    fun bintangterbalik() {
        val rows = 8
        var k = 0
        for (i in rows downTo 1) {
            print("  ")
            for (space in 1..rows - i) {
                print("  ")
            }

            for (j in i..2 * i - 1) {
                print("* ")
            }

            for (j in 0..i - 1 - 1) {
                print("* ")
            }

            println()
        }
    }
}

class belahketupatbintang() {
    fun belahketupat() {
        val rows = 8
        var k = 0

        for (i in 1..rows) {
            for (space in 1..rows - i) {
                print("  ")
            }

            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }

            println()
            k = 0
        }
        val rows2 = rows - 1

        for (i in rows2 downTo 1) {
            print("  ")
            for (space in 1..rows2 - i) {
                print("  ")
            }

            for (j in i..2 * i - 1) {
                print("* ")
            }

            for (j in 0..i - 1 - 1) {
                print("* ")
            }

            println()
        }
    }
}

class silangbintang() {
    fun silangbintang() {
        val star = 15
        for (j in 1..star) {
            for (k in 1..star) {
                if (k == j || (k == star - j + 1)) {
                    print("*")
                } else {
                    print(" ")

                }

            }
            println("")

        }
    }
}

class segitigabintangsiku() {
    fun segitigasiku() {
        for (r in 0..7) {

            for (t in 0..r) {
                System.out.print("*");
            }

            for (u in 7 downTo r) {
                System.out.print(" ");
            }
            println()


        }
    }
}

class plusbintang(){
    fun plusbintang(){
        val rows = 4
        for (i in 1..rows * 2 - 1) {
            if (i != rows) {
                for (j in 1..rows) {
                    if (j == rows) {
                        print("*")
                    }
                    print(" ")
                }
            } else {
                for (k in 1..rows * 2 - 1) {
                    print("*")
                }
            }

            println()
        }
    }
}




