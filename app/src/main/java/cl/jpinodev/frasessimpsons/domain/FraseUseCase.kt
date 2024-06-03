package cl.jpinodev.frasessimpsons.domain

import cl.jpinodev.frasessimpsons.model.entity.FraseResponse
import cl.jpinodev.frasessimpsons.model.repository.FrasesRepoImpl

class FraseUseCase (private val repository: FrasesRepoImpl) {

    suspend fun getAllFrases(): MutableList<FraseResponse> {
        return repository.fetchFrases()
    }
}