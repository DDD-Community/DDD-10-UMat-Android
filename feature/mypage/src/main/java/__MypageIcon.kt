import androidx.compose.ui.graphics.vector.ImageVector
import mypageicon.IcCalenderFilled
import mypageicon.IcHeartFilled
import mypageicon.IcProfileUserOrangeFilled
import mypageicon.IcProfileUserPurpleFilled
import kotlin.collections.List as ____KtList

public object MypageIcon

private var __MypageIcons: ____KtList<ImageVector>? = null

public val MypageIcon.MypageIcons: ____KtList<ImageVector>
  get() {
    if (__MypageIcons != null) {
      return __MypageIcons!!
    }
    __MypageIcons= listOf(IcCalenderFilled, IcProfileUserPurpleFilled, IcHeartFilled,
        IcProfileUserOrangeFilled)
    return __MypageIcons!!
  }
