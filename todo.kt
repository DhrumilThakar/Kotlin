import java.lang.System.exit

fun main(){
    val tasks = mutableListOf<String>()
    val status = mutableListOf<Boolean>()
    while (true){
        print("1. Add Task\n2. View Task\n3. Mark Task as Done\n4. Delete a Task\n5. Exit\n")

        print("Enter a choice: ")
        var input=readln().toInt()

        when(input){

            1 -> {print("Enter Task")
                var task = readln()
                tasks.add(task)
                status.add(false)
            }

            2 -> {for (i in tasks.indices) {
                val mark = if (status[i]) "✔" else "❌"
                println("${i + 1}. ${tasks[i]} $mark")
            }}

            3 ->{
                println("Enter task number:")
                val input = readln().toIntOrNull()

                if (input == null) {
                    println("Invalid input")
                } else {
                    val index = input - 1

                    if (index in tasks.indices) {
                        status[index] = true
                    } else {
                        println("Invalid task number")
                    }
                }

            }
            4 ->{
                println("Enter task number:")
                val taskNo = readln().toIntOrNull()

                if (taskNo == null) {
                    println("Invalid input")
                } else {
                    val index = taskNo - 1

                    if (index in tasks.indices) {
                        tasks.removeAt(index)
                        status.removeAt(index)
                        println("Task deleted successfully")
                    } else {
                        println("Invalid task number")
                    }
                }

            }
            5->{
                exit(2)
            }
        }
    }
}