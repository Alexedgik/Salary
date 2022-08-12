package com.example.myapplicationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplicationapp.constance.Constance
import com.example.myapplicationapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btResult.setOnClickListener {

            val resultValue = binding.edValue.text.toString()
            binding.imPhoto.visibility = View.VISIBLE
            when (resultValue) {
                Constance.DVORNIK -> {
                    binding.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DVORNIK_SUELDO}"
                    if(binding.edPassword.text.toString() == Constance.DVORNIK_PASSWORD){
                        binding.tvResult.text = tempText
                        binding.imPhoto.setImageResource(R.drawable.sergey)
                     }else{
                        binding.tvResult.text = "Не верный пароль"
                        binding.imPhoto.setImageResource(R.drawable.dula)

                        }
                    }
                Constance.INGINER -> {
                    binding.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.INGINER_SUELDO}"
                    if(binding.edPassword.text.toString() == Constance.INGINER_PASSWORD){
                        binding.tvResult.text = tempText
                        binding.imPhoto.setImageResource(R.drawable.andrey)
                    }else{
                        binding.tvResult.text = "Не верный пароль"
                        binding.imPhoto.setImageResource(R.drawable.dula)

                    }
                }

                Constance.DIRECTOR -> {
                    binding.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ваши ${Constance.DIRECTOR_SUELDO}"
                    if(binding.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD){
                        binding.tvResult.text = tempText
                        binding.imPhoto.setImageResource(R.drawable.egor)
                    }else{

                        binding.tvResult.text = "Не верный пароль"
                        binding.imPhoto.setImageResource(R.drawable.dula)

                    }
                }
                else -> {
                    binding.tvResult.visibility = View.VISIBLE
                    binding.tvResult.text = "Нет такого работника"
                }
            }
        }
    }
}