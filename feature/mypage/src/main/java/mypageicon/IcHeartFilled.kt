package mypageicon

import MypageIcon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val MypageIcon.IcHeartFilled: ImageVector
    get() {
        if (_icHeartFilled != null) {
            return _icHeartFilled!!
        }
        _icHeartFilled = Builder(name = "IcHeartFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFF43F5E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4f, 5.25f)
                curveTo(5.6191f, 5.25f, 3.25f, 7.3293f, 3.25f, 10.0298f)
                curveTo(3.25f, 11.8927f, 4.1224f, 13.4612f, 5.2785f, 14.7604f)
                curveTo(6.4307f, 16.0552f, 7.9171f, 17.142f, 9.261f, 18.0516f)
                lineTo(11.5796f, 19.6211f)
                curveTo(11.8335f, 19.793f, 12.1665f, 19.793f, 12.4204f, 19.6211f)
                lineTo(14.739f, 18.0516f)
                curveTo(16.0829f, 17.142f, 17.5693f, 16.0552f, 18.7215f, 14.7604f)
                curveTo(19.8777f, 13.4612f, 20.75f, 11.8927f, 20.75f, 10.0298f)
                curveTo(20.75f, 7.3293f, 18.3809f, 5.25f, 15.6f, 5.25f)
                curveTo(14.1665f, 5.25f, 12.9052f, 5.9221f, 12.0f, 6.7918f)
                curveTo(11.0948f, 5.9221f, 9.8335f, 5.25f, 8.4f, 5.25f)
                close()
            }
        }
        .build()
        return _icHeartFilled!!
    }

private var _icHeartFilled: ImageVector? = null
