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

public val UmatIcon.IcEditOutlined: ImageVector
    get() {
        if (_icEditOutlined != null) {
            return _icEditOutlined!!
        }
        _icEditOutlined = Builder(name = "IcEditOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.4491f, 1.8945f)
                lineTo(22.1059f, 7.5514f)
                lineTo(9.0851f, 20.5722f)
                horizontalLineTo(3.4282f)
                verticalLineTo(14.9154f)
                lineTo(16.4491f, 1.8945f)
                close()
                moveTo(16.4491f, 4.723f)
                lineTo(15.026f, 6.146f)
                lineTo(17.8544f, 8.9744f)
                lineTo(19.2775f, 7.5514f)
                lineTo(16.4491f, 4.723f)
                close()
                moveTo(16.4402f, 10.3887f)
                lineTo(13.6118f, 7.5602f)
                lineTo(5.4282f, 15.7438f)
                verticalLineTo(18.5722f)
                horizontalLineTo(8.2566f)
                lineTo(16.4402f, 10.3887f)
                close()
            }
        }
        .build()
        return _icEditOutlined!!
    }

private var _icEditOutlined: ImageVector? = null
