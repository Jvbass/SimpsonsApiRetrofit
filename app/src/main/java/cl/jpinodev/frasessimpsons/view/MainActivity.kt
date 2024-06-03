package cl.jpinodev.frasessimpsons.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import cl.jpinodev.frasessimpsons.R
import cl.jpinodev.frasessimpsons.databinding.ActivityMainBinding
import cl.jpinodev.frasessimpsons.domain.FraseUseCase
import cl.jpinodev.frasessimpsons.model.network.api.FraseApiClient
import cl.jpinodev.frasessimpsons.model.repository.FrasesRepoImpl
import cl.jpinodev.frasessimpsons.view.adapter.FraseAdapter
import cl.jpinodev.frasessimpsons.viewmodel.FraseViewModel
import cl.jpinodev.frasessimpsons.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val FraseApiClient = FraseApiClient()
        val repository = FrasesRepoImpl(FraseApiClient)
        val useCase = FraseUseCase(repository)

        val viewModelFactory = ViewModelFactory(useCase)
        val viewModel = ViewModelProvider(this, viewModelFactory)[FraseViewModel::class.java]

        val adapterFrase = FraseAdapter()

        binding.recyclerFrases.adapter = adapterFrase
        binding.recyclerFrases.layoutManager = LinearLayoutManager(this)
        viewModel.frasesLD.observe(this) {
            adapterFrase.frases = it
        }
    }
}