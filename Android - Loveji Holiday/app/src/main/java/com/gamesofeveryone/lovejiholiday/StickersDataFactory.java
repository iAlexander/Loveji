package com.gamesofeveryone.lovejiholiday;

import java.util.ArrayList;
import java.util.List;

public class StickersDataFactory {

    public static List<Sticker> getAllStickerReference() {
        String[] stickerURLRef = {

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-0.png?alt=media&token=7557029a-710e-4252-96cb-19eb337a3584",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-01.png?alt=media&token=fb0974ec-3919-42e0-800a-33c1e59b1d8e",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-02.png?alt=media&token=cfc02130-5c13-49bd-8b52-08ccd761c7bd",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-03.png?alt=media&token=45d1536d-b9cc-4cf6-8f05-e15360509aa1",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-04.png?alt=media&token=7c69bbd4-2562-4ea6-9a33-229997a2d42e",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-05.png?alt=media&token=71c59305-0bf5-4bea-bfd4-cfe02d347577",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-06.png?alt=media&token=a10ca40e-d61d-4a66-91eb-00c32ef3ba52",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-07.png?alt=media&token=18b50ca0-4742-41b9-82a8-b54aee553504",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-08.png?alt=media&token=80db1834-73b4-42f7-840e-88309297f594",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-09.png?alt=media&token=54990c13-c7b2-4430-af03-7e97b6ab483a",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-10.png?alt=media&token=bacb3403-8ab5-4841-a9ab-0fe98eb9cfcf",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-11.png?alt=media&token=81418c82-f853-4fe0-8ed9-7ea7172a50d2",

                "https://firebasestorage.googleapis.com/v0/b/loveji-stickers.appspot.com/o/lovejiholiday-12.png?alt=media&token=cd2676d0-96e6-42c7-95d2-024f5b19b2e7"
        };
        List<Sticker> stickerList = new ArrayList<>();
        for (int i = 0; i < stickerURLRef.length; i++) {
            stickerList.add(new Sticker(stickerURLRef[i]));
        }
        return stickerList;
    }
}