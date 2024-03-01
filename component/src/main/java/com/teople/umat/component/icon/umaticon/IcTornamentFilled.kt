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

public val UmatIcon.IcTornamentFilled: ImageVector
    get() {
        if (_icTornamentFilled != null) {
            return _icTornamentFilled!!
        }
        _icTornamentFilled = Builder(name = "IcTornamentFilled", defaultWidth = 25.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 25.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6791f, 2.207f)
                horizontalLineTo(8.3209f)
                curveTo(6.7537f, 2.207f, 5.5f, 3.4192f, 5.5f, 4.8333f)
                verticalLineTo(10.5908f)
                curveTo(5.5f, 13.9242f, 8.1119f, 16.7525f, 11.4552f, 17.2575f)
                verticalLineTo(20.1868f)
                horizontalLineTo(8.3209f)
                curveTo(7.694f, 20.1868f, 7.2761f, 20.5908f, 7.2761f, 21.1969f)
                curveTo(7.2761f, 21.803f, 7.694f, 22.207f, 8.3209f, 22.207f)
                horizontalLineTo(16.6791f)
                curveTo(17.306f, 22.207f, 17.7239f, 21.803f, 17.7239f, 21.1969f)
                curveTo(17.7239f, 20.5908f, 17.306f, 20.1868f, 16.6791f, 20.1868f)
                horizontalLineTo(13.5448f)
                verticalLineTo(17.2575f)
                curveTo(16.8881f, 16.7525f, 19.5f, 14.0252f, 19.5f, 10.5908f)
                verticalLineTo(4.8333f)
                curveTo(19.5f, 3.4192f, 18.2463f, 2.207f, 16.6791f, 2.207f)
                close()
            }
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 4.207f)
                curveTo(2.9f, 4.207f, 2.5f, 4.5707f, 2.5f, 5.1161f)
                verticalLineTo(10.2979f)
                curveTo(2.5f, 10.8434f, 2.9f, 11.207f, 3.5f, 11.207f)
                curveTo(4.1f, 11.207f, 4.5f, 10.8434f, 4.5f, 10.2979f)
                verticalLineTo(5.1161f)
                curveTo(4.5f, 4.6616f, 4.1f, 4.207f, 3.5f, 4.207f)
                close()
            }
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 4.207f)
                curveTo(20.9f, 4.207f, 20.5f, 4.5707f, 20.5f, 5.1161f)
                verticalLineTo(10.2979f)
                curveTo(20.5f, 10.8434f, 20.9f, 11.207f, 21.5f, 11.207f)
                curveTo(22.1f, 11.207f, 22.5f, 10.8434f, 22.5f, 10.2979f)
                verticalLineTo(5.1161f)
                curveTo(22.5f, 4.6616f, 22.1f, 4.207f, 21.5f, 4.207f)
                close()
            }
        }
        .build()
        return _icTornamentFilled!!
    }

private var _icTornamentFilled: ImageVector? = null
