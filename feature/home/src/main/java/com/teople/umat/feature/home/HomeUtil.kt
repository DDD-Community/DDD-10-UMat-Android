package com.teople.umat.feature.home

import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

object HomeUtil {
    fun calculateDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
        val R = 6371 //지구의 반지름
        val latDistance = Math.toRadians(lat2 - lat1)
        val lonDistance = Math.toRadians(lon2 - lon1)
        val a = sin(latDistance / 2) * sin(latDistance / 2) + (cos(Math.toRadians(lat1)) * cos(
            Math.toRadians(lat2)
        ) * sin(lonDistance / 2) * sin(lonDistance / 2))
        val c = 2 * atan2(sqrt(a), sqrt(1 - a))
        val distance = R * c

        return distance
    }
}