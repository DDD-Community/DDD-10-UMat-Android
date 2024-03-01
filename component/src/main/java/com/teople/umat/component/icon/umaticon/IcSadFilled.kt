package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val UmatIcon.IcSadFilled: ImageVector
    get() {
        if (_icSadFilled != null) {
            return _icSadFilled!!
        }
        _icSadFilled = Builder(name = "IcSadFilled", defaultWidth = 25.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2998f, 23.9664f)
                curveTo(13.7998f, 23.9664f, 11.4998f, 22.6664f, 10.1998f, 20.5664f)
                curveTo(8.8998f, 18.4664f, 8.7998f, 15.8664f, 9.8998f, 13.5664f)
                lineTo(15.3998f, 2.4664f)
                curveTo(15.6998f, 1.7664f, 16.7998f, 1.7664f, 17.1998f, 2.4664f)
                lineTo(22.6998f, 13.5664f)
                curveTo(23.7998f, 15.7664f, 23.6998f, 18.4664f, 22.3998f, 20.5664f)
                curveTo(21.0998f, 22.6664f, 18.7998f, 23.9664f, 16.2998f, 23.9664f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2998f, 12.9664f)
                curveTo(3.9998f, 12.9664f, 2.7998f, 12.2664f, 2.0998f, 11.1664f)
                curveTo(1.3998f, 10.0664f, 1.2998f, 8.6664f, 1.8998f, 7.4664f)
                lineTo(4.3998f, 2.4664f)
                curveTo(4.6998f, 1.7664f, 5.8998f, 1.7664f, 6.1998f, 2.4664f)
                lineTo(8.6998f, 7.4664f)
                curveTo(9.2998f, 8.6664f, 9.1998f, 10.0664f, 8.4998f, 11.1664f)
                curveTo(7.8998f, 12.3664f, 6.5998f, 12.9664f, 5.2998f, 12.9664f)
                close()
            }
        }
        .build()
        return _icSadFilled!!
    }

private var _icSadFilled: ImageVector? = null
