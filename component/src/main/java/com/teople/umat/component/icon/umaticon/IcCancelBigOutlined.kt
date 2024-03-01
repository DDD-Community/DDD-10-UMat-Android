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

public val UmatIcon.IcCancelBigOutlined: ImageVector
    get() {
        if (_icCancelBigOutlined != null) {
            return _icCancelBigOutlined!!
        }
        _icCancelBigOutlined = Builder(name = "IcCancelBigOutlined", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.939f, 12.0001f)
                lineTo(5.1058f, 17.8333f)
                curveTo(4.8911f, 18.048f, 4.8338f, 18.3605f, 4.9339f, 18.6274f)
                curveTo(4.8342f, 18.3606f, 4.8917f, 18.0486f, 5.1061f, 17.8341f)
                lineTo(10.9395f, 12.0007f)
                lineTo(10.939f, 12.0001f)
                close()
                moveTo(19.0665f, 18.1012f)
                curveTo(19.0301f, 18.0036f, 18.9727f, 17.9121f, 18.8942f, 17.8336f)
                lineTo(13.0611f, 12.0004f)
                lineTo(13.0609f, 12.0007f)
                lineTo(18.8945f, 17.8344f)
                curveTo(18.9728f, 17.9126f, 19.0301f, 18.0039f, 19.0665f, 18.1012f)
                close()
                moveTo(19.0666f, 5.3732f)
                curveTo(19.0301f, 5.2756f, 18.9727f, 5.1841f, 18.8942f, 5.1056f)
                curveTo(18.6013f, 4.8127f, 18.1265f, 4.8127f, 17.8336f, 5.1056f)
                lineTo(11.9999f, 10.9393f)
                lineTo(6.1663f, 5.1056f)
                curveTo(5.8734f, 4.8127f, 5.3985f, 4.8127f, 5.1056f, 5.1056f)
                curveTo(4.8907f, 5.3205f, 4.8335f, 5.6333f, 4.9339f, 5.9003f)
                curveTo(4.8339f, 5.6334f, 4.8913f, 5.321f, 5.1059f, 5.1064f)
                curveTo(5.3988f, 4.8135f, 5.8737f, 4.8135f, 6.1666f, 5.1064f)
                lineTo(12.0002f, 10.9401f)
                lineTo(17.8339f, 5.1064f)
                curveTo(18.1268f, 4.8135f, 18.6016f, 4.8135f, 18.8945f, 5.1064f)
                curveTo(18.9728f, 5.1847f, 19.0301f, 5.2759f, 19.0666f, 5.3732f)
                close()
                moveTo(6.3784f, 4.8935f)
                lineTo(11.9999f, 10.515f)
                lineTo(17.6214f, 4.8935f)
                curveTo(18.0315f, 4.4834f, 18.6963f, 4.4834f, 19.1064f, 4.8935f)
                curveTo(19.5164f, 5.3035f, 19.5164f, 5.9683f, 19.1063f, 6.3784f)
                lineTo(13.4849f, 11.9999f)
                lineTo(19.1063f, 17.6214f)
                curveTo(19.5164f, 18.0315f, 19.5164f, 18.6963f, 19.1063f, 19.1063f)
                curveTo(18.6963f, 19.5164f, 18.0315f, 19.5164f, 17.6215f, 19.1063f)
                lineTo(11.9999f, 13.4848f)
                lineTo(6.3786f, 19.1061f)
                curveTo(5.9687f, 19.516f, 5.3041f, 19.5162f, 4.894f, 19.1064f)
                curveTo(4.4837f, 18.6964f, 4.4835f, 18.0314f, 4.8937f, 17.6212f)
                lineTo(10.5149f, 11.9999f)
                lineTo(4.8935f, 6.3784f)
                curveTo(4.4834f, 5.9683f, 4.4834f, 5.3035f, 4.8935f, 4.8935f)
                curveTo(5.3035f, 4.4834f, 5.9683f, 4.4834f, 6.3784f, 4.8935f)
                close()
            }
        }
        .build()
        return _icCancelBigOutlined!!
    }

private var _icCancelBigOutlined: ImageVector? = null
