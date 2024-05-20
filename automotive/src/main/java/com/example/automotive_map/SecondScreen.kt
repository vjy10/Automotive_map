package com.example.automotive_map

import android.graphics.Color
import androidx.car.app.CarContext

import androidx.car.app.Screen
import androidx.car.app.model.Action
import androidx.car.app.model.ActionStrip
import androidx.car.app.model.CarColor
import androidx.car.app.model.CarIcon
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Pane
import androidx.car.app.model.PaneTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template
import androidx.core.graphics.drawable.IconCompat
import com.example.navapp.R

import datas.models.PlaceRepository
import datas.models.toIntent

class SecondScreen(carContext: CarContext, private val placeId: Int) : Screen(carContext) {
    private var isFavorite = false
    override fun onGetTemplate(): Template {


val Place=PlaceRepository().getPlace(placeId)
    ?: return MessageTemplate.Builder("place not found").setHeaderAction(Action.BACK)
        .build()

 val navigateAction=Action.Builder()
     .setTitle("navigate")
     .setOnClickListener { carContext.startCarApp(Place.toIntent(CarContext.ACTION_NAVIGATE)) }.build()

val actionStrip=ActionStrip.Builder()
        .addAction(

            Action.Builder()
                .setIcon(
                    CarIcon.Builder(
                        IconCompat.createWithResource(
                            carContext,
                            R.drawable.baseline_favorite_24
                        )
                        ).setTint(
                            if (isFavorite) CarColor.RED else CarColor.createCustom(Color.LTGRAY,Color.DKGRAY)


                    ).build()
                        ).setOnClickListener {
                    isFavorite=!isFavorite
                    invalidate()
                }.build()
            ).build()

   return  PaneTemplate.Builder(
    Pane.Builder().addAction(navigateAction)
        .addRow(
            Row.Builder()
                .setTitle("Coordinates")
                .addText("${Place.latitude},${Place.longitude}")
                .build()
         )
        .addRow(
             Row.Builder()
                 .setTitle("Description")
                 .addText(Place.description)
                 .build()
            ).build()
    ).setTitle(Place.name)
        .setHeaderAction(Action.BACK)
       .setActionStrip(actionStrip)
        .build()
    }
    }
