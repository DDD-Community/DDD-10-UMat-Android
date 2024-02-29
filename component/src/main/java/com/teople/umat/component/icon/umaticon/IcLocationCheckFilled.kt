package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon

public val UmatIcon.IcLocationCheckFilled: ImageVector
    get() {
        if (_icLocationCheckFilled != null) {
            return _icLocationCheckFilled!!
        }
        _icLocationCheckFilled = Builder(name = "IcLocationCheckFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.7735f, 8.8774f)
                curveTo(4.1172f, 4.7084f, 7.601f, 1.5f, 11.7841f, 1.5f)
                horizontalLineTo(12.216f)
                curveTo(16.3991f, 1.5f, 19.8829f, 4.7084f, 20.2265f, 8.8774f)
                curveTo(20.4115f, 11.122f, 19.7182f, 13.3508f, 18.2925f, 15.0943f)
                lineTo(13.4995f, 20.9561f)
                curveTo(12.7245f, 21.9039f, 11.2756f, 21.9039f, 10.5006f, 20.9561f)
                lineTo(5.7075f, 15.0943f)
                curveTo(4.2819f, 13.3508f, 3.5885f, 11.122f, 3.7735f, 8.8774f)
                close()
                moveTo(15.5303f, 8.5303f)
                curveTo(15.8232f, 8.2374f, 15.8232f, 7.7626f, 15.5303f, 7.4697f)
                curveTo(15.2374f, 7.1768f, 14.7626f, 7.1768f, 14.4697f, 7.4697f)
                lineTo(11.5f, 10.4393f)
                lineTo(10.0303f, 8.9697f)
                curveTo(9.7374f, 8.6768f, 9.2626f, 8.6768f, 8.9697f, 8.9697f)
                curveTo(8.6768f, 9.2626f, 8.6768f, 9.7374f, 8.9697f, 10.0303f)
                lineTo(10.9697f, 12.0303f)
                curveTo(11.2626f, 12.3232f, 11.7374f, 12.3232f, 12.0303f, 12.0303f)
                lineTo(15.5303f, 8.5303f)
                close()
            }
        }
        .build()
        return _icLocationCheckFilled!!
    }

private var _icLocationCheckFilled: ImageVector? = null
