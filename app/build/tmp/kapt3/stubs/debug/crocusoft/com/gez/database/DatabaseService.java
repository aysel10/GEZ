package crocusoft.com.gez.database;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\'\u00a8\u0006\r"}, d2 = {"Lcrocusoft/com/gez/database/DatabaseService;", "", "fetchAllImages", "", "Lcrocusoft/com/gez/pojo/response/flight/AirportImageResponse;", "getImage", "code", "", "insertAllImages", "", "user", "insertImage", "model", "app_debug"})
public abstract interface DatabaseService {
    
    @android.arch.persistence.room.Insert()
    public abstract void insertImage(@org.jetbrains.annotations.NotNull()
    crocusoft.com.gez.pojo.response.flight.AirportImageResponse model);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllImages(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends crocusoft.com.gez.pojo.response.flight.AirportImageResponse> user);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM airportImageResponse")
    public abstract java.util.List<crocusoft.com.gez.pojo.response.flight.AirportImageResponse> fetchAllImages();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM airportImageResponse WHERE AirlineName LIKE :code LIMIT 1")
    public abstract crocusoft.com.gez.pojo.response.flight.AirportImageResponse getImage(@org.jetbrains.annotations.NotNull()
    java.lang.String code);
}