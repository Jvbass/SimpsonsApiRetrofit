package cl.jpinodev.frasessimpsons.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.jpinodev.frasessimpsons.domain.FraseUseCase
import cl.jpinodev.frasessimpsons.model.entity.FraseResponse
import kotlinx.coroutines.launch

class FraseViewModel(private val useCase: FraseUseCase): ViewModel() {
    private var frasesList = MutableLiveData<MutableList<FraseResponse>>()

    val frasesLD
        get() = frasesList

    init {
        viewModelScope.launch {
            frasesList.value = useCase.getAllFrases()
        }
    }

}