package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class OriginDestinationCombinations implements Parcelable{

	@SerializedName("OriginDestinationCombination")
	@JsonProperty("OriginDestinationCombination")
	private Object OriginDestinationCombination;
	private List<OriginDestinationCombinationItem> originDestinationCombinationList;

	public List<OriginDestinationCombinationItem> getOriginDestinationCombinationList() {
		return originDestinationCombinationList;
	}

	public void setOriginDestinationCombinationList(List<OriginDestinationCombinationItem> originDestinationCombinationList) {
		this.originDestinationCombinationList = originDestinationCombinationList;
	}

	public Object getOriginDestinationCombination() {
		return OriginDestinationCombination;
	}

	public void setOriginDestinationCombination(Object originDestinationCombination) {
		OriginDestinationCombination = originDestinationCombination;
	}

	@Override
 	public String toString(){
		return 
			"OriginDestinationCombinations{" + 
			"originDestinationCombination = '" + originDestinationCombinationList + '\'' +
			"}";
		}


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable((Parcelable) this.OriginDestinationCombination, flags);
        dest.writeTypedList(this.originDestinationCombinationList);
    }

    public OriginDestinationCombinations() {
    }

    protected OriginDestinationCombinations(Parcel in) {
        this.OriginDestinationCombination = in.readParcelable(Object.class.getClassLoader());
        this.originDestinationCombinationList = in.createTypedArrayList(OriginDestinationCombinationItem.CREATOR);
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