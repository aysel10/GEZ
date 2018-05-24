package crocusoft.com.gez.pojo.request.searchRoundtripFlight;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonAutoDetect(fieldVisibility=JsonAutoDetect.Visibility.ANY, getterVisibility=JsonAutoDetect.Visibility.NONE, setterVisibility= JsonAutoDetect.Visibility.NONE, creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class OriginDestinationInformation {
    @JsonProperty("OneWayOriginDestinationInformation")
    @Expose
    private List<OriginDestinationInformation_> originDestinationInformation = null;

    public OriginDestinationInformation(List<OriginDestinationInformation_> originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

    public List<OriginDestinationInformation_> getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    public void setOriginDestinationInformation(List<OriginDestinationInformation_> originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

}
