package com.example.evaluation;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities={ItemEntity.class},version=1)
public abstract class AppDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "app_database";

    private static AppDatabase instance;

    public abstract ItemDao itemDao();
//
//       public static synchronized AppDatabase getInstance(Context context) {
//           if (instance == null) {
//             instance = Room.databaseBuilder(context.getApplicationContext(),
//                              AppDatabase.class, DATABASE_NAME)
//                     .fallbackToDestructiveMigration()
//                       .build();
//          }
//            return instance;
//        }
}