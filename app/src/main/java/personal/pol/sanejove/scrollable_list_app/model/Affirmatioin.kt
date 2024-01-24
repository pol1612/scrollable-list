package personal.pol.sanejove.scrollable_list_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmatioin(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId : Int
)