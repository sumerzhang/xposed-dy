package com.spark.xposeddy.repository.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.spark.xposeddy.repository.bean.CommentBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COMMENT_BEAN".
*/
public class CommentBeanDao extends AbstractDao<CommentBean, Long> {

    public static final String TABLENAME = "COMMENT_BEAN";

    /**
     * Properties of entity CommentBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property AwemeId = new Property(1, String.class, "awemeId", false, "AWEME_ID");
        public final static Property Uid = new Property(2, String.class, "uid", false, "UID");
        public final static Property TypeCode = new Property(3, String.class, "typeCode", false, "TYPE_CODE");
        public final static Property Acc = new Property(4, String.class, "acc", false, "ACC");
        public final static Property Nick = new Property(5, String.class, "nick", false, "NICK");
        public final static Property Sex = new Property(6, String.class, "sex", false, "SEX");
        public final static Property Age = new Property(7, String.class, "age", false, "AGE");
        public final static Property Works_num = new Property(8, String.class, "works_num", false, "WORKS_NUM");
        public final static Property Area = new Property(9, String.class, "area", false, "AREA");
        public final static Property Source = new Property(10, String.class, "source", false, "SOURCE");
        public final static Property ContentID = new Property(11, String.class, "contentID", false, "CONTENT_ID");
        public final static Property Content = new Property(12, String.class, "content", false, "CONTENT");
        public final static Property Relevant = new Property(13, String.class, "relevant", false, "RELEVANT");
        public final static Property Create_time = new Property(14, Long.class, "create_time", false, "CREATE_TIME");
    }


    public CommentBeanDao(DaoConfig config) {
        super(config);
    }
    
    public CommentBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COMMENT_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"AWEME_ID\" TEXT UNIQUE ," + // 1: awemeId
                "\"UID\" TEXT," + // 2: uid
                "\"TYPE_CODE\" TEXT," + // 3: typeCode
                "\"ACC\" TEXT," + // 4: acc
                "\"NICK\" TEXT," + // 5: nick
                "\"SEX\" TEXT," + // 6: sex
                "\"AGE\" TEXT," + // 7: age
                "\"WORKS_NUM\" TEXT," + // 8: works_num
                "\"AREA\" TEXT," + // 9: area
                "\"SOURCE\" TEXT," + // 10: source
                "\"CONTENT_ID\" TEXT," + // 11: contentID
                "\"CONTENT\" TEXT," + // 12: content
                "\"RELEVANT\" TEXT," + // 13: relevant
                "\"CREATE_TIME\" INTEGER);"); // 14: create_time
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COMMENT_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CommentBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String awemeId = entity.getAwemeId();
        if (awemeId != null) {
            stmt.bindString(2, awemeId);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(3, uid);
        }
 
        String typeCode = entity.getTypeCode();
        if (typeCode != null) {
            stmt.bindString(4, typeCode);
        }
 
        String acc = entity.getAcc();
        if (acc != null) {
            stmt.bindString(5, acc);
        }
 
        String nick = entity.getNick();
        if (nick != null) {
            stmt.bindString(6, nick);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(7, sex);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(8, age);
        }
 
        String works_num = entity.getWorks_num();
        if (works_num != null) {
            stmt.bindString(9, works_num);
        }
 
        String area = entity.getArea();
        if (area != null) {
            stmt.bindString(10, area);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(11, source);
        }
 
        String contentID = entity.getContentID();
        if (contentID != null) {
            stmt.bindString(12, contentID);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(13, content);
        }
 
        String relevant = entity.getRelevant();
        if (relevant != null) {
            stmt.bindString(14, relevant);
        }
 
        Long create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindLong(15, create_time);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CommentBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String awemeId = entity.getAwemeId();
        if (awemeId != null) {
            stmt.bindString(2, awemeId);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(3, uid);
        }
 
        String typeCode = entity.getTypeCode();
        if (typeCode != null) {
            stmt.bindString(4, typeCode);
        }
 
        String acc = entity.getAcc();
        if (acc != null) {
            stmt.bindString(5, acc);
        }
 
        String nick = entity.getNick();
        if (nick != null) {
            stmt.bindString(6, nick);
        }
 
        String sex = entity.getSex();
        if (sex != null) {
            stmt.bindString(7, sex);
        }
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(8, age);
        }
 
        String works_num = entity.getWorks_num();
        if (works_num != null) {
            stmt.bindString(9, works_num);
        }
 
        String area = entity.getArea();
        if (area != null) {
            stmt.bindString(10, area);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(11, source);
        }
 
        String contentID = entity.getContentID();
        if (contentID != null) {
            stmt.bindString(12, contentID);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(13, content);
        }
 
        String relevant = entity.getRelevant();
        if (relevant != null) {
            stmt.bindString(14, relevant);
        }
 
        Long create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindLong(15, create_time);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CommentBean readEntity(Cursor cursor, int offset) {
        CommentBean entity = new CommentBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // awemeId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // uid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // typeCode
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // acc
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // nick
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // sex
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // age
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // works_num
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // area
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // source
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // contentID
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // content
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // relevant
            cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14) // create_time
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CommentBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAwemeId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTypeCode(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAcc(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNick(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSex(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAge(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setWorks_num(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setArea(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setSource(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setContentID(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setContent(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setRelevant(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setCreate_time(cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CommentBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CommentBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CommentBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}