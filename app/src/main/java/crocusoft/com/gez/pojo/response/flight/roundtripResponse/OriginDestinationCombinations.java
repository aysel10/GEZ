package crocusoft.com.gez.pojo.response.flight.roundtripResponse;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginDestinationCombinations {

    @JsonProperty("OriginDestinationCombination")
    private Object originDestinationCombination;

    public OriginDestinationCombinations(Object originDestinationCombination) {
        this.originDestinationCombination = originDestinationCombination;
    }
    public OriginDestinationCombinations(){

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
}