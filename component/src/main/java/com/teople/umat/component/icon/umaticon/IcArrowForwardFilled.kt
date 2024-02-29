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

public val UmatIcon.IcArrowForwardFilled: ImageVector
    get() {
        if (_icArrowForwardFilled != null) {
            return _icArrowForwardFilled!!
        }
        _icArrowForwardFilled = Builder(name = "IcArrowForwardFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7956f, 20.3137f)
                curveTo(10.7012f, 20.4092f, 10.6274f, 20.5214f, 10.5784f, 20.6441f)
                curveTo(10.5294f, 20.7667f, 10.5061f, 20.8974f, 10.51f, 21.0286f)
                curveTo(10.5139f, 21.1598f, 10.5448f, 21.289f, 10.601f, 21.4089f)
                curveTo(10.6572f, 21.5287f, 10.7375f, 21.6367f, 10.8375f, 21.7269f)
                curveTo(10.9374f, 21.8171f, 11.0549f, 21.8876f, 11.1834f, 21.9344f)
                curveTo(11.3118f, 21.9811f, 11.4487f, 22.0033f, 11.5861f, 21.9996f)
                curveTo(11.7235f, 21.9959f, 11.8589f, 21.9664f, 11.9843f, 21.9127f)
                curveTo(12.1098f, 21.8591f, 12.223f, 21.7823f, 12.3174f, 21.6869f)
                lineTo(21.2139f, 12.6922f)
                curveTo(21.3976f, 12.5067f, 21.5f, 12.261f, 21.5f, 12.0056f)
                curveTo(21.5f, 11.7503f, 21.3976f, 11.5046f, 21.2139f, 11.319f)
                lineTo(12.3174f, 2.3233f)
                curveTo(12.2236f, 2.2258f, 12.1105f, 2.1471f, 11.9845f, 2.0917f)
                curveTo(11.8586f, 2.0363f, 11.7224f, 2.0053f, 11.5838f, 2.0006f)
                curveTo(11.4452f, 1.9959f, 11.3071f, 2.0176f, 11.1773f, 2.0643f)
                curveTo(11.0476f, 2.111f, 10.9289f, 2.1819f, 10.8281f, 2.2728f)
                curveTo(10.7272f, 2.3637f, 10.6464f, 2.4728f, 10.5901f, 2.5938f)
                curveTo(10.5338f, 2.7148f, 10.5033f, 2.8453f, 10.5002f, 2.9776f)
                curveTo(10.4972f, 3.11f, 10.5218f, 3.2416f, 10.5725f, 3.3649f)
                curveTo(10.6232f, 3.4881f, 10.699f, 3.6005f, 10.7956f, 3.6955f)
                lineTo(19.0139f, 12.0056f)
                lineTo(10.7956f, 20.3137f)
                close()
            }
        }
        .build()
        return _icArrowForwardFilled!!
    }

private var _icArrowForwardFilled: ImageVector? = null
