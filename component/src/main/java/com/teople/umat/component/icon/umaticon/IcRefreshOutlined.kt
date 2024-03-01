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

public val UmatIcon.IcRefreshOutlined: ImageVector
    get() {
        if (_icRefreshOutlined != null) {
            return _icRefreshOutlined!!
        }
        _icRefreshOutlined = Builder(name = "IcRefreshOutlined", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5457f, 8.1619f)
                curveTo(6.3305f, 8.1051f, 6.1516f, 7.9557f, 6.0574f, 7.754f)
                curveTo(5.9633f, 7.5523f, 5.9635f, 7.3192f, 6.0582f, 7.1178f)
                lineTo(7.7189f, 3.5834f)
                curveTo(7.8427f, 3.32f, 8.1077f, 3.152f, 8.3987f, 3.1523f)
                curveTo(8.6897f, 3.1527f, 8.9542f, 3.3214f, 9.0773f, 3.5851f)
                lineTo(9.81f, 5.1543f)
                curveTo(9.8362f, 5.144f, 9.8632f, 5.1351f, 9.891f, 5.1276f)
                curveTo(14.2383f, 3.9628f, 18.7069f, 6.5427f, 19.8717f, 10.89f)
                curveTo(21.0366f, 15.2374f, 18.4567f, 19.7059f, 14.1094f, 20.8708f)
                curveTo(9.762f, 22.0356f, 5.2935f, 19.4557f, 4.1286f, 15.1084f)
                curveTo(3.7582f, 13.7259f, 3.7666f, 12.3291f, 4.091f, 11.0303f)
                curveTo(4.1914f, 10.6285f, 4.5985f, 10.3841f, 5.0004f, 10.4845f)
                curveTo(5.4023f, 10.5848f, 5.6466f, 10.992f, 5.5463f, 11.3939f)
                curveTo(5.282f, 12.4519f, 5.2747f, 13.5899f, 5.5775f, 14.7202f)
                curveTo(6.528f, 18.2673f, 10.174f, 20.3723f, 13.7211f, 19.4219f)
                curveTo(17.2683f, 18.4714f, 19.3733f, 14.8254f, 18.4229f, 11.2783f)
                curveTo(17.4879f, 7.7891f, 13.9449f, 5.6953f, 10.4533f, 6.5323f)
                lineTo(11.1925f, 8.1156f)
                curveTo(11.3156f, 8.3793f, 11.275f, 8.6904f, 11.0885f, 8.9138f)
                curveTo(10.9019f, 9.1371f, 10.603f, 9.2323f, 10.3216f, 9.1581f)
                lineTo(6.5457f, 8.1619f)
                close()
            }
        }
        .build()
        return _icRefreshOutlined!!
    }

private var _icRefreshOutlined: ImageVector? = null
