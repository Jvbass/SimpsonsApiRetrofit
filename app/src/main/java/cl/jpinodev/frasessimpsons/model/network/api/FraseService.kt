package cl.jpinodev.frasessimpsons.model.network.api

import cl.jpinodev.frasessimpsons.model.entity.FraseResponse
import retrofit2.http.GET

interface FraseService {
    @GET("quotes?count=15")
    suspend fun getAllFrases(): MutableList<FraseResponse>
}