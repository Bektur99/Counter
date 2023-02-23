package com.example.homework5_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.homework5_1.Presenter.Presenter
import com.example.homework5_1.View.View
import com.example.homework5_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {
    lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
             presenter.increment()
            }
        }
    }

    override fun changeCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Рустам гей", Toast.LENGTH_SHORT).show()
    }
    override fun color(color: Int) {
        binding.resultTv.setTextColor(color)
    }
}