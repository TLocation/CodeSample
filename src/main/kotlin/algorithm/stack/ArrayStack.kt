package algorithm.stack

class ArrayStack(private val capacity:Int) {
    private val array = IntArray(capacity)
    private var count:Int = 0



    fun push(value:Int):Boolean{
        if(count >= capacity){
            return false
        }
        array[count++] = value
        return true
    }


    fun peek():Int? = if(count > 0){
        array[count -1]
    }else{
        null
    }

    fun pop():Int? = if(count > 0){
        count--
        array[count]
    }else{
        null
    }
}