import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class CounterViewModel: ViewModel() {
    var counter by mutableStateOf(value = 0)

    fun incrementCounter (){
        counter++
    }
    fun decrementCounter (){
        counter--
    }
}