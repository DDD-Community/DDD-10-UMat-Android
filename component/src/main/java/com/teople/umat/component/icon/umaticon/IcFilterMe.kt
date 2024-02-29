package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon

public val UmatIcon.IcFilterMe: ImageVector
    get() {
        if (_icFilterMe != null) {
            return _icFilterMe!!
        }
        _icFilterMe = Builder(name = "IcFilterMe", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF6366F1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(14.6651f, 5.9599f)
                    curveTo(14.7084f, 4.0319f, 13.7257f, 2.3793f, 12.3291f, 1.5653f)
                    curveTo(11.0224f, 0.8039f, 9.3811f, 0.7999f, 7.9997f, 1.9233f)
                    curveTo(6.6184f, 0.7999f, 4.977f, 0.8046f, 3.6704f, 1.5653f)
                    curveTo(2.2737f, 2.3799f, 1.291f, 4.0319f, 1.3344f, 5.9599f)
                    curveTo(1.3973f, 8.7647f, 4.0623f, 11.061f, 6.0412f, 12.2183f)
                    lineTo(5.8152f, 13.6701f)
                    curveTo(5.7039f, 14.3853f, 6.257f, 15.0312f, 6.9809f, 15.0312f)
                    horizontalLineTo(9.0921f)
                    curveTo(9.816f, 15.0312f, 10.3692f, 14.3853f, 10.2578f, 13.6701f)
                    lineTo(10.0257f, 12.1785f)
                    curveTo(11.997f, 11.0089f, 14.6024f, 8.7329f, 14.6651f, 5.9599f)
                    close()
                }
            }
        }
        .build()
        return _icFilterMe!!
    }

private var _icFilterMe: ImageVector? = null
