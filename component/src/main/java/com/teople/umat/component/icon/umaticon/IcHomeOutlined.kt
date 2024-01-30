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

public val UmatIcon.IcHomeOutlined: ImageVector
    get() {
        if (_icHomeOutlined != null) {
            return _icHomeOutlined!!
        }
        _icHomeOutlined = Builder(name = "IcHomeOutlined", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.5579f, 5.5328f)
                curveTo(12.6874f, 4.6974f, 11.3128f, 4.6974f, 10.4423f, 5.5328f)
                lineTo(5.8158f, 9.9721f)
                curveTo(5.7024f, 10.0808f, 5.6262f, 10.2225f, 5.5979f, 10.377f)
                curveTo(5.0437f, 13.3989f, 5.0028f, 16.4925f, 5.4769f, 19.528f)
                lineTo(5.5894f, 20.2485f)
                horizontalLineTo(8.5659f)
                verticalLineTo(14.0372f)
                curveTo(8.5659f, 13.6229f, 8.9016f, 13.2872f, 9.3159f, 13.2872f)
                horizontalLineTo(14.6843f)
                curveTo(15.0985f, 13.2872f, 15.4343f, 13.6229f, 15.4343f, 14.0372f)
                verticalLineTo(20.2485f)
                horizontalLineTo(18.4108f)
                lineTo(18.5233f, 19.528f)
                curveTo(18.9973f, 16.4925f, 18.9564f, 13.3989f, 18.4023f, 10.377f)
                curveTo(18.374f, 10.2225f, 18.2977f, 10.0808f, 18.1844f, 9.9721f)
                lineTo(13.5579f, 5.5328f)
                close()
                moveTo(9.4037f, 4.4504f)
                curveTo(10.8547f, 3.0582f, 13.1455f, 3.0582f, 14.5965f, 4.4504f)
                lineTo(19.2229f, 8.8898f)
                curveTo(19.5635f, 9.2166f, 19.7926f, 9.6423f, 19.8777f, 10.1065f)
                curveTo(20.4622f, 13.2941f, 20.5054f, 16.5575f, 20.0053f, 19.7594f)
                lineTo(19.8246f, 20.9169f)
                curveTo(19.7498f, 21.3956f, 19.3375f, 21.7485f, 18.853f, 21.7485f)
                horizontalLineTo(14.6843f)
                curveTo(14.2701f, 21.7485f, 13.9343f, 21.4127f, 13.9343f, 20.9985f)
                verticalLineTo(14.7872f)
                horizontalLineTo(10.0659f)
                verticalLineTo(20.9985f)
                curveTo(10.0659f, 21.4127f, 9.7301f, 21.7485f, 9.3159f, 21.7485f)
                horizontalLineTo(5.1471f)
                curveTo(4.6626f, 21.7485f, 4.2503f, 21.3956f, 4.1756f, 20.9169f)
                lineTo(3.9948f, 19.7594f)
                curveTo(3.4948f, 16.5575f, 3.5379f, 13.2941f, 4.1225f, 10.1065f)
                curveTo(4.2076f, 9.6423f, 4.4367f, 9.2166f, 4.7772f, 8.8898f)
                lineTo(9.4037f, 4.4504f)
                close()
            }
        }
        .build()
        return _icHomeOutlined!!
    }

private var _icHomeOutlined: ImageVector? = null
