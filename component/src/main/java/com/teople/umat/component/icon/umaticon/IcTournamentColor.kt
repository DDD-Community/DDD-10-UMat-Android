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

public val UmatIcon.IcTournamentColor: ImageVector
    get() {
        if (_icTournamentColor != null) {
            return _icTournamentColor!!
        }
        _icTournamentColor = Builder(name = "IcTournamentColor", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFFFDD842)), stroke = null, fillAlpha = 0.35f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                lineTo(18.0f, 0.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 36.0f, 18.0f)
                lineTo(36.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 18.0f, 36.0f)
                lineTo(18.0f, 36.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 0.0f, 18.0f)
                lineTo(0.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 18.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDD842)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1791f, 8.207f)
                horizontalLineTo(13.8209f)
                curveTo(12.2537f, 8.207f, 11.0f, 9.4192f, 11.0f, 10.8333f)
                verticalLineTo(16.5908f)
                curveTo(11.0f, 19.9242f, 13.6119f, 22.7525f, 16.9552f, 23.2575f)
                verticalLineTo(26.1868f)
                horizontalLineTo(13.8209f)
                curveTo(13.194f, 26.1868f, 12.7761f, 26.5908f, 12.7761f, 27.1969f)
                curveTo(12.7761f, 27.803f, 13.194f, 28.207f, 13.8209f, 28.207f)
                horizontalLineTo(22.1791f)
                curveTo(22.806f, 28.207f, 23.2239f, 27.803f, 23.2239f, 27.1969f)
                curveTo(23.2239f, 26.5908f, 22.806f, 26.1868f, 22.1791f, 26.1868f)
                horizontalLineTo(19.0448f)
                verticalLineTo(23.2575f)
                curveTo(22.3881f, 22.7525f, 25.0f, 20.0252f, 25.0f, 16.5908f)
                verticalLineTo(10.8333f)
                curveTo(25.0f, 9.4192f, 23.7463f, 8.207f, 22.1791f, 8.207f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDD842)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.207f)
                curveTo(8.4f, 10.207f, 8.0f, 10.5707f, 8.0f, 11.1161f)
                verticalLineTo(16.2979f)
                curveTo(8.0f, 16.8434f, 8.4f, 17.207f, 9.0f, 17.207f)
                curveTo(9.6f, 17.207f, 10.0f, 16.8434f, 10.0f, 16.2979f)
                verticalLineTo(11.1161f)
                curveTo(10.0f, 10.6616f, 9.6f, 10.207f, 9.0f, 10.207f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDD842)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 10.207f)
                curveTo(26.4f, 10.207f, 26.0f, 10.5707f, 26.0f, 11.1161f)
                verticalLineTo(16.2979f)
                curveTo(26.0f, 16.8434f, 26.4f, 17.207f, 27.0f, 17.207f)
                curveTo(27.6f, 17.207f, 28.0f, 16.8434f, 28.0f, 16.2979f)
                verticalLineTo(11.1161f)
                curveTo(28.0f, 10.6616f, 27.6f, 10.207f, 27.0f, 10.207f)
                close()
            }
        }
        .build()
        return _icTournamentColor!!
    }

private var _icTournamentColor: ImageVector? = null
