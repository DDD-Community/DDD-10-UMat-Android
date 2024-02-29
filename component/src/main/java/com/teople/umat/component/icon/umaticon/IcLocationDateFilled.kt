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

public val UmatIcon.IcLocationDateFilled: ImageVector
    get() {
        if (_icLocationDateFilled != null) {
            return _icLocationDateFilled!!
        }
        _icLocationDateFilled = Builder(name = "IcLocationDateFilled", defaultWidth = 24.0.dp,
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
                moveTo(12.1942f, 13.9296f)
                curveTo(13.2054f, 13.0395f, 14.9935f, 11.3683f, 15.6618f, 10.1395f)
                curveTo(17.13f, 7.4362f, 13.4282f, 5.6339f, 12.0f, 8.3373f)
                curveTo(10.5718f, 5.6339f, 6.87f, 7.4362f, 8.3382f, 10.1395f)
                curveTo(9.0065f, 11.3683f, 10.7946f, 13.0395f, 11.8115f, 13.9296f)
                curveTo(11.864f, 13.9749f, 11.9322f, 14.0f, 12.0029f, 14.0f)
                curveTo(12.0736f, 14.0f, 12.1417f, 13.9749f, 12.1942f, 13.9296f)
                close()
            }
        }
        .build()
        return _icLocationDateFilled!!
    }

private var _icLocationDateFilled: ImageVector? = null
