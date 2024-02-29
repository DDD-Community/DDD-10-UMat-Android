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

public val UmatIcon.IcFollowFilled: ImageVector
    get() {
        if (_icFollowFilled != null) {
            return _icFollowFilled!!
        }
        _icFollowFilled = Builder(name = "IcFollowFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4067f, 2.4866f)
                curveTo(6.4904f, 1.8745f, 5.1555f, 2.5332f, 5.2547f, 3.7246f)
                lineTo(5.2837f, 4.0722f)
                curveTo(5.7252f, 9.3737f, 6.6591f, 14.6259f, 8.0738f, 19.765f)
                curveTo(8.4108f, 20.9889f, 10.1041f, 21.0944f, 10.6182f, 19.96f)
                lineTo(12.7468f, 15.263f)
                curveTo(12.9503f, 14.8139f, 13.4444f, 14.5257f, 13.9806f, 14.5831f)
                lineTo(19.247f, 15.1471f)
                curveTo(20.4558f, 15.2766f, 21.3101f, 13.8006f, 20.3413f, 12.8654f)
                curveTo(16.4525f, 9.1112f, 12.2227f, 5.7039f, 7.7031f, 2.6846f)
                lineTo(7.4067f, 2.4866f)
                close()
            }
        }
        .build()
        return _icFollowFilled!!
    }

private var _icFollowFilled: ImageVector? = null
