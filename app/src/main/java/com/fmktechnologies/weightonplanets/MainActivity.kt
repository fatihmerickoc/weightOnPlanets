package com.fmktechnologies.weightonplanets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    val MARS=0.38
    val JUPITER=2.5
    val MOON = 0.16
    val PLUTO  = 0.06
   val SATURN = 1.0622
   val SUN =  27.07


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        et_Marssonuc.text = savedInstanceState?.getString("mars")
       et_Jupitersonuc.text = savedInstanceState?.getString("jupiter")
        et_Moonsonuc.text = savedInstanceState?.getString("moon")
        et_Plutosonuc.text = savedInstanceState?.getString("pluto")
        et_theSUNsonuc.text = savedInstanceState?.getString("sun")
        et_saturnsonuc.text = savedInstanceState?.getString("saturn")









        btn_hesapla.setOnClickListener{

            val girilenkilo= et_girilenkilo.text
            if (girilenkilo.isNullOrEmpty()){
                Toast.makeText(this,"Please enter your kg!",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            var Marskilonuz=(girilenkilo.toString().toDouble()*MARS).formatla()
            var Sunkilonuz=(girilenkilo.toString().toDouble()*SUN).formatla()
            var Saturnkilonuz=(girilenkilo.toString().toDouble()*SATURN).formatla()
            var Jupiterkilonuz=(girilenkilo.toString().toDouble()*JUPITER).formatla()
            var Moonkilonuz=(girilenkilo.toString().toDouble()*MOON).formatla()
            var Plutokilonuz=(girilenkilo.toString().toDouble()*PLUTO).formatla()

try {
    et_Marssonuc.text= Marskilonuz.toString() +"kg"
    et_theSUNsonuc.text= Sunkilonuz.toString() +"kg"
    et_saturnsonuc.text= Saturnkilonuz.toString() +"kg"
    et_Jupitersonuc.text= Jupiterkilonuz.toString() +"kg"
    et_Moonsonuc.text= Moonkilonuz.toString() +"kg"
    et_Plutosonuc.text= Plutokilonuz.toString() +"kg"

}catch (hata:Exception){
    et_Marssonuc.text= " kg"
    et_theSUNsonuc.text= " kg"
    et_saturnsonuc.text= " kg"
    et_Jupitersonuc.text=" kg"
    et_Moonsonuc.text=" kg"
    et_Plutosonuc.text=" kg"
}






        }





    }





    fun Double.formatla()=String.format("%.1f",this)
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
         outState.putString("mars",et_Marssonuc.text.toString())
         outState.putString("sun",et_theSUNsonuc.text.toString())
         outState.putString("saturn",et_saturnsonuc.text.toString())
         outState.putString("jupiter",et_Jupitersonuc.text.toString())
         outState.putString("moon",et_Moonsonuc.text.toString())
         outState.putString("pluto",et_Plutosonuc.text.toString())
    }

}
