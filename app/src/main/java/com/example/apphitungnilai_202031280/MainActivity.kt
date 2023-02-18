package com.example.apphitungnilai_202031280

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var edtnim : EditText
    private lateinit var edtnama : EditText
    private lateinit var edthdr : EditText
    private lateinit var edttgs : EditText
    private lateinit var edtuts : EditText
    private lateinit var edtuas : EditText
    private lateinit var btnhitung : Button
    private lateinit var tvnim : TextView
    private lateinit var tvnama : TextView
    private lateinit var tvhdr : TextView
    private lateinit var tvtgs   : TextView
    private lateinit var tvuts : TextView
    private lateinit var tvuas : TextView
    private lateinit var tvakhir : TextView
    private lateinit var tvmutu : TextView
    private lateinit var tvpredikat : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtnim = findViewById(R.id.edt_nim)
        edtnama = findViewById(R.id.edt_nama)
        edthdr  = findViewById(R.id.edt_hdr)
        edttgs = findViewById(R.id.edt_tgs)
        edtuts = findViewById(R.id.edt_uts)
        edtuas = findViewById(R.id.edt_uas)
        btnhitung = findViewById(R.id.btn_hitung)
        tvnim = findViewById(R.id.tv_resultnim)
        tvnama = findViewById(R.id.tv_resultnama)
        tvhdr = findViewById(R.id.tv_resulthdr)
        tvtgs = findViewById(R.id.tv_resulttgs)
        tvuts = findViewById(R.id.tv_resultuts)
        tvuas = findViewById(R.id.tv_resultuas)
        tvakhir = findViewById(R.id.tv_resultakhr)
        tvmutu = findViewById(R.id.tv_resultmt)
        tvpredikat = findViewById(R.id.tv_resultpdkt)

        btnhitung.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_hitung){
            val inputnim = edtnim.text.toString().trim()
            val inputnama = edtnama.text.toString().trim()
            val inputhdr = edthdr.text.toString().trim()
            val inputtgs = edttgs.text.toString().trim()
            val inpututs = edtuts.text.toString().trim()
            val inputuas = edtuas.text.toString().trim()

            var isEmptyFields = false

            if (inputnim.isEmpty()){
                isEmptyFields = true
                edtnim.error = "Field Ini Tidak Boleh Kosong"
            }
            if (inputnama.isEmpty()){
                isEmptyFields = true
                edtnama.error = "Field Ini Tidak Boleh Kosong"
            }
            if (inputhdr.isEmpty()){
                isEmptyFields = true
                edthdr.error = "Field Ini Tidak Boleh Kosong"
            }
            if (inputtgs.isEmpty()){
                isEmptyFields = true
                edttgs.error = "Field Ini Tidak Boleh Kosong"
            }
            if (inpututs.isEmpty()){
                isEmptyFields = true
                edtuts.error = "Field Ini Tidak Boleh Kosong"
            }
            if (inputuas.isEmpty()){
                isEmptyFields = true
                edtuas.error = "Field Ini Tidak Boleh Kosong"
            }
            if (!isEmptyFields){
                tvnim.text = inputnim
                tvnama.text = inputnama
                tvhdr.text = inputhdr
                tvtgs.text = inputtgs
                tvuts.text = inpututs
                tvuas.text = inputuas

                val nilai = (inputhdr.toDouble() * 0.1 ) + (inputtgs.toDouble() * 0.2) + (inpututs.toDouble() * 0.3) + (inputuas.toDouble() * 0.4)
                tvakhir.text = nilai.toString()


                if (nilai<=99 && nilai>=80){
                    tvmutu.text = 'A' .toString()
                    tvpredikat.text = "lulus"
                }
                else if (nilai<=79 && nilai>=70){
                    tvmutu.text = 'B' .toString()
                    tvpredikat.text = "lulus"
                }
                else if (nilai<=69 && nilai>=60){
                    tvmutu.text = 'C' .toString()
                    tvpredikat.text = "lulus"
                }
                else if (nilai<=59 && nilai>=40){
                    tvmutu.text = 'D' .toString()
                    tvpredikat.text = "lulus"
                }
                else if (nilai<=40 && nilai>=1){
                    tvmutu.text = 'E' .toString()
                    tvpredikat.text = "Tidak Lulus"
                }
            }
        }
    }
}