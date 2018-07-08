package crocusoft.com.gez.pojo.response.flight.multiCityReponse;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketDesignators implements Parcelable{

	@JsonProperty("TicketDesignator")
	private Object ticketDesignator;

	public Object getTicketDesignator() {
		return ticketDesignator;
	}

	public void setTicketDesignator(Object ticketDesignator) {
		this.ticketDesignator = ticketDesignator;
	}

	//private List<TicketDesignatorItem> ticketDesignator;

//	public void setTicketDesignator(List<TicketDesignatorItem> ticketDesignator){
//		this.ticketDesignator = ticketDesignator;
//	}
//
//	public List<TicketDesignatorItem> getTicketDesignator(){
//		return ticketDesignator;
//	}

	@Override
 	public String toString(){
		return 
			"TicketDesignators{" + 
			"ticketDesignator = '" + ticketDesignator + '\'' + 
			"}";
		}


	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeParcelable((Parcelable) this.ticketDesignator, flags);
	}

	public TicketDesignators() {
	}

	protected TicketDesignators(Parcel in) {
		this.ticketDesignator = in.readParcelable(Object.class.getClassLoader());
	}

	public static final Creator<TicketDesignators> CREATOR = new Creator<TicketDesignators>() {
		@Override
		public TicketDesignators createFromParcel(Parcel source) {
			return new TicketDesignators(source);
		}

		@Override
		public TicketDesignators[] newArray(int size) {
			return new TicketDesignators[size];
		}
	};
}