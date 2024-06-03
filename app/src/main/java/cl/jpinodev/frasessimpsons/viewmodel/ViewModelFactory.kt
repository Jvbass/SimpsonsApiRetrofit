package cl.jpinodev.frasessimpsons.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import cl.jpinodev.frasessimpsons.domain.FraseUseCase

class ViewModelFactory(private val useCase: FraseUseCase): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(FraseViewModel::class.java)){
            return FraseViewModel(useCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}