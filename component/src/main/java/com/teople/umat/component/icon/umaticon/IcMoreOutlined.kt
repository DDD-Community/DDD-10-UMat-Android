package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1804f, 8.215f)
                curveTo(6.1136f, 8.1463f, 6.035f, 8.0926f, 5.9492f, 8.057f)
                curveTo(5.8633f, 8.0213f, 5.7718f, 8.0045f, 5.68f, 8.0073f)
                curveTo(5.5881f, 8.0101f, 5.4977f, 8.0326f, 5.4138f, 8.0735f)
                curveTo(5.3299f, 8.1143f, 5.2543f, 8.1728f, 5.1912f, 8.2454f)
                curveTo(5.128f, 8.3181f, 5.0787f, 8.4036f, 5.0459f, 8.497f)
                curveTo(5.0132f, 8.5904f, 4.9977f, 8.69f, 5.0003f, 8.7899f)
                curveTo(5.0029f, 8.8898f, 5.0235f, 8.9883f, 5.0611f, 9.0795f)
                curveTo(5.0986f, 9.1708f, 5.1523f, 9.2531f, 5.2192f, 9.3218f)
                lineTo(11.5155f, 15.7919f)
                curveTo(11.6453f, 15.9255f, 11.8173f, 16.0f, 11.9961f, 16.0f)
                curveTo(12.1748f, 16.0f, 12.3468f, 15.9255f, 12.4767f, 15.7919f)
                lineTo(18.7737f, 9.3218f)
                curveTo(18.8419f, 9.2535f, 18.8971f, 9.1713f, 18.9358f, 9.0797f)
                curveTo(18.9746f, 8.9881f, 18.9963f, 8.889f, 18.9996f, 8.7882f)
                curveTo(19.0029f, 8.6875f, 18.9877f, 8.587f, 18.955f, 8.4926f)
                curveTo(18.9223f, 8.3982f, 18.8727f, 8.3119f, 18.8091f, 8.2386f)
                curveTo(18.7454f, 8.1653f, 18.669f, 8.1064f, 18.5843f, 8.0655f)
                curveTo(18.4996f, 8.0246f, 18.4083f, 8.0024f, 18.3156f, 8.0002f)
                curveTo(18.223f, 7.998f, 18.1308f, 8.0158f, 18.0446f, 8.0527f)
                curveTo(17.9583f, 8.0896f, 17.8797f, 8.1447f, 17.8132f, 8.215f)
                lineTo(11.9961f, 14.1919f)
                lineTo(6.1804f, 8.215f)
                close()
            }
        }
        .build()
        return _icMoreOutlined!!
    }

private var _icMoreOutlined: ImageVector? = null
