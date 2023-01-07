package com.elopez.pokemonfeature.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Crystal(
    val back_default: String,
    val back_shiny: String,
    val back_shiny_transparent: String,
    val back_transparent: String,
    val front_default: String,
    val front_shiny: String,
    val front_shiny_transparent: String,
    val front_transparent: String
): Parcelable