package crocusoft.com.gez.models

import android.os.Parcel
import android.os.Parcelable
import crocusoft.com.gez.flight_view_model.OriginDestinationOptionItemViewModel

data class TicketCombination(var indexList: ArrayList<String> = ArrayList(), var originDestinations: ArrayList<OriginDestinationOptionItemViewModel> = ArrayList(), var combId: String = "", var segment: String="") : Parcelable {
    constructor(source: Parcel) : this(
            source.createStringArrayList(),
            source.createTypedArrayList(OriginDestinationOptionItemViewModel.CREATOR),
            source.readString(),
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeStringList(indexList)
        writeTypedList(originDestinations)
        writeString(combId)
        writeString(segment)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<TicketCombination> = object : Parcelable.Creator<TicketCombination> {
            override fun createFromParcel(source: Parcel): TicketCombination = TicketCombination(source)
            override fun newArray(size: Int): Array<TicketCombination?> = arrayOfNulls(size)
        }
    }
}