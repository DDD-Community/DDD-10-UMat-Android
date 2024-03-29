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

public val UmatIcon.IcClockOutlined: ImageVector
    get() {
        if (_icClockOutlined != null) {
            return _icClockOutlined!!
        }
        _icClockOutlined = Builder(name = "IcClockOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 12.0f)
                curveTo(3.5f, 7.3056f, 7.3056f, 3.5f, 12.0f, 3.5f)
                curveTo(16.6944f, 3.5f, 20.5f, 7.3056f, 20.5f, 12.0f)
                curveTo(20.5f, 16.6944f, 16.6944f, 20.5f, 12.0f, 20.5f)
                curveTo(7.3056f, 20.5f, 3.5f, 16.6944f, 3.5f, 12.0f)
                close()
                moveTo(12.75f, 7.0f)
                curveTo(12.75f, 6.5858f, 12.4142f, 6.25f, 12.0f, 6.25f)
                curveTo(11.5858f, 6.25f, 11.25f, 6.5858f, 11.25f, 7.0f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 12.2586f, 11.3832f, 12.4989f, 11.6025f, 12.636f)
                lineTo(14.6025f, 14.511f)
                curveTo(14.9538f, 14.7305f, 15.4165f, 14.6238f, 15.636f, 14.2725f)
                curveTo(15.8555f, 13.9212f, 15.7488f, 13.4585f, 15.3975f, 13.239f)
                lineTo(12.75f, 11.5843f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _icClockOutlined!!
    }

private var _icClockOutlined: ImageVector? = null
