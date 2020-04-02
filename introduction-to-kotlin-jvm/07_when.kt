/*
Напишите программу, которая считывает число и выводит "A", если оно двузначное, 
"B", если оно трёхзначное и "C" во всех остальных случаях.

Гарантируется, что число положительное.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()

    when(a.toString().length) {
        3 -> print("B")
        2 -> print ("A")
        else -> print ("C")
    }
}

/*
Напишите программу, которая считывает строку и выводит:

    "A", если её длина больше 0 и меньше 11;
    "B", если её длина равна 20
    "C", если её длина равна 15
    "D" во всех остальных случаях.

Использовать условный опреатор if-else запрещено.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextLine()

    when(a.toString().length) {
        in 1..10 -> print("A")
        20 -> print("B")
        15 -> print("C")
        else -> print("D")
    }
}

/*
Напишите программу, которая считывает число и выводит:

    "F", если оно является одним из десяти первых чисел Фибоначчи (от 1 до 55 включительно);
    "T", если оно является одним из десяти первых треугольных чисел (от 0 до 45 включительно);
    "P", если оно является какой-либо положительной степенью целого числа 10 (не больше 106 10^6 106);
    "N" в противном случае.

В случае, если число подходит двум или нескольким условиям, нужно вывести первое из них.

Гарантируется, что число положительное.
*/
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>){
    val a = scan.nextInt()

    when(a){
        1,2,3,5,8,13,21,34,55 -> print("F")
        0,1,3,6,10,15,21,28,36,45 -> print("T")
        10,100,100,1000,10000,100000,1000000 -> print("P")
        else -> print("N")
    }
}