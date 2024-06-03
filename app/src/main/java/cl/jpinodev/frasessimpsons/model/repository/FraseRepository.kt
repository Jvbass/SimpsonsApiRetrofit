package cl.jpinodev.frasessimpsons.model.repository

import cl.jpinodev.frasessimpsons.model.entity.FraseResponse

interface FraseRepository {
    suspend fun fetchFrases(): MutableList<FraseResponse>
}