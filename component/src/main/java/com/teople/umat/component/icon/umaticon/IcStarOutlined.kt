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

public val UmatIcon.IcStarOutlined: ImageVector
    get() {
        if (_icStarOutlined != null) {
            return _icStarOutlined!!
        }
        _icStarOutlined = Builder(name = "IcStarOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.4864f, 4.1139f)
                curveTo(11.1608f, 2.9516f, 12.8392f, 2.9516f, 13.5136f, 4.1139f)
                lineTo(15.579f, 7.6733f)
                curveTo(15.7694f, 8.0013f, 16.0984f, 8.2252f, 16.4735f, 8.2819f)
                lineTo(19.9031f, 8.7999f)
                curveTo(21.3981f, 9.0257f, 21.9225f, 10.9133f, 20.7582f, 11.8778f)
                lineTo(18.2593f, 13.9482f)
                curveTo(17.9086f, 14.2387f, 17.7437f, 14.6971f, 17.8289f, 15.1446f)
                lineTo(18.5289f, 18.8205f)
                curveTo(18.8031f, 20.2605f, 17.2914f, 21.3793f, 15.9944f, 20.6963f)
                lineTo(12.5824f, 18.8998f)
                curveTo(12.2178f, 18.7078f, 11.7822f, 18.7078f, 11.4176f, 18.8998f)
                lineTo(8.0055f, 20.6963f)
                curveTo(6.7085f, 21.3793f, 5.1969f, 20.2605f, 5.4711f, 18.8205f)
                lineTo(6.1711f, 15.1446f)
                curveTo(6.2563f, 14.6971f, 6.0914f, 14.2387f, 5.7406f, 13.9482f)
                lineTo(3.2417f, 11.8778f)
                curveTo(2.0774f, 10.9133f, 2.6018f, 9.0257f, 4.0968f, 8.7999f)
                lineTo(7.5265f, 8.2819f)
                curveTo(7.9015f, 8.2252f, 8.2306f, 8.0013f, 8.421f, 7.6733f)
                lineTo(10.4864f, 4.1139f)
                close()
                moveTo(12.2162f, 4.8667f)
                curveTo(12.1199f, 4.7007f, 11.8801f, 4.7007f, 11.7838f, 4.8667f)
                lineTo(9.7184f, 8.4261f)
                curveTo(9.2995f, 9.1479f, 8.5756f, 9.6404f, 7.7505f, 9.765f)
                lineTo(4.3208f, 10.2831f)
                curveTo(4.1073f, 10.3153f, 4.0324f, 10.585f, 4.1987f, 10.7228f)
                lineTo(6.6976f, 12.7931f)
                curveTo(7.4692f, 13.4324f, 7.832f, 14.4408f, 7.6446f, 15.4251f)
                lineTo(6.9446f, 19.1011f)
                curveTo(6.9054f, 19.3068f, 7.1214f, 19.4667f, 7.3067f, 19.3691f)
                lineTo(10.7188f, 17.5725f)
                curveTo(11.5207f, 17.1502f, 12.4793f, 17.1502f, 13.2812f, 17.5725f)
                lineTo(16.6933f, 19.3691f)
                curveTo(16.8786f, 19.4667f, 17.0945f, 19.3068f, 17.0553f, 19.1011f)
                lineTo(16.3554f, 15.4251f)
                curveTo(16.1679f, 14.4408f, 16.5307f, 13.4324f, 17.3024f, 12.7931f)
                lineTo(19.8013f, 10.7228f)
                curveTo(19.9676f, 10.585f, 19.8927f, 10.3153f, 19.6791f, 10.2831f)
                lineTo(16.2495f, 9.765f)
                curveTo(15.4243f, 9.6404f, 14.7004f, 9.1479f, 14.2816f, 8.4261f)
                lineTo(12.2162f, 4.8667f)
                close()
            }
        }
        .build()
        return _icStarOutlined!!
    }

private var _icStarOutlined: ImageVector? = null
