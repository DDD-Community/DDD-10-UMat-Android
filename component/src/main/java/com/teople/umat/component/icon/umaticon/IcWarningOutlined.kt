package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val UmatIcon.IcWarningOutlined: ImageVector
    get() {
        if (_icWarningOutlined != null) {
            return _icWarningOutlined!!
        }
        _icWarningOutlined = Builder(name = "IcWarningOutlined", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.25f)
                curveTo(11.5858f, 13.25f, 11.25f, 12.9142f, 11.25f, 12.5f)
                verticalLineTo(7.5f)
                curveTo(11.25f, 7.0858f, 11.5858f, 6.75f, 12.0f, 6.75f)
                curveTo(12.4142f, 6.75f, 12.75f, 7.0858f, 12.75f, 7.5f)
                lineTo(12.75f, 12.5f)
                curveTo(12.75f, 12.9142f, 12.4142f, 13.25f, 12.0f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(11.4477f, 15.0f, 11.0f, 15.4477f, 11.0f, 16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                curveTo(13.0f, 15.4477f, 12.5523f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.75f, 12.0f)
                curveTo(20.75f, 16.8325f, 16.8325f, 20.75f, 12.0f, 20.75f)
                curveTo(7.1675f, 20.75f, 3.25f, 16.8325f, 3.25f, 12.0f)
                curveTo(3.25f, 7.1675f, 7.1675f, 3.25f, 12.0f, 3.25f)
                curveTo(16.8325f, 3.25f, 20.75f, 7.1675f, 20.75f, 12.0f)
                close()
                moveTo(12.0f, 19.25f)
                curveTo(16.0041f, 19.25f, 19.25f, 16.0041f, 19.25f, 12.0f)
                curveTo(19.25f, 7.9959f, 16.0041f, 4.75f, 12.0f, 4.75f)
                curveTo(7.9959f, 4.75f, 4.75f, 7.9959f, 4.75f, 12.0f)
                curveTo(4.75f, 16.0041f, 7.9959f, 19.25f, 12.0f, 19.25f)
                close()
            }
        }
        .build()
        return _icWarningOutlined!!
    }

private var _icWarningOutlined: ImageVector? = null
