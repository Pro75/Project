package Database;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.database.sqlite.SQLiteQueryBuilder;

import java.util.ArrayList;
import java.util.List;

import Model.Teachers;




public class Database extends SQLiteAssetHelper {

    private static final String DB_Name = "Tportal.db";
    private static final int DB_VER = 1;


    public Database(Context contex) {
        super(contex, DB_Name, null, DB_VER);

    }

    public List<Teachers> getTeachers()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String[] sqlSelect = {"Id", "Initial", "Name", "Email", "Cell"};

        String tableName = "Teachers";
        qb.setTables(tableName);

        Cursor cursor = qb.query(db, sqlSelect,  null, null, null,null, null);
        List<Teachers> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Teachers teachers = new Teachers();

                teachers.setName(cursor.getString(cursor.getColumnIndex(   "Name")));
                teachers.setName(cursor.getString(cursor.getColumnIndex(   "Id")));
                teachers.setName(cursor.getString(cursor.getColumnIndex(   "Email")));
                teachers.setName(cursor.getString(cursor.getColumnIndex(   "cell")));
                teachers.setName(cursor.getString(cursor.getColumnIndex(   "Initial")));
                result.add(teachers);

            } while (cursor.moveToNext());


        } return result;
    }

    public List<String> getInitial() {

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String[] sqlSelect = {"Initial"};

        String tableName = "Teachers";
        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null,null, null, null, null);
        List<String> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {


                result.add(cursor.getString(cursor.getColumnIndex( "Initial")));

            } while (cursor.moveToNext());


        } return result;
    }

public List<Teachers> getGetTeachersbyInitial(String initial)
     {

         SQLiteDatabase db = getReadableDatabase();
         SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
         String[] sqlSelect = {"Id", "Initial", "Name", "Email", "Cell"};

         String tableName = "Teachers";
         qb.setTables(tableName);
         Cursor cursor = qb.query(db, sqlSelect,"Initial =  ?", new String[]{initial},null,null,null );
         List<Teachers> result = new ArrayList<>();
         if (cursor.moveToFirst()) {
             do {
                 Teachers teachers = new Teachers();
                 teachers.setName(cursor.getString(cursor.getColumnIndex(   "Name")));
                 teachers.setName(cursor.getString(cursor.getColumnIndex(   "Id")));
                 teachers.setName(cursor.getString(cursor.getColumnIndex(   "Email")));
                 teachers.setName(cursor.getString(cursor.getColumnIndex(   "cell")));
                 teachers.setName(cursor.getString(cursor.getColumnIndex(   "Initial")));
                 result.add(teachers);

                 result.add(teachers);

             } while (cursor.moveToNext());


         } return result;
     }

     }






















