package mypageicon

import MypageIcon
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

public val MypageIcon.IcCalenderFilled: ImageVector
    get() {
        if (_icCalenderFilled != null) {
            return _icCalenderFilled!!
        }
        _icCalenderFilled = Builder(name = "IcCalenderFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFA855F7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7506f, 4.0f)
                curveTo(7.7506f, 3.5858f, 7.4149f, 3.25f, 7.0006f, 3.25f)
                curveTo(6.5864f, 3.25f, 6.2506f, 3.5858f, 6.2506f, 4.0f)
                verticalLineTo(5.8164f)
                curveTo(4.7576f, 6.0275f, 3.578f, 7.2084f, 3.3784f, 8.7148f)
                lineTo(3.2918f, 9.3678f)
                curveTo(3.2771f, 9.4785f, 3.2631f, 9.5893f, 3.2497f, 9.7001f)
                curveTo(3.2142f, 9.9941f, 3.4458f, 10.25f, 3.7419f, 10.25f)
                horizontalLineTo(20.2593f)
                curveTo(20.5554f, 10.25f, 20.787f, 9.9941f, 20.7515f, 9.7001f)
                curveTo(20.7381f, 9.5893f, 20.7241f, 9.4785f, 20.7094f, 9.3678f)
                lineTo(20.6228f, 8.7148f)
                curveTo(20.4232f, 7.2085f, 19.2436f, 6.0275f, 17.7506f, 5.8164f)
                verticalLineTo(4.0f)
                curveTo(17.7506f, 3.5858f, 17.4148f, 3.25f, 17.0006f, 3.25f)
                curveTo(16.5864f, 3.25f, 16.2506f, 3.5858f, 16.2506f, 4.0f)
                verticalLineTo(5.6676f)
                curveTo(13.4229f, 5.4158f, 10.5783f, 5.4158f, 7.7506f, 5.6676f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA855F7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9439f, 12.2256f)
                curveTo(20.9351f, 11.9591f, 20.7149f, 11.75f, 20.4484f, 11.75f)
                horizontalLineTo(3.5502f)
                curveTo(3.2836f, 11.75f, 3.0635f, 11.9591f, 3.0547f, 12.2256f)
                curveTo(2.9953f, 14.0332f, 3.1051f, 15.8446f, 3.3838f, 17.6359f)
                curveTo(3.5949f, 18.9919f, 4.6965f, 20.0335f, 6.0623f, 20.1681f)
                lineTo(7.2553f, 20.2858f)
                curveTo(10.4103f, 20.5969f, 13.5883f, 20.5969f, 16.7433f, 20.2858f)
                lineTo(17.9363f, 20.1681f)
                curveTo(19.3021f, 20.0335f, 20.4037f, 18.9919f, 20.6147f, 17.6359f)
                curveTo(20.8935f, 15.8446f, 21.0033f, 14.0332f, 20.9439f, 12.2256f)
                close()
            }
        }
        .build()
        return _icCalenderFilled!!
    }

private var _icCalenderFilled: ImageVector? = null
