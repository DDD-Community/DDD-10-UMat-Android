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

public val UmatIcon.IcStarOutlined: ImageVector
    get() {
        if (_icStarOutlined != null) {
            return _icStarOutlined!!
        }
        _icStarOutlined = Builder(name = "IcStarOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8647f, 2.9981f)
                curveTo(12.4794f, 2.334f, 11.5202f, 2.334f, 11.1349f, 2.9981f)
                lineTo(8.4208f, 7.6754f)
                curveTo(8.2305f, 8.0035f, 7.9014f, 8.2274f, 7.5264f, 8.284f)
                lineTo(2.44f, 9.0523f)
                curveTo(1.5857f, 9.1813f, 1.2861f, 10.2599f, 1.9514f, 10.8111f)
                lineTo(5.7405f, 13.9503f)
                curveTo(6.0912f, 14.2409f, 6.2561f, 14.6993f, 6.1709f, 15.1467f)
                lineTo(5.1798f, 20.3519f)
                curveTo(5.0231f, 21.1747f, 5.8869f, 21.814f, 6.628f, 21.4238f)
                lineTo(11.4174f, 18.9019f)
                curveTo(11.7819f, 18.71f, 12.2176f, 18.71f, 12.5822f, 18.9019f)
                lineTo(17.3716f, 21.4238f)
                curveTo(18.1127f, 21.814f, 18.9765f, 21.1747f, 18.8198f, 20.3519f)
                lineTo(17.8287f, 15.1467f)
                curveTo(17.7435f, 14.6993f, 17.9084f, 14.2409f, 18.2591f, 13.9503f)
                lineTo(22.0482f, 10.8111f)
                curveTo(22.7135f, 10.2599f, 22.4139f, 9.1813f, 21.5596f, 9.0523f)
                lineTo(16.4733f, 8.284f)
                curveTo(16.0982f, 8.2274f, 15.7692f, 8.0035f, 15.5788f, 7.6754f)
                lineTo(12.8647f, 2.9981f)
                close()
            }
        }
        .build()
        return _icStarOutlined!!
    }

private var _icStarOutlined: ImageVector? = null
