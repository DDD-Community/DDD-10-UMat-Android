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

public val UmatIcon.IcMoreOutlined: ImageVector
    get() {
        if (_icMoreOutlined != null) {
            return _icMoreOutlined!!
        }
        _icMoreOutlined = Builder(name = "IcMoreOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5303f, 8.9697f)
                curveTo(16.8232f, 9.2626f, 16.8232f, 9.7374f, 16.5303f, 10.0303f)
                lineTo(12.5303f, 14.0303f)
                curveTo(12.2374f, 14.3232f, 11.7626f, 14.3232f, 11.4697f, 14.0303f)
                lineTo(7.4697f, 10.0303f)
                curveTo(7.1768f, 9.7374f, 7.1768f, 9.2626f, 7.4697f, 8.9697f)
                curveTo(7.7626f, 8.6768f, 8.2374f, 8.6768f, 8.5303f, 8.9697f)
                lineTo(12.0f, 12.4393f)
                lineTo(15.4697f, 8.9697f)
                curveTo(15.7626f, 8.6768f, 16.2374f, 8.6768f, 16.5303f, 8.9697f)
                close()
            }
        }
        .build()
        return _icMoreOutlined!!
    }

private var _icMoreOutlined: ImageVector? = null
