package org.techtales.fcmnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtales.fcmnotification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var dataString: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        if (intent!= null) {

            if(intent.hasExtra("key1")){

                for (key in intent.extras!!.keySet()){
                    dataString = dataString+intent.extras!!.getString(key)+"\n"
                }
                binding.textView.text = dataString.toString()
            }
        }
    }
}