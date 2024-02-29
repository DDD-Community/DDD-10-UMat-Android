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

public val UmatIcon.IcCheckOnFilled: ImageVector
    get() {
        if (_icCheckOnFilled != null) {
            return _icCheckOnFilled!!
        }
        _icCheckOnFilled = Builder(name = "IcCheckOnFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFA855F7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4552f, 3.4971f)
                curveTo(10.5427f, 3.152f, 13.7341f, 3.152f, 16.8216f, 3.4971f)
                curveTo(17.9808f, 3.6267f, 18.9985f, 4.2535f, 19.6422f, 5.1639f)
                lineTo(11.6384f, 13.1676f)
                lineTo(9.1688f, 10.698f)
                curveTo(8.8759f, 10.4051f, 8.401f, 10.4051f, 8.1081f, 10.698f)
                curveTo(7.8152f, 10.9909f, 7.8152f, 11.4657f, 8.1081f, 11.7586f)
                lineTo(11.1081f, 14.7586f)
                curveTo(11.401f, 15.0515f, 11.8758f, 15.0515f, 12.1687f, 14.7586f)
                lineTo(20.2842f, 6.6432f)
                curveTo(20.3066f, 6.7528f, 20.3246f, 6.8641f, 20.3378f, 6.9768f)
                curveTo(20.707f, 10.1337f, 20.707f, 13.3229f, 20.3378f, 16.4798f)
                curveTo(20.1229f, 18.3168f, 18.648f, 19.7554f, 16.8216f, 19.9596f)
                curveTo(13.7341f, 20.3046f, 10.5427f, 20.3046f, 7.4552f, 19.9596f)
                curveTo(5.6288f, 19.7554f, 4.1539f, 18.3168f, 3.939f, 16.4798f)
                curveTo(3.5698f, 13.3229f, 3.5698f, 10.1337f, 3.939f, 6.9768f)
                curveTo(4.1539f, 5.1399f, 5.6288f, 3.7012f, 7.4552f, 3.4971f)
                close()
            }
        }
        .build()
        return _icCheckOnFilled!!
    }

private var _icCheckOnFilled: ImageVector? = null
