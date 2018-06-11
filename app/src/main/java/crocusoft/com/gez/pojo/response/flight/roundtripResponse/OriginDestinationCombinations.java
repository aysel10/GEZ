package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class OriginDestinationCombinations implements Parcelable{

    @JsonProperty("OriginDestinationCombination")
    @SerializedName("OriginDestinationCombination")
    private Object originDestinationCombination;
    private List<OriginDestinationCombinationItem>originDestinationCombinationsList;

    public OriginDestinationCombinations(Object originDestinationCombination) {
        this.originDestinationCombination = originDestinationCombination;
    }

    public OriginDestinationCombinations(){

    }
    

    public OriginDestinationCombinations(Object originDestinationCombination, List<OriginDestinationCombinationItem> originDestinationCombinationsList) {
        this.originDestinationCombination = originDestinationCombination;
        this.originDestinationCombinationsList = originDestinationCombinationsList;
    }

    public List<OriginDestinationCombinationItem> getOriginDestinationCombinationsList() {
        return originDestinationCombinationsList;
    }

    public void setOriginDestinationCombinationsList(List<OriginDestinationCombinationItem> originDestinationCombinationsList) {
        this.originDestinationCombinationsList = originDestinationCombinationsList;
    }

    public Object getOriginDestinationCombination() {
        return originDestinationCombination;
    }

    public void setOriginDestinationCombination(Object originDestinationCombination) {
        this.originDestinationCombination = originDestinationCombination;
    }

    @Override
    public String toString() {
        return
                "OriginDestinationCombinations{" +
                        "originDestinationCombination = '" + originDestinationCombination + '\'' +
                        "}";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable((Parcelable)this.originDestinationCombination, flags);
        dest.writeTypedList(this.originDestinationCombinationsList);
    }

    protected OriginDestinationCombinations(Parcel in) {
        this.originDestinationCombination = in.readParcelable(Object.class.getClassLoader());
        this.originDestinationCombinationsList = in.createTypedArrayList(OriginDestinationCombinationItem.CREATOR);
    }

    public static final Creator<OriginDestinationCombinations> CREATOR = new Creator<OriginDestinationCombinations>() {
        @Override
        public OriginDestinationCombinations createFromParcel(Parcel source) {
            return new OriginDestinationCombinations(source);
        }

        @Override
        public OriginDestinationCombinations[] newArray(int size) {
            return new OriginDestinationCombinations[size];
        }
    };
}