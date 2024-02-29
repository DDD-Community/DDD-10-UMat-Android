package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon

public val UmatIcon.IcPinYou: ImageVector
    get() {
        if (_icPinYou != null) {
            return _icPinYou!!
        }
        _icPinYou = Builder(name = "IcPinYou", defaultWidth = 36.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 36.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFF374151)), stroke = null, fillAlpha = 0.24f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 36.0f)
                arcToRelative(11.0f, 4.0f, 0.0f, true, false, 22.0f, 0.0f)
                arcToRelative(11.0f, 4.0f, 0.0f, true, false, -22.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF5B0A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(35.9963f, 13.3778f)
                curveTo(36.1133f, 8.1447f, 33.4601f, 3.6589f, 29.6891f, 1.4495f)
                curveTo(26.1611f, -0.617f, 21.7296f, -0.6278f, 18.0f, 2.4212f)
                curveTo(14.2704f, -0.6278f, 9.8389f, -0.6152f, 6.3109f, 1.4495f)
                curveTo(2.5399f, 3.6607f, -0.1133f, 8.1447f, 0.0037f, 13.3778f)
                curveTo(0.1736f, 20.9907f, 7.3689f, 27.2235f, 12.712f, 30.3648f)
                lineTo(12.1018f, 34.3054f)
                curveTo(11.8012f, 36.2468f, 13.2947f, 38.0f, 15.2492f, 38.0f)
                horizontalLineTo(20.9494f)
                curveTo(22.9039f, 38.0f, 24.3974f, 36.2468f, 24.0968f, 34.3054f)
                lineTo(23.4699f, 30.2568f)
                curveTo(28.7925f, 27.0821f, 35.8271f, 20.9045f, 35.9963f, 13.3778f)
                close()
            }
        }
        .build()
        return _icPinYou!!
    }

private var _icPinYou: ImageVector? = null
