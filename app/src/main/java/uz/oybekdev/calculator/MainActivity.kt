package uz.oybekdev.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.oybekdev.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.plusbtn.setOnClickListener{
            val firstNuumber = binding.firstNumberEt.text.toString().toInt()
            val secondNuumber = binding.secondNumberEt.text.toString().toInt()
            binding.resulttv.text =" ${ firstNuumber + secondNuumber }"
        }
        binding.minusbtn.setOnClickListener{
            val firstNuumber = binding.firstNumberEt.text.toString().toInt()
            val secondNuumber = binding.secondNumberEt.text.toString().toInt()
            binding.resulttv.text =" ${ firstNuumber - secondNuumber }"
        }
        binding.multiplybtn.setOnClickListener{
            val firstNuumber = binding.firstNumberEt.text.toString().toInt()
            val secondNuumber = binding.secondNumberEt.text.toString().toInt()
            binding.resulttv.text =" ${ firstNuumber * secondNuumber }"
        }
        binding.devidebtn.setOnClickListener{
            val firstNuumber = binding.firstNumberEt.text.toString().toDouble()
            val secondNuumber = binding.secondNumberEt.text.toString().toInt()
            binding.resulttv.text =" ${ firstNuumber / secondNuumber }"
        }
    }
}