package crocusoft.com.gez.util;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import crocusoft.com.gez.pojo.response.flight.defaultFlight.FlightSegment;
import crocusoft.com.gez.pojo.response.flight.defaultFlight.OriginDestinationOptionItem;
import crocusoft.com.gez.pojo.response.flight.defaultFlight.PricedItineraryItem;
import crocusoft.com.gez.pojo.response.flight.defaultFlight.Response;
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel;
import crocusoft.com.gez.view_model.PricedItineraryItemViewModel;
import crocusoft.com.gez.view_model.TicketDataViewModel;

/**
 * Created by Kanan on 5/10/2018.
 */
public class Utility {

    public static TicketDataViewModel getTicketList(Response response) {
        TicketDataViewModel ticketDataViewModel = new TicketDataViewModel();
        try {
            List<PricedItineraryItem> pricedItineraryItemList = response
                    .getSoapEnvelope()
                    .getSoapBody()
                    .getSearchFlightResponse()
                    .getOTAAirLowFareSearchRS()
                    .getPricedItineraries()
                    .getPricedItinerary();
            List<PricedItineraryItemViewModel> pricedItineraryItemViewModelList = new ArrayList<>();

            for (PricedItineraryItem pricedItineraryItem : pricedItineraryItemList) {

                PricedItineraryItemViewModel pricedItineraryItemViewModel = new PricedItineraryItemViewModel();
                pricedItineraryItemViewModel.setSequenceNumber(pricedItineraryItem.getSequenceNumber());
                pricedItineraryItemViewModel.setCurrency(pricedItineraryItem.getCurrency());

                List<OriginDestinationOptionItem> originDestinationOptionItemList = pricedItineraryItem
                        .getAirItinerary()
                        .getOriginDestinationOptions()
                        .getOriginDestinationOption();

                List<OriginDestinationOptionItemViewModel> originDestinationOptionItemViewModelList
                        = new ArrayList<>();
                for (OriginDestinationOptionItem originDestinationOptionItem : originDestinationOptionItemList) {
                    List<FlightSegment> flightSegmentList = new ArrayList<>();
                    OriginDestinationOptionItemViewModel originDestinationOptionItemViewModel = new OriginDestinationOptionItemViewModel();
                    originDestinationOptionItemViewModel.setDirectionId(originDestinationOptionItem.getDirectionId());
                    originDestinationOptionItemViewModel.setElapsedTime(originDestinationOptionItem.getElapsedTime());
                    originDestinationOptionItemViewModel.setOptionPricingInfo(originDestinationOptionItem.getOptionPricingInfo());
                    originDestinationOptionItemViewModel.setRefNumber(originDestinationOptionItem.getRefNumber());
//                    System.out.println(String.format("direction id = %s", originDestinationOptionItem.getDirectionId()));
                    Gson gson = new Gson();
                    String jsonInString = gson.toJson(originDestinationOptionItem.getFlightSegment());
//                    Log.e("kanan",jsonInString);
                    try {
                        FlightSegment flightSegment = new Gson().fromJson(jsonInString, FlightSegment.class);
                        flightSegmentList.add(flightSegment);
                    } catch (JsonSyntaxException e) {
                        JSONArray jsonArray = new JSONArray(jsonInString);

                        for(int i=0;i<jsonArray.length();i++){
                            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                            flightSegmentList.add(new Gson().fromJson(jsonObject.toString(), FlightSegment.class));

                        }

                    }
                    originDestinationOptionItemViewModel.setFlightSegmentList(flightSegmentList);
                    originDestinationOptionItemViewModelList.add(originDestinationOptionItemViewModel);
                }
                pricedItineraryItemViewModel.setCustomOriginDestinationOptionItemList(originDestinationOptionItemViewModelList);
                pricedItineraryItemViewModelList.add(pricedItineraryItemViewModel);
            }

            ticketDataViewModel.setPricedItineraryItemList(pricedItineraryItemViewModelList);

//            System.out.println(new Gson().toJson(ticketDataViewModel));

//            System.out.println(ticketDataViewModel.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticketDataViewModel;

    }





}
