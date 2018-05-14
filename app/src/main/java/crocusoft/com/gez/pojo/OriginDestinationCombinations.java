package crocusoft.com.gez.pojo;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class OriginDestinationCombinations {

    @SerializedName("OriginDestinationCombination")
    private Object originDestinationCombination;

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