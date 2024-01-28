package com.teople.umat.component.icon.umaticon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.teople.umat.component.icon.UmatIcon

public val UmatIcon.IcArrowBackFilled: ImageVector
    get() {
        if (_icArrowBackFilled != null) {
            return _icArrowBackFilled!!
        }
        _icArrowBackFilled = Builder(name = "IcArrowBackFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF111827)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7269f, 3.6872f)
                curveTo(12.8171f, 3.5918f, 12.8876f, 3.4795f, 12.9344f, 3.3567f)
                curveTo(12.9812f, 3.234f, 13.0034f, 3.1033f, 12.9997f, 2.972f)
                curveTo(12.996f, 2.8407f, 12.9664f, 2.7114f, 12.9128f, 2.5915f)
                curveTo(12.8591f, 2.4716f, 12.7823f, 2.3635f, 12.6869f, 2.2733f)
                curveTo(12.5914f, 2.183f, 12.4791f, 2.1125f, 12.3563f, 2.0657f)
                curveTo(12.2336f, 2.0189f, 12.1029f, 1.9967f, 11.9716f, 2.0004f)
                curveTo(11.8403f, 2.0041f, 11.711f, 2.0336f, 11.5911f, 2.0873f)
                curveTo(11.4712f, 2.141f, 11.3631f, 2.2178f, 11.2729f, 2.3133f)
                lineTo(2.7729f, 11.3132f)
                curveTo(2.5973f, 11.4989f, 2.4995f, 11.7447f, 2.4995f, 12.0002f)
                curveTo(2.4995f, 12.2558f, 2.5973f, 12.5016f, 2.7729f, 12.6872f)
                lineTo(11.2729f, 21.6882f)
                curveTo(11.3625f, 21.7858f, 11.4706f, 21.8646f, 11.5909f, 21.92f)
                curveTo(11.7112f, 21.9754f, 11.8414f, 22.0064f, 11.9738f, 22.0111f)
                curveTo(12.1062f, 22.0158f, 12.2382f, 21.9942f, 12.3621f, 21.9474f)
                curveTo(12.4861f, 21.9007f, 12.5995f, 21.8298f, 12.6959f, 21.7388f)
                curveTo(12.7922f, 21.6479f, 12.8695f, 21.5387f, 12.9232f, 21.4176f)
                curveTo(12.977f, 21.2965f, 13.0062f, 21.166f, 13.009f, 21.0335f)
                curveTo(13.0119f, 20.9011f, 12.9885f, 20.7694f, 12.94f, 20.6461f)
                curveTo(12.8916f, 20.5228f, 12.8191f, 20.4103f, 12.7269f, 20.3153f)
                lineTo(4.8748f, 12.0002f)
                lineTo(12.7269f, 3.6872f)
                close()
            }
        }
        .build()
        return _icArrowBackFilled!!
    }

private var _icArrowBackFilled: ImageVector? = null
