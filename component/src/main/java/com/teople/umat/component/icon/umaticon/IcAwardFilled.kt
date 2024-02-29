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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon

public val UmatIcon.IcAwardFilled: ImageVector
    get() {
        if (_icAwardFilled != null) {
            return _icAwardFilled!!
        }
        _icAwardFilled = Builder(name = "IcAwardFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 9.5f)
                curveTo(10.25f, 8.5335f, 11.0335f, 7.75f, 12.0f, 7.75f)
                curveTo(12.9665f, 7.75f, 13.75f, 8.5335f, 13.75f, 9.5f)
                curveTo(13.75f, 10.4665f, 12.9665f, 11.25f, 12.0f, 11.25f)
                curveTo(11.0335f, 11.25f, 10.25f, 10.4665f, 10.25f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 9.5f)
                curveTo(5.0f, 5.634f, 8.134f, 2.5f, 12.0f, 2.5f)
                curveTo(15.866f, 2.5f, 19.0f, 5.634f, 19.0f, 9.5f)
                curveTo(19.0f, 10.8722f, 18.6052f, 12.1522f, 17.9229f, 13.2325f)
                lineTo(20.6495f, 17.9551f)
                curveTo(20.7967f, 18.2101f, 20.7812f, 18.5276f, 20.6097f, 18.767f)
                curveTo(20.4382f, 19.0063f, 20.1425f, 19.1231f, 19.8537f, 19.0657f)
                lineTo(17.2376f, 18.5455f)
                lineTo(16.3801f, 21.0713f)
                curveTo(16.2854f, 21.35f, 16.0364f, 21.5477f, 15.7434f, 21.5765f)
                curveTo(15.4504f, 21.6054f, 15.1676f, 21.4601f, 15.0204f, 21.2051f)
                lineTo(12.3002f, 16.4937f)
                curveTo(12.2007f, 16.4979f, 12.1006f, 16.5f, 12.0f, 16.5f)
                curveTo(11.8994f, 16.5f, 11.7993f, 16.4979f, 11.6998f, 16.4937f)
                lineTo(8.9796f, 21.2051f)
                curveTo(8.8326f, 21.4599f, 8.5502f, 21.6051f, 8.2575f, 21.5766f)
                curveTo(7.9647f, 21.5481f, 7.7156f, 21.3511f, 7.6205f, 21.0728f)
                lineTo(6.7585f, 18.5522f)
                lineTo(4.1447f, 19.066f)
                curveTo(3.8561f, 19.1228f, 3.5609f, 19.0056f, 3.3899f, 18.7663f)
                curveTo(3.2188f, 18.527f, 3.2034f, 18.2099f, 3.3505f, 17.9551f)
                lineTo(6.0771f, 13.2325f)
                curveTo(5.3948f, 12.1522f, 5.0f, 10.8722f, 5.0f, 9.5f)
                close()
                moveTo(7.0859f, 14.4852f)
                curveTo(7.9182f, 15.3056f, 8.9549f, 15.9192f, 10.1127f, 16.2426f)
                lineTo(8.5058f, 19.0259f)
                lineTo(7.966f, 17.4473f)
                curveTo(7.8446f, 17.0924f, 7.4797f, 16.8817f, 7.1117f, 16.9541f)
                lineTo(5.4747f, 17.2759f)
                lineTo(7.0859f, 14.4852f)
                close()
                moveTo(13.8873f, 16.2426f)
                lineTo(15.4918f, 19.0217f)
                lineTo(16.0287f, 17.4406f)
                curveTo(16.1497f, 17.0842f, 16.516f, 16.8727f, 16.8851f, 16.9461f)
                lineTo(18.5229f, 17.2717f)
                lineTo(16.9141f, 14.4852f)
                curveTo(16.0818f, 15.3056f, 15.0451f, 15.9192f, 13.8873f, 16.2426f)
                close()
                moveTo(12.0f, 6.25f)
                curveTo(10.2051f, 6.25f, 8.75f, 7.7051f, 8.75f, 9.5f)
                curveTo(8.75f, 11.2949f, 10.2051f, 12.75f, 12.0f, 12.75f)
                curveTo(13.7949f, 12.75f, 15.25f, 11.2949f, 15.25f, 9.5f)
                curveTo(15.25f, 7.7051f, 13.7949f, 6.25f, 12.0f, 6.25f)
                close()
            }
        }
        .build()
        return _icAwardFilled!!
    }

private var _icAwardFilled: ImageVector? = null
