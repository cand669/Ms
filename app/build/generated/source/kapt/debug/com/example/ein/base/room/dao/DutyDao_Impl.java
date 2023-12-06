package com.example.ein.base.room.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.ein.base.room.Converters;
import com.example.ein.base.room.entity.DutyEntity;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DutyDao_Impl implements DutyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DutyEntity> __insertionAdapterOfDutyEntity;

  private final Converters __converters = new Converters();

  public DutyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDutyEntity = new EntityInsertionAdapter<DutyEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `duty_table` (`id`,`memoTitle`,`createdAt`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DutyEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getMemoTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMemoTitle());
        }
        final String _tmp;
        _tmp = __converters.dateToTimestamp(value.getCreatedAt());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp);
        }
      }
    };
  }

  @Override
  public void addDates(final List<DutyEntity> dates) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDutyEntity.insert(dates);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<DutyEntity> GetAllDuty() {
    final String _sql = "SELECT * FROM duty_table WHERE createdAt <= date('now', 'localtime', '+1 day') ORDER BY createdAt DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMemoTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "memoTitle");
      final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
      final List<DutyEntity> _result = new ArrayList<DutyEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DutyEntity _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpMemoTitle;
        _tmpMemoTitle = _cursor.getString(_cursorIndexOfMemoTitle);
        final LocalDateTime _tmpCreatedAt;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfCreatedAt);
        _tmpCreatedAt = __converters.fromTimestamp(_tmp);
        _item = new DutyEntity(_tmpId,_tmpMemoTitle,_tmpCreatedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
