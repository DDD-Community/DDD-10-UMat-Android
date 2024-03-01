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

public val UmatIcon.IcArrowBackFilled: ImageVector
    get() {
        if (_icArrowBackFilled != null) {
            return _icArrowBackFilled!!
        }
        _icArrowBackFilled = Builder(name = "IcArrowBackFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2039f, 3.6863f)
                curveTo(13.2983f, 3.5908f, 13.3722f, 3.4786f, 13.4212f, 3.356f)
                curveTo(13.4701f, 3.2333f, 13.4934f, 3.1026f, 13.4895f, 2.9714f)
                curveTo(13.4856f, 2.8402f, 13.4547f, 2.711f, 13.3985f, 2.5912f)
                curveTo(13.3423f, 2.4713f, 13.262f, 2.3633f, 13.162f, 2.2731f)
                curveTo(13.0621f, 2.1829f, 12.9446f, 2.1124f, 12.8161f, 2.0656f)
                curveTo(12.6877f, 2.0189f, 12.5508f, 1.9967f, 12.4134f, 2.0004f)
                curveTo(12.276f, 2.0041f, 12.1406f, 2.0336f, 12.0152f, 2.0873f)
                curveTo(11.8897f, 2.1409f, 11.7765f, 2.2176f, 11.6821f, 2.3131f)
                lineTo(2.7856f, 11.3078f)
                curveTo(2.6019f, 11.4933f, 2.4995f, 11.739f, 2.4995f, 11.9944f)
                curveTo(2.4995f, 12.2497f, 2.6019f, 12.4954f, 2.7856f, 12.681f)
                lineTo(11.6821f, 21.6767f)
                curveTo(11.7759f, 21.7742f, 11.889f, 21.8529f, 12.015f, 21.9083f)
                curveTo(12.1409f, 21.9637f, 12.2771f, 21.9947f, 12.4157f, 21.9994f)
                curveTo(12.5543f, 22.0041f, 12.6924f, 21.9824f, 12.8222f, 21.9357f)
                curveTo(12.9519f, 21.889f, 13.0706f, 21.8181f, 13.1715f, 21.7272f)
                curveTo(13.2723f, 21.6363f, 13.3532f, 21.5272f, 13.4094f, 21.4062f)
                curveTo(13.4657f, 21.2852f, 13.4962f, 21.1547f, 13.4993f, 21.0223f)
                curveTo(13.5023f, 20.89f, 13.4777f, 20.7584f, 13.427f, 20.6351f)
                curveTo(13.3763f, 20.5119f, 13.3005f, 20.3995f, 13.2039f, 20.3045f)
                lineTo(4.9857f, 11.9944f)
                lineTo(13.2039f, 3.6863f)
                close()
            }
        }
        .build()
        return _icArrowBackFilled!!
    }

private var _icArrowBackFilled: ImageVector? = null
