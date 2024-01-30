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

public val UmatIcon.IcCalenderFilled: ImageVector
    get() {
        if (_icCalenderFilled != null) {
            return _icCalenderFilled!!
        }
        _icCalenderFilled = Builder(name = "IcCalenderFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7502f, 4.0f)
                curveTo(7.7502f, 3.5858f, 7.4144f, 3.25f, 7.0002f, 3.25f)
                curveTo(6.5859f, 3.25f, 6.2502f, 3.5858f, 6.2502f, 4.0f)
                verticalLineTo(5.8164f)
                curveTo(4.7571f, 6.0275f, 3.5775f, 7.2084f, 3.3779f, 8.7148f)
                lineTo(3.2913f, 9.3678f)
                curveTo(3.2766f, 9.4785f, 3.2626f, 9.5893f, 3.2492f, 9.7001f)
                curveTo(3.2137f, 9.9941f, 3.4453f, 10.25f, 3.7414f, 10.25f)
                horizontalLineTo(20.2589f)
                curveTo(20.555f, 10.25f, 20.7866f, 9.9941f, 20.7511f, 9.7001f)
                curveTo(20.7377f, 9.5893f, 20.7237f, 9.4785f, 20.709f, 9.3678f)
                lineTo(20.6224f, 8.7148f)
                curveTo(20.4228f, 7.2085f, 19.2432f, 6.0275f, 17.7502f, 5.8164f)
                verticalLineTo(4.0f)
                curveTo(17.7502f, 3.5858f, 17.4144f, 3.25f, 17.0002f, 3.25f)
                curveTo(16.586f, 3.25f, 16.2502f, 3.5858f, 16.2502f, 4.0f)
                verticalLineTo(5.6676f)
                curveTo(13.4225f, 5.4158f, 10.5779f, 5.4158f, 7.7502f, 5.6676f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9444f, 12.2256f)
                curveTo(20.9356f, 11.9591f, 20.7154f, 11.75f, 20.4489f, 11.75f)
                horizontalLineTo(3.5507f)
                curveTo(3.2841f, 11.75f, 3.064f, 11.9591f, 3.0552f, 12.2256f)
                curveTo(2.9958f, 14.0332f, 3.1056f, 15.8446f, 3.3843f, 17.6359f)
                curveTo(3.5953f, 18.9919f, 4.697f, 20.0335f, 6.0627f, 20.1681f)
                lineTo(7.2558f, 20.2858f)
                curveTo(10.4108f, 20.5969f, 13.5888f, 20.5969f, 16.7438f, 20.2858f)
                lineTo(17.9368f, 20.1681f)
                curveTo(19.3026f, 20.0335f, 20.4042f, 18.9919f, 20.6152f, 17.6359f)
                curveTo(20.894f, 15.8446f, 21.0038f, 14.0332f, 20.9444f, 12.2256f)
                close()
            }
        }
        .build()
        return _icCalenderFilled!!
    }

private var _icCalenderFilled: ImageVector? = null
