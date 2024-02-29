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

public val UmatIcon.IcPinFilled: ImageVector
    get() {
        if (_icPinFilled != null) {
            return _icPinFilled!!
        }
        _icPinFilled = Builder(name = "IcPinFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.9976f, 8.893f)
                curveTo(22.0626f, 6.001f, 20.5886f, 3.522f, 18.4936f, 2.301f)
                curveTo(16.5336f, 1.159f, 14.0716f, 1.153f, 11.9996f, 2.838f)
                curveTo(9.9276f, 1.153f, 7.4656f, 1.16f, 5.5056f, 2.301f)
                curveTo(3.4106f, 3.523f, 1.9366f, 6.001f, 2.0016f, 8.893f)
                curveTo(2.096f, 13.1002f, 6.0934f, 16.5447f, 9.0618f, 18.2806f)
                lineTo(8.7228f, 20.4582f)
                curveTo(8.5558f, 21.5311f, 9.3855f, 22.5f, 10.4714f, 22.5f)
                horizontalLineTo(13.6382f)
                curveTo(14.724f, 22.5f, 15.5537f, 21.5311f, 15.3867f, 20.4582f)
                lineTo(15.0385f, 18.2209f)
                curveTo(17.9955f, 16.4665f, 21.9036f, 13.0525f, 21.9976f, 8.893f)
                close()
            }
        }
        .build()
        return _icPinFilled!!
    }

private var _icPinFilled: ImageVector? = null
