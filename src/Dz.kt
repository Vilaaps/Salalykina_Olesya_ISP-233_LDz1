fun main() {
    /* №1
    val a: String = "Kotlin"
    val d: Int = 7
    val c: Double = 3.14159
    val b: Char = 'K'

    println("Моя любимая вещь: $a")
    println("Моя любимая цифра: $d")
    println("Значение числа пи: $c")
    println("Моя любимая буква алфавита: $b") */

/* №2
    pritln("Привет)   //Неправильно написан println и пропущена закрывающая кавычка
    val s = "текст  //Пропущена закрывающая кавычка
    val x Int = 5    //Пропущен знак :
 */

/* №3
    val pi: Double = 3.14
    val radius: Int = 5
    val a: Double = radius.toDouble()
    val b: Double = pi * a * a
    println(b)
 */

/* №4
    print("Введите ваше имя: ")
    val name: String = readln()
    print("Введите ваш год рождения: ")
    val age: Int = readln().toInt()
    val b: Int = 2025 - age
    println("$name, вам $b лет")
 */

/* №5
    print("Введите первое число: ")
    val num1: Double = readln().toDouble()
    print("Введите второе число: ")
    val num2: Double = readln().toDouble()
    val sum: Double = num1 + num2
    val b: Double = num1 - num2
    val c: Double = num1 * num2
    println("$num1 + $num2 = $sum")
    println("$num1 - $num2 = $b")
    println("$num1 * $num2 = $c")
 */

/* №6
    print("Введите трехзначное число: ")
    val input: Int = readln().toInt()
    var number: Int = input
    if (number < 100 || number > 999) {
        println("Введено не трехзначное число.")
        return
    }
    var sum: Int = 0
    while (number > 0) {
        sum += number % 10
        number /= 10
    }
    println("Сумма $input = $sum")
 */

/* №7
    print("Введите строку-разделитель: ")
    val str: String = readln()
    print("Введите первую строку: ")
    val str1: String = readln()
    print("Введите вторую строку: ")
    val str2: String = readln()
    print("Введите третью строку: ")
    val str3: String = readln()
    println("$str1$str$str2$str$str3")
 */


/* №8
    print("Введите число: ")
    val a: Int = readln().toInt()
    val b: Int = a + 1
    val c: Int = a + 2
    println(a)
    println(b)
    println(c)
}
 */

/* №9
    print("Введите трехзначное число: ")
    val input: Int = readln().toInt()
    if (input < 100 || input > 999) {
        println("Введено не трехзначное число.")
        return
    }
    val a: Int = (input % 10) * 100 + ((input / 10) % 10) * 10 + (input / 100) % 10
    println("Перевернутое число: $a")
 */

/* №10
    print("Введите натуральное число: ")
    val number: Int = readln().toInt()
    if (number <= 0) {
        println("Введено не натуральное число")
        return
    }
    val a: Int = (number / 100) % 10
    println("Число сотен в $number: $a")
 */
}

