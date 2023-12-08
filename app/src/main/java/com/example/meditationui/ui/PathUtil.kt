package com.example.meditationui.ui

import androidx.compose.ui.geometry.Offset
import java.nio.file.Path

fun androidx.compose.ui.graphics.Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        from.x,
        from.y,
        Math.abs(from.x + to.x) / 2f,
        Math.abs(from.y + to.y) / 2f
    )
}


