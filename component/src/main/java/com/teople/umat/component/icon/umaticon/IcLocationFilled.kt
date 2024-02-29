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

public val UmatIcon.IcLocationFilled: ImageVector
    get() {
        if (_icLocationFilled != null) {
            return _icLocationFilled!!
        }
        _icLocationFilled = Builder(name = "IcLocationFilled", defaultWidth = 25.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 10.0f)
                curveTo(9.25f, 8.2051f, 10.7051f, 6.75f, 12.5f, 6.75f)
                curveTo(14.2949f, 6.75f, 15.75f, 8.2051f, 15.75f, 10.0f)
                curveTo(15.75f, 11.7949f, 14.2949f, 13.25f, 12.5f, 13.25f)
                curveTo(10.7051f, 13.25f, 9.25f, 11.7949f, 9.25f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.2735f, 8.8774f)
                curveTo(4.6172f, 4.7084f, 8.101f, 1.5f, 12.2841f, 1.5f)
                horizontalLineTo(12.716f)
                curveTo(16.8991f, 1.5f, 20.3829f, 4.7084f, 20.7265f, 8.8774f)
                curveTo(20.9115f, 11.122f, 20.2182f, 13.3508f, 18.7925f, 15.0943f)
                lineTo(13.9995f, 20.9561f)
                curveTo(13.2245f, 21.9039f, 11.7756f, 21.9039f, 11.0006f, 20.9561f)
                lineTo(6.2075f, 15.0943f)
                curveTo(4.7819f, 13.3508f, 4.0885f, 11.122f, 4.2735f, 8.8774f)
                close()
                moveTo(12.5f, 5.25f)
                curveTo(9.8766f, 5.25f, 7.75f, 7.3766f, 7.75f, 10.0f)
                curveTo(7.75f, 12.6234f, 9.8766f, 14.75f, 12.5f, 14.75f)
                curveTo(15.1234f, 14.75f, 17.25f, 12.6234f, 17.25f, 10.0f)
                curveTo(17.25f, 7.3766f, 15.1234f, 5.25f, 12.5f, 5.25f)
                close()
            }
        }
        .build()
        return _icLocationFilled!!
    }

private var _icLocationFilled: ImageVector? = null
