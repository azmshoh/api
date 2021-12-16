package org.versusgame.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.versusgame.api.helper.NetworkHelper
import org.versusgame.api.retrofit.ApiClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NetworkHelper(ApiClient.getClient()).getAnimals(onFailure = {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        }, onResponse = {
            Toast.makeText(this, it.size.toString(), Toast.LENGTH_LONG).show()
        })
    }
}