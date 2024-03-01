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

public val UmatIcon.IcLockFilled: ImageVector
    get() {
        if (_icLockFilled != null) {
            return _icLockFilled!!
        }
        _icLockFilled = Builder(name = "IcLockFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.306f, 7.7583f)
                lineTo(7.6491f, 10.8458f)
                lineTo(6.9549f, 10.9012f)
                curveTo(5.9868f, 10.9785f, 5.1963f, 11.7063f, 5.0393f, 12.6647f)
                curveTo(4.6776f, 14.8736f, 4.6776f, 17.1266f, 5.0393f, 19.3355f)
                curveTo(5.1963f, 20.2939f, 5.9868f, 21.0216f, 6.9549f, 21.0989f)
                lineTo(8.451f, 21.2184f)
                curveTo(10.8131f, 21.4069f, 13.1865f, 21.4069f, 15.5487f, 21.2184f)
                lineTo(17.0448f, 21.0989f)
                curveTo(18.0129f, 21.0216f, 18.8034f, 20.2939f, 18.9603f, 19.3355f)
                curveTo(19.322f, 17.1266f, 19.322f, 14.8736f, 18.9603f, 12.6647f)
                curveTo(18.8034f, 11.7063f, 18.0129f, 10.9785f, 17.0448f, 10.9012f)
                lineTo(16.3505f, 10.8458f)
                lineTo(16.6935f, 7.7583f)
                curveTo(16.734f, 7.3943f, 16.734f, 7.027f, 16.6935f, 6.663f)
                lineTo(16.6708f, 6.4581f)
                curveTo(16.4293f, 4.2847f, 14.7207f, 2.565f, 12.5489f, 2.3095f)
                curveTo(12.1841f, 2.2666f, 11.8155f, 2.2666f, 11.4507f, 2.3095f)
                curveTo(9.2789f, 2.565f, 7.5703f, 4.2847f, 7.3288f, 6.4581f)
                lineTo(7.306f, 6.663f)
                curveTo(7.2656f, 7.027f, 7.2656f, 7.3943f, 7.306f, 7.7583f)
                close()
                moveTo(12.3736f, 3.7993f)
                curveTo(12.1253f, 3.77f, 11.8743f, 3.77f, 11.6259f, 3.7993f)
                curveTo(10.1473f, 3.9732f, 8.984f, 5.144f, 8.8196f, 6.6237f)
                lineTo(8.7969f, 6.8286f)
                curveTo(8.7686f, 7.0825f, 8.7686f, 7.3387f, 8.7969f, 7.5926f)
                lineTo(9.1456f, 10.7318f)
                curveTo(11.0464f, 10.6099f, 12.9531f, 10.6099f, 14.8539f, 10.7318f)
                lineTo(15.2027f, 7.5926f)
                curveTo(15.2309f, 7.3387f, 15.2309f, 7.0825f, 15.2027f, 6.8286f)
                lineTo(15.18f, 6.6237f)
                curveTo(15.0155f, 5.144f, 13.8523f, 3.9732f, 12.3736f, 3.7993f)
                close()
                moveTo(11.9998f, 14.5001f)
                curveTo(11.1714f, 14.5001f, 10.4998f, 15.1717f, 10.4998f, 16.0001f)
                curveTo(10.4998f, 16.8285f, 11.1714f, 17.5001f, 11.9998f, 17.5001f)
                curveTo(12.8282f, 17.5001f, 13.4998f, 16.8285f, 13.4998f, 16.0001f)
                curveTo(13.4998f, 15.1717f, 12.8282f, 14.5001f, 11.9998f, 14.5001f)
                close()
            }
        }
        .build()
        return _icLockFilled!!
    }

private var _icLockFilled: ImageVector? = null
