package com.Ideabytes;

/**
 * Ideabytes Inc.
 * @author Luka Macieszczak
 * date: July 13, 2020
 */
public class Constants {

    public static final double DIVIDE = 0.75;
    public static final String DB_NAME = "wraptext.db";
    public static final String TSE_DB_NAME = "TSEOutput.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Databases\\" + DB_NAME;
    public static final String TSE_CONNECTION_STRING = "jdbc:sqlite:C:\\Databases\\" + TSE_DB_NAME;
    public static final String SQL_CREATE_TSE_TABLE = "CREATE TABLE IF NOT EXISTS TSE2(appName VARCHAR(1024),startTime LONG, className VARCHAR(1024), methodName VARCHAR(1024), inputParams VARCHAR(1024), result VARCHAR(1024))";
    public static final String tableName = "strings";
    public static final String COLUMN_PAR = "paragraph";
    public static final String COLUMN_ROW = "row";
    public static final String FILE_OUTPUT = "C:\\Users\\luka\\Documents\\ItextOutput\\wraptext.pdf";
    public static final String PREVIEW_IMAGE = "C:\\Users\\luka\\Pictures\\Camera Roll\\Test_Image.jpg";
    public static final String CANVAS_TITLE = "My Drawing";
    public static final String SQL_SELECT_GETPAR = "SELECT * FROM paragraph1";
    public static final String SQL_CREATETABLE = "CREATE TABLE IF NOT EXISTS paragraph1 (row INTEGER, paragraph TEXT)";
    public static final String FONT_DIRECTORY = "C:\\Users\\luka\\Documents\\SampleFonts";
    public static final String TSE_CONSTRUCTOR = "Constructor";
    public static final String METHOD_START = "Method Start";
    public static final String METHOD_RETURN = " Method return";

}
