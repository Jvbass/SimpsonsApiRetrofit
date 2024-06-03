package cl.jpinodev.frasessimpsons.model.entity

import com.google.gson.annotations.SerializedName

data class FraseResponse(
    @SerializedName("quote")
    val frase: String,
    @SerializedName("character")
    val personaje: String,
    @SerializedName("image")
    val imagen: String,
    @SerializedName("characterDirection")
    val direccionPersonaje: String
)
