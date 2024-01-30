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

public val UmatIcon.IcCurrentLocationOutlined: ImageVector
    get() {
        if (_icCurrentLocationOutlined != null) {
            return _icCurrentLocationOutlined!!
        }
        _icCurrentLocationOutlined = Builder(name = "IcCurrentLocationOutlined", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                verticalLineTo(3.7836f)
                curveTo(7.2922f, 4.1403f, 4.1403f, 7.2922f, 3.7836f, 11.25f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 11.25f, 1.25f, 11.5858f, 1.25f, 12.0f)
                curveTo(1.25f, 12.4142f, 1.5858f, 12.75f, 2.0f, 12.75f)
                horizontalLineTo(3.7836f)
                curveTo(4.1403f, 16.7079f, 7.2922f, 19.8597f, 11.25f, 20.2164f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.4142f, 11.5858f, 22.75f, 12.0f, 22.75f)
                curveTo(12.4142f, 22.75f, 12.75f, 22.4142f, 12.75f, 22.0f)
                verticalLineTo(20.2164f)
                curveTo(16.7079f, 19.8597f, 19.8597f, 16.7079f, 20.2164f, 12.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 12.75f, 22.75f, 12.4142f, 22.75f, 12.0f)
                curveTo(22.75f, 11.5858f, 22.4142f, 11.25f, 22.0f, 11.25f)
                horizontalLineTo(20.2164f)
                curveTo(19.8597f, 7.2922f, 16.7079f, 4.1403f, 12.75f, 3.7836f)
                verticalLineTo(2.0f)
                close()
                moveTo(8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                close()
            }
        }
        .build()
        return _icCurrentLocationOutlined!!
    }

private var _icCurrentLocationOutlined: ImageVector? = null
