package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val UmatIcon.IcMyOutlined: ImageVector
    get() {
        if (_icMyOutlined != null) {
            return _icMyOutlined!!
        }
        _icMyOutlined = Builder(name = "IcMyOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 7.5f)
                curveTo(7.75f, 5.1528f, 9.6528f, 3.25f, 12.0f, 3.25f)
                curveTo(14.3472f, 3.25f, 16.25f, 5.1528f, 16.25f, 7.5f)
                curveTo(16.25f, 9.8472f, 14.3472f, 11.75f, 12.0f, 11.75f)
                curveTo(9.6528f, 11.75f, 7.75f, 9.8472f, 7.75f, 7.5f)
                close()
                moveTo(12.0f, 4.75f)
                curveTo(10.4812f, 4.75f, 9.25f, 5.9812f, 9.25f, 7.5f)
                curveTo(9.25f, 9.0188f, 10.4812f, 10.25f, 12.0f, 10.25f)
                curveTo(13.5188f, 10.25f, 14.75f, 9.0188f, 14.75f, 7.5f)
                curveTo(14.75f, 5.9812f, 13.5188f, 4.75f, 12.0f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 14.75f)
                curveTo(6.7574f, 14.75f, 5.75f, 15.7574f, 5.75f, 17.0f)
                verticalLineTo(18.1883f)
                curveTo(5.75f, 18.2064f, 5.7631f, 18.2218f, 5.781f, 18.2247f)
                curveTo(9.8997f, 18.8972f, 14.1003f, 18.8972f, 18.219f, 18.2247f)
                curveTo(18.2369f, 18.2218f, 18.25f, 18.2064f, 18.25f, 18.1883f)
                verticalLineTo(17.0f)
                curveTo(18.25f, 15.7574f, 17.2426f, 14.75f, 16.0f, 14.75f)
                horizontalLineTo(15.6591f)
                curveTo(15.6328f, 14.75f, 15.6066f, 14.7542f, 15.5815f, 14.7623f)
                lineTo(14.716f, 15.045f)
                curveTo(12.9512f, 15.6212f, 11.0488f, 15.6212f, 9.284f, 15.045f)
                lineTo(8.4185f, 14.7623f)
                curveTo(8.3934f, 14.7542f, 8.3672f, 14.75f, 8.3409f, 14.75f)
                horizontalLineTo(8.0f)
                close()
                moveTo(4.25f, 17.0f)
                curveTo(4.25f, 14.9289f, 5.9289f, 13.25f, 8.0f, 13.25f)
                horizontalLineTo(8.3409f)
                curveTo(8.5254f, 13.25f, 8.7087f, 13.2792f, 8.8841f, 13.3364f)
                lineTo(9.7496f, 13.6191f)
                curveTo(11.2119f, 14.0965f, 12.7881f, 14.0965f, 14.2504f, 13.6191f)
                lineTo(15.1159f, 13.3364f)
                curveTo(15.2913f, 13.2792f, 15.4746f, 13.25f, 15.6591f, 13.25f)
                horizontalLineTo(16.0f)
                curveTo(18.0711f, 13.25f, 19.75f, 14.9289f, 19.75f, 17.0f)
                verticalLineTo(18.1883f)
                curveTo(19.75f, 18.9415f, 19.2041f, 19.5837f, 18.4607f, 19.7051f)
                curveTo(14.1819f, 20.4037f, 9.8181f, 20.4037f, 5.5393f, 19.7051f)
                curveTo(4.7959f, 19.5837f, 4.25f, 18.9415f, 4.25f, 18.1883f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _icMyOutlined!!
    }

private var _icMyOutlined: ImageVector? = null
