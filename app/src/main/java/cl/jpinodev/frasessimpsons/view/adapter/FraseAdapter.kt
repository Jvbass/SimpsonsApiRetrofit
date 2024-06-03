package cl.jpinodev.frasessimpsons.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.jpinodev.frasessimpsons.databinding.FraseItemBinding
import cl.jpinodev.frasessimpsons.model.entity.FraseResponse

class FraseAdapter: RecyclerView.Adapter<ViewHolder>() {

        var frases = mutableListOf<FraseResponse>()
            set(value) {
                field = value
                this.notifyDataSetChanged()
            }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = FraseItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val frase = frases[position]
            holder.bindFrase(frase)
        }

        override fun getItemCount(): Int {
            return frases.size
        }
}