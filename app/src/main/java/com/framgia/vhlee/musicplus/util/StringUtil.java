package com.framgia.vhlee.musicplus.util;

import com.framgia.vhlee.musicplus.BuildConfig;

public class StringUtil {
    public static String append(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public static String getTrackByGenreApi(String genres) {
        return StringUtil.append(Constants.ApiConfig.BASE_URL_GENRES, genres,
                Constants.ApiConfig.CLIENT_ID, BuildConfig.CLIENT_ID);
    }

    public static String getTrackDetailApi(int trackId) {
        return StringUtil.append(Constants.ApiConfig.BASE_URL_TRACK, Constants.ApiConfig.SPLASH,
                String.valueOf(trackId), Constants.ApiConfig.SPLASH,
                Constants.ApiConfig.CLIENT_ID);
    }

    public static String getTrackStreamApi(int trackId) {
        return StringUtil.append(Constants.ApiConfig.BASE_URL_TRACK, Constants.ApiConfig.SPLASH,
                String.valueOf(trackId), Constants.ApiConfig.SPLASH,
                Constants.ApiConfig.NAME_STREAM, Constants.ApiConfig.QUESTION_MARK,
                Constants.ApiConfig.CLIENT_ID);
    }
}
