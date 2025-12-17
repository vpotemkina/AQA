//Создайте список имен и используйте функции let, run, also, apply и with
//для выполнения различных операций над этим списком (например,
//добавьте имя, удалите имя, переверните список и т. д.).

fun  main() {
    val Names = mutableListOf("Егор", "Лена", "Влад", "Ваня")

    Names.let {
        println("Начальный список имен: $it")
        it.add("Софа")
        it.remove("Ваня")
        println("1. Измененный список имен: $it")
    }

    Names
        .apply {this.reverse()}
        .apply { println("2. Измененный список имен:  $this") }

    Names.run {
        add("Лера")
        this.shuffle()
        println("3. Измененный список имен: $this")
    }

    with(Names) {
        add("Даша")
        this.shuffle()
        println("5. Измененный список имен: $this")
    }

    Names
        .apply {this.map { it.uppercase() }
            .also { println("6. Изменения внесены: $it") }
    }
}