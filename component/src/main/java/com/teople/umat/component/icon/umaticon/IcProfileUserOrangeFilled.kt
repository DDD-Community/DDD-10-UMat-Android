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

public val UmatIcon.IcProfileUserOrangeFilled: ImageVector
    get() {
        if (_icProfileUserOrangeFilled != null) {
            return _icProfileUserOrangeFilled!!
        }
        _icProfileUserOrangeFilled = Builder(
            name = "IcProfileUserOrangeFilled", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFF5B0A)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.9981f, 10.393f)
                curveTo(22.0631f, 7.501f, 20.5891f, 5.022f, 18.4941f, 3.801f)
                curveTo(16.5341f, 2.659f, 14.0721f, 2.653f, 12.0001f, 4.338f)
                curveTo(9.9281f, 2.653f, 7.4661f, 2.66f, 5.5061f, 3.801f)
                curveTo(3.4111f, 5.023f, 1.9371f, 7.501f, 2.0021f, 10.393f)
                curveTo(2.0965f, 14.6002f, 6.0939f, 18.0447f, 9.0623f, 19.7806f)
                lineTo(8.9668f, 20.3939f)
                curveTo(8.6719f, 22.289f, 10.1374f, 24.0003f, 12.0552f, 24.0003f)
                curveTo(13.9731f, 24.0003f, 15.4386f, 22.289f, 15.1436f, 20.3939f)
                lineTo(15.0389f, 19.721f)
                curveTo(17.9959f, 17.9665f, 21.9041f, 14.5525f, 21.9981f, 10.393f)
                close()
            }
        }
            .build()
        return com.teople.umat.component.icon.umaticon._icProfileUserOrangeFilled!!
    }

private var _icProfileUserOrangeFilled: ImageVector? = null
