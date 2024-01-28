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

public val UmatIcon.IcAddFilled: ImageVector
    get() {
        if (_icAddFilled != null) {
            return _icAddFilled!!
        }
        _icAddFilled = Builder(name = "IcAddFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.3447f, 4.019f)
                curveTo(10.4138f, 3.676f, 13.5866f, 3.676f, 16.6557f, 4.019f)
                curveTo(18.3684f, 4.2104f, 19.7501f, 5.5598f, 19.9513f, 7.2793f)
                curveTo(20.3182f, 10.417f, 20.3182f, 13.5867f, 19.9513f, 16.7243f)
                curveTo(19.7501f, 18.4438f, 18.3684f, 19.7932f, 16.6557f, 19.9846f)
                curveTo(13.5866f, 20.3276f, 10.4138f, 20.3276f, 7.3447f, 19.9846f)
                curveTo(5.632f, 19.7932f, 4.2503f, 18.4438f, 4.0491f, 16.7243f)
                curveTo(3.6822f, 13.5867f, 3.6822f, 10.417f, 4.0491f, 7.2793f)
                curveTo(4.2503f, 5.5598f, 5.632f, 4.2104f, 7.3447f, 4.019f)
                close()
                moveTo(12.0002f, 7.0091f)
                curveTo(12.4144f, 7.0091f, 12.7502f, 7.3449f, 12.7502f, 7.7591f)
                verticalLineTo(11.2518f)
                horizontalLineTo(16.2429f)
                curveTo(16.6571f, 11.2518f, 16.9929f, 11.5876f, 16.9929f, 12.0018f)
                curveTo(16.9929f, 12.416f, 16.6571f, 12.7518f, 16.2429f, 12.7518f)
                horizontalLineTo(12.7502f)
                verticalLineTo(16.2444f)
                curveTo(12.7502f, 16.6587f, 12.4144f, 16.9944f, 12.0002f, 16.9944f)
                curveTo(11.586f, 16.9944f, 11.2502f, 16.6587f, 11.2502f, 16.2444f)
                verticalLineTo(12.7518f)
                horizontalLineTo(7.7576f)
                curveTo(7.3434f, 12.7518f, 7.0076f, 12.416f, 7.0076f, 12.0018f)
                curveTo(7.0076f, 11.5876f, 7.3434f, 11.2518f, 7.7576f, 11.2518f)
                horizontalLineTo(11.2502f)
                verticalLineTo(7.7591f)
                curveTo(11.2502f, 7.3449f, 11.586f, 7.0091f, 12.0002f, 7.0091f)
                close()
            }
        }
        .build()
        return _icAddFilled!!
    }

private var _icAddFilled: ImageVector? = null
