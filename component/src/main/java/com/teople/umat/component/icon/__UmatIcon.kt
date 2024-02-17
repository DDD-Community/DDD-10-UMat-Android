package com.teople.umat.component.icon

import androidx.compose.ui.graphics.vector.ImageVector
import com.teople.umat.component.icon.umaticon.IcAddFilled
import com.teople.umat.component.icon.umaticon.IcArrowBackFilled
import com.teople.umat.component.icon.umaticon.IcArrowForwardFilled
import com.teople.umat.component.icon.umaticon.IcCalenderFilled
import com.teople.umat.component.icon.umaticon.IcCancleOutlined
import com.teople.umat.component.icon.umaticon.IcCheckOutlined
import com.teople.umat.component.icon.umaticon.IcClockOutlined
import com.teople.umat.component.icon.umaticon.IcCurrentLocationOutlined
import com.teople.umat.component.icon.umaticon.IcEditOutlined
import com.teople.umat.component.icon.umaticon.IcHeartFilled
import com.teople.umat.component.icon.umaticon.IcHeartOutlined
import com.teople.umat.component.icon.umaticon.IcHomeOutlined
import com.teople.umat.component.icon.umaticon.IcMoneyOutlined
import com.teople.umat.component.icon.umaticon.IcMoreOutlined
import com.teople.umat.component.icon.umaticon.IcMyOutlined
import com.teople.umat.component.icon.umaticon.IcProfileUserBlueFilled
import com.teople.umat.component.icon.umaticon.IcProfileUserOrangeFilled
import com.teople.umat.component.icon.umaticon.IcProfileUserPurpleFilled
import com.teople.umat.component.icon.umaticon.IcRefreshOutlined
import com.teople.umat.component.icon.umaticon.IcSearchOutlined
import com.teople.umat.component.icon.umaticon.IcSettingsOutlined
import com.teople.umat.component.icon.umaticon.IcStarOutlined
import com.teople.umat.component.icon.umaticon.IcWarningOutlined
import kotlin.collections.List as ____KtList

public object UmatIcon

private var __UmatIcons: ____KtList<ImageVector>? = null

public val UmatIcon.UmatIcons: ____KtList<ImageVector>
    get() {
        if (__UmatIcons != null) {
            return __UmatIcons!!
        }
        __UmatIcons = listOf(
            IcCalenderFilled, IcClockOutlined, IcHeartFilled, IcStarOutlined,
            IcHeartOutlined, IcArrowForwardFilled, IcMoreOutlined, IcAddFilled,
            IcCurrentLocationOutlined, IcSearchOutlined, IcMoneyOutlined, IcMyOutlined,
            IcCancleOutlined, IcWarningOutlined, IcArrowBackFilled, IcEditOutlined, IcCheckOutlined,
            IcRefreshOutlined, IcSettingsOutlined, IcHomeOutlined, IcProfileUserOrangeFilled,
            IcProfileUserBlueFilled, IcProfileUserPurpleFilled
        )
        return __UmatIcons!!
    }
