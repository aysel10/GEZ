package crocusoft.com.gez.util;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import crocusoft.com.gez.models.AirportSearchModel;
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.MultiCityResponse;
import crocusoft.com.gez.pojo.response.flight.multiCityReponse.TicketDesignatorItem;
import crocusoft.com.gez.pojo.response.flight.oneWayResponse.Response;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.BaggageItem;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.FlightSegment;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.FreeBaggages;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OriginDestinationCombinationItem;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.OriginDestinationOptionItem;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.PricedItineraries;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.PricedItineraryItem;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.RoundtripResponse;
import crocusoft.com.gez.pojo.response.flight.roundtripResponse.TicketDesignators;
import crocusoft.com.gez.view_model.OriginDestinationCombinationItemViewModel;
import crocusoft.com.gez.view_model.OriginDestinationOptionItemViewModel;
import crocusoft.com.gez.view_model.PricedItineraryItemViewModel;
import crocusoft.com.gez.view_model.TicketDataViewModel;


public class Utility {

    public static TicketDataViewModel getTicketList(MultiCityResponse response) {
        TicketDataViewModel ticketDataViewModel = new TicketDataViewModel();
        try {
            List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.PricedItineraryItem> pricedItineraryItemList = response
                    .getSoapEnvelope()
                    .getSoapBody()
                    .getSearchFlightResponse()
                    .getOTAAirLowFareSearchRS()
                    .getPricedItineraries()
                    .getPricedItinerary();
            List<PricedItineraryItemViewModel> pricedItineraryItemViewModelList = new ArrayList<>();

            crocusoft.com.gez.pojo.response.flight.multiCityReponse.PricedItineraries pricedItineraries = response
                    .getSoapEnvelope()
                    .getSoapBody()
                    .getSearchFlightResponse()
                    .getOTAAirLowFareSearchRS()
                    .getPricedItineraries();
            for (crocusoft.com.gez.pojo.response.flight.multiCityReponse.PricedItineraryItem pricedItineraryItem : pricedItineraryItemList) {

                PricedItineraryItemViewModel pricedItineraryItemViewModel = new PricedItineraryItemViewModel();
                pricedItineraryItemViewModel.setSequenceNumber(pricedItineraryItem.getSequenceNumber());
                pricedItineraryItemViewModel.setCurrency(pricedItineraryItem.getCurrency());

                List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationOptionItem> originDestinationOptionItemList = pricedItineraryItem
                        .getAirItinerary()
                        .getOriginDestinationOptions()
                        .getOriginDestinationOption();

                List<OriginDestinationOptionItemViewModel> originDestinationOptionItemViewModelList
                        = new ArrayList<>();

                List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem> destinationCombinationItems = new ArrayList<>();

                //COMBINATIONS
                Gson gson = new Gson();
                String s = gson.toJson(pricedItineraryItem.getAirItinerary().getOriginDestinationCombinations().getOriginDestinationCombination());
                try {
                    crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem flightSegment =
                            new Gson().fromJson(s, crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem.class);
                    destinationCombinationItems.add(flightSegment);
                } catch (JsonSyntaxException e) {
                    JSONArray jsonArray = new JSONArray(s);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                        destinationCombinationItems.add(new Gson().fromJson(jsonObject.toString(), crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationCombinationItem.class));
                    }
                }

                //DESTINATIONS AND SEGMENT
                for (crocusoft.com.gez.pojo.response.flight.multiCityReponse.OriginDestinationOptionItem originDestinationOptionItem : originDestinationOptionItemList) {
                    List<crocusoft.com.gez.pojo.response.flight.multiCityReponse.FlightSegment> flightSegmentList = new ArrayList<>();
                    OriginDestinationOptionItemViewModel originDestinationOptionItemViewModel = new OriginDestinationOptionItemViewModel();
                    originDestinationOptionItemViewModel.setDirectionId(originDestinationOptionItem.getDirectionId());
                    originDestinationOptionItemViewModel.setElapsedTime(originDestinationOptionItem.getElapsedTime());
                    originDestinationOptionItemViewModel.setOptionPricingInfo(originDestinationOptionItem.getOptionPricingInfo());
                    originDestinationOptionItemViewModel.setRefNumber(originDestinationOptionItem.getRefNumber());
                    originDestinationOptionItemViewModel.setSequenceNumber(pricedItineraryItem.getSequenceNumber());


                    Gson sd = new Gson();
                    String jsonInString = sd.toJson(originDestinationOptionItem.getFlightSegment());
                    try {
                        crocusoft.com.gez.pojo.response.flight.multiCityReponse.FlightSegment flightSegment =
                                new Gson().fromJson(jsonInString, crocusoft.com.gez.pojo.response.flight.multiCityReponse.FlightSegment.class);
                        flightSegmentList.add(flightSegment);
                    } catch (JsonSyntaxException e) {
                        JSONArray jsonArray = new JSONArray(jsonInString);

                        for(int i=0;i<jsonArray.length();i++){
                            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                            flightSegmentList.add(new Gson().fromJson(jsonObject.toString(), crocusoft.com.gez.pojo.response.flight.multiCityReponse.FlightSegment.class));
                        }
                    }
                    originDestinationOptionItemViewModel.setMultiAirItineraryPricingInfo(pricedItineraryItem.getAirItineraryPricingInfo());
                    originDestinationOptionItemViewModel.setMultiCityFlightSegment(flightSegmentList);
                    originDestinationOptionItemViewModelList.add(originDestinationOptionItemViewModel);

                }
                pricedItineraryItemViewModel.setFreeBaggagesMultiCity(pricedItineraries.getFreeBaggages());
                pricedItineraryItemViewModel.setFreeBaggagesListMultiCity(pricedItineraries.getFreeBaggagesList());
                pricedItineraryItemViewModel.setOriginMultiCityCombinationOptionList(destinationCombinationItems);
                pricedItineraryItemViewModel.setCustomOriginDestinationOptionItemList(originDestinationOptionItemViewModelList);
                pricedItineraryItemViewModelList.add(pricedItineraryItemViewModel);
            }
            ticketDataViewModel.setPricedItineraryItemList(pricedItineraryItemViewModelList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticketDataViewModel;
    }



    public static TicketDataViewModel getTicketList(RoundtripResponse response) {
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
            PricedItineraries pricedItineraries = response
                    .getSoapEnvelope()
                    .getSoapBody()
                    .getSearchFlightResponse()
                    .getOTAAirLowFareSearchRS()
                    .getPricedItineraries();
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
                List<OriginDestinationCombinationItemViewModel> originDestinationCombinationItemViewModelList
                        = new ArrayList<>();

                List<OriginDestinationCombinationItem> destinationCombinationItems = new ArrayList<>();

                //COMBINATIONS
                Gson gson = new Gson();
                String s = gson.toJson(pricedItineraryItem.getAirItinerary().getOriginDestinationCombinations().getOriginDestinationCombination());
                try {
                    OriginDestinationCombinationItem flightSegment = new Gson().fromJson(s, OriginDestinationCombinationItem.class);
                    destinationCombinationItems.add(flightSegment);
                } catch (JsonSyntaxException e) {
                    JSONArray jsonArray = new JSONArray(s);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                        destinationCombinationItems.add(new Gson().fromJson(jsonObject.toString(), OriginDestinationCombinationItem.class));
                    }
                }

                //DESTINATIONS AND SEGMENT
                for (OriginDestinationOptionItem originDestinationOptionItem : originDestinationOptionItemList) {
                    List<FlightSegment> flightSegmentList = new ArrayList<>();
                    List<crocusoft.com.gez.pojo.response.flight.roundtripResponse.TicketDesignatorItem> ticketDesignatorItemList = new ArrayList<>();

                    OriginDestinationOptionItemViewModel originDestinationOptionItemViewModel = new OriginDestinationOptionItemViewModel();
                    originDestinationOptionItemViewModel.setDirectionId(originDestinationOptionItem.getDirectionId());
                    originDestinationOptionItemViewModel.setElapsedTime(originDestinationOptionItem.getElapsedTime());
                  //  originDestinationOptionItemViewModel.setOptionPricingInfo(originDestinationOptionItem.getOptionPricingInfo());
                    originDestinationOptionItemViewModel.setRefNumber(originDestinationOptionItem.getRefNumber());
                    originDestinationOptionItemViewModel.setSequenceNumber(pricedItineraryItem.getSequenceNumber());


                    Gson sd = new Gson();
                    String jsonInString = sd.toJson(originDestinationOptionItem.getFlightSegment());
                    String ticketDesignator = sd.toJson(pricedItineraryItem.getAirItineraryPricingInfo().getPTCFareBreakdowns().getPTCFareBreakdown().getTicketDesignators().getTicketDesignator());

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

                    try {
                        crocusoft.com.gez.pojo.response.flight.roundtripResponse.TicketDesignatorItem ticketDesignators =
                                new Gson().fromJson(ticketDesignator, crocusoft.com.gez.pojo.response.flight.roundtripResponse.TicketDesignatorItem.class);
                        ticketDesignatorItemList.add(ticketDesignators);
                    } catch (JsonSyntaxException e) {
                        JSONArray designatorList = new JSONArray(ticketDesignator);

                        for(int j=0;j<designatorList.length();j++) {
                            JSONObject designatorObject = (JSONObject) designatorList.get(j);
                            ticketDesignatorItemList.add(new Gson().fromJson(designatorObject.toString(), crocusoft.com.gez.pojo.response.flight.roundtripResponse.TicketDesignatorItem.class));
                        }
                    }

                    pricedItineraryItem.getAirItineraryPricingInfo().getPTCFareBreakdowns().getPTCFareBreakdown().getTicketDesignators().setTicketDesignatorItems(ticketDesignatorItemList);
                    originDestinationOptionItemViewModel.setRoundtripAirItineraryPricingInfo(pricedItineraryItem.getAirItineraryPricingInfo());

                    originDestinationOptionItemViewModel.setFlightSegmentList(flightSegmentList);
                    originDestinationOptionItemViewModelList.add(originDestinationOptionItemViewModel);

                }
                List<BaggageItem> freeBaggagesList = new ArrayList<>();
                Gson json = new Gson();
                String baggage = json.toJson(pricedItineraries.getFreeBaggages().getBaggageItem());
                try {
                    BaggageItem flightSegment = new Gson().fromJson(baggage, BaggageItem.class);
                    freeBaggagesList.add(flightSegment);
                } catch (JsonSyntaxException e) {
                    JSONArray jsonArray = new JSONArray(baggage);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                        freeBaggagesList.add(new Gson().fromJson(jsonObject.toString(), BaggageItem.class));
                    }
                }
                FreeBaggages freeBaggages = pricedItineraries.getFreeBaggages();
                freeBaggages.setBaggage(freeBaggagesList);

                pricedItineraryItemViewModel.setFreeBaggages(freeBaggages);
                pricedItineraryItemViewModel.setFreeBaggagesList(pricedItineraries.getFreeBaggagesList());
                pricedItineraryItemViewModel.setCustomOriginCombinationOptionItemList(destinationCombinationItems);
                pricedItineraryItemViewModel.setCustomOriginDestinationOptionItemList(originDestinationOptionItemViewModelList);
                pricedItineraryItemViewModelList.add(pricedItineraryItemViewModel);
            }
            ticketDataViewModel.setPricedItineraryItemList(pricedItineraryItemViewModelList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticketDataViewModel;
    }




    public static TicketDataViewModel getTicketList(Response response) {
        TicketDataViewModel ticketDataViewModel = new TicketDataViewModel();
        try {
            List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.PricedItineraryItem> pricedItineraryItemList = response
                    .getSoapEnvelope()
                    .getSoapBody()
                    .getSearchFlightResponse()
                    .getOTAAirLowFareSearchRS()
                    .getPricedItineraries()
                    .getPricedItinerary();

            List<PricedItineraryItemViewModel> pricedItineraryItemViewModelList = new ArrayList<>();
            crocusoft.com.gez.pojo.response.flight.oneWayResponse.PricedItineraries pricedItineraries = response
                    .getSoapEnvelope()
                    .getSoapBody()
                    .getSearchFlightResponse()
                    .getOTAAirLowFareSearchRS()
                    .getPricedItineraries();
            for (crocusoft.com.gez.pojo.response.flight.oneWayResponse.PricedItineraryItem pricedItineraryItem : pricedItineraryItemList) {

                PricedItineraryItemViewModel pricedItineraryItemViewModel = new PricedItineraryItemViewModel();
                pricedItineraryItemViewModel.setSequenceNumber(pricedItineraryItem.getSequenceNumber());
                pricedItineraryItemViewModel.setCurrency(pricedItineraryItem.getCurrency());

                List<OriginDestinationCombinationItemViewModel> originDestinationCombinationItemViewModelList
                        = new ArrayList<>();
                List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem>originList = new ArrayList<>();
                List<OriginDestinationOptionItemViewModel> originDestinationOptionItemViewModelList
                        = new ArrayList<>();
                List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem> destinationCombinationItems = new ArrayList<>();

                //COMBINATIONS

                Gson gson = new Gson();
                String s = gson.toJson(pricedItineraryItem.getAirItinerary().getOriginDestinationCombinations().getOriginDestinationCombination());
                try {
                    crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem flightSegment = new Gson().fromJson(s, crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem.class);
                    destinationCombinationItems.add(flightSegment);
                } catch (JsonSyntaxException e) {
                    JSONArray jsonArray = new JSONArray(s);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                        destinationCombinationItems.add(new Gson().fromJson(jsonObject.toString(), crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationCombinationItem.class));
                    }
                }

                Gson fd = new Gson();
                String objectDest = fd.toJson(pricedItineraryItem.getAirItinerary().getOriginDestinationOptions().getOriginDeationationOption() );
                try{
                    crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem originDestinationOptionItem = new Gson().fromJson(objectDest, crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem.class);
                    originList.add(originDestinationOptionItem);
                }catch(JsonSyntaxException e){
                    JSONArray jsonArray = new JSONArray(objectDest);
                    for(int i=0;i<jsonArray.length();i++){
                        JSONObject jsonObject = (JSONObject)jsonArray.get(i);
                        originList.add(new Gson().fromJson(jsonObject.toString(), crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem.class));
                    }
                }

                for(crocusoft.com.gez.pojo.response.flight.oneWayResponse.OriginDestinationOptionItem item : originList) {
                    List<crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment> flightSegmentList = new ArrayList<>();
                    OriginDestinationOptionItemViewModel model = new OriginDestinationOptionItemViewModel();
                    model.setDirectionId(item.getDirectionId());
                    model.setElapsedTime(item.getElapsedTime());
                    model.setRefNumber(item.getRefNumber());
                    model.setSequenceNumber(pricedItineraryItem.getSequenceNumber());

                    Gson sd = new Gson();
                    String jsonInString = sd.toJson(item.getFlightSegment());
                    try {
                        crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment flightSegment =
                                new Gson().fromJson(jsonInString, crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment.class);
                        flightSegmentList.add(flightSegment);
                    } catch (JsonSyntaxException e) {
                        JSONArray jsonArray = new JSONArray(jsonInString);

                        for(int i=0;i<jsonArray.length();i++){
                            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                            flightSegmentList.add(new Gson().fromJson(jsonObject.toString(), crocusoft.com.gez.pojo.response.flight.oneWayResponse.FlightSegment.class));
                        }
                    }
                    model.setAirItineraryPricingInfo(pricedItineraryItem.getAirItineraryPricingInfo());

                    model.setFlighTSegmentList(flightSegmentList);

                    originDestinationOptionItemViewModelList.add(model);

                }

                pricedItineraryItemViewModel.setFreeBaggagesOneWay(pricedItineraries.getFreeBaggages());
                pricedItineraryItemViewModel.setFreeBaggagesListOneWay(pricedItineraries.getFreeBaggagesList());
                pricedItineraryItemViewModel.setCustomOriginDestinationOptionItemList(originDestinationOptionItemViewModelList);
                pricedItineraryItemViewModel.setOriginOneWayCombinationOptionItemList(destinationCombinationItems);
                pricedItineraryItemViewModelList.add(pricedItineraryItemViewModel);
            }

            ticketDataViewModel.setPricedItineraryItemList(pricedItineraryItemViewModelList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticketDataViewModel;

    }





}
