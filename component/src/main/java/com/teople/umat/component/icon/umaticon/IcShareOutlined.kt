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

public val UmatIcon.IcShareOutlined: ImageVector
    get() {
        if (_icShareOutlined != null) {
            return _icShareOutlined!!
        }
        _icShareOutlined = Builder(name = "IcShareOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 5.5f)
                curveTo(14.25f, 3.7051f, 15.7051f, 2.25f, 17.5f, 2.25f)
                curveTo(19.2949f, 2.25f, 20.75f, 3.7051f, 20.75f, 5.5f)
                curveTo(20.75f, 7.2949f, 19.2949f, 8.75f, 17.5f, 8.75f)
                curveTo(16.5404f, 8.75f, 15.6779f, 8.3341f, 15.083f, 7.6727f)
                lineTo(12.3657f, 9.1549f)
                lineTo(9.3251f, 10.8923f)
                curveTo(9.5955f, 11.3664f, 9.75f, 11.9152f, 9.75f, 12.5f)
                curveTo(9.75f, 12.7963f, 9.7103f, 13.0834f, 9.636f, 13.3562f)
                lineTo(15.083f, 16.3273f)
                curveTo(15.6779f, 15.6659f, 16.5404f, 15.25f, 17.5f, 15.25f)
                curveTo(19.2949f, 15.25f, 20.75f, 16.7051f, 20.75f, 18.5f)
                curveTo(20.75f, 20.2949f, 19.2949f, 21.75f, 17.5f, 21.75f)
                curveTo(15.7051f, 21.75f, 14.25f, 20.2949f, 14.25f, 18.5f)
                curveTo(14.25f, 18.2036f, 14.2897f, 17.9166f, 14.364f, 17.6438f)
                lineTo(8.917f, 14.6727f)
                curveTo(8.3221f, 15.3341f, 7.4596f, 15.75f, 6.5f, 15.75f)
                curveTo(4.7051f, 15.75f, 3.25f, 14.2949f, 3.25f, 12.5f)
                curveTo(3.25f, 10.7051f, 4.7051f, 9.25f, 6.5f, 9.25f)
                curveTo(7.1507f, 9.25f, 7.7567f, 9.4412f, 8.2649f, 9.7705f)
                lineTo(11.6343f, 7.8451f)
                lineTo(14.364f, 6.3562f)
                curveTo(14.2897f, 6.0834f, 14.25f, 5.7964f, 14.25f, 5.5f)
                close()
                moveTo(17.5f, 3.75f)
                curveTo(16.5335f, 3.75f, 15.75f, 4.5335f, 15.75f, 5.5f)
                curveTo(15.75f, 6.4665f, 16.5335f, 7.25f, 17.5f, 7.25f)
                curveTo(18.4665f, 7.25f, 19.25f, 6.4665f, 19.25f, 5.5f)
                curveTo(19.25f, 4.5335f, 18.4665f, 3.75f, 17.5f, 3.75f)
                close()
                moveTo(6.5f, 10.75f)
                curveTo(5.5335f, 10.75f, 4.75f, 11.5335f, 4.75f, 12.5f)
                curveTo(4.75f, 13.4665f, 5.5335f, 14.25f, 6.5f, 14.25f)
                curveTo(7.4665f, 14.25f, 8.25f, 13.4665f, 8.25f, 12.5f)
                curveTo(8.25f, 11.5335f, 7.4665f, 10.75f, 6.5f, 10.75f)
                close()
                moveTo(15.75f, 18.5f)
                curveTo(15.75f, 17.5335f, 16.5335f, 16.75f, 17.5f, 16.75f)
                curveTo(18.4665f, 16.75f, 19.25f, 17.5335f, 19.25f, 18.5f)
                curveTo(19.25f, 19.4665f, 18.4665f, 20.25f, 17.5f, 20.25f)
                curveTo(16.5335f, 20.25f, 15.75f, 19.4665f, 15.75f, 18.5f)
                close()
            }
        }
        .build()
        return _icShareOutlined!!
    }

private var _icShareOutlined: ImageVector? = null
