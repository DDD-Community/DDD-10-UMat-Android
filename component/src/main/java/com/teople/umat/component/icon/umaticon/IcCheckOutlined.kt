package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val UmatIcon.IcCheckOutlined: ImageVector
    get() {
        if (_icCheckOutlined != null) {
            return _icCheckOutlined!!
        }
        _icCheckOutlined = Builder(name = "IcCheckOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4836f, 5.2613f)
                curveTo(6.3392f, 5.3892f, 5.4231f, 6.2924f, 5.2907f, 7.4245f)
                curveTo(4.935f, 10.4657f, 4.935f, 13.5379f, 5.2907f, 16.5791f)
                curveTo(5.4231f, 17.7112f, 6.3392f, 18.6144f, 7.4836f, 18.7423f)
                curveTo(10.4604f, 19.075f, 13.54f, 19.075f, 16.5169f, 18.7423f)
                curveTo(17.6613f, 18.6144f, 18.5773f, 17.7112f, 18.7097f, 16.5791f)
                curveTo(18.9653f, 14.3939f, 19.0373f, 12.1927f, 18.9256f, 9.9985f)
                curveTo(18.9227f, 9.9418f, 18.9438f, 9.8866f, 18.984f, 9.8465f)
                lineTo(20.0227f, 8.8077f)
                curveTo(20.143f, 8.6875f, 20.3484f, 8.7626f, 20.3612f, 8.9322f)
                curveTo(20.5572f, 11.5371f, 20.5034f, 14.1562f, 20.1996f, 16.7533f)
                curveTo(19.9847f, 18.5903f, 18.5098f, 20.0289f, 16.6835f, 20.2331f)
                curveTo(13.5959f, 20.5781f, 10.4045f, 20.5781f, 7.317f, 20.2331f)
                curveTo(5.4906f, 20.0289f, 4.0157f, 18.5903f, 3.8009f, 16.7533f)
                curveTo(3.4316f, 13.5964f, 3.4316f, 10.4072f, 3.8009f, 7.2503f)
                curveTo(4.0157f, 5.4133f, 5.4906f, 3.9746f, 7.317f, 3.7705f)
                curveTo(10.4045f, 3.4255f, 13.5959f, 3.4255f, 16.6835f, 3.7705f)
                curveTo(17.3267f, 3.8424f, 17.9264f, 4.0675f, 18.4427f, 4.4091f)
                curveTo(18.5443f, 4.4763f, 18.5544f, 4.6192f, 18.4683f, 4.7053f)
                lineTo(17.6654f, 5.5082f)
                curveTo(17.5997f, 5.5739f, 17.4978f, 5.5849f, 17.416f, 5.541f)
                curveTo(17.1426f, 5.3945f, 16.8388f, 5.2972f, 16.5169f, 5.2613f)
                curveTo(13.54f, 4.9285f, 10.4604f, 4.9285f, 7.4836f, 5.2613f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0303f, 6.0303f)
                curveTo(21.3232f, 5.7374f, 21.3232f, 5.2626f, 21.0303f, 4.9697f)
                curveTo(20.7374f, 4.6768f, 20.2626f, 4.6768f, 19.9697f, 4.9697f)
                lineTo(11.5f, 13.4393f)
                lineTo(9.0303f, 10.9697f)
                curveTo(8.7374f, 10.6768f, 8.2626f, 10.6768f, 7.9697f, 10.9697f)
                curveTo(7.6768f, 11.2626f, 7.6768f, 11.7374f, 7.9697f, 12.0303f)
                lineTo(10.9697f, 15.0303f)
                curveTo(11.2626f, 15.3232f, 11.7374f, 15.3232f, 12.0303f, 15.0303f)
                lineTo(21.0303f, 6.0303f)
                close()
            }
        }
        .build()
        return _icCheckOutlined!!
    }

private var _icCheckOutlined: ImageVector? = null
