package com.example.myprj1;

import android.net.Uri;
import android.provider.BaseColumns;

public final class Contract {
    public Contract(){

    }

    public static final String CONTENT_AUTHORITY="com.example.myprj1";
    public static final Uri BASE_URI = Uri.parse("content//"+CONTENT_AUTHORITY);
    public static final String PATH_CONTACTS = "myprj1";

    public static abstract class ContactEntry implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_URI,PATH_CONTACTS);

        public static final String TABLE_NAME = "myprj1";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_EMAIL = "email";
        public static final String COLUMN_PICTURE = "picture";
        public static final String COLUMN_PHONENUMBER = "number";
        public static final String COLUMN_TYPEOFCONTACT = "type";

        public static final String TYPEOFCONTACT_WORK = "work";
        public static final String TYPEOFCONTACT_HOME ="home";
        public static final String TYPEOFCONTACT_PERSONAL ="personal";

        public static boolean isValidType (String type){
            if (type == TYPEOFCONTACT_HOME || type == TYPEOFCONTACT_PERSONAL || type == TYPEOFCONTACT_WORK){
                return true ;
            }
            return false ;
        }
    }
}
