package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon

public val UmatIcon.IcFilterYou: ImageVector
    get() {
        if (_icFilterYou != null) {
            return _icFilterYou!!
        }
        _icFilterYou = Builder(name = "IcFilterYou", defaultWidth = 17.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 17.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFF5B0A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(15.1651f, 5.9599f)
                    curveTo(15.2084f, 4.0319f, 14.2257f, 2.3793f, 12.8291f, 1.5653f)
                    curveTo(11.5224f, 0.8039f, 9.8811f, 0.7999f, 8.4997f, 1.9233f)
                    curveTo(7.1184f, 0.7999f, 5.477f, 0.8046f, 4.1704f, 1.5653f)
                    curveTo(2.7737f, 2.3799f, 1.791f, 4.0319f, 1.8344f, 5.9599f)
                    curveTo(1.8973f, 8.7647f, 4.5623f, 11.061f, 6.5412f, 12.2183f)
                    lineTo(6.3152f, 13.6701f)
                    curveTo(6.2039f, 14.3853f, 6.757f, 15.0312f, 7.4809f, 15.0312f)
                    horizontalLineTo(9.5921f)
                    curveTo(10.316f, 15.0312f, 10.8692f, 14.3853f, 10.7578f, 13.6701f)
                    lineTo(10.5257f, 12.1785f)
                    curveTo(12.497f, 11.0089f, 15.1024f, 8.7329f, 15.1651f, 5.9599f)
                    close()
                }
            }
        }
        .build()
        return _icFilterYou!!
    }

private var _icFilterYou: ImageVector? = null
