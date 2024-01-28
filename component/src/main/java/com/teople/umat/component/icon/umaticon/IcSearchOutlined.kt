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

public val UmatIcon.IcSearchOutlined: ImageVector
    get() {
        if (_icSearchOutlined != null) {
            return _icSearchOutlined!!
        }
        _icSearchOutlined = Builder(name = "IcSearchOutlined", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.3849f, 15.446f)
                curveTo(11.7346f, 17.5687f, 7.8552f, 17.4016f, 5.3984f, 14.9448f)
                curveTo(2.7624f, 12.3088f, 2.7624f, 8.035f, 5.3984f, 5.3989f)
                curveTo(8.0345f, 2.7629f, 12.3083f, 2.7629f, 14.9443f, 5.3989f)
                curveTo(17.4011f, 7.8557f, 17.5682f, 11.7351f, 15.4455f, 14.3854f)
                lineTo(20.6012f, 19.541f)
                curveTo(20.8941f, 19.8339f, 20.8941f, 20.3088f, 20.6012f, 20.6017f)
                curveTo(20.3083f, 20.8946f, 19.8334f, 20.8946f, 19.5405f, 20.6017f)
                lineTo(14.3849f, 15.446f)
                close()
                moveTo(6.4591f, 13.8842f)
                curveTo(4.4088f, 11.8339f, 4.4088f, 8.5098f, 6.4591f, 6.4596f)
                curveTo(8.5093f, 4.4093f, 11.8334f, 4.4093f, 13.8837f, 6.4596f)
                curveTo(15.9324f, 8.5083f, 15.9339f, 11.829f, 13.8882f, 13.8797f)
                curveTo(13.8867f, 13.8812f, 13.8852f, 13.8826f, 13.8836f, 13.8842f)
                curveTo(13.8821f, 13.8857f, 13.8806f, 13.8872f, 13.8792f, 13.8887f)
                curveTo(11.8285f, 15.9344f, 8.5078f, 15.9329f, 6.4591f, 13.8842f)
                close()
            }
        }
        .build()
        return _icSearchOutlined!!
    }

private var _icSearchOutlined: ImageVector? = null
