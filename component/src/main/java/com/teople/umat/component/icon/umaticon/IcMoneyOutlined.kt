package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon

public val UmatIcon.IcMoneyOutlined: ImageVector
    get() {
        if (_icMoneyOutlined != null) {
            return _icMoneyOutlined!!
        }
        _icMoneyOutlined = Builder(name = "IcMoneyOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.75f, 3.0f)
                    curveTo(6.9175f, 3.0f, 3.0f, 6.9175f, 3.0f, 11.75f)
                    curveTo(3.0f, 16.5825f, 6.9175f, 20.5f, 11.75f, 20.5f)
                    curveTo(16.5825f, 20.5f, 20.5f, 16.5825f, 20.5f, 11.75f)
                    curveTo(20.5f, 6.9175f, 16.5825f, 3.0f, 11.75f, 3.0f)
                    close()
                    moveTo(4.5f, 11.75f)
                    curveTo(4.5f, 7.7459f, 7.7459f, 4.5f, 11.75f, 4.5f)
                    curveTo(15.7541f, 4.5f, 19.0f, 7.7459f, 19.0f, 11.75f)
                    curveTo(19.0f, 15.7541f, 15.7541f, 19.0f, 11.75f, 19.0f)
                    curveTo(7.7459f, 19.0f, 4.5f, 15.7541f, 4.5f, 11.75f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.6635f, 10.1105f)
                    curveTo(13.4929f, 9.4688f, 13.0024f, 9.0481f, 12.0995f, 9.041f)
                    curveTo(11.1469f, 9.0481f, 10.4716f, 9.5615f, 10.4645f, 10.2103f)
                    curveTo(10.4716f, 10.7237f, 10.8839f, 11.0731f, 11.7867f, 11.2941f)
                    lineTo(12.9384f, 11.5793f)
                    curveTo(14.3175f, 11.9073f, 14.9929f, 12.5989f, 15.0f, 13.6755f)
                    curveTo(14.9929f, 15.016f, 13.9052f, 16.0071f, 11.9716f, 16.0f)
                    curveTo(10.237f, 16.0071f, 9.2062f, 15.2299f, 9.0f, 13.8181f)
                    horizontalLineTo(10.2796f)
                    curveTo(10.4218f, 14.5739f, 10.9692f, 14.9376f, 11.9431f, 14.9304f)
                    curveTo(13.045f, 14.9376f, 13.7346f, 14.4741f, 13.7346f, 13.7468f)
                    curveTo(13.7346f, 13.1978f, 13.3436f, 12.8413f, 12.4692f, 12.6346f)
                    lineTo(11.3033f, 12.3636f)
                    curveTo(9.9597f, 12.0499f, 9.2417f, 11.3155f, 9.2417f, 10.2816f)
                    curveTo(9.2417f, 8.9554f, 10.4005f, 8.0f, 12.0995f, 8.0f)
                    curveTo(13.6991f, 8.0f, 14.7014f, 8.8556f, 14.8578f, 10.1105f)
                    horizontalLineTo(13.6635f)
                    close()
                }
            }
        }
        .build()
        return _icMoneyOutlined!!
    }

private var _icMoneyOutlined: ImageVector? = null
