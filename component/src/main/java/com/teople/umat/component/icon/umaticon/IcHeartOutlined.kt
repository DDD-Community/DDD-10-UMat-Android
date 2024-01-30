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

public val UmatIcon.IcHeartOutlined: ImageVector
    get() {
        if (_icHeartOutlined != null) {
            return _icHeartOutlined!!
        }
        _icHeartOutlined = Builder(name = "IcHeartOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.25f, 10.0298f)
                curveTo(3.25f, 7.3293f, 5.6191f, 5.25f, 8.4f, 5.25f)
                curveTo(9.8335f, 5.25f, 11.0948f, 5.9221f, 12.0f, 6.7918f)
                curveTo(12.9052f, 5.9221f, 14.1665f, 5.25f, 15.6f, 5.25f)
                curveTo(18.3809f, 5.25f, 20.75f, 7.3293f, 20.75f, 10.0298f)
                curveTo(20.75f, 11.8797f, 19.9611f, 13.5064f, 18.8682f, 14.8815f)
                curveTo(17.7771f, 16.2543f, 16.35f, 17.4193f, 14.9835f, 18.366f)
                curveTo(14.4615f, 18.7276f, 13.9335f, 19.0611f, 13.4503f, 19.3072f)
                curveTo(12.9965f, 19.5383f, 12.4747f, 19.75f, 12.0f, 19.75f)
                curveTo(11.5253f, 19.75f, 11.0035f, 19.5383f, 10.5497f, 19.3072f)
                curveTo(10.0665f, 19.0611f, 9.5385f, 18.7276f, 9.0165f, 18.366f)
                curveTo(7.6501f, 17.4193f, 6.2229f, 16.2543f, 5.1318f, 14.8815f)
                curveTo(4.0389f, 13.5064f, 3.25f, 11.8797f, 3.25f, 10.0298f)
                close()
                moveTo(8.4f, 6.75f)
                curveTo(6.3208f, 6.75f, 4.75f, 8.2791f, 4.75f, 10.0298f)
                curveTo(4.75f, 11.4333f, 5.3458f, 12.74f, 6.3061f, 13.9482f)
                curveTo(7.2683f, 15.1588f, 8.5629f, 16.2269f, 9.8707f, 17.133f)
                curveTo(10.3656f, 17.4758f, 10.8317f, 17.7675f, 11.2305f, 17.9706f)
                curveTo(11.6586f, 18.1886f, 11.9067f, 18.25f, 12.0f, 18.25f)
                curveTo(12.0933f, 18.25f, 12.3414f, 18.1886f, 12.7695f, 17.9706f)
                curveTo(13.1683f, 17.7675f, 13.6344f, 17.4758f, 14.1293f, 17.133f)
                curveTo(15.4371f, 16.2269f, 16.7317f, 15.1588f, 17.6939f, 13.9482f)
                curveTo(18.6542f, 12.74f, 19.25f, 11.4333f, 19.25f, 10.0298f)
                curveTo(19.25f, 8.2791f, 17.6792f, 6.75f, 15.6f, 6.75f)
                curveTo(14.4058f, 6.75f, 13.2908f, 7.4634f, 12.5946f, 8.3689f)
                curveTo(12.4526f, 8.5536f, 12.2329f, 8.6618f, 12.0f, 8.6618f)
                curveTo(11.7671f, 8.6618f, 11.5474f, 8.5536f, 11.4054f, 8.3689f)
                curveTo(10.7092f, 7.4634f, 9.5941f, 6.75f, 8.4f, 6.75f)
                close()
            }
        }
        .build()
        return _icHeartOutlined!!
    }

private var _icHeartOutlined: ImageVector? = null
