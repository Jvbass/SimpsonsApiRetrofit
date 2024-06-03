package cl.jpinodev.frasessimpsons.view.adapter

import androidx.recyclerview.widget.RecyclerView
import cl.jpinodev.frasessimpsons.databinding.FraseItemBinding
import cl.jpinodev.frasessimpsons.model.entity.FraseResponse

class ViewHolder(private var binding: FraseItemBinding): RecyclerView.ViewHolder(binding.root){

    fun bindFrase(frase: FraseResponse) {
            binding.tvFrase.text = frase.frase
            binding.tvCharacter.text = frase.personaje
        }
}