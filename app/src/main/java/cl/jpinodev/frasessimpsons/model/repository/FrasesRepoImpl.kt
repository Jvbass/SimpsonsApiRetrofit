package cl.jpinodev.frasessimpsons.model.repository

import cl.jpinodev.frasessimpsons.model.entity.FraseResponse
import cl.jpinodev.frasessimpsons.model.network.api.FraseApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FrasesRepoImpl(private val apiClient: FraseApiClient): FraseRepository {
    override suspend fun fetchFrases(): MutableList<FraseResponse> {
        return withContext(Dispatchers.IO){
            apiClient.getFrases()
        }
    }
}