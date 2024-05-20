package com.example.automotive_map

import android.content.Intent
//import android.se.omapi.Session
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.Session


class HelloWorldSession : Session(){
    override fun onCreateScreen(intent: Intent): Screen {



        return FirstScreen(carContext)
    }


}