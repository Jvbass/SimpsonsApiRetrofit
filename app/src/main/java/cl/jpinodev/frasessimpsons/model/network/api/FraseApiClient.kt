package cl.jpinodev.frasessimpsons.model.network.api

import cl.jpinodev.frasessimpsons.model.entity.FraseResponse
import cl.jpinodev.frasessimpsons.model.network.retrofit.RetrofitHelper

class FraseApiClient {
    private val retrofit = RetrofitHelper.getRetrofit()
    private val apiService = retrofit.create(FraseService::class.java)

    suspend fun getFrases(): MutableList<FraseResponse> {
        return apiService.getAllFrases()
    }
}