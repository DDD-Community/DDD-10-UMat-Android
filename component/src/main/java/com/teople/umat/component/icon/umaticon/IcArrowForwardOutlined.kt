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

public val UmatIcon.IcArrowForwardOutlined: ImageVector
    get() {
        if (_icArrowForwardOutlined != null) {
            return _icArrowForwardOutlined!!
        }
        _icArrowForwardOutlined = Builder(name = "IcArrowForwardOutlined", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2727f, 20.3128f)
                curveTo(11.1824f, 20.4082f, 11.1119f, 20.5205f, 11.0651f, 20.6433f)
                curveTo(11.0183f, 20.766f, 10.9961f, 20.8967f, 10.9998f, 21.028f)
                curveTo(11.0035f, 21.1593f, 11.0331f, 21.2886f, 11.0867f, 21.4085f)
                curveTo(11.1404f, 21.5284f, 11.2172f, 21.6365f, 11.3127f, 21.7268f)
                curveTo(11.4081f, 21.817f, 11.5204f, 21.8875f, 11.6432f, 21.9343f)
                curveTo(11.7659f, 21.9811f, 11.8966f, 22.0033f, 12.0279f, 21.9996f)
                curveTo(12.1592f, 21.9959f, 12.2885f, 21.9663f, 12.4084f, 21.9127f)
                curveTo(12.5283f, 21.859f, 12.6364f, 21.7822f, 12.7267f, 21.6868f)
                lineTo(21.2267f, 12.6868f)
                curveTo(21.4022f, 12.5011f, 21.5f, 12.2553f, 21.5f, 11.9998f)
                curveTo(21.5f, 11.7442f, 21.4022f, 11.4984f, 21.2267f, 11.3128f)
                lineTo(12.7267f, 2.3117f)
                curveTo(12.637f, 2.2142f, 12.5289f, 2.1354f, 12.4086f, 2.08f)
                curveTo(12.2883f, 2.0246f, 12.1581f, 1.9936f, 12.0257f, 1.9889f)
                curveTo(11.8933f, 1.9842f, 11.7613f, 2.0058f, 11.6374f, 2.0526f)
                curveTo(11.5134f, 2.0993f, 11.4f, 2.1702f, 11.3037f, 2.2612f)
                curveTo(11.2073f, 2.3521f, 11.1301f, 2.4613f, 11.0763f, 2.5824f)
                curveTo(11.0225f, 2.7035f, 10.9933f, 2.834f, 10.9905f, 2.9665f)
                curveTo(10.9876f, 3.0989f, 11.011f, 3.2306f, 11.0595f, 3.3539f)
                curveTo(11.1079f, 3.4772f, 11.1804f, 3.5897f, 11.2727f, 3.6848f)
                lineTo(19.1247f, 11.9998f)
                lineTo(11.2727f, 20.3128f)
                close()
            }
        }
        .build()
        return _icArrowForwardOutlined!!
    }

private var _icArrowForwardOutlined: ImageVector? = null
