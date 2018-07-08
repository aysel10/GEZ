package crocusoft.com.gez.database;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import crocusoft.com.gez.pojo.response.flight.AirportImageResponse;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class DatabaseService_Impl implements DatabaseService {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfAirportImageResponse;

  private final EntityInsertionAdapter __insertionAdapterOfAirportImageResponse_1;

  public DatabaseService_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAirportImageResponse = new EntityInsertionAdapter<AirportImageResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `AirportImageResponse`(`uid`,`AirlineName`,`ID`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AirportImageResponse value) {
        stmt.bindLong(1, value.getUid());
        if (value.getAirlineName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAirlineName());
        }
        stmt.bindLong(3, value.getID());
      }
    };
    this.__insertionAdapterOfAirportImageResponse_1 = new EntityInsertionAdapter<AirportImageResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AirportImageResponse`(`uid`,`AirlineName`,`ID`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AirportImageResponse value) {
        stmt.bindLong(1, value.getUid());
        if (value.getAirlineName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAirlineName());
        }
        stmt.bindLong(3, value.getID());
      }
    };
  }

  @Override
  public void insertImage(AirportImageResponse model) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfAirportImageResponse.insert(model);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllImages(List<? extends AirportImageResponse> user) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfAirportImageResponse_1.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<AirportImageResponse> fetchAllImages() {
    final String _sql = "SELECT * FROM airportImageResponse";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfUid = _cursor.getColumnIndexOrThrow("uid");
      final int _cursorIndexOfAirlineName = _cursor.getColumnIndexOrThrow("AirlineName");
      final int _cursorIndexOfID = _cursor.getColumnIndexOrThrow("ID");
      final List<AirportImageResponse> _result = new ArrayList<AirportImageResponse>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AirportImageResponse _item;
        _item = new AirportImageResponse();
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        _item.setUid(_tmpUid);
        final String _tmpAirlineName;
        _tmpAirlineName = _cursor.getString(_cursorIndexOfAirlineName);
        _item.setAirlineName(_tmpAirlineName);
        final int _tmpID;
        _tmpID = _cursor.getInt(_cursorIndexOfID);
        _item.setID(_tmpID);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public AirportImageResponse getImage(String code) {
    final String _sql = "SELECT * FROM airportImageResponse WHERE AirlineName LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (code == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, code);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfUid = _cursor.getColumnIndexOrThrow("uid");
      final int _cursorIndexOfAirlineName = _cursor.getColumnIndexOrThrow("AirlineName");
      final int _cursorIndexOfID = _cursor.getColumnIndexOrThrow("ID");
      final AirportImageResponse _result;
      if(_cursor.moveToFirst()) {
        _result = new AirportImageResponse();
        final int _tmpUid;
        _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        _result.setUid(_tmpUid);
        final String _tmpAirlineName;
        _tmpAirlineName = _cursor.getString(_cursorIndexOfAirlineName);
        _result.setAirlineName(_tmpAirlineName);
        final int _tmpID;
        _tmpID = _cursor.getInt(_cursorIndexOfID);
        _result.setID(_tmpID);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
