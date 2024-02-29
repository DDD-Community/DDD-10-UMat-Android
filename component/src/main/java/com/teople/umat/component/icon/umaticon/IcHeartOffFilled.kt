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

public val UmatIcon.IcHeartOffFilled: ImageVector
    get() {
        if (_icHeartOffFilled != null) {
            return _icHeartOffFilled!!
        }
        _icHeartOffFilled = Builder(name = "IcHeartOffFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2208f, 5.5985f)
                curveTo(16.336f, 5.4834f, 16.2721f, 5.2884f, 16.1099f, 5.2734f)
                curveTo(15.9418f, 5.2579f, 15.7717f, 5.25f, 15.6f, 5.25f)
                curveTo(14.1665f, 5.25f, 12.9052f, 5.9221f, 12.0f, 6.7918f)
                curveTo(11.0948f, 5.9221f, 9.8335f, 5.25f, 8.4f, 5.25f)
                curveTo(5.6191f, 5.25f, 3.25f, 7.3293f, 3.25f, 10.0298f)
                curveTo(3.25f, 11.8927f, 4.1224f, 13.4612f, 5.2785f, 14.7604f)
                curveTo(5.4921f, 15.0005f, 5.7172f, 15.2334f, 5.9508f, 15.4593f)
                curveTo(6.0669f, 15.5716f, 6.2512f, 15.5681f, 6.3654f, 15.4539f)
                lineTo(16.2208f, 5.5985f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.503f, 19.4364f)
                lineTo(4.4697f, 19.4697f)
                curveTo(4.1768f, 19.7626f, 4.1768f, 20.2374f, 4.4697f, 20.5303f)
                curveTo(4.7626f, 20.8232f, 5.2374f, 20.8232f, 5.5303f, 20.5303f)
                lineTo(8.5204f, 17.5403f)
                curveTo(8.77f, 17.7167f, 9.0178f, 17.8871f, 9.261f, 18.0516f)
                lineTo(11.5796f, 19.6211f)
                curveTo(11.8335f, 19.793f, 12.1665f, 19.793f, 12.4204f, 19.6211f)
                lineTo(14.739f, 18.0516f)
                curveTo(16.0829f, 17.142f, 17.5693f, 16.0552f, 18.7215f, 14.7604f)
                curveTo(19.8777f, 13.4612f, 20.75f, 11.8927f, 20.75f, 10.0298f)
                curveTo(20.75f, 8.7336f, 20.2042f, 7.5805f, 19.3289f, 6.7317f)
                lineTo(21.5303f, 4.5303f)
                curveTo(21.8232f, 4.2374f, 21.8232f, 3.7626f, 21.5303f, 3.4697f)
                curveTo(21.2464f, 3.1857f, 20.7914f, 3.1771f, 20.497f, 3.4436f)
                lineTo(4.5303f, 19.4103f)
                curveTo(4.5214f, 19.4193f, 4.5122f, 19.428f, 4.503f, 19.4364f)
                close()
            }
        }
        .build()
        return _icHeartOffFilled!!
    }

private var _icHeartOffFilled: ImageVector? = null
