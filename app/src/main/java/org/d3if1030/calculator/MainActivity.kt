package org.d3if1030.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.d3if1030.calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    //private lateinit var EditBilangan1:EditText
    //private lateinit var EditBilangan2:EditText
    //private lateinit var ViewHasil:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonTambah.setOnClickListener { tambah() }
        binding.buttonKurang.setOnClickListener { kurang() }
        binding.buttonKali.setOnClickListener { kali() }
        binding.buttonBagi.setOnClickListener { bagi() }

        //EditBilangan1 = findViewById(R.id.edit_bilangan_pertama)
        //EditBilangan2 = findViewById(R.id.edit_bilangan_kedua)
        //ViewHasil = findViewById(R.id.text_hasil)

        //val ButtonTambah:Button = findViewById(R.id.button_tambah)
        //val ButtonKurang:Button = findViewById(R.id.button_kurang)
        //val ButtonKali:Button = findViewById(R.id.button_kali)
        //val ButtonBagi:Button = findViewById(R.id.button_bagi)

        //ButtonTambah.setOnClickListener(this)
        //ButtonKurang.setOnClickListener(this)
        //ButtonKali.setOnClickListener(this)
        //ButtonBagi.setOnClickListener(this)
    }

    private fun tambah() {
        val pertama = binding.editbilanganpertama.text.toString()
        if (TextUtils.isEmpty(pertama.toString())){
            Toast.makeText(this,R.string.pertama_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val kedua = binding.editbilangankedua.text.toString()
        if (TextUtils.isEmpty(kedua.toString())){
            Toast.makeText(this,R.string.kedua_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val tambah = pertama.toInt() + kedua.toInt()
        binding.textHasil.text = tambah.toString()
    }

    private fun kurang() {
        val pertama = binding.editbilanganpertama.text.toString()
        if (TextUtils.isEmpty(pertama.toString())){
            Toast.makeText(this,R.string.pertama_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val kedua = binding.editbilangankedua.text.toString()
        if (TextUtils.isEmpty(kedua.toString())){
            Toast.makeText(this,R.string.kedua_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val kurang = pertama.toInt() - kedua.toInt()
        binding.textHasil.text = kurang.toString()
    }

    private fun kali() {
        val pertama = binding.editbilanganpertama.text.toString()
        if (TextUtils.isEmpty(pertama.toString())){
            Toast.makeText(this,R.string.pertama_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val kedua = binding.editbilangankedua.text.toString()
        if (TextUtils.isEmpty(kedua.toString())){
            Toast.makeText(this,R.string.kedua_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val kali = pertama.toInt() * kedua.toInt()
        binding.textHasil.text = kali.toString()
    }
    private fun bagi() {
        val pertama = binding.editbilanganpertama.text.toString()
        if (TextUtils.isEmpty(pertama.toString())){
            Toast.makeText(this,R.string.pertama_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val kedua = binding.editbilangankedua.text.toString()
        if (TextUtils.isEmpty(kedua.toString())){
            Toast.makeText(this,R.string.kedua_invalid, Toast.LENGTH_LONG).show()
            return
        }
        val bagi = pertama.toInt() / kedua.toInt()
        binding.textHasil.text = bagi.toString()
    }

//    override fun onClick(v: View?) {
//        if (v != null) {
//            when(v.id){
//                R.id.button_tambah ->{
//                    val HasilTambah = EditBilangan1.text.toString().trim().toDouble() + EditBilangan2.text.toString().toDouble()
//                    ViewHasil.text = HasilTambah.toString()
//                }
//                R.id.button_kurang ->{
//                    val HasilKurang = EditBilangan1.text.toString().trim().toDouble() - EditBilangan2.text.toString().toDouble()
//                    ViewHasil.text = HasilKurang.toString()
//                }
//                R.id.button_kali ->{
//                    val HasilKali = EditBilangan1.text.toString().trim().toDouble() * EditBilangan2.text.toString().toDouble()
//                    ViewHasil.text = HasilKali.toString()
//                }
//                R.id.button_bagi ->{
//                    val HasilBagi = EditBilangan1.text.toString().trim().toDouble() / EditBilangan2.text.toString().toDouble()
//                    ViewHasil.text = HasilBagi.toString()
//                }
//            }
//        }
//    }

}