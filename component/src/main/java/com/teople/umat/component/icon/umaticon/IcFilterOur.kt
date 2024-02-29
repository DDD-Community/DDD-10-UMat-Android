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

public val UmatIcon.IcFilterOur: ImageVector
    get() {
        if (_icFilterOur != null) {
            return _icFilterOur!!
        }
        _icFilterOur = Builder(name = "IcFilterOur", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFA855F7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.666f, 5.9599f)
                    curveTo(14.7094f, 4.0319f, 13.7267f, 2.3793f, 12.33f, 1.5653f)
                    curveTo(11.0234f, 0.8039f, 9.382f, 0.7999f, 8.0007f, 1.9233f)
                    curveTo(6.6194f, 0.7999f, 4.978f, 0.8046f, 3.6714f, 1.5653f)
                    curveTo(2.2747f, 2.3799f, 1.292f, 4.0319f, 1.3354f, 5.9599f)
                    curveTo(1.3983f, 8.7647f, 4.0632f, 11.061f, 6.0422f, 12.2183f)
                    lineTo(5.8162f, 13.6701f)
                    curveTo(5.7049f, 14.3853f, 6.258f, 15.0312f, 6.9819f, 15.0312f)
                    horizontalLineTo(9.0931f)
                    curveTo(9.817f, 15.0312f, 10.3701f, 14.3853f, 10.2588f, 13.6701f)
                    lineTo(10.0266f, 12.1785f)
                    curveTo(11.998f, 11.0089f, 14.6034f, 8.7329f, 14.666f, 5.9599f)
                    close()
                }
            }
        }
        .build()
        return _icFilterOur!!
    }

private var _icFilterOur: ImageVector? = null
