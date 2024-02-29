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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon

public val UmatIcon.IcFilterNew: ImageVector
    get() {
        if (_icFilterNew != null) {
            return _icFilterNew!!
        }
        _icFilterNew = Builder(name = "IcFilterNew", defaultWidth = 17.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 17.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFFF5B0A)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.5f, 0.0f)
                    lineTo(8.5f, 0.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 16.5f, 8.0f)
                    lineTo(16.5f, 8.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 8.5f, 16.0f)
                    lineTo(8.5f, 16.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 0.5f, 8.0f)
                    lineTo(0.5f, 8.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 8.5f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.4648f, 3.9297f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(10.332f)
                    lineTo(6.9824f, 6.166f)
                    horizontalLineTo(6.9238f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(5.6543f)
                    verticalLineTo(3.9297f)
                    horizontalLineTo(6.8066f)
                    lineTo(10.1367f, 8.7637f)
                    horizontalLineTo(10.2051f)
                    verticalLineTo(3.9297f)
                    horizontalLineTo(11.4648f)
                    close()
                }
            }
        }
        .build()
        return _icFilterNew!!
    }

private var _icFilterNew: ImageVector? = null
